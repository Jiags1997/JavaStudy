package demo16ThreadandLambda.Lambda;
import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Person [] array={
                new Person("刘诗诗",33),
                new Person("迪丽热巴",29),
                new Person("柳岩",36)
        };
        Arrays.sort(array, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        for (Person person:array
             ) {
            System.out.println(person);
        }
        Arrays.sort(array, (Person o1,Person o2)->{
             return o2.getAge()-o1.getAge();
        });
        for (Person person:array
        ) {
            System.out.println(person);
        }
    }
}
