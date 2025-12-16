package org.example.assesment.fretes;

import org.example.assesment.domain.Entrega;
import org.example.assesment.interfaces.ICalculadoraFrete;

public class FreteExpresso implements ICalculadoraFrete {
    private static final double CUSTO_POR_KG = 1.5;
    private static final double TAXA_URGENCIA = 10.0;

    @Override
    public double calcular(Entrega entrega) {
        return entrega.peso() * CUSTO_POR_KG + TAXA_URGENCIA;
    }
}
