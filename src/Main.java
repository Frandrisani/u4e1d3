import entitis.Esercizio1;
import entitis.esercizio2.Sim;
import entitis.esercizio3.Articoli;
import entitis.esercizio3.Cliente;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Seleziona l'esercizio da eseguire: ");
        n = sc.nextInt();
        switch (n) {
            case 1:
            // ESERCIZIO 1
            Esercizio1 areaEPerimetro = new Esercizio1(30, 40);
            System.out.println(areaEPerimetro);
            Esercizio1 areaEPerimetro2 = new Esercizio1(30, 40, 10, 20);
            System.out.println(areaEPerimetro2.areaEPerimetroDiDueRettangoli());
            break;
            case 2:
                //ESERCIZIO 2
                Sim sim = new Sim("3278689809");
                sim.stamp();
                System.out.println("Vuoi effettuare una ricarica?: Si=1/No=2");
                int y = sc.nextInt();
                if (y == 1) {
                    System.out.println("Seleziona il formato ricarica da effettuare: 5/10/20/50 euro ");
                int credit = sc.nextInt();
                switch (credit){
                    case 5:
                        sim.addCredit(5);
                    sim.stamp();
                    break;
                    case 10:
                        sim.addCredit(10);
                        sim.stamp();
                        break;
                    case 20:
                        sim.addCredit(20);
                        sim.stamp();
                        break;
                    case 50:
                        sim.addCredit(50);
                        sim.stamp();
                        break;
                    default:
                        System.out.println("Errore");
                }
        }
                break;
                case 3:
                    //ESERCIZIO 3
                    int j;
                    System.out.println("Seleziona 1 per articoli, 2 per clienti: ");
                    j = sc.nextInt();
                    switch (j) {
            case 1:
                //ARTICOLI
                Articoli articolo1 = new Articoli("dsd234", "Bello", 100, 100);
                System.out.println(articolo1);
                break;
            case 2:
                //CLIENTI
                int x;
                System.out.println("Seleziona 1 per visualizzare cliente, 2 per aggiungere cliente: ");
                x = sc.nextInt();
                switch (x) {
                    case 1:
                        Cliente c = new Cliente("Mario", "Rossi", "<ciao@gmail.com>");
                        System.out.println(c);
                        break;
                    case 2:
                        System.out.println("Inserisci Nome: ");
                        sc.nextLine(); // aggiungi questa riga per consumare il carattere di a capo lasciato da nextInt()
                        String nome = sc.nextLine();
                        System.out.println("Inserisci Cognome: ");
                        String cognome = sc.nextLine();
                        System.out.println("Inserisci Email: ");
                        String email = sc.nextLine();
                        Cliente c1 = new Cliente(nome, cognome, email);
                        System.out.println(c1);

                        break;
                    default:
                        System.out.println("Seleziona una scelta valida");
                }
                break;
            default:
                System.out.println("Seleziona una scelta valida");
        }
                    break;
            default:
                System.out.println("Seleziona una scelta valida");
        }
        sc.close();
    }
}
