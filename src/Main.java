import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Course;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("course java");
        course1.setDescription("description course java");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("course js");
        course2.setDescription("description course js");
        course2.setWorkload(4);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("mentoring de java");
        mentoring.setDescription("descrição mentoring java");
        mentoring.setDate(LocalDate.now());

        /*System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentoring);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Description Bootcamp Java Developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentoring);

        Dev devNivaldo = new Dev();
        devNivaldo.setName("Nivaldo");
        devNivaldo.registerBootcamp(bootcamp);
        System.out.println("Subscribed Content Nivaldo:" + devNivaldo.getsubscribedContent());
        devNivaldo.progress();
        devNivaldo.progress();
        System.out.println("-");
        System.out.println("Subscribed Content Nivaldo:" + devNivaldo.getsubscribedContent());
        System.out.println("Content Completed Nivaldo:" + devNivaldo.getContentsCompleted());
        System.out.println("XP:" + devNivaldo.calculateTotalXp());

        System.out.println("-------");

        Dev devJose = new Dev();
        devJose.setName("Jose");
        devJose.registerBootcamp(bootcamp);
        System.out.println("Subscribed Content João:" + devJose.getsubscribedContent());
        devJose.progress();
        devJose.progress();
        devJose.progress();
        System.out.println("-");
        System.out.println("Subscribed Content João:" + devJose.getsubscribedContent());
        System.out.println("Content Completed João:" + devJose.getContentsCompleted());
        System.out.println("XP:" + devJose.calculateTotalXp());

    }

}
