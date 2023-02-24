algoritmo "Enquanto3"
// Função :
// Autor :
// Data : 11/20/2022
// Seção de Declarações 
var

    maisNovo, maisVelho,qtdEntrevistados, idadeInformada : inteiro
    procentagemMenorIdade, mediaIdade, qtdMenoresIdade, somaIdades : real
    
inicio

      maisNovo <- 9999
      maisVelho <- 0
      qtdEntrevistados <- 0
      qtdMenoresIdade <- 0
      
      enquanto qtdEntrevistados < 5 faca
               Escreval("Favor, informe sua idade")
               leia(idadeInformada)
               
               se idadeInformada >= maisVelho entao
                  maisVelho <- idadeInformada
               fimse
                  
               se idadeInformada < maisNovo entao
                  maisNovo <- idadeInformada
               fimse
               
               se idadeInformada < 18 entao
                  qtdMenoresIdade <- qtdMenoresIdade + 1
               fimse
               
               somaIdades <- somaIdades + IdadeInformada
               qtdEntrevistados <- qtdEntrevistados + 1
                  
      fimenquanto
      
      Escreval("Mais novo ", maisNovo)
      Escreval("Mais novo ", maisVelho)
      procentagemMenorIdade <- (qtdMenoresIdade / 5) * 100
      Escreval("Porcentagem menor idade ",procentagemMenorIdade,"%")
      mediaIdade <- somaIdades / 5
      Escreval("Media de idade ",mediaIdade)

fimalgoritmo
