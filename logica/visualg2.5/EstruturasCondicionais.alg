algoritmo "Estruturas Condicionais"
// Fun??o :
// Autor :
// Data : 11/19/2022
// Se??o de Declara??es 
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
         Escreval("Voc? est? de recupera??o")
      senao
         Escreval("Voc? passou!")
      fimse
fimalgoritmo
