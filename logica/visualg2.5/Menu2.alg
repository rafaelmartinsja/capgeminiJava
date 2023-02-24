algoritmo "Menu2"
// Função :
// Autor :
// Data : 11/20/2022
// Seção de Declarações
var
   opcaoMenu : literal
   totalConta : inteiro
inicio

      totalConta <- 0

      repita
            escreval("1 - Troca de óleo")
            escreval("2 - Balanceiamento")
            escreval("3 - Sair")
            leia(opcaoMenu)
            se opcaoMenu = "1" entao
               totalConta <- totalConta + 100
            senao
            se opcaoMenu = "2" entao
                  totalConta <- totalConta + 70
            fimse
            fimse

            limpatela
      ate opcaoMenu = "3"
      Escreval("Total conta: R$",totalConta)
fimalgoritmo
