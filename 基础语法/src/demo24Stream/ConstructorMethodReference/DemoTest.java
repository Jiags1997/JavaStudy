package demo24Stream.ConstructorMethodReference;

public class DemoTest {
    public static Person getPresonObject(String str,PersonBuilder pb){
        return pb.personBuilder(str);
    }
    //注意：静态方法只能调用静态方法
    public static void main(String[] args) {
        Person person=getPresonObject("贾国胜",Person::new);
        System.out.println(person);
    }
}
