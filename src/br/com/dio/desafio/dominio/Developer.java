package br.com.dio.desafio.dominio;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Developer {
    private String name;
    private Set<Content> availableContent = new LinkedHashSet<>();
    private final Set<Content> completedContent = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp) {
        this.availableContent.addAll(bootcamp.getContent());
        bootcamp.getDevsOn().add(this);
    }

    public void progress() {
        Optional<Content> content = this.availableContent.stream().findFirst();
        if (content.isPresent()) {
            this.completedContent.add(content.get());
            this.availableContent.remove(content.get());
        } else {
            System.err.println("You are not enrolled in any course.");
        }
    }

    public double calculateTotalXp() {
        return this.completedContent
                .stream()
                .mapToDouble(Content::calculateXP)
                .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getAvailableContent() {
        return availableContent;
    }

    public void setAvailableContent(Set<Content> availableContent) {
        this.availableContent = availableContent;
    }

    public Set<Content> getCompletedContent() {
        return completedContent;
    }
}
