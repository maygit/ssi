package test;

import dao.IAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import po.Person;

/**
 * Created by sedrtyug on 2017/2/15.
 */
public class Test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
       IAction action = (IAction)context.getBean("ActionImpl");
        action.insertPerson(new Person(1,"huage",12));
    }

    public void print(){
        System.out.println("修改打印方法");
    }

    //获取信息
    public void getAll(){}

    //添加测试方法
    public void test(){}
}
