algoritmo "Tabela Verdade"
// Fun??o :
// Autor :
// Data : 11/19/2022
// Se??o de Declara??es 
var
  afirmacao: logico
  i, j: inteiro
inicio
      i: <- 10
      j: <- 20
         // sim E nao = n?o
         // sim E sim = sim
         // n?o E n?o = n?o
      
         // sim OU sim = sim
         // n?o ou n?o = sim
         // sim ou n?o = sim
         
      se (i = 10) e (j = 20) entao
            Escreval("Fazer algo")
      senao
            Escreval("N?o fazer nada")
      fimse
fimalgoritmo
