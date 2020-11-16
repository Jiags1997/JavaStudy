package demo24Stream.ConstructorMethodReference;

public class Person {
    private String name;
    public Person(){

    }
    public Person(String name){
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
