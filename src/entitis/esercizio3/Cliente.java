package entitis.esercizio3;
import java.time.LocalDate;

public class Cliente {
    // Attributi
    private String codCliente;
    private String nome;
    private String cognome;
    private String email;
    private String annoIscrizione;

    // Costruttori
    public Cliente() {
        this.codCliente = randomString(12);
        this.annoIscrizione = (LocalDate.now().getYear() + "/" + LocalDate.now().getMonthValue()+"/" + LocalDate.now().getDayOfMonth());
    }

    public Cliente(String nome, String cognome, String email) {
        this(); // chiama il costruttore senza parametri
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }

    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAnnoIscrizione(String annoIscrizione) {
        this.annoIscrizione = annoIscrizione;
    }

    // Getter
    public String getCodCliente() {
        return codCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public String getAnnoIscrizione() {
        return annoIscrizione;
    }

    // Metodi ausiliari
    private String randomString(int length) {
        return String.valueOf(Math.random()).substring(2, 2 + length);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codCliente='" + codCliente + '\'' +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", annoIscrizione=" + annoIscrizione +
                '}';
    }
}
