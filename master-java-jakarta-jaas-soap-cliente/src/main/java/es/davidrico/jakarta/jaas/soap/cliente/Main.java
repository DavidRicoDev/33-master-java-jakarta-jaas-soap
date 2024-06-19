package es.davidrico.jakarta.jaas.soap.cliente;

import jakarta.xml.ws.BindingProvider;
import es.davidrico.jakarta.jaas.soap.servicios.Curso;
import es.davidrico.jakarta.jaas.soap.servicios.CursoServicioWs;
import es.davidrico.jakarta.jaas.soap.servicios.CursoServicioWsImplService;

public class Main {
    public static void main(String[] args) {
        CursoServicioWs service = new CursoServicioWsImplService().getCursoServicioWsImplPort();

        ((BindingProvider)service).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "admin");
        ((BindingProvider)service).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "12345");
        Curso curso = new Curso();
        curso.setNombre("react");
        curso.setDescripcion("react js");
        curso.setDuracion(50D);
        curso.setInstructor("andres guzman");
        Curso respuesta = service.guardar(curso);
        System.out.println("nuevo curso: " + curso.getId() +", "+ curso.getNombre());

        service.listar().forEach(c -> System.out.println(c.getNombre()));
    }
}
