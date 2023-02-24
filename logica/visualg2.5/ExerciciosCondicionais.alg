algoritmo "Exercicos - Condicionais 1"
// Função :
// Autor :
// Data : 11/19/2022
// Seção de Declarações 
var
   VelocidadeVeiculo, VelocidadeLeve, VelocidadeMedia, VelocidadeGrave, VelocidadeGravissima: real
inicio
      VelocidadeLeve <- 50 * 1.1
      VelocidadeMedia <- 70
      VelocidadeGrave <- 90
      VelocidadeGravissima <- 110
      
      Escreval("Informe a velocidade que o veículo passou: ")
      leia(VelocidadeVeiculo)
      
      se VelocidadeVeiculo <= VelocidadeLeve entao
         Escreval("Isento")
      senao
           se VelocidadeVeiculo <= VelocidadeMedia entao
              Escreval("3 pontos na carteira")
      senao
           se VelocidadeVeiculo <= VelocidadeGrave entao
              Escreval("4 pontos na carteira")
      senao
           se VelocidadeVeiculo <= VelocidadeGrave entao
              Escreval("4 pontos na carteira")
      senao
           se VelocidadeVeiculo <= VelocidadeGravissima entao
              EscrevaL("5 pontos na carteira")
      senao
           EscrevaL("7 pontos na carteira")
      fimse
      fimse
      fimse
      fimse
      
fimalgoritmo
fimse
