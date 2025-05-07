package Es3;

public class Cliente {
    private int codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodiceCliente() {
        return codiceCliente;
    }

    public void setCodiceCliente(int codiceCliente) {
        this.codiceCliente = codiceCliente;
    }

    public void stampa() {
        System.out.println("Cliente: " + nome + " " + cognome);
        System.out.println("Codice Cliente: " + codiceCliente);
        System.out.println("Email: " + email);
        System.out.println("Data di Iscrizione: " + data);
    }

}
