package dasturlash.uz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        StudentService service1 = (StudentService) context.getBean("studentService");
        StudentService service2 = (StudentService) context.getBean("studentService");

        System.out.println(service1);
        System.out.println(service2);
    }
}