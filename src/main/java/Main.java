import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    static void main(String[] args) throws Exception{

        String url = "jdbc:mysql://localhost:3306/escola";
        String uname = "root";
        String pass = "1234";
        String query = "insert into estudante values (5, \"Andrei Pereira\", 16, \"Computaçao\")";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        int count = st.executeUpdate(query);

        System.out.println("Total de estudantes : " + count);


        st.close();
        con.close();
    }
}




