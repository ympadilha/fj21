package exception;

import java.sql.SQLException;

public class DAOException extends RuntimeException {

    public DAOException(SQLException exception) {
        super("Algo de errado aconteceu no DAO!", exception);
    }
}
