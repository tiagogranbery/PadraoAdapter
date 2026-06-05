package adapter;

public class PagamentoAdapter extends Pagamento {

    private SistemaPagamentoAntigo sistemaAntigo;

    public PagamentoAdapter(
            SistemaPagamentoAntigo sistemaAntigo
    ) {

        this.sistemaAntigo = sistemaAntigo;
    }

    @Override
    public void pagar(double valor) {

        sistemaAntigo.realizarPagamentoAntigo(
                valor
        );
    }
}