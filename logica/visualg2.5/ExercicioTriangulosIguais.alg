algoritmo "ExercicioTriangulosIguais"
// Função :
// Autor :
// Data : 11/19/2022
// Seção de Declarações 
var
   lado1, lado2, lado3: real
inicio

Escreval("Lado 1")
leia(lado1)
Escreval("Lado 2")
leia(lado2)
Escreval("Lado 3")
leia(lado3)

se (lado1 > lado2 + lado3) ou (lado2 > lado1 + lado1) ou (lado3 > lado1 + lado2) entao
   Escreval("Não é triângulo")
senao
     se (lado1 = lado2) e (lado2 = lado3) entao
        Escreval("Equilátero = Todos os lados são iguais.")
        senao
             se (lado1 = lado2) ou (lado2 = lado3) ou (lado1 = lado3) entao
                Escreval("Isóceles = Os dois lados são iguais.")
        senao
             Escreval("Escaleno = Nenhum lado é igual.")
        fimse
        fimse
     fimse

fimalgoritmo
