package pe.edu.cibertec.curso_service_grupo10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.curso_service_grupo10.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
