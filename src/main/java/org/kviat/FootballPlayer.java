package org.kviat;

public class FootballPlayer {
    private String firstName;
    private String lastName;
    private int age;
    private String position;


    public FootballPlayer(String firstName, String lastName, int age, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Перевизначений метод toString
    @Override
    public String toString() {
        return "FootballPlayer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }
}