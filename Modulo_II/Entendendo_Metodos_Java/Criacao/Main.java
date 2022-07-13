public class Main {

    public static void main(String[ ] args) {

        // Calculadora
        System.out.println("Exercício calculadora:");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(3, 6);
        Calculadora.multiplicacao(3,6);
        Calculadora.divisao(3,6);

        // Mensagem
        System.out.println("Exercício mensagem:");
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(22);
        Mensagem.obterMensagem(-2);

        // Empréstimo
        System.out.println("Exercício empréstimo:");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
    
}