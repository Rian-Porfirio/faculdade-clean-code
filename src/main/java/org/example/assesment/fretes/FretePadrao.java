package org.example.assesment.fretes;

import org.example.assesment.domain.Entrega;
import org.example.assesment.interfaces.ICalculadoraFrete;

public class FretePadrao implements ICalculadoraFrete {

    private static final double CUSTO_POR_KG = 1.2;

    @Override
    public double calcular(Entrega entrega) {
        return entrega.peso() * CUSTO_POR_KG;
    }
}
