# PE vs POO 

Paradigma estruturado tem uma representação mais simplista (linguagem estruturada é mais limitada), já o Paradigma Orientado a Objeto tem uma representação mais realista (linguagem orientada a objetos possui mecanismos mais avançados).

PE foca em funções e dados, já o POO foca na modelagem de entidades e nas interações entre estas.

PE foca no *como* fazer (pois o nível baixo de programação com pouco nível de abstração faz com que nos preocupemos em *como* fazer) e POO no *que* fazer (nível de abstração maior, podemos nos preocupar no *que* fazer). Quanto mais alto nível trabalhamos, mais a programação se torna fácil e isso contribui a automatizar nossos processos.

- Melhor coesão: as unidades de códigos tem responsabilidades bem definidas.

- Melhor acoplamento: são mais flexíveis, mais fáceis de serem alterados.

- Diminuição do Gap semântico (diferença de representação entre mundo real e mundo computacional).

- Coletor de lixo: a POO tem um mecanismo dinâmico de liberação de melhora. Em PE, você mesmo é que tem que ficar liberando memória.

# Definição

É um paradigma de análise, projeto e programação de sistemas de software baseado na composição e interação entre diversas unidades de software chamadas de objetos.

# Pilares

## Herança

## Encapsulamento

## Polimorfismo

Permite que um mesmo nome represente vários comportamentos diferentes. *Ex:* Método acordar() pode ser feito de várias formas diferentes (acordar pra trabalhar, acordar pra pedalar, acordar no domingo, etc).


# Fundamentos

## 1. Abstração

Processo pelo qual se isolam as características de um objeto, considerando os que tenham em comum certos grupos de objetos. Preocupa-se com as características *essenciais*, e não as acidentais. Ex: cadeira: assento, encosto e pernas: cadeira de praia, cadeira de trabalho, etc. Braço seria acidental.

## 2. Reuso

Capacidade de criar novas unidades de código a partir de outras já existentes.

## 3. Encapsulamento

Capacidade de esconder complexidades e proteger dados, evitando acessos indevidos.

### Exercício

Modele uma entidade livro para uma loja online de livros:

- páginas
- ISBN
- Assunto
- Editora
- Título
- Autor

Modele o software pensando nos problemas que vc tem **HOJE**. Não é bom tentar fazer tudo pensando no futuro.


# Estruturas básicas

## Classe

Unidade mínima e básica de codificação/implementação. É uma estrutura que abstrai um conjunto de objetos com características similares. Uma classe define o comportamento de seus objetos através de métodos e os estados possíveis destes objetos através de atributos. Em outros termos, uma classe descreve os serviços providos por seus objetos e quais informações eles podem armazenar. Para criar classes, precisaremos do fundamento 1, a abstração.

**Ex.:** bola, carro, viagem, computador, venda, comprador, etc.

*Dicas*

- substantivos
- nomes significativos
- contexto deve ser considerado (ex: pessoa, dependendo se for numa loja, é cliente, se for numa universidade, é aluno)

*Códigos*

Java: 

class Carro {
}

Python>

class Carro:
    pass

## Atributo

Elemento de uma classe responsável por definir sua estrutura de dados. O conjunto destes será responsável por representar suas características e fará parte dos objetos criados a partir da classe. Através dos atributos, caracterizamos as classes e seus futuros objetos. Ex: bola - atributo diâmetro; carro - atributo cor; computador - atributo memória; etc. Servem para representarmos o mundo real de maneira mais fidedigna.

*Atributo vs Variável*

Em PE, trabalhamos com variáveis, aquilo que muda, inconstante. Em POO trabalhamos com variáveis e atributos (aquilo que é peculiar a alguém).

*Códigos*

Java: 

class Carro {
    int portas;
}

Python>

class Carro:
    portas = 0

## Método

É uma porção de código (sub-rotina) que é disponibilizada pela classe. Este é executado quando é feita uma requisição a ele. Um método serve para identificar quais serviços, ações, que a classe oferece. Eles são responsáveis por definir e realizar um determinado comportamento. Ex: Carro - método ligar; computador - método desligar; venda - calcularTotal; etc.

Java:

- Visibilidade;
- Retorno;
- Nome;
- Parâmetros.

Python

- def;
- Nome;
- Parâmetros.

*Dicas*

Usar verbos, nomes significativos e considerar o contexto.

*Códigos*

Java: 

class Carro {
    void frear() {
        ...
    }
}

Python>

class Carro:
    def frear():

*Dois métodos especiais*

**CONSTRUTOR:**  constrói objetos a partir das nossas classes.

*Códigos*

Java: 

class Carro {
    Carro() { // não precisa colocar o retorno, pois será o mesmo da classe
        ...
    }
}

Python>

class Carro:
    def \__init__(self):


**DESTRUTOR:**  ajuda a acabar com os objetos.

*Códigos*

Java: 

class Carro {
    void finalize() {
        ...
    }
}

Python>

class Carro:
    def \__del__(self):

**SOBRECARGA:**  mudar a assinatura do método (nome + parâmetros) de acordo com a necessidade.


## Objeto

É a representação de um conceito/entidade do mundo real, que pode ser física (bola, carro, árvore etc.) ou conceitual (viagem, estoque, compra etc.) e possui um significado bem definido para um determinado software. Para esse conceito/entidade, deve ser definida inicialmente uma classe a partir da qual posteriormente serão instanciados objetos distintos.

