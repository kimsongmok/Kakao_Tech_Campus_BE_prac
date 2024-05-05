package fc.java.model;

public class Employee { // extends Object 가 항상 생략되어있음.
    protected String name;
    protected int age;
    protected String phone;
    protected String empDate;
    protected String dept;
    protected  boolean marriage;

    public Employee(){
        super(); // 상위클래스의 생성자를 호출 -> new Object()
    }
}
