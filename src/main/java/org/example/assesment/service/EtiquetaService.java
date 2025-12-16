package org.example.assesment.service;

import org.example.assesment.domain.Entrega;
import org.example.assesment.interfaces.ICalculadoraFrete;

public class EtiquetaService {

    private final ICalculadoraFrete calculoFrete;

    public EtiquetaService(ICalculadoraFrete calculoFrete) {
        this.calculoFrete = calculoFrete;
    }

    public String gerarEtiqueta(Entrega entrega) {
        return """
               Destinatário: %s
               Endereço: %s
               Valor do Frete: R$ %.2f
               """.formatted(
                entrega.destinatario(),
                entrega.endereco(),
                calculoFrete.calcular(entrega)
        );
    }

    public String gerarResumo(Entrega entrega) {
        return "Pedido para %s com frete %s no valor de R$ %.2f"
                .formatted(
                        entrega.destinatario(),
                        entrega.tipoFrete(),
                        calculoFrete.calcular(entrega)
                );
    }
}

