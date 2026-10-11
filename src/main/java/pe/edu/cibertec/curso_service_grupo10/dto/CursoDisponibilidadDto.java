package pe.edu.cibertec.curso_service_grupo10.dto;

public record CursoDisponibilidadDto(
        Long idCurso,
        String codigoCurso,
        String nombreCurso,
        Integer vacantesDisponibles,
        String prerrequisito,
        String estadoCurso
) {
}
