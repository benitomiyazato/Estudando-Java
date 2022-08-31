package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

import java.util.ArrayList;

public class Employee {
    private String name;
    private int age;
    private ArrayList<Double> allEarnings = new ArrayList<>();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEarnings(double... earnings) {
        for (int i = 0; i < earnings.length; i++) {
            allEarnings.add(earnings[i]);
        }
    }

    public void printEarnings() {
        if (allEarnings == null) {
            System.out.println("Earnings is null");
            return;
        }
        for (int i = 0; i < allEarnings.size(); i++) {
            System.out.println(allEarnings.get(i));
        }
    }

    public void printEarningsAverage() {
        if (allEarnings == null) {
            System.out.println("Earnings is null");
            return;
        }
        double average = 0;
        for (double d : allEarnings) {
            average += d;
        }
        average /= allEarnings.size();
        System.out.printf("The average earning of this employee is %.2f dollars", average);
    }
}
