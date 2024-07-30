package model;

public class Hogwarts {

    protected final String name;

    protected final int transgression;

    protected final int magicPower;

    public Hogwarts(String name, int transgression, int magicPower) {
        this.name = name;
        this.transgression = transgression;
        this.magicPower = magicPower;
    }

    public static void compareHogwartsStudents(Hogwarts student, Hogwarts student2) {
        if (student.getPower() > student2.getPower()) {
            System.out.println(String.format("%s обладает бОльшей мощностью магии, чем %s", student, student2));
        } else if (student.getPower() < student2.getPower()) {
            System.out.println(String.format("%s обладает бОльшей мощностью магии, чем %s", student2, student));
        } else {
            System.out.println("Студенты равны");
        }
    }

    private int getPower() {
        return transgression + magicPower;
    }

    public String getName() {
        return name;
    }

    public int getTransgression() {
        return transgression;
    }

    public int getMagicPower() {
        return magicPower;
    }
}
