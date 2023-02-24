/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MeuPrimeiroProjeto;

/**
 *
 * @author rafae
 */

import java.util.Scanner;

public class LeituraGravacao {

    public static void LeituraGravacao(String[] args) {
    
    Scanner leitor = new Scanner (System.in);
    
    int idade = leitor.nextInt();
    float cotacacaoDolar = leitor.nextFloat();
    double cocatacaoEuro = leitor.nextDouble();
    String nome = leitor.nextLine();
    String codigoRua = leitor.next();
    
    System.out.println("Texto que será exibido no comando");
    System.out.print("Texto que será exibido no console");
    
    }
}
