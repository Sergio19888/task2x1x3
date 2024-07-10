import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanTwo = (HelloWorld) applicationContext.getBean("helloworld");
        boolean sravni = bean == beanTwo;
        System.out.println(sravni);
        System.out.println(bean);
        System.out.println(beanTwo);
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        boolean sravni2 = cat1 == cat2;
        System.out.println(sravni2);
        System.out.println(cat1);
        System.out.println(cat2);

    }
}