package br.com.fiap.mspagamentos.domain.dto;

import java.util.List;

public record CarrinhoDtoRequest(
        Long idUsuario,
        List<ItemCarrinhoDtoRequest> itens,
        String formaPagamento,
        int quantidadeItens,
        double valorTotal
) {
}
