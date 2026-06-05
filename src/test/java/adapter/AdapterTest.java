package adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdapterTest {

    @Test
    void deveCriarAdapter() {

        SistemaPagamentoAntigo antigo =
                new SistemaPagamentoAntigo();

        PagamentoAdapter adapter =
                new PagamentoAdapter(
                        antigo
                );

        assertNotNull(adapter);
    }
}