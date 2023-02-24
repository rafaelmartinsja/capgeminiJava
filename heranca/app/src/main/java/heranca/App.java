package heranca;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) {
        
        Vendedor v = new Vendedor();
        v.setNome("Marcio");
        v.setSalario(1000.0f);
        v.setCpf("12128556688");
        v.setDataNascimento(new Date());
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);
                
        System.out.println("O salário do vendedor é: " + v.calcularSalario());
        
        Motorista m = new Motorista();
    }
    
}
