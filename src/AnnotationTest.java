import com.mengma.annotation.PersonAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    public static void main(String[] args) {
        String xmlPath = "com/mengma/annotation/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        PersonAction personAction = (PersonAction) applicationContext.getBean("personAction");
        personAction.add();
    }
}
