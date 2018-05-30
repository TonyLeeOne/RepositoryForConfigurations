package daemon;

import org.springframework.context.ApplicationEvent;

/**
 * Created by tony on 2018/5/4.
 */
public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
    }

    public String toString(){
        System.out.println("This is custom Event");

        return "My Custom Event!";
    }
}
