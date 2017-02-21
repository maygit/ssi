package po;

/**
 * Created by 001117020012 on 2017/2/21.
 */
public class User {
    private int id;
    private String name;
    private String password;
    private int age;
    public User(){}
    public User(int id,String name,String password,int age){
        this.id=id;
        this.name = name;
        this.password = password;
        this.age = age;
    }
}
