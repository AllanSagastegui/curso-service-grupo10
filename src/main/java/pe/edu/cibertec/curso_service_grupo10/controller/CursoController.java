
package pe.edu.cibertec.curso_service_grupo10.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.cibertec.curso_service_grupo10.dto.CursoDisponibilidadDto;
import pe.edu.cibertec.curso_service_grupo10.model.Curso;
import pe.edu.cibertec.curso_service_grupo10.repository.CursoRepository;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/cursos")
public class CursoController {
    private final CursoRepository cursoRepository;

    @GetMapping("/{idCurso}")
    public ResponseEntity<CursoDisponibilidadDto> getCurso(
            @PathVariable Long idCurso) {

        return cursoRepository.findById(idCurso)
                .map(curso -> ResponseEntity.ok(convertirADTO(curso)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/estudiante/{estudianteId}")
    public ResponseEntity<List<CursoDisponibilidadDto>> getCursosEstudiante(
            @PathVariable Long estudianteId) {

        List<CursoDisponibilidadDto> cursos = cursoRepository.findAll()
                .stream()
                .filter(curso -> curso.getVacantesDisponibles() != null
                        && curso.getVacantesDisponibles() > 0)
                .filter(curso -> "ABIERTO".equalsIgnoreCase(
                        curso.getEstadoCurso()))
                .map(this::convertirADTO)
                .toList();
        return ResponseEntity.ok(cursos);
    }

    private CursoDisponibilidadDto convertirADTO(Curso curso) {
        return new CursoDisponibilidadDto(
                curso.getIdCurso(),
                curso.getCodigoCurso(),
                curso.getNombreCurso(),
                curso.getVacantesDisponibles(),
                curso.getPrerrequisito(),
                curso.getEstadoCurso()
        );
    }
}
