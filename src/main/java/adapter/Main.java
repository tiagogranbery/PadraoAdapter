package adapter;

public class Main {

    public static void main(String[] args) {

        System.out.println(
                "=================================="
        );

        System.out.println(
                " ADAPTER - HAMBURGUERIA "
        );

        System.out.println(
                "=================================="
        );

        SistemaPagamentoAntigo sistemaAntigo =
                new SistemaPagamentoAntigo();

        Pagamento pagamento =
                new PagamentoAdapter(
                        sistemaAntigo
                );

        ((PagamentoAdapter) pagamento).pagar(35.90);

        System.out.println(
                "\n=================================="
        );

        System.out.println(
                " Pagamento concluído!"
        );

        System.out.println(
                "=================================="
        );
    }
}