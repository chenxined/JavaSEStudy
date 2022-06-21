package main.abnormal.one;

/**
 * @author chenxin
 *
 */
public class one {
    public static void main(String[] args) {
        try {
            test(2,0);
        } catch (Exception e) {//捕获方法中可能会出现的异常

            e.printStackTrace();
        }finally {//无论是否出现异常都会执行。
            System.out.println("aa");
        }

    }
    static int test(int a,int b) throws  MyException{ //声明异常，交给上一层处理，必须这么干
        System.out.println("ok");
        if(b==0) throw new MyException("no");   //创建异常对象并声明异常
        System.out.println("1");  //终止程序的运行
        return a/b;

    }







}
