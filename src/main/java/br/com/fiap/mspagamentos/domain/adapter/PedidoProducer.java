package br.com.fiap.mspagamentos.domain.adapter;

import br.com.fiap.mspagamentos.domain.dto.CarrinhoDtoRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "pedido", url = "${pedido.url}")
public interface PedidoProducer {
    @PostMapping(value = "/pedido")
    void criarPedido(@RequestBody CarrinhoDtoRequest carrinho);
}
