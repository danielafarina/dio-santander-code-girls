# Sobrecarga

É a capacidade de definir métodos para diferentes contextos, mas preservando seu nome. Para tal, mudamos a lista de parâmetros, mudando a assinatura do método e adequando-o ao contexto.

Lembrando que assinatura = nome + parâmetros

Ex de sobrecargas:

*converterParaInteiro(float f);*
*converterParaInteiro(double d);*
*converterParaInteiro(String s);*
*converterParaInteiro(String s, RoundType rd);*
*converterParaInteiro();*

*println()*
*println(boolean x)*
*println(char x)*

*valueOf(boolean b)*
*valueOf(char[ ] data)*
*valueOf(int i)*

É muito comum utilizar sobrecargas.

# Sobrescrita

Tem a ver com herança, com orientação a objetos.