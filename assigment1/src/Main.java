import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, NoSuchAlgorithmException {
        int count = 0;
        boolean isTrue = false;
        RunTimer time = new RunTimer(isTrue, count);
        Main_Operations main_op = new Main_Operations(isTrue, count);
        main_op.call_op(isTrue, count);

    }
}