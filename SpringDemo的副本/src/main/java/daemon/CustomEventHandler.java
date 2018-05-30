package daemon;

import org.springframework.context.ApplicationListener;

/**
 * Created by tony on 2018/5/4.
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent>{
    public void onApplicationEvent(CustomEvent customEvent) {
        System.out.println(customEvent.toString());
    }
}
