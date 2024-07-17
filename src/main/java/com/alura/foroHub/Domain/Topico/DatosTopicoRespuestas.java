package com.alura.foroHub.Domain.Topico;

import ForoHub.Aplication.Domain.Topico.Respuestas.DatosRespuesta;
import org.springframework.data.domain.Page;

public record DatosTopicoRespuestas(DatosTopico topico, Page<DatosRespuesta> respuestas) {
}