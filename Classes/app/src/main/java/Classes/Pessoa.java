package Classes;

public class Pessoa {
    
    //Atritutos
    private float peso;
    private float altura;
    
    //Metodos
    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }
    
    // Método Construtor
    public Pessoa(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }
    
    //Métodos de Acesso (Gets and Sets)
    
   public void setPeso(float peso) {
       this.peso = peso;
   }
   
   public float getPeso() {
       return peso;
   }
   
   public void setAltura(float altura) {
       this.altura = altura;
   }
   
   public float getAltura() {
       return altura;
   }
}
