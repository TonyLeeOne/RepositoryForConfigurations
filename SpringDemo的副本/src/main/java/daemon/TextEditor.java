package daemon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by tony on 2018/5/2.
 */
public class TextEditor {
    private SpellChecker spellChecker;
    private int num;
//    @Autowired
    private String s;

/*
* 基于构造函数的依赖注入
* */
    @Autowired
    public TextEditor(SpellChecker spellChecker){
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
        this.num = num;
        this.s = s;
//        System.out.println(num+s);

    }

    /*
    * 基于设置函数的依赖注入  setter方法
    *
    * */

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }


    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
        System.out.println("Set SpellChecker");
    }

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
        System.out.println(""+num);
    }

    public String getS() {
        return s;
    }
    public void setS(String s) {
        this.s = s;
        System.out.println(s);
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

}
