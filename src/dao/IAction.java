package dao;

import po.Person;

import java.util.List;

/**
 * Created by sedrtyug on 2017/2/15.
 */
public interface IAction {
    public boolean insertPerson(Person person);   //添加
    public boolean deleteById(int id);            //删除
    public boolean updatePerson(Person person);    //修改
    public Person queryById(int id);              //根据ID查询
    public List<Person> queryAllPerson();         //查询全部
    public void test();     //测试方法
}
