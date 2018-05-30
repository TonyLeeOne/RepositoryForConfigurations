package daemon;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by tony on 2018/5/1.
 */
public class InitHelloWorld implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("BeforeInitialization:"+s);
        return s;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("AfterInitialization:"+s);
        return s;
    }
}
