package MeuPrimeiroProjeto;

import  java.util.Scanner;

public class ExerciceQuinze {
    
    public static void ExerciceQuinze(String[] args) {
        
        int numero;
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Dgite um valor.");
        numero = leitorScanner.nextInt();
        
        if (numero >= 100 && numero <= 200) {
            System.out.println("O número está no intervalo.");
        } else {
           System.out.println("O número não está no intervalo."); 
        }
    
    }
    
}
