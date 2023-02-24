algoritmo "Estruturas Condicionais 2"
// Função :
// Autor :
// Data : 11/19/2022
// Seção de Declarações
var
nota1, nota2, nota3, media: real
inicio
      Escreval("Informe a nota 1")
      leia(nota1)
      Escreval("Informe a nota 2")
      leia(nota2)
      Escreval("Informe a nota 3")
      leia(nota3)
      media <- (nota1+nota2+nota3)/3

      se media >= 7 entao
         Escreval("Você passou com a média: ", media)
      senao
         se media < 5 entao
            Escreval("Você passou com a média: ", media)
         senao
            Escreval("Você está de recuperação com a média: ", media)
         fimse
       fimse
fimalgoritmo
