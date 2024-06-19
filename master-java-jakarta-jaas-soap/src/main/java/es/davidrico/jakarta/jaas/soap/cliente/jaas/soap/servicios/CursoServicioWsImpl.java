package es.davidrico.jakarta.jaas.soap.cliente.jaas.soap.servicios;

import es.davidrico.jakarta.jaas.soap.cliente.jaas.soap.modelos.Curso;
import es.davidrico.jakarta.jaas.soap.cliente.jaas.soap.repositorios.CursoRepository;
import jakarta.annotation.security.DeclareRoles;
import jakarta.annotation.security.RolesAllowed;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@DeclareRoles({"USER", "ADMIN"})
@Stateless
@WebService(endpointInterface = "org.aguzman.webapp.jaxws.services.CursoServicioWs")
public class CursoServicioWsImpl implements CursoServicioWs {

    @Inject
    private CursoRepository repository;

    @RolesAllowed({"ADMIN", "USER"})
    @WebMethod
    @Override
    public List<Curso> listar() {
        return repository.listar();
    }

    @RolesAllowed({"ADMIN"})
    @Override
    @WebMethod
    public Curso guardar(Curso curso) {
        return repository.guardar(curso);
    }
}
