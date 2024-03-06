package entitis.esercizio3;

public class Articoli {
    //Attributi
    private String codArt;
    private String descrizione;
    private double prezzo;
    private int quantita;

    //Costruttore
    public Articoli(String codArt, String descrizione, double prezzo, int quantita) {
        this.codArt = codArt;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    //metodi


    @Override
    public String toString() {
        return "Articolo{" +
                "codArt='" + codArt + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                ", quantita=" + quantita +
                '}';
    }
}
