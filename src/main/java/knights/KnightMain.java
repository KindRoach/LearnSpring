package knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class KnightMain {
    public static void main(String[] args) throws Exception {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("src/main/java/knights/config/Knight.config");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
    }
}
