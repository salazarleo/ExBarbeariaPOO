import java.util.List;
import java.util.ArrayList;

public class Clientes {
    private String nome;
    private int idade;
    private String telefone;

    private static ArrayList<Clientes> clientes = new ArrayList<>();


    public Clientes(String nome, int idade, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    public static void CadastraCliente(Clientes cliente) {
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!" + cliente.nome);

    }

    public static void ListarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Não existe clientes cadastrados!");
        } else {
            for (Clientes cliente : clientes) {
                System.out.println(cliente.nome);
                System.out.println(cliente.idade);
                System.out.println(cliente.telefone);
            }
        }

    }


    // Método para buscar cliente por nome
    public static Clientes buscarClientePorNome(String nome) {
        for (Clientes cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                return cliente;
            }
        }
        return null;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
