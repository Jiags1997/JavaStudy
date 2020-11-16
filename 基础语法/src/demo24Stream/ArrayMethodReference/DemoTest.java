package demo24Stream.ArrayMethodReference;

public class DemoTest {
    public static int [] getArray(int length,ArrayBuillder ab){
        return ab.arrayBuilder(length);
    }

    public static void main(String[] args) {
        int [] array=getArray(5, int []::new);
        System.out.println(array.length);
    }
}
