package com.company;

public class User {
    // Fields (attributes)
    public String name;

    public User (String name, int age) {
        // Constructor: a method that gets called when we create a new instance of a class.
        this.name = name;
        // if we type name = name, the java compiler will think we are referring to this name parameter.
        // Using this. to access all the fields and methods in this class.

    }
    // Methods
    public void sayHello() {
        System.out.println(" - Hi, my name is " + name);
        // Here, we don't have parameters. So we don't have to use this.

    }

}
