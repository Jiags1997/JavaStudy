package demo23FunctionalInterface.Lambda01;
/*

 */
public class Demo02Lambda {
    public static void main(String[] args) {
        //定义三个日志xinx
        String msg1="Hello";
        String msg2="World";
        String msg3="Java";
        //调用shoLog方法
        showLog(1,()->{
            return msg1+msg2+msg3;
        });
        /*
         使用lambda表达式作为参数传递，仅仅是把参数传递到show方法中，只有满足条件才会进行字符串的拼接
         如果不满足，即日子等级不是1，messageBuilder也不会执行，
         不存在性能浪费

         */

    }
    //定义一个显示日志的方法 ，方法的参数传递日志等级和函数式接口MessageBuilder
    public static void showLog(int leval,MessageBuilder mb){
        //对日志的等级进行判断
        if(leval==1){
            System.out.println(mb.builderMessage()) ;
        }
    }

}
