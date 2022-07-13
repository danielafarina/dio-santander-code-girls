# Retorno

O tipo de retorno do método é definido na sua criação e pode ser um tipo primitivo ou objeto;

O tipo de dado do return deve ser compatível com o do método;

Se o método for sem retorno(void), pode ou não ter um "return" para encerrar sua execução.

Exemplos:

*public String getMsg() {*
*return "Olá!";*
*}*

*public void executar() {*
*return;*
*}*

Errados:

*public int getParcelas() {*
*return 1.36F;*
*}*

*public void setIdade() {*
*return 10; // retorno é void, pode ter o retorno, mas não pode retornar 10*
*}*

