package br.com.fiap.mspagamentos.domain.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public record PagamentoDtoResponse (
        UUID idTransacao,
        LocalDateTime dataHoraTransacao,
        double valorTranscao,
        int quantidadeItensTranscao
) {
}
