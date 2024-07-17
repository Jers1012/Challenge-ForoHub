package com.alura.foroHub.Domain.Curso.Validacion;

import ForoHub.Aplication.Domain.Curso.CursoRepository;
import ForoHub.Aplication.Domain.Curso.DatosCrearCurso;
import ForoHub.Aplication.Infra.Errores.ValidacionDeIntegridad;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CursoExistenteValidacionCurso implements ValidadorCurso{

    @Autowired
    CursoRepository repository;

    @Override
    public void validar(DatosCrearCurso datos) {
        if (repository.existsByNombre(datos.nombre())) {
            throw new ValidationException("Ya existe nombre");
        }
        if (datos.nombre() == null) {
            throw new ValidacionDeIntegridad("El nombre no puede quedar vacio");
        }
    }
}