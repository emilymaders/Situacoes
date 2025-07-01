package situacoes.decorator;

public class ExemploRelatorio {
    public static void main(String[] args) {
        

        Relatorio relatorio = new RelatorioSimples();
        relatorio = new Cabecalho(relatorio);
        relatorio = new Assinatura(relatorio);
        relatorio = new Rodape(relatorio);

        System.out.println(relatorio.gerar());
    }
}
