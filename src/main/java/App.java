import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat bean1 =
                (Cat) applicationContext.getBean("cat");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat bean3 =
                (Cat) applicationContext.getBean("cat");
        boolean bool1 = bean.equals(bean2);
        boolean bool2 = bean1.equals(bean3);
        System.out.println(bool1);
        System.out.println(bool2);

    }
}