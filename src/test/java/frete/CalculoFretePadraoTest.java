package frete;

import org.example.assesment.domain.Entrega;
import org.example.assesment.enums.TipoFrete;
import org.example.assesment.fretes.FretePadrao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculoFretePadraoTest {

    private final FretePadrao frete = new FretePadrao();

    @Test
    void deveCalcularFretePadraoParaPesoValido() {
        Entrega entrega = new Entrega("Rua A", "Carlos", 10, TipoFrete.PADRAO);
        assertEquals(12.0, frete.calcular(entrega));
    }

    @Test
    void deveCalcularFretePadraoParaPesoFracionado() {
        Entrega entrega = new Entrega("Rua A", "Carlos", 2.5, TipoFrete.PADRAO);
        assertEquals(3.0, frete.calcular(entrega));
    }
}
