package ConexaoBanco;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBanco {
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/boletim","root","");
        }catch (Exception erro){
            throw new RuntimeException(erro);
        }
    }
    public static void main(String[] args) {
        try{
            new ConexaoBanco().getConnection();
            JOptionPane.showMessageDialog(null,"CONEXÃO COM ÊXITO");
        }catch (Exception erro){
            JOptionPane.showMessageDialog(null,"ERRO NA CONEXÃO "+ erro);
        }
    }
}