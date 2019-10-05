import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO {

    private Connection connection;

    public ContatoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Contato contato) {
        String sql = "insert into contatos (nome, email, endereco, dataNascimento) values (?, ?, ?, ?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getEmail());
            stmt.setString(3, contato.getEndereco());
            stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));

            stmt.execute();
            stmt.close();
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Contato> todosContatos() throws SQLException {
        List<Contato> contatos = new ArrayList<>();
        String sql = "select * from contatos";

        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Contato contato = new Contato(rs.getLong("id"),
                    rs.getString("nome"),
                    rs.getString("email"),
                    rs.getString("endereco"),
                    rs.getDate("dataNascimento"));

            contatos.add(contato);
        }

        rs.close();
        stmt.close();

        return contatos;
    }

}
