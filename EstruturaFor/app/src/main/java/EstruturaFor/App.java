package EstruturaFor;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        
        int totalAlunos = 10;
        
        Scanner leitorScanner = new Scanner(System.in);
        
        while(totalAlunos > 0) {
            
            String nomeAluno = leitorScanner.nextLine();
            int idadeAluno = leitorScanner.nextInt();
            
            System.out.println("O nome do aluno é: " + nomeAluno + " e sua idade é: " + idadeAluno);
            
            
            totalAlunos = totalAlunos - 1;
        }
    }
}
