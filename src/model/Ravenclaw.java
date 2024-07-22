package model;

import java.util.Objects;

public class Ravenclaw extends Hogwarts{

    private final int wise;

    private final int witty;

    private final int creative;

    public Ravenclaw(String name, int transgression, int magicPower, int wise, int witty, int creative) {
        super(name, transgression, magicPower);
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public void compareRavenclawStudents(Ravenclaw student) {
        if (getPower() > student.getPower()) {
            System.out.println(String.format("%s лучший Когтевранец, чем %s", this, student));
        } else if (getPower() < student.getPower()) {
            System.out.println(String.format("%s лучший Когтевранец, чем %s", student, this));
        } else {
            System.out.println("Студенты равны");
        }
    }

    private int getPower() {
        return wise + witty + creative;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreative() {
        return creative;
    }

    public String toStringFullInfo() {
        return "Ravenclaw{" +
                "wise=" + wise +
                ", witty=" + witty +
                ", creative=" + creative +
                ", name='" + name + '\'' +
                ", transgression=" + transgression +
                ", magicPower=" + magicPower +
                '}';
    }
    @Override
    public String toString () {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ravenclaw ravenclaw)) return false;
        return wise == ravenclaw.wise && witty == ravenclaw.witty && creative == ravenclaw.creative;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wise, witty, creative);
    }
}
