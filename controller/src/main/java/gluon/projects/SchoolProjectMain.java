package gluon.projects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SchoolProjectMain {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SchoolProjectMain.class, args);
        System.out.println("------------------------------------------------------------------------------------");
        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.stream(beanNames).filter(x -> !x.contains("org.springframework")).forEach(System.out::println);
        System.out.println("------------------------------------------------------------------------------------");
    }
}
