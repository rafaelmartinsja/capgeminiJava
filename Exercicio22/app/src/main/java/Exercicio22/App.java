package Exercicio22;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        String nomeProduto;
        float precoCusto;
        float precoVenda;
        
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        
        Scanner leitor = new Scanner(System.in);
        
        int i = 0;
        for (;i < 5; i++) {
            
            System.out.println("Digite o nome do produto");
            nomeProduto = leitor.nextLine();
            
            
            System.out.println("Digite o preço do produto");
            precoCusto = leitor.nextFloat();

            System.out.println("Digite o preço de venda do produto");         
            precoVenda = leitor.nextFloat();
            
            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;
            
            if (precoCusto == precoVenda) {
                System.out.println("Houve um empate entre o preço do produto e o custo de venda");
            } else {
                if(precoCusto > precoVenda) {
                    System.out.println("Prejuizo");
                } else {
                    System.out.println("Lucro");
                }
            }
            
            System.out.println(nomeProduto + ", preço de custo = " + precoCusto + ", precoCusto de venda = " + precoVenda);
        }
        
        System.out.println("A média é de do preço de custo é de: " + (totalCusto / i));
        
        System.out.println("A média é de do preço de custo é de: " + (totalVenda / i));
    }

    Object getGreeting() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getGreeting() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
