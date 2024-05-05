package fc.java.model;

public class Cat extends Animal{
    public void night(){
        System.out.println("밤에 눈에서 빛이난다");
    }
    //재정의(override)
    public void eat(){
        System.out.println("고양이처럼먹다");
    }
}
