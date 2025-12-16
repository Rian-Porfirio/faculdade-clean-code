package entrega;

import org.example.assesment.domain.Entrega;
import org.example.assesment.enums.TipoFrete;
import org.example.assesment.exceptions.EntregaInvalidaException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class EntregaTest {

    @Test
    void deveFalharQuandoEnderecoForVazio() {
        assertThrows(EntregaInvalidaException.class, () ->
                new Entrega("", "Maria", 5, TipoFrete.PADRAO)
        );
    }

    @Test
    void deveFalharQuandoDestinatarioForNulo() {
        assertThrows(EntregaInvalidaException.class, () ->
                new Entrega("Rua A", null, 5, TipoFrete.PADRAO)
        );
    }

    @Test
    void deveFalharQuandoPesoForZero() {
        assertThrows(EntregaInvalidaException.class, () ->
                new Entrega("Rua A", "João", 0, TipoFrete.EXPRESSO)
        );
    }

    @Test
    void deveFalharQuandoPesoForNegativo() {
        assertThrows(EntregaInvalidaException.class, () ->
                new Entrega("Rua A", "João", -3, TipoFrete.EXPRESSO)
        );
    }

    @Test
    void deveFalharQuandoTipoFreteForNulo() {
        assertThrows(EntregaInvalidaException.class, () ->
                new Entrega("Rua A", "João", 3, null)
        );
    }
}