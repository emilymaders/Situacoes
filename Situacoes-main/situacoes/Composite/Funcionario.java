package situacoes.Composite;

public class Funcionario implements EmpresaComponente {
    private String nome;
    private String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    @Override
    public void exibirDados() {
        System.out.println(cargo + ": " + nome);
    }
}