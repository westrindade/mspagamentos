package br.com.fiap.mspagamentos.domain.dto;

public record LoginDtoRequest (
        String email,
        String password
) {
}
