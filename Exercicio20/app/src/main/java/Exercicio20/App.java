package Exercicio20;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        int anoFabricacao = 0;
        float valorVeiculo = 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;
        
        int totalCarrosSemiNovos = 0;
        int totalCarros = 0;
        
        Scanner leitor = new Scanner(System.in);
                
        char desejaRepetir = 's';
                        
        while (desejaRepetir == 's' || desejaRepetir == 'S') {
            
            System.out.println("Digite o ano de fabricação do veículo");
            anoFabricacao = leitor.nextInt();
            
            System.out.println("Digite o valor do veículo");
            valorVeiculo = leitor.nextFloat();
            
            if (anoFabricacao <= 2000) {
                porcentagemDesconto = 0.12f;
            } else {
                porcentagemDesconto = 0.07f;
                totalCarrosSemiNovos++;
            }
                totalCarros++;
            
            valorDesconto = valorVeiculo * porcentagemDesconto;
            valorPagar = valorVeiculo - valorDesconto;
            
            System.out.println("O desconto foi de: " + valorDesconto);
            System.out.println("O desconto foi de: " + valorPagar);
            
            System.out.println("Deseja fazer mais cadastros? S - Sim / N - Não");
            desejaRepetir = leitor.next().charAt(0);
        }
        
        System.out.println("O total de carros semi novos: " + totalCarrosSemiNovos);
        System.out.println("O total de carros: " + totalCarros);
    }
}
