package pe.edu.cibertec.curso_service_grupo10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
@EnableDiscoveryClient
@SpringBootApplication
public class CursoServiceGrupo10Application {

    public static void main(String[] args) {
        SpringApplication.run(CursoServiceGrupo10Application.class, args);
    }

}
