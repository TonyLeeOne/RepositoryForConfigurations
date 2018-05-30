package Annotation.Action;

import Annotation.Service.Service;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by tony on 2018/5/6.
 */
//@Component()
@Controller
public class Action {
@Resource()
    private Service service;

    public void setService(Service service) {
        this.service = service;
    }

    public void save(){
        service.save();
    }
}
