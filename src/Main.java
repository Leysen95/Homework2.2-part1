import model.*;

public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 36, 76, 39, 40, 51);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 75, 63, 27, 76, 28);
        Gryffindor ronWeasley = new Gryffindor("Rom Weasley", 25, 56, 74, 98, 24);

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 37, 65, 75, 38, 56, 65, 67);
        Slytherin grahamMontague = new Slytherin("Graham Montague", 56, 85, 36, 42, 59, 67, 96);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 43, 49, 74, 57, 64, 82, 73);

        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith", 56, 87, 38, 56, 98);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 38, 54, 49, 72, 63);
        Hufflepuff justinFinchFlatchley = new Hufflepuff("Justin Finch-Flatchley", 57, 60, 39, 47, 56);

        Ravenclaw choChang = new Ravenclaw("Cho Chang", 56, 75, 68, 35, 46);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 38, 63, 82, 60, 84);
        Ravenclaw marcusBeloy = new Ravenclaw("Marcus Beloy", 45, 67, 81, 70, 68);

        harryPotter.compareGryffindorStudents(ronWeasley);
        dracoMalfoy.compareSlytherinStudents(gregoryGoyle);
        cedricDiggory.compareHufflePuffStudents(zachariasSmith);
        padmaPatil.compareRavenclawStudents(marcusBeloy);

        Hogwarts.compareHogwartsStudents(harryPotter, padmaPatil);
    }
}