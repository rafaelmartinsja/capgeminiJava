/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MeuPrimeiroProjeto;

public class App {
    public String getGreeting() {
        return "Olá Mundo!";
    }

    //Comentário de linha
    
    /* Comentário de multiplas linhas 
        Olha só como funciona...
    */
    
    /** Comentário de documentação 
     Serve para gerar uma documentação para terceiros por exemplo.
     */
    
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println("Meu primeiro programa em Java");
    }
}
