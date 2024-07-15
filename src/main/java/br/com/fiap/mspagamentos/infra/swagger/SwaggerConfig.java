package br.com.fiap.mspagamentos.infra.swagger;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    OpenAPI openAPI() {
        OpenAPI securityItem = new OpenAPI()
                .components(new Components().addSecuritySchemes("bearer-key",new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT")))
                .info(new Info()
                        .title("APIs do Microserviço de Pagamentos")
                        .version("v1")
                        .description("APIs do Microserviço de Pgamentos criada exclusivamente para o TechChallenge 5 da FIAP.")
                        
                )
                .addSecurityItem(new SecurityRequirement().addList("bearer-key"));
       
        return securityItem;       
    }

}
