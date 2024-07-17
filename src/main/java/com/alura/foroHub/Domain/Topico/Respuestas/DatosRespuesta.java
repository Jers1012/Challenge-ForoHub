package com.alura.foroHub.Domain.Topico.Respuestas;

public record DatosRespuesta(Long id, String mensaje, Long idTopico, Long idAutor, Boolean solucionado) {

    public DatosRespuesta(ForoHub.Aplication.Domain.Topico.Respuestas.Respuesta respuesta) {
        this(respuesta.getId(),
                respuesta.getMensaje(),
                respuesta.getTopico().getId(),
                respuesta.getAutorRespuesta().getId(),
                respuesta.getSolucion());
    }
}