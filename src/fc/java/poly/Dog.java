package fc.java.model;

public class Dog extends Animal{
    public Dog(){
        super(); // new Animal()
    }
    //재정의(override)
    public void eat(){
        System.out.println("개처럼먹다");
    }

}
