package org.example.assesment.domain;

import org.example.assesment.enums.TipoFrete;
import org.example.assesment.exceptions.EntregaInvalidaException;

public record Entrega(String endereco, String destinatario, double peso, TipoFrete tipoFrete) {
    public Entrega {
        if (endereco == null || endereco.isBlank()) {
            throw new EntregaInvalidaException("Endereço não pode ser vazio");
        }
        if (destinatario == null || destinatario.isBlank()) {
            throw new EntregaInvalidaException("Destinatário não pode ser vazio");
        }
        if (peso <= 0) {
            throw new EntregaInvalidaException("Peso deve ser maior que zero");
        }
        if (tipoFrete == null) {
            throw new EntregaInvalidaException("Tipo de frete é obrigatório");
        }
    }
}
