algoritmo "Vetores2"
// Fun??o :
// Autor :
// Data : 11/22/2022
// Se??o de Declara??es
var
   vetorNomes : vetor[1..5] de literal
   pesquisa : literal
   i, sucesso : inteiro
   encontrado : logico
inicio

para i de 1 ate 5 faca
     Escreval("Informe seu nome")
     leia(vetorNomes[i])
fimpara
     limpatela
     
     Escreval("Informe um nome a pesquisar")
     leia(pesquisa)
     
     sucesso <- 0
     
     para i de 1 ate 5 faca
          se vetorNomes[i] = pesquisa entao
             encontrado <- 1
          fimse
     fimpara
     
     se sucesso = 1 entao
        escreval("Cliente Encontrado")
     senao
          escreval("Cliente n?o encontrado")
     fimse

fimalgoritmo
