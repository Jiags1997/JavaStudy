package demo14.Exception;
/*
   Throw关键字
   可以使用Throw关键字方法中抛出指定的异常
   使用格式：
   throw new   xxxException("产生异常的原因");
   注意：1.throw关键字必须写在方法的内部
        2.throw关键字后面new的对象  必须是Exception或者Exception类的子类对象
        3.throw关键字抛出指定的异常对象，必须处理这个异常对象
        throw关键字后面创建的是RuntimeException或者RuntimeException子类对象，无需程序员自己处理。
        throw关键字后面创建是编译异常，必须处理异常：1.throws,2.try...catch

  */
public class DemoThrow {
    public static void main(String[] args) {
        int [] arr={1,2,3};
        int ele=getElement(arr,2);
        System.out.println(ele);
    }
    /*
      NullPointerException是一个运行期异常，程序员无需处理
     */
    public static int getElement(int []arr,int index)
    {
        /* 检验参数arr:
            注意：NullPointerException是一个运行期异常，程序员无需处理
        */
        if(arr==null){
            throw new NullPointerException("传递的数组是null");
        }
        /*检验参数index:index不能越界；
           注意：ArrayIndexOutOfBoundsException是一个运行期异常，程序员无需处理
         */
        if(index<0||index>arr.length-1)
        {
            throw new ArrayIndexOutOfBoundsException("数组下标越界了");
        }
        int ele=arr[index];
        return ele;
    }
}
