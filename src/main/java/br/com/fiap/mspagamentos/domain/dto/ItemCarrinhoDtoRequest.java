package br.com.fiap.mspagamentos.domain.dto;

public record ItemCarrinhoDtoRequest(
        Long idProduto,
        Long quantidade,
        double valor
) { }
