import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int num;
        num=new Scanner(System.in).nextInt();
        int ans=reverse(num);
        System.out.println(ans);
    }
    public  static int reverse(int x){
        int sign=-1;
        long num=0;
        int r=0;
        if(x==Integer.MIN_VALUE)
            return 0;
        if(x<0){
            x=sign*x;
            sign=1;
        }
        while(x!=0){
            r=x%10;
            x=x/10;
            num=num*10+r;
        }
        if(sign<0&&num<=Integer.MAX_VALUE)
        {
            return (int)num;
        }
        if(sign>0&&(-1*num)>Integer.MIN_VALUE){
            return (int)(-1*num);
        }
        return 0;
    }
}
