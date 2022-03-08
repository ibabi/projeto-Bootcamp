import dominio.Course;
import dominio.Mentorship;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("Java basics");
        course1.setDescription("Learn Java basic concepts.");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("JavaScript introduction");
        course2.setDescription("Learn JavaScript basic concepts.");
        course2.setWorkload(4);

        Mentorship mentorship = new Mentorship();
        mentorship.setTitle("Java mentorship");
        mentorship.setDescription("This is a scheduled Java mentorship.");
        mentorship.setDate(LocalDate.now());
    }

}