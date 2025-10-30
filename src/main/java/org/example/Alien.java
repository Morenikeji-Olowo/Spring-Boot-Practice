package org.example;


public class Alien {

    //private Laptop laptop;
    private int age;

    public  Alien(){
        System.out.println("Dev constructor");
    }
    public  Alien(int age){
        this.age = age;
        System.out.println("Dev1 constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void  build(){

        System.out. println("Working on a project");
        //laptop.compile();
    }
}
