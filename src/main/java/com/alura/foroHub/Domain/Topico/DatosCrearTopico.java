package com.alura.foroHub.Domain.Topico;

import jakarta.validation.constraints.NotNull;

public record DatosCrearTopico(
        @NotNull
        String titulo,
        @NotNull
        String mensaje,
        @NotNull
        Long idAutor,
        @NotNull
        Long idCurso
) {
}