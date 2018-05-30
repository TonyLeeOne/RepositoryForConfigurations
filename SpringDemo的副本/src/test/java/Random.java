/**
 * Created by tony on 2018/5/13.
 */
public class Random {

    public static void main(String[] args) {

        for (int i = 0; i <100 ; i++) {
//            System.out.println(getRandomNum(2,31));
//            System.out.println(getRandomChar('A','Z'));
            System.out.println(getRandomData(1,11));
        }

    }


    /*
    * 获取任意数字方法
    * */

    public static int getRandomNum(double a, double b){

        return (int)(a+Math.random()*(b-a));

    }

    /*
    * 获取任意字符的方法
    * */

    public static char getRandomChar(char a,char b){
        return (char) (a+Math.random()*(b-a+1));
    }

    public static int getRandomData(int a,int b){

        return new java.util.Random().nextInt(b-a+1)+a;
    }
}
