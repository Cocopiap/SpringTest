package com.test.one;

public class Person {
    private String name;
    private Dog dog;
    private Cat cat;

    public Person() {
        this(null, null, null);

    }

    public Person(String name, Dog dog, Cat cat) {
        this.name = name;
        this.dog = dog;
        this.cat = cat;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public Dog getDog() {
        return dog;
    }
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }
    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", dog=" + dog + ", cat=" + cat +'}';
    }
}

