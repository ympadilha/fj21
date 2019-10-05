import java.util.Calendar;

public class Contato {

    private final Long id;
    private final String nome;
    private final String email;
    private final String endereco;
    private final Calendar dataNascimento;

    public Contato(Long id, String nome, String email, String endereco, Calendar dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public Contato(Long id, String nome, String email, String endereco, java.sql.Date dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;

        Calendar calendar = Calendar.getInstance();
        java.util.Date utilDate = new java.util.Date(dataNascimento.getTime());
        calendar.setTime(utilDate);
        this.dataNascimento = calendar;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                ", dataNascimento=" + dataNascimento.getTime() +
                '}';
    }
}
