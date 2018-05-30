package daemon;

/**
 * Created by tony on 2018/5/4.
 */
public class Student {

    private int age;
    private String name;



    public int getAge() {
        System.out.println(""+age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        System.out.println(""+name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void save() {
    }
}
