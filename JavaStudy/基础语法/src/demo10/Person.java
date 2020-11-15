package demo10;

public class Person {
    private String name;
    private int age;
    //无参构造
    public Person() {
    }
    // 有参构造
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
     //重写toString 方法；
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public boolean equals(Object obj){
        if(obj==this)
            return true;
        if(obj==null)
            return false;
        if(obj instanceof Person)
        {
            Person person=(Person)obj;
            boolean b=this.age==person.age&&this.name==person.name;
            return  b;
        }
        return false;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
