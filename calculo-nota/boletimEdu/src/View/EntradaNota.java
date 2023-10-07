package View;

import Model.DadosNotas;

import java.util.Scanner;

public class EntradaNota {
    public static void main(String[] args) {
        char continua = 'n';
        Scanner dalva = new Scanner(System.in);
        DadosNotas dadosNotas = new DadosNotas();
        while(continua != 'n') {
            System.out.println("digite a materia: ");
            dadosNotas.setMateria(dalva.nextLine());
            System.out.println("digite a nota do primeiro trimestre: ");
            dadosNotas.setNota1(dalva.nextDouble());
            System.out.println("digite a nota do segundo trimestre: ");
            dadosNotas.setNota2(dalva.nextDouble());
            System.out.println("digite a nota do terceito: ");
            dadosNotas.setNota3(dalva.nextDouble());
            System.out.println("deseja continuar?");
            continua = dalva.next().charAt(0);
            dadosNotas.enviarDados(dadosNotas);
        }

    }
}
