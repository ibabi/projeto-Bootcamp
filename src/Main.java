import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Course;
import br.com.dio.desafio.dominio.Developer;
import br.com.dio.desafio.dominio.Mentorship;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("Java basics");
        course1.setDescription("Learn Java basics.");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("JavaScript basics");
        course2.setDescription("Learn JavaScript basics.");
        course2.setWorkload(4);

        Mentorship mentorship = new Mentorship();
        mentorship.setTitle("Java mentorship");
        mentorship.setDescription("This is a scheduled Java mentorship.");
        mentorship.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Learn Java and get a job!");
        bootcamp.getContent().add(course1);
        bootcamp.getContent().add(course2);
        bootcamp.getContent().add(mentorship);

        Developer devKyloRen = new Developer();
        devKyloRen.setName("Kylo Ren");
        devKyloRen.subscribeBootcamp(bootcamp);
        System.out.println("Available Content Kylo Ren:" + devKyloRen.getAvailableContent());
        devKyloRen.progress();
        devKyloRen.progress();
        System.out.println("-");
        System.out.println("Available Content Kylo Ren:" + devKyloRen.getAvailableContent());
        System.out.println("Available Content Kylo Ren:" + devKyloRen.getAvailableContent());
        System.out.println("XP:" + devKyloRen.calculateTotalXp());

        System.out.println("-------");

        Developer devRickGrimes = new Developer();
        devRickGrimes.setName("Rick Grimes");
        devRickGrimes.subscribeBootcamp(bootcamp);
        System.out.println("Available Content Rick Grimes:" + devRickGrimes.getAvailableContent());
        devRickGrimes.progress();
        devRickGrimes.progress();
        devRickGrimes.progress();
        System.out.println("-");
        System.out.println("Available Content Rick Grimes:" + devRickGrimes.getAvailableContent());
        System.out.println("Available Content Rick Grimes:" + devRickGrimes.getAvailableContent());
        System.out.println("XP:" + devRickGrimes.calculateTotalXp());

    }

}