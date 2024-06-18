package br.com.fiap.mspagamentos.domain.service;

import br.com.fiap.mspagamentos.domain.adapter.AuthConsumer;
import br.com.fiap.mspagamentos.domain.dto.LoginDtoRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TokenService {

    private final AuthConsumer authConsumer;

    @Value("${auth.login}")
    private String authLogin;

    @Value("${auth.password}")
    private String authPassword;

    public TokenService(AuthConsumer authConsumer) {
        this.authConsumer = authConsumer;
    }

    public String generateToken(){
        LoginDtoRequest login = new LoginDtoRequest(this.authLogin,this.authPassword);
        return this.authConsumer.obterToken(login).token();
    }
}
