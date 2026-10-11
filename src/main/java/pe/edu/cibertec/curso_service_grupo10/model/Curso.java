package pe.edu.cibertec.curso_service_grupo10.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cursos")
@Getter
@Setter
@NoArgsConstructor
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCurso;
    @Column(nullable = false)
    private String codigoCurso;
    @Column(nullable = false)
    private String nombreCurso;
    private String seccion;
    private Integer creditos;
    private Double costoPorCredito;
    private Integer vacantesDisponibles;
    private String prerrequisito;
    private String estadoCurso;
}
