import entitis.Esercizio1;

public class Main {
    public static void main(String[] args) {
        // Create a new instance of the class
        Esercizio1 areaEPerimetro = new Esercizio1(30,40);
        System.out.println(areaEPerimetro);
        Esercizio1 areaEPerimetro2 = new Esercizio1(30,40,10,20);
        System.out.println(areaEPerimetro2.areaEPerimetroDiDueRettangoli());
    }
}
