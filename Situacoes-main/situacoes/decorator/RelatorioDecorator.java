package situacoes.decorator;

public abstract class RelatorioDecorator implements Relatorio {
    protected Relatorio relatorio;

    public RelatorioDecorator(Relatorio relatorio) {
        this.relatorio = relatorio;
    }
}
