package adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PagamentoTest {

    @Test
    void deveCriarSistemaAntigo() {

        SistemaPagamentoAntigo sistema =
                new SistemaPagamentoAntigo();

        assertNotNull(sistema);
    }
}