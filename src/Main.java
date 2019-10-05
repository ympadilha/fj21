import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Contato contato = new Contato(0L, "Caelum","contato@caelum.com.br", "R. Vergueiro 3185 cj57", Calendar.getInstance());
        ContatoDAO dao = new ContatoDAO();
        dao.adiciona(contato);
        System.out.println("Gravado!");
    }
}
