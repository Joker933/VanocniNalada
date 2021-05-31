package cz.educanet;
import java.sql.*;
import java.util.Scanner;

public class Insert {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/ops", "root", "");

        String newjmeno;
        String newobsah;
        String newheslo;
        int newcenauzivatele;

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej jmeno");
        newjmeno = sc.nextLine();
        System.out.println("Zadej heslo");
        newheslo = sc.nextLine();
        System.out.println("Zadej obsah");
        newobsah = sc.nextLine();
        System.out.println("Zadej cenu uzivatele");
        newcenauzivatele = sc.nextInt();


        PreparedStatement preparedStatement = connection.prepareStatement
                ("INSERT INTO data VALUES(NULL, ?, ?, ?, ?);");

        preparedStatement.setString(1, newjmeno);
        preparedStatement.setString(2, newheslo);
        preparedStatement.setString(3, newobsah);
        preparedStatement.setInt(4, newcenauzivatele);

        preparedStatement.executeUpdate();

        preparedStatement.close();
        connection.close();
    }
}
