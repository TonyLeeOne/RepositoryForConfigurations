package Annotation.Service;


import Annotation.Dao.Student;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by tony on 2018/5/6.
 */
//@Component()
    @org.springframework.stereotype.Service
public class Service {
   @Resource()
    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public void save(){

           student.save();

    }
}
