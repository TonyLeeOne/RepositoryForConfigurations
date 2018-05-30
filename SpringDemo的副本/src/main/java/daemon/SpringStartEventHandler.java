package daemon;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * Created by tony on 2018/5/4.
 */
public class SpringStartEventHandler implements ApplicationListener<ContextStartedEvent> {


    public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
        System.out.println("ContextStartedEvent Received");
    }
}
