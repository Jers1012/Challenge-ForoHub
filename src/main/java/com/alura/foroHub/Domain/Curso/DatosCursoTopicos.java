package com.alura.foroHub.Domain.Curso;

import ForoHub.Aplication.Domain.Topico.DatosTopico;
import org.springframework.data.domain.Page;

public record DatosCursoTopicos(DatosCurso curso, Page<DatosTopico> topicos) {

}