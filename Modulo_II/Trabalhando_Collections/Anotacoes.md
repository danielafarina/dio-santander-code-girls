# Collections

É um objeto que agrupa múltiplos elementos (variáveis primitivas ou objetos) dentro de uma única unidade.

Serve para armazenar e processar conjuntos de dados de forma eficiente.

## Composição

Interfaces: contrato que quando assumido por uma classe, dee ser implementado.

Implementações ou Classes: materializações, codificação das interfaces.

Algoritmos: sequências lógicas, finitas e definidas de instruções que devem ser seguidas para resolver um problema.

## Lists

Elementos duplicados e garante ordem de inserção.

ArrayList deve ser usado onde mais operações de pesquisa são necessárias, e LinkedList deve ser usado onde  mais operações de inserção e exclusão são necessárias.

## Comparable

O método para ordenar uma lista se encontra na classe *java.util.Collections* (repare o "s" no final). Ela possui métodos estáticos que ajudam a manipular coleções, entre eles o método sort. Assim podemos tentar ordenar a lista de contas:

*Collections.sort(lista);*

Mas infelizmente a linha acima nem compila. Antes de invocar o método sort é preciso definir o critério de ordenação: uma forma de informar, dado duas contas, qual vem "antes" e qual vem "depois".

Considerando que queremos ordenar pelo número da conta, a classe Conta implementar a interface java.lang.Comparable que define o que será nossa "ordem natural". A interface possui apenas um método compareTo:

*public interface Comparable {*
    *int compareTo(T outro);*
*}*

As contas então devem ser comparáveis. Vamos definir a ordem natural baseada no número da conta:

*public Conta implements Comparable {*
    *private int numero;*
    *private String titular;*
    *// outros metodos e atributos*
    *public int compareTo(Conta outraConta) {*
        *if (this.numero < outraConta.numero) {*
            *return -1;*
        *}*
        *if (this.numero > outraConta.numero) {*
            *return 1;*
        *}*
        *return 0;*
    *}*
*}*

Se o número da conta atual é menor do que da outraConta retormamos -1 (ou qualquer int negativo, indicando que this deve vir "antes" de outraConta), se for maior retornamos 1 (ou qualquer int positivo) e se for igual então devolvemos 0.

Agora podemos invocar Collections.sort(lista).

Mas se surgir a necessidade de ordenar pelo titular da conta? Não queremos alterar o método compareTo na classe Conta, já que isso mudaria a ordem natural. Queremos definir um outro critério de ordenação. Para tal, existe uma outra interface: a *Comparator*:

*public interface Comparator {*
    *int compare(T o1, T o2);*
*}*

Vamos então implementar a interface para definir a ordem pelo titular (String) da conta. Comparar duas Strings é difícil, mas, como você pode imaginar, esse problema já foi resolvido na API do Java.

A classe *String* já sabe comparar dois strings, sabemos isso pois ela implementa a interface Comparable (por esse mesmo motivo podemos invocar Collections.sort para uma List de String). Podemos então delegar essa tarefa ao método compareTo das Strings:

*public class TitularComparator implements Comparator {*
    *public int compare(Conta conta, Conta outraConta) {*
        *return conta.getTitular().*
                *compareTo(outraConta.getTitular());*
    *}*
*}*

Como escolher para que esse critério de comparação seja utilizado em vez da ordem natural? O método sort é sobrecarregado e pode receber um objeto do tipo Comparator:

*TitularComparator comparator = new TitularComparator();*
*Collections.sort(lista, comparator);*

Falta mencionar que o método compareTo da interface Comparable deve ser consistente com o método equals. Quando uma conta é igual a outra (a classe Conta sobreescreve o método equals para definir igualdade), o método compareTo deve devolver zero também. Devemos também pensar se receberemos null como Contas para ordenar, e tomar as devidas precauções nos comparadores.

Através de Comparable e Comparator também são controladas a ordenação da coleção TreeSet e as chaves do mapa TreeMap.

Vale lembrar que muita coisa mudou desde esse post, com a entrada do Java 8, e você pode ler sobre lambdas e outras facilidades que ajudam em funções como comparação aqui no blog da Caelum.

## Set

Não permite elementos duplicados;

Não possui índice;

## Map

Elementos únicos (key) para cada valor (value);

TreeMap = ordenação do map (O(log n));

HashTable = 

LinkedHashMap = O(1)

