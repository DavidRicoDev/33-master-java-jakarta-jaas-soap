package es.davidrico.jakarta.jaas.soap.cliente.jaas.soap.repositorios;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import es.davidrico.jakarta.jaas.soap.cliente.jaas.soap.modelos.Curso;

import java.util.List;

@RequestScoped
public class CursoRepositoryImpl implements CursoRepository{
    @Inject
    private EntityManager em;

    @Override
    public List<Curso> listar() {
        return em.createQuery("from Curso", Curso.class).getResultList();
    }

    @Override
    public Curso guardar(Curso curso) {
        em.persist(curso);
        return curso;
    }
}
