public class RodarFuncionario {
    public static void main(String[] args) {

        // Upcasts implicitos:
        Funcionario f = new Funcionario(); // peguei uma classe e instanciei um objeto nela
        Funcionario g = new Gerente(); // funcionario é o supertipo das classes gerente, vendedor e faxineiro
        Funcionario v = new Vendedor();
        Funcionario fx = new Faxineiro();

        // Downcast (explicitos):
        Vendedor v_ = (Vendedor) new Funcionario(); // melhor não trabalhar com downcast; embora um conceito válido, melhor ser evitado.

        // Assim eu nao posso fazer:
        // Gerente g_ = new Funcionario();

        
    }
}
