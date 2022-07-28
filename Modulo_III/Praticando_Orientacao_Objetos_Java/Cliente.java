import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

    // public Integer codigo;
    // public String nome;
    // public String documento; // pode começar por 0, por isso é uma string

    // public String endereco;
    // public String numero;
    // public String complemento;
    // public String bairro;
    // public String estado;
    // public String cep;

    // public String endereco1;
    // public String numero1;
    // public String complemento1;
    // public String bairro1;
    // public String estado1;
    // public String cep1;

    // ao invés de fazer isso, melhor criar a classe endereço!

    // public Endereco endereco;
    // public Endereco enderecoEntrega;
    // public Endereco enderecoTrabalho;

    // mas eu ainda não estou trabalhando de forma OO. Então eu faço assim:

    public String numCartao;    
    private List<Endereco> enderecos; // pra vc acessar os enderecos, precisará ir pelos métodos get/setter abaixo.
    
    public void setEnderecos(List<Endereco> enderecos) {
        if (enderecos == null) enderecos = new ArrayList<Endereco>();
        this.enderecos = enderecos;
    }

    public void adicionaEndereco(Endereco endereco) {
        if (endereco == null) {
            throw new NullPointerException("Endereco nao pode ser nulo");
        }
        if (endereco.cep == null) {
            throw new NullPointerException("Cep nao pode ser nulo");
        }
        getEnderecos().add(endereco);

    }
    
    private List<Endereco> getEnderecos() {
        return enderecos;
    }
    
}
