package daemon;

/**
 * Created by tony on 2018/5/1.
 */
public class HelloChina{


    private String message;
    private String message1;

    public void getMessage1() {
        System.out.println("Your Message : " + message1);
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }

    public void init(){
        System.out.println("Bean is going through init.");
    }
    public void destroy(){
        System.out.println("Bean will destroy now.");
    }
}
