package br.com.fiap.mspagamentos.domain.controllers;

import br.com.fiap.estrutura.exception.BusinessException;
@FunctionalInterface
public interface GerarResponse<T> {

	T get() throws BusinessException;
}
