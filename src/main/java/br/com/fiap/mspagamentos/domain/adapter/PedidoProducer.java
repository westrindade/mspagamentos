package br.com.fiap.mspagamentos.domain.adapter;

import br.com.fiap.mspagamentos.domain.adapter.config.FeignConfig;
import br.com.fiap.mspagamentos.domain.dto.CarrinhoDtoRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "pedidos", url = "${pedidos.url}", configuration = FeignConfig.class)
public interface PedidoProducer {
    @PostMapping
    void criarPedido(@RequestBody CarrinhoDtoRequest carrinho);
}
