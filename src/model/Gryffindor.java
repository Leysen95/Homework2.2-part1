package model;

import java.util.Objects;

public class Gryffindor extends Hogwarts {

    private final int nobility;

    private final int honor;

    private final int bravery;

    public Gryffindor(String name, int transgression, int magicPower, int nobility, int honor, int bravery) {
        super(name, transgression, magicPower);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void compareGryffindorStudents(Gryffindor student) {
        if (getPower() > student.getPower()) {
            System.out.println(String.format("%s лучший Гриффиндорец, чем %s", this, student));
        } else if (getPower() < student.getPower()) {
            System.out.println(String.format("%s лучший Гриффиндорец, чем %s", student, this));
        } else {
            System.out.println("Студенты равны");
        }
    }

    private int getPower() {
        return bravery + honor + nobility;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }


    public String toStringFullInfo() {
        return "Gryffindor{" +
                "name='" + name + '\'' +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
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
        if (!(o instanceof Gryffindor that)) return false;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nobility, honor, bravery);
    }
}
