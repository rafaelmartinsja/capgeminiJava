algoritmo "Triangulos2"
// Função :
// Autor :
// Data : 11/19/2022
// Seção de Declarações 
var
   lado1, lado2, lado3 : real
inicio
      lado1 <- 30
      lado2 <- 10
      lado3 <- 21
      
      se (lado1 > lado2 + lado3) ou (lado2 > lado1 + lado3) entao
         escreval("Não é um triângulo")
      fimse
fimalgoritmo
