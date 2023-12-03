package org.example;

public class Animal {

    String name;
    String color;

    public Animal() {
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void toGo(){
        System.out.println(name + " идет.");
    }

    public void fly(){
        System.out.println(name + " летит.");
    }

    public void swim(){
        System.out.println(name + " плывет.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
