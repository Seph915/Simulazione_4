/*It is possible to implement constructors, setter, getters or any other additional method
        where it is considered necessary.
        1. Declare a class Student with the following instance variables:
        - name: String
        - identifier: long
        - averageGrade: double
        2. Implement a method printNameFirstHalf that takes an array of Student objects as
        parameter and prints to the terminal the first half ([0, length/2]) of the name string of
        each element of the array.
        3. Implement a main method where:
        - An array of 3 Student objects is allocated.
        - The method printNameFirstHalf is called, passing the allocated array as
        parameter.
        - The value of the averageGrade attribute for each element of the array is
        printed to screen, if for that specific element averageGrade < 20.0.*/

public class Student {
    private String name;
    private long identifier;
    private double averageGrade;

    public Student(String name, long identifier, double averageGrade) {
        this.name = name;
        this.identifier = identifier;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public void setIdentifier(long identifier) {
        this.identifier = identifier;
    }

    public double getAverageGrade() {
        return averageGrade;
    }
}
