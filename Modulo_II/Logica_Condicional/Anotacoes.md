# Operadores Lógicos

Conjunção: Quando ambas são verdadeiras;

Disjunção: Quando ambas são falsas;

&&

|| 

Disjunção exclusiva: Quando ambos operandos são opostos;

^
xor

Negação

!

## Curiosidades

& 

 |

 ~

 \>\>

 \>\>\>

 não são operadores lógicos. São operadores de bits.


 ### Exemplo

 boolean b1 = true; boolean b2 = false; boolean b3 = true;
 
 b1 ^ b2  // true, pois só é verdadeiro quando são opostos
 b1 ^ b3 // false


# Boas Práticas

Crie variáveis auxiliares para guardar resultados intermediários

*(salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)*

pode virar:

*(salarioBaixo) && (muitosDependentes)*

que pode virar:

*boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes)*
*recebeAuxilio*



# Controle de Fluxo

Estruturas que mudam a direção em que o código é executado (da esquerda pra direita, de cima pra baixo):

decisão: if, switch

repetição: for

interrupção: break, continue, return


## Operador ternário

*condição ? se for true : se for false*

Caso não tenha o else:

*condição ? true : null*

## Boas Práticas

- Switch é para valores exatos e if para expressões booleanas;

- Evitar usar o default do switch para casos genéricos. Use ele pra indicar que o valor q vc passou está errado;

- Evitar o efeito flecha dos ifs: ifs aninhados, um dentro do outro;

- Criar variáveis intermediárias pra diminuir o tamanho do if.



# Blocos

é um grupo de 0 ou mais códigos quais trabalham em conjunto para executar uma operação

- locais;
- estáticos;
- instância;

abre uma chave e fecha para ter um bloco.

Exemplos:

- *if { .. }*

