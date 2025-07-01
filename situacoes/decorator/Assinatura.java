package situacoes.decorator;

public class Assinatura extends RelatorioDecorator {
    public Assinatura(Relatorio relatorio) {
        super(relatorio);
    }

    public String gerar() {
        return relatorio.gerar() + "\nAssinado por: Diretor";
    }
}
