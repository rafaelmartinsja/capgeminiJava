algoritmo "Exercicios"

var
   gabarito : vetor[1..10] de literal
   opcaoMenu : literal
   notaFinal : inteiro

procedimento mostrarMenu()
inicio
      escreval("1 - Cadastrar Gabarito")
      escreval("2 - Cadastrar Prova")
      leia(opcaoMenu)
fimprocedimento

//Verifica Situação se Aprovado ou Reprovado.

procedimento cadastrarGabarito()
var
   i: inteiro
inicio
      para i de 1 ate 10 faca
           escreval("Informe a resposta da questao ",i)
           leia(gabarito[i])
      fimpara
fimprocedimento

//Cadastrar Prova

funcao cadastrarProva() : inteiro
var
   i,nota: inteiro
   resposta : literal
inicio
      nota <- 0
      para i de 1 ate 10 faca
           escreval("Informe a resposta da questao ",i)
           leia(gabarito[i])
           se resposta = gabarito[i] entao
              nota <- nota + 1
           fimse
           retorne nota
      fimpara
fimfuncao

//Verifica Situação se Aprovado ou Reprovado.

funcao verificarSituacao(nota:inteiro) : literal
inicio
      se nota >= 7 entao
         retorne "Aprovado"
      senao
           retorna "Reprovado"
      fimse
fimfuncao

inicio

//Executa a ação de ver se estar aprovado além de consultar o gabarito.

repita
      mostrarMenu()
      escolha opcaoMenu
              caso "1"
                   cadastrarGabarito()
              caso "2"
                   notaFinal <- cadastrarProva()
                             escreval(verificarSituacao(notaFinal))
              outrocaso
                       escreval("Opção inválida")
      ate opcaoMenu = "3"

fimalgoritmo
