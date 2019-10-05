import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {
        Contato novoContato = new Contato(0L, "Caelum","contato@caelum.com.br", "R. Vergueiro 3185 cj57", Calendar.getInstance());
        ContatoDAO dao = new ContatoDAO();
        dao.adiciona(novoContato);
        System.out.println("Gravado!");

        List<Contato> contatos = dao.todosContatos();

//        for (Contato contato : contatos) {
//            System.out.println(contato);
//        }

        // Java 8 abaixo
//        contatos.forEach(contato -> System.out.println(contato));
        contatos.forEach(System.out::println);
    }

}
