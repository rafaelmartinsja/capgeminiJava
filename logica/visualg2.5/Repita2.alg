algoritmo "Repita2"
// Função :
// Autor :
// Data : 11/20/2022
// Seção de Declarações 
var
   senha, resposta: literal
   i:inteiro
inicio
      i <- 0
      escreval("Informe a senha")
      leia(senha)
      limpatela
      
      repita
            escreval("Digite a senha para sair do programa")
            leia(resposta)

      i <- i + 1

      se i = 5 entao
         interrompa
      fimse

      ate resposta = senha

fimalgoritmo
