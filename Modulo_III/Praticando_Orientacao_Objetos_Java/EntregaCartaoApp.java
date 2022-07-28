import java.util.ArrayList;

public class EntregaCartaoApp {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.cep  = "00000000";
        // dados do endereço

        Cliente cliente = new Cliente();
        // dados do cliente

        // if(cliente.enderecos == null) {
        //     cliente.enderecos = new ArrayList<Endereco>();
        // }


        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereco adicionado com sucesso");
        } catch (Exception e) {
            System.err.println("Houve um erro ao adicionar endereco: " + e.getMessage());
        }        
        
    }
}
