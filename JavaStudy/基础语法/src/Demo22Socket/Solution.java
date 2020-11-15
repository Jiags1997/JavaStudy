package Demo22Socket;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int num;
        num=new Scanner(System.in).nextInt();
        System.out.println(reverse(num));
    }
    public  static int reverse(int x){
        int sign=-1;
        int num=0;
        int r=0;
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
            return num;
        }
        if(sign>0&&num<=(Integer.MAX_VALUE+1)){
            return -1*num;
        }
        return 0;
    }
}
