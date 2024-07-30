package model;

import java.util.Objects;

public class Slytherin extends Hogwarts{

    private final int cunning;

    private final int determination;

    private final int ambition;

    private final int resourcefulness;

    private final int thirstForPower;

    public Slytherin(String name, int transgression, int magicPower, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, transgression, magicPower);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

      public void compareSlytherinStudents(Slytherin student) {
        if (getPower() > student.getPower()) {
            System.out.println(String.format("%s лучший Слизеринец, чем %s", this, student));
        } else if (getPower() < student.getPower()) {
            System.out.println(String.format("%s лучший Слизеринец, чем %s", student, this));
        } else {
            System.out.println("Студенты равны");
        }
    }

    private int getPower() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public String toStringFullInfo() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                ", name='" + name + '\'' +
                ", transgression=" + transgression +
                ", magicPower=" + magicPower +
                '}';
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Slytherin slytherin)) return false;
        return cunning == slytherin.cunning && determination == slytherin.determination && ambition == slytherin.ambition && resourcefulness == slytherin.resourcefulness && thirstForPower == slytherin.thirstForPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cunning, determination, ambition, resourcefulness, thirstForPower);
    }
}
