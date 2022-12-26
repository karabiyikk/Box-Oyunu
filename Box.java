package Proje2;

public class Box {
    public static void main(String[] args) {


        Fighter f1 = new Fighter("Myke Tyson", 10, 120, 100,70);
        Fighter f2 = new Fighter("Muhammed Ali", 20, 85, 85, 40);

        Match match = new Match(f1, f2, 85, 100);
        match.run();
        match.isChance();
    }
}
