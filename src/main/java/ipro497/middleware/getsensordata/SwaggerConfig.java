package ipro497.middleware.getsensordata;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Get Sensor Data API")
                        .description("API for getting sensor data from database for IPRO497: The Parameterized Space")
                        .version("v0.0.1"));
    }

}
