package entitis.esercizio2;

public class Sim {
    // Attributi
    private String cellNumber;
    private int simCredit;

    // Costruttori
    public Sim(String cellNumber) {
        this.cellNumber = cellNumber;
        this.simCredit = 0;
}

public void stamp(){
        System.out.println("Cell Number: " + this.cellNumber);
        System.out.println("Sim Credit: " + this.simCredit);
}

public void addCredit(int credit){
        this.simCredit +=credit;}
}




