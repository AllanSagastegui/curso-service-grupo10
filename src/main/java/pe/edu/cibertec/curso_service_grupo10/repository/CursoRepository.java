package pe.edu.cibertec.curso_service_grupo10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.curso_service_grupo10.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
}
