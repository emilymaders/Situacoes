package situacoes.decorator;

public class Cabecalho extends RelatorioDecorator {
    public Cabecalho(Relatorio relatorio) {
        super(relatorio);
    }

    public String gerar() {
        return "Cabeçalho do relatório\n" + relatorio.gerar();
    }
}
