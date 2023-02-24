algoritmo "Enquanto"
// Função :
// Autor :
// Data : 11/19/2022
// Seção de Declarações 
var
   alturaMarcelo, alturaJoao, crescimentoAnualMarcelo, crescimentoAnualJoao : real
   idade : inteiro
inicio

      alturaMarcelo <- 1.20
      alturaJoao <- 1.05
      crescimentoAnualMarcelo <- 0.05
      crescimentoAnualJoao <- 0.07
      
      enquanto alturaMarcelo >= alturaJoao faca
               alturaMarcelo <- alturaMarcelo + crescimentoAnualMarcelo
               alturaJoao <- alturaJoao + crescimentoAnualJoao
               idade <- idade + 1
      fimenquanto
      
      escreval("Idade ", idade)
      escreval("Altura João ", alturaJoao)
      escreval("Altura Marcelo ", alturaMarcelo)



fimalgoritmo
