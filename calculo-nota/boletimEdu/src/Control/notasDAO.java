package Control;

import ConexaoBanco.ConexaoBanco;
import Model.DadosNotas;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class notasDAO {
    public Connection conecta;

    public notasDAO(){
        conecta = new ConexaoBanco().getConnection();
    }
    public void cadastrarNotas(DadosNotas dados){
        try{
            String sql = "INSERT INTO nota(nome_materia, media,qnt_falta,situacao) " + "VALUES" +
                    "(?,?,?,?)";
            PreparedStatement inserir = conecta.prepareStatement(sql);
            inserir.setString(1,dados.getMateria());
            inserir.setDouble(2, dados.getMedia());
            inserir.setDouble(3,dados.getQnt_falta());
            inserir.setString(4,dados.getSituacao());
            inserir.execute();
            inserir.close();
            JOptionPane.showMessageDialog(null,"CADASTRO DO VEICULO EXITO");
        } catch(Exception erro){
            JOptionPane.showMessageDialog(null, "F" + erro);
        }
    }

}