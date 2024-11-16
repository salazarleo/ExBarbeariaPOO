
import java.util.ArrayList;
import java.util.List;

public class Agendamento {
    private String nomeCorte;
    private String horario;
    Clientes clientes;

    private static ArrayList<Agendamento> agendamentos = new ArrayList<>();

    public Agendamento(String nomeCorte, Clientes clientes, String horario) {
        this.nomeCorte = nomeCorte;
        this.clientes = clientes;
        this.horario = horario;
    }


    public static void CriarAgendamento(Agendamento agendamento) {
        agendamentos.add(agendamento);
        System.out.println("Agendamento criado com sucesso!" + agendamento.clientes.getNome());
    }

    public static void ListarAgendamento() {
        if (agendamentos.isEmpty()) {
            System.out.println("Não existe Agendamentos!");
        } else {
            for (Agendamento agendamento : agendamentos) {
                System.out.println("Nome: " + agendamento.clientes.getNome() + "  Corte: " + agendamento.nomeCorte + "  Horario: " + agendamento.horario);
            }
        }

    }


    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNomeCorte() {
        return nomeCorte;
    }

    public void setNomeCorte(String nomeCorte) {
        this.nomeCorte = nomeCorte;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }
}
