package entitis;

//Esercizio 1 -
public class Esercizio1 {
    //Attributi
    private int height1;
    private int width1;
    private int height2;
    private int width2;

    //Costruttore
    public Esercizio1(int height, int width) {
        this.height1 = height;
        this.width1 = width;
    }
    public Esercizio1(int height1, int width1, int height2, int width2) {
        this.height1 = height1;
        this.width1 = width1;
        this.height2 = height2;
        this.width2 = width2;
    }

    //Metodi
    private int area(){
        return this.height1 * this.width1;
    }
    private int perimeter(){
        return 2 * (this.height1 + this.width1);
    }

    public String areaEPerimetroDiDueRettangoli(){
        int a1 = this.area();
        int a2 = this.height2 * this.width2;
        int p1 = this.perimeter();
        int p2 = 2 * (this.height2 + this.width2);
        return "Esercizio 1/c \nArea1: " + this.area() + "\nPerimetro 1: " + this.perimeter() + "\nArea2: " + a2 + "\nPerimetro 2: " + p2 + "\nSomma Aree: " + (a1 + a2) + "\nSomma Perimetri: " + (p1 + p2);
    }


    public String toString(){
        return "Stampa dell'esercizio N.1a/b \nArea: " + this.area() + "\nPerimetro: " + this.perimeter()+"\n";
    }
}
