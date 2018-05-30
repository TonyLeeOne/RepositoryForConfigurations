package Annotation.Dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by tony on 2018/5/6.
 */
//@Component()
    @Repository
public class Student {

    private int age;

    private String name;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void save(){
        System.out.println("Insert into DB successfully !!");
    }
}
