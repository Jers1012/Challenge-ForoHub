package com.alura.foroHub.Domain.Topico.Respuestas.Validaciones;

import ForoHub.Aplication.Domain.Topico.Respuestas.DatosCrearRespuesta;
import ForoHub.Aplication.Domain.Topico.TopicoRepository;
import ForoHub.Aplication.Infra.Errores.ValidacionDeIntegridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicoValido implements ValidadorRespuesta {

    @Autowired
    TopicoRepository topicoRepository;

    @Override
    public void validar(DatosCrearRespuesta datos) {
        if (datos.idTopico() == null || !topicoRepository.existsById(datos.idTopico())) {
            throw new ValidacionDeIntegridad("Topico no encontrado");
        }
    }
}