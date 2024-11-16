import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("\n1. Cadastrar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Criar Agendamento");
            System.out.println("4. Listar Agendamentos");
            System.out.println("5. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();


            switch (opcao) {
                case 1:
                    System.out.print("Nome do Cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    Clientes cliente = new Clientes(nome, idade, telefone);

                    Clientes.CadastraCliente(cliente);
                    break;

                case 2:
                    Clientes.ListarClientes();
                    break;

                case 3:
                    System.out.print("Nome do Cliente para o Agendamento: ");
                    String nomeCliente = scanner.nextLine();

                    Clientes clienteEncontrado = Clientes.buscarClientePorNome(nomeCliente);
                    if (clienteEncontrado != null) {
                        System.out.print("Nome do Corte: ");
                        String nomeCorte = scanner.nextLine();

                        System.out.print("Horario: ");
                        String horario = scanner.nextLine();

                        Agendamento agendamento = new Agendamento(nomeCorte, clienteEncontrado, horario);
                        Agendamento.CriarAgendamento(agendamento);
                    } else {
                        System.out.println("Cliente não encontrado!");
                    }
                    break;


                case 4:
                    Agendamento.ListarAgendamento();
                    break;


                case 5:
                    System.out.println("Encerrando o sistema.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }


        }


    }


}


