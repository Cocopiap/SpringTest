import com.test.one.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * 一般程序中
 * import com.test.one.Cat;
import com.test.one.Dog;
import com.test.one.Person;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Person person = new Person("ju", dog, cat);
        person.getDog().shout();
        person.getCat().shout();
    }
}*/

public class Test {
    public static void main(String[] args) {
        // The ApplicationContext lets you read bean definitions and access them
        // 因为我们是用XML装配的bean，所以要用 ClassPathXmlApplicationContext。
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从容器中获取bean
        Person person = context.getBean("person", Person.class);
        person.getDog().shout();
        person.getCat().shout();
    }
}
