Métodos precisam estar dentro de uma classe. São responsáveis por definir e realizar um determinado comportamento.

# Criação

<?visibilidade?> <?tipo?> <?modificador?> retorno nome (<?parâmetros?>) <?exceções?> corpo

V: public, protected, private
T: concreto ou abstrato
M: static ou final
R: tipo de dado ou void
N: nome que é fornecido ao método
P: parâmetros que pode receber
E: exceções que pode lançar
C: código que possui ou vazio

## Forma mais utilizada:

*public static R N(P) {  }*

Classe: letra maiúscula
Math.random()

Objeto: letra minúscula
usuario.getEmail()

## Assinatura

Forma de identificar unicamente o método.

Ass = nome + parâmetros

Método:
*public double calcularTotalVenda (double precoItem1, double precoItem2, double precoItem3) { . . . }*

Assinatura:
*calcularTotalVenda (double precoItem1, double precoItem2, double precoItem3) { . . . }*


## Construtor e Destrutor

Métodos especiais usados na Orientação a Objetos.

## Mensagem

Ato de solicitar ao método que o mesmo execute.

## Passagem de parâmetros

- Por cópia:

*int i = 10;*
*public void fazerAlgo (int i) {*
    *i = i + 10;*
    *System.out.println("Valor de i dentro: " + i)*   // 20
    *}*
*System.out.println("Valor de i fora: " + i)* // 10 

## Boas práticas

- camelCase;
- possuir entre 80 e 120 linhas;
- nomes descritivos, mas curtos;
- evite lista de parâmetros longa;
- visibilidades adequadas.