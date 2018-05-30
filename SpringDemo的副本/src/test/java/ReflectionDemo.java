import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Created by tony on 2018/5/13.
 */
public class ReflectionDemo {

   @Test
    public void test(){

       String str=new String();
       Class string=str.getClass();
       System.out.println(string.getPackage());
       System.out.println(string.getClassLoader());
       Field[] field=string.getFields();

       for (int i = 0; i <field.length-1 ; i++) {
           System.out.println(field[1].getName());
       }



       System.out.println(string.getName());
       System.out.println(string.getSuperclass());
       System.out.println(string.getConstructors());
       System.out.println(string.getFields());
       System.out.println(string.getInterfaces());
   }
}
