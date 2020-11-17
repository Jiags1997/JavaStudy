package cn.edu.Jlu.Day01.annotation;
@MyAnno(age=22,name="贾国胜",per=Person.p1,anno2=@MyAnno2,str={"贾国胜","吉林大学"})
@MyAnno3
public class Worker {
    @MyAnno3
    public String name="贾国胜";

    @MyAnno3
    public void study(){

    }

}
