package Model;

import Control.notasDAO;

public class DadosNotas {
    private String materia;
    private double nota1,nota2,nota3;
    private double media;
    private double qnt_falta;
    private String situacao;

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        media = (nota1+nota2+nota3) / 3;
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getSituacao() {
        if(media>= 6){
            situacao = "aprovado";
        }else{
            situacao = "reprovado";
        }
        return situacao;
    }

    public double getQnt_falta() {
        double conta_falta;
        conta_falta = (nota1+nota2+nota3) - 18;
        if(conta_falta >= 18){
            qnt_falta = 0;
        }else{
            qnt_falta = conta_falta;
        }
        return qnt_falta;
    }

    public void setQnt_falta(double qnt_falta) {
        this.qnt_falta = qnt_falta;
    }

    public void setSituacao(String situacao) {

        this.situacao = situacao;
    }
    public static void enviarDados(DadosNotas dados){
        notasDAO enviar = new notasDAO();
        enviar.cadastrarNotas(dados);
    }
}

