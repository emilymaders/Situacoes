package situacoes.Composite;

public class MainComposite {
    public static void main(String[] args) {
 
        EmpresaComponente dev1 = new Funcionario("Juliana", "Desenvolvedora Júnior");
        EmpresaComponente dev2 = new Funcionario("Bruno", "Desenvolvedor Pleno");
        EmpresaComponente suporte = new Funcionario("Sid", "Suporte Técnico");

        
        Gerente gerenteTI = new Gerente("Fernanda", "Gerente de TI");
        gerenteTI.adicionar(dev1);
        gerenteTI.adicionar(dev2);

        
        Gerente diretora = new Gerente("Patrícia", "Diretora de Tecnologia");
        diretora.adicionar(gerenteTI);
        diretora.adicionar(suporte);

 
        diretora.exibirDados();
    }
}