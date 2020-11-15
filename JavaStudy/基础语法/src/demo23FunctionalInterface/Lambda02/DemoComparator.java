package demo23FunctionalInterface.Lambda02;

import java.util.Arrays;
import java.util.Comparator;

public class DemoComparator {
    public static Comparator<String>getCompare(){
        return (s1,s2)->s2.length()-s1.length();
    }
    public static void main(String[] args) {
        String []arr={"123","1234","12345","1234566"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,getCompare());
        System.out.println(Arrays.toString(arr));
    }
}
