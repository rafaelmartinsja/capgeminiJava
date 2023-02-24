algoritmo "Estruturas Condicionais"
// Função :
// Autor :
// Data : 11/19/2022
// Seção de Declarações 
var
nota1, nota2, nota3, media: real
inicio
      Escreva("Informe a nota 1")
      leia(nota1)
      Escreva("Informe a nota 2")
      leia(nota2)
      Escreva("Informe a nota 3")
      leia(nota3)
      media <- (nota1+nota2+nota3)/3
      
      se media < 7 entao
         Escreval("Você está de recuperação")
      senao
         Escreval("Você passou!")
      fimse
fimalgoritmo
