package jdbc.test;

import jdbc.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String args[]){
        try {
            Connection conexao = new ConnectionFactory().getConnection();
            System.out.println("Conexão aberta");
            conexao.close();
        }catch(SQLException e){
            System.out.println("e");
        }
    }
}
