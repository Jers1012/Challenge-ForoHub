package com.alura.foroHub.Domain.Topico.Respuestas;

import ForoHub.Aplication.Domain.Topico.Topico;
import ForoHub.Aplication.Domain.Usuario.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {

    boolean existsByTopicoAndSolucion(Topico topico, boolean solucion);

    boolean existsByTopicoAndMensajeAndAutorRespuesta(Topico topico, String mensaje, Usuario autorRespuesta);

    Page<Respuesta> findAllByTopico(Topico topico, Pageable paginacion);

    void removeAllByTopico(Topico referenceById);
}