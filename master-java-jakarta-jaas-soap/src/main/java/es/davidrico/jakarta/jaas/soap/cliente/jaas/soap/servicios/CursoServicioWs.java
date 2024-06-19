package es.davidrico.jakarta.jaas.soap.cliente.jaas.soap.servicios;

import jakarta.jws.WebService;
import es.davidrico.jakarta.jaas.soap.cliente.jaas.soap.modelos.Curso;

import java.util.List;

@WebService
public interface CursoServicioWs {
    List<Curso> listar();
    Curso guardar(Curso curso);
}
