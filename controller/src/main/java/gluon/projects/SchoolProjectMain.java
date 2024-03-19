package gluon.projects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SchoolProjectMain {

    private static final Logger logger = LoggerFactory.getLogger(SchoolProjectMain.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SchoolProjectMain.class, args);
        logger.info("------------------------------------------------------------------------------------");
        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.stream(beanNames).filter(x -> !x.contains("org.springframework")).forEach(logger::info);
        logger.info("------------------------------------------------------------------------------------");
    }
}
