package org.example.assesment.fretes;

import org.example.assesment.domain.Entrega;
import org.example.assesment.interfaces.ICalculadoraFrete;

public class FreteEconomico implements ICalculadoraFrete {
    private static final double CUSTO_POR_KG = 1.1;
    private static final double DESCONTO_FIXO = 5.0;

    @Override
    public double calcular(Entrega entrega) {
        double freteCalculado = entrega.peso() * CUSTO_POR_KG;

        if (isFreteGratis(entrega.peso())) {
            return 0.0;
        }

        return freteCalculado - DESCONTO_FIXO;
    }

    public boolean isFreteGratis(double peso) {
        return peso < 2;
    }
}
