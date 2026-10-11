package pe.edu.cibertec.curso_service_grupo10;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
        "server.port=0",
        "eureka.client.enabled=false"
})
class CursoServiceGrupo10ApplicationTests {

    @Test
    void contextLoads() {
    }

}
