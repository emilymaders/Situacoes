package situacoes.decorator;

public class Rodape extends RelatorioDecorator {
    public Rodape(Relatorio relatorio) {
        super(relatorio);
    }

    public String gerar() {
        return relatorio.gerar() + "\nRodapé do relatório";
    }
}
