algoritmo "Extra"
// Fun??o :
// Autor :
// Data : 11/19/2022
// Se??o de Declara??es 
var
    altura, peso, imc : real
inicio

Escreval("Informe sua altura, por favor")
leia(altura)
Escreval("Informe seu peso, por gentileza")
leia(peso)
imc <- peso / altura ^ 2

se imc < 19 entao
   escreval("Abaixo do peso")
senao
     se imc < 24 entao
     escreval("Peso ideal")
senao
     escreval("Peso ideal")
fimse
fimse
fimalgoritmo
