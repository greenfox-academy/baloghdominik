package cloneable;

public class Person {
    public String name;
    public int age;
    public String gender;

    public Person(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    public Person(String nsme, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public void introduce(){
        System.out.println("Hi I am "+ this.name +"a "+ this.age +" year old "+ this.gender +".");
    }

    public void getGoal(){
        System.out.println("My goal is: Live for the moment!");
    }
}