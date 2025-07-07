import java.util.ArrayList;
import java.util.List;
import situacoes.Composite.EmpresaComponente;

public class Gerente implements EmpresaComponente {
    private String nome;
    private String cargo;
    private List<EmpresaComponente> subordinados = new ArrayList<>();

    public Gerente(String nome, String cargo) {
        this.nome = nome;

        this.cargo = cargo;
    }

    public void adicionar(EmpresaComponente funcionario) {
        subordinados.add(funcionario);
    }

    public void remover(EmpresaComponente funcionario) {
        subordinados.remove(funcionario);
    }

    @Override
    public void exibirDados() {
        System.out.println(cargo + ": " + nome);
        for (EmpresaComponente e : subordinados) {
            System.out.print("  ");
            e.exibirDados();
        }
    }
}
