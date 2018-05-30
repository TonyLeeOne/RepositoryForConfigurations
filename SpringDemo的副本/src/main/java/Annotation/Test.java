package Annotation;


import Annotation.Action.Action;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by tony on 2018/5/6.
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans1.xml");
        Action action= (Action) context.getBean("action");
        action.save();
    }
}
