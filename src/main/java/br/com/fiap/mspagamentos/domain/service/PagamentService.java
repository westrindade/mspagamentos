package br.com.fiap.mspagamentos.domain.service;

import br.com.fiap.estrutura.exception.BusinessException;
import br.com.fiap.mspagamentos.domain.adapter.PedidoProducer;
import br.com.fiap.mspagamentos.domain.dto.CarrinhoDtoRequest;
import br.com.fiap.mspagamentos.domain.dto.PagamentoDtoResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class PagamentService {

    private final PedidoProducer pedidoProducer;

    private final TokenService tokenService;

    public PagamentService(PedidoProducer pedidoProducer, TokenService tokenService) {
        this.pedidoProducer = pedidoProducer;
        this.tokenService = tokenService;
    }

    public PagamentoDtoResponse pagar(CarrinhoDtoRequest carrinho) throws BusinessException  {
        this.pedidoProducer.criarPedido(carrinho);
        return this.gerarTicket(carrinho.valorTotal(), carrinho.quantidadeItens());
    }

    private String authenticate() {
        return this.tokenService.generateToken();
    }

    private PagamentoDtoResponse gerarTicket(double valorTotal, int quantidade){
        return new PagamentoDtoResponse(
                UUID.randomUUID(),
                LocalDateTime.now(),
                valorTotal,
                quantidade
        );
    }
}
