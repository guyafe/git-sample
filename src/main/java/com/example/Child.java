package com.example;

public class Child {

  private final String name;

  public Child(String name){
    this.name = name;
  }

  public void speak(){
    System.out.println("My name is: " + name);
  }
}
