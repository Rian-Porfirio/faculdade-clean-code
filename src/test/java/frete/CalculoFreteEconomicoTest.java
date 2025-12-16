package frete;

import org.example.assesment.domain.Entrega;
import org.example.assesment.enums.TipoFrete;
import org.example.assesment.fretes.FreteEconomico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculoFreteEconomicoTest {

    private final FreteEconomico frete = new FreteEconomico();

    @Test
    void deveSerFreteGratisQuandoPesoMenorQue2() {
        Entrega entrega = new Entrega("Rua B", "Ana", 1.99, TipoFrete.ECONOMICO);
        assertEquals(0.0, frete.calcular(entrega));
    }

    @Test
    void deveAplicarDescontoQuandoPesoIgualA2() {
        Entrega entrega = new Entrega("Rua B", "Ana", 2.0, TipoFrete.ECONOMICO);
        assertEquals((2.0 * 1.1) - 5.0, frete.calcular(entrega));
    }

    @Test
    void deveAplicarDescontoQuandoPesoMaiorQue2() {
        Entrega entrega = new Entrega("Rua B", "Ana", 5.0, TipoFrete.ECONOMICO);
        assertEquals((5.0 * 1.1) - 5.0, frete.calcular(entrega));
    }
}
