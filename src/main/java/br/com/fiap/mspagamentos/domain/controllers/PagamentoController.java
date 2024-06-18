package br.com.fiap.mspagamentos.domain.controllers;

import br.com.fiap.estrutura.swagger.annotations.ApiResponseSwaggerCreate;
import br.com.fiap.estrutura.utils.SpringControllerUtils;
import br.com.fiap.mspagamentos.domain.dto.CarrinhoDtoRequest;
import br.com.fiap.mspagamentos.domain.service.PagamentService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    @Autowired
    private PagamentService service;

    @PostMapping
    @Operation(summary = "Realizar Pagamento")
    @ApiResponseSwaggerCreate
    public ResponseEntity<?> pagar(@RequestBody CarrinhoDtoRequest carrinho){
        return SpringControllerUtils.response(HttpStatus.CREATED,
            () -> service.pagar(carrinho)
        );
    }
}
