package com.alura.foroHub.Domain.Topico.Respuestas.Validaciones;

import ForoHub.Aplication.Domain.Topico.Respuestas.DatosCrearRespuesta;
import ForoHub.Aplication.Domain.Usuario.UsuarioRepository;
import ForoHub.Aplication.Infra.Errores.ValidacionDeIntegridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutorValido implements ValidadorRespuesta {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public void validar(DatosCrearRespuesta datos) {
        if (datos.idAutor() == null || !usuarioRepository.existsById(datos.idAutor())) {
            throw new ValidacionDeIntegridad("Autor no encontrado");
        }
    }
}