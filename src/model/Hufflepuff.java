package model;

import java.util.Objects;

public class Hufflepuff extends Hogwarts{

    private final int hardworking;

    private final int loyal;

    private final int honest;

    public Hufflepuff(String name, int transgression, int magicPower, int hardworking, int loyal, int honest) {
        super(name, transgression, magicPower);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public void compareHufflePuffStudents(Hufflepuff student) {
        if (getPower() > student.getPower()) {
            System.out.println(String.format("%s лучший Пуффендуец, чем %s", this, student));
        } else if (getPower() < student.getPower()) {
            System.out.println(String.format("%s лучший Пуффендуец, чем %s", student, this));
        } else {
            System.out.println("Студенты равны");
        }
    }

    private int getPower() {
        return hardworking + loyal + honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    public String toStringFullInfo() {
        return "Hufflepuff{" +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
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
        if (!(o instanceof Hufflepuff that)) return false;
        return hardworking == that.hardworking && loyal == that.loyal && honest == that.honest;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hardworking, loyal, honest);
    }
}
