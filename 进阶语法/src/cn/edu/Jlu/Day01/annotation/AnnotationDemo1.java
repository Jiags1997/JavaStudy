package cn.edu.Jlu.Day01.annotation;

import java.util.Date;

public class AnnotationDemo1 {
    @Override
    public String toString(){
        return super.toString();
    }

    @Deprecated
    public void  show01(){
        //有缺陷
    }
    public void show02(){
        //替代show01
    }

    public void dmeo(){
        Date date=new Date();
    }

}