*Códigos*

Java: 

Carro carro = new Carro();

Python:

carro = Carro()

## Mensagem

É o processo de ativação de um método de um objeto. Isto ocorre quando uma requisição (chamada) a esse método é realizada, assim disparando a execução de seu comportamento descrito por sua classe. Pode também ser direcionada diretamente à classe, caso a requisição seja a um método estático.

*Códigos*

Java: 

Carro carro = new Carro();
carro.<\método>;

Python:

carro = Carro()
carro.<\método>

## Instância vs Estático:  atributos e métodos

Pesquisar.

## Estado de um objeto

Valores de seus atributos.

## Identidade de um objeto

## Representação numéria de um objeto

## Representação padrão de um objeto


# Herança

É o relacionamento entre classes em que uma classe chamada de subclasse (classe filha, classe derivada) é uma extensão, um sutbtipo, de outra classe chamada de superclasse (classe pai, classe mãe, classe base). Devido a isto, a subclasse consegue reaproveitar os atributos e métodos dela. Além dos que venham a ser herdados, a subclasse pode definir seus próprios membros.

*Códigos*

Java: 

class A extends B { // A tá herdando de B
    ...
}

Python:

class A(B):
    ...

## Tipos de herança

### Simples

A classe filha só tem uma classe mãe.

### Múltipla

A classe filha tem 1 ou mais classes mãe. Python e C++ tem herança múltipla. Java e C# não têm.

### Upcast

Subir na hierarquia de classes. Ex: Transformar filha na mãe, transformar int em float. Int é classe derivada de float.

*Códigos*

Java: 

A a = new B();

Python:

não tem upcast.


### Downcast

Descer na hierarquia de classes. Não é aconselhável usar.

### Polimorfismo *** importantíssimo

É a mesma ação, se comportando diferente. Muitas formas para o mesmo método. *Ex:* Imagine uma entidade chamada Pagamento. Ele pode se *processar()* de várias formas diferentes: boleto, credito, debito, pix...

### Sobrescrita

É a mesma ação, *podendo* se comportar diferente. *Ex:* Imagine a entidade Conta que possui um atributo *saldo* e um método *exibirSaldo()*, que acrescenta algo a mais no método de apenas visualizar o saldo. Em contas corrente e universitária, basta exibir o saldo. Em contas poupança e especial (cheque especial), é preciso utilizar o método para mostrar o saldo corretamente (aplicando juros, etc.). Então nessas contas eu sobrescrevi a forma mais simples que era só de mostrar o valor.

### Polimorfismo vs Sobrescrita

O comportamento padrão do método é tão abstrato que não tem como vc prever as futuras diferenças no uso do mesmo (polimorfismo). 

Se você quiser, pode usar o que está na classe mãe, mas se quiser, pode fazer algo completamente diferente.

*ATENÇÃO*

Vide exemplo *RodarClasseMae.java*

# Associação

Possibilita um relacionamento entre classes/objetos, no qual estes possam pedir ajuda a outras classes/objetos e representar de forma completa o conceito ao qual se destinam. Neste tipo de relacionamento, as classes e os objetos interagem entre si para atingir seus objetivos.

## Associação Estrutural

Manifesta-se na estrutura, nos seus atributos.

#### Composição

A parte (endereço) só existe com o todo (pessoa).

*Códigos*

class Pessoa {
    Endereco endereco;
}

#### Agregação

A parte (disciplina) existe sem o todo (aluno).

*Códigos*

class Disciplina {
    Aluno aluno;
}

## Associação Comportamental

Manifesta-se nos métodos. *Ex:* 

Compra // entidade Compra
Cliente cliente
finalizar(Cupom cupom, ...)  // metodo depende do uso de outra entidade, chamada Cupom
finalizar(...)

*OBS.*

Herança vs Associação: Herança é mais rígido. Associação mais flexível. Posso usá-la enquanto rodo a aplicação.

# Interface

Define um contrato que deve ser seguido pela classe que a implementa. Quando uma classe implementa uma interface, ela se compromete a realizar todos os comportamentos que a interface disponibiliza. *Ex:* A impressora HP pode funcionar em Windows, Linux, iOS. Ela fornece uma interface, que é um conjunto de métodos que deverão ser implementados. Pessoal do Linux pega os métodos e implementa do jeito que acharem necessário.

"Essa é minha interface e os métodos que vou usar nelas. Você implementa do jeito que achar necessário."

É você obrigar um terceiro a implementar os métodos que você vai colocar dentro dela.

*Códigos:*

interface A {
    ...
}

class B implements A {

}


# Pacotes

São uma organização física ou lógica criada para separar classes com responsabilidades distintas. Com isso, espera-se que a aplicação fique mais organizada e seja possível separar classes de finalidades e representatividades diferentes.

*Códigos*

package

import // utilizado se quero uma classe que está em outro pacote

# Visibilidades

Um modificador de acesso tem como finalidade determinar até que ponto uma classe, atributo ou método pode ser usado. A utilização de modificadores de acesso é fundamental para o uso efetivo da Orientação a Objetos. Algumas boas práticas e conceitos só são atingidos com o uso correto deles.

## Private

Só será visível dentro da classe onde foi criada.

## Protected

Dentro da classe, **mesmo pacote** e subclasses.

## Public

Em qualquer lugar.