package br.com.fiap.mspagamentos.infra.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("APIs do Microserviço de Pagamentos")
                        .version("v1")
                        .description("APIs do Microserviço de Pgamentos criada exclusivamente para o TechChallenge 5 da FIAP.")
                );
    }
}
