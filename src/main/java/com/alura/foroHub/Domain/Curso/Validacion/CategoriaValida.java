package com.alura.foroHub.Domain.Curso.Validacion;

import ForoHub.Aplication.Domain.Curso.Categoria;
import ForoHub.Aplication.Domain.Curso.DatosCrearCurso;
import ForoHub.Aplication.Infra.Errores.ValidacionDeIntegridad;
import jakarta.validation.ValidationException;
import org.springframework.stereotype.Component;

@Component
public class CategoriaValida implements ValidadorCurso{

    @Override
    public void validar(DatosCrearCurso datos) {
        if (datos.categoria() == null) {
            throw new ValidacionDeIntegridad("Asigna una categoria");
        }
    }
}