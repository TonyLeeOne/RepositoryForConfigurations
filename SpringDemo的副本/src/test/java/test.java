import daemon.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.applet.AppletContext;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by tony on 2018/5/1.
 */
public class test {
    @Test
    public void test(){
//
//     AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//        HelloChina obj1 = (HelloChina) context.getBean("helloChina");
//        obj.getMessage();
//        obj1.getMessage();
//        obj1.getMessage1();
//        context.registerShutdownHook();

//     ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//        TextEditor textEditor= (TextEditor) context.getBean("textEditor");
//  textEditor.spellCheck();

//        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//        JavaCollection javaCollection= (JavaCollection) context.getBean("javaCollection");
//        javaCollection.getAddressList();
//        javaCollection.getAddressSet();
//        javaCollection.getAddressMap();
//        javaCollection.getAddressProp();

        ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

        context.start();

        Student student=(Student)context.getBean("student");
       student.getAge();
       student.getName();

        context.stop();





    }
}
