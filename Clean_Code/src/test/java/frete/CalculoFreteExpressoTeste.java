package frete;

import org.example.assesment.domain.Entrega;
import org.example.assesment.enums.TipoFrete;
import org.example.assesment.fretes.FreteExpresso;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculoFreteExpressoTeste {
    @Test
    void deveCalcularFreteExpresso() {
        Entrega entrega = new Entrega(
                "Rua A",
                "João",
                10,
                TipoFrete.EXPRESSO
        );

        FreteExpresso frete = new FreteExpresso();
        double valor = frete.calcular(entrega);

        assertEquals(25.0, valor);
    }
}
