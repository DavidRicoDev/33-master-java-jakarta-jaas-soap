package es.davidrico.jakarta.jaas.soap.cliente.jaas.soap.repositorios;

import es.davidrico.jakarta.jaas.soap.cliente.jaas.soap.modelos.Curso;

import java.util.List;

public interface CursoRepository {
    List<Curso> listar();
    Curso guardar(Curso curso);
}
