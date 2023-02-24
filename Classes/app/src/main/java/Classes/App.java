package Classes;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Pessoa objetoPessoa = new Pessoa(70.0f, 1.70f);        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("digite o peso da pessoa");
        objetoPessoa.setPeso(leitor.nextFloat());
        System.out.println("digite a altura da pessoa");
        objetoPessoa.setAltura(leitor.nextFloat());
        
        System.out.println("IMC = " + objetoPessoa.calcularIMC());
    }
}
