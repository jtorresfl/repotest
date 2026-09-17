package tarea.basedatos.operaciones.Actor;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-09-17T17:02:24+0000",
    comments = "version: 1.6.3, compiler: IncrementalProcessingEnvironment from gradle-java-compiler-worker-9.7.1.jar, environment: Java 25.0.4.1 (Microsoft)"
)
@Component
public class MapperActorImpl implements MapperActor {

    @Override
    public Actor toActor(RequestActor request) {
        if ( request == null ) {
            return null;
        }

        Actor actor = new Actor();

        actor.setNombre( request.nombre() );
        actor.setNacionalidad( request.nacionalidad() );
        actor.setEdad( request.edad() );

        return actor;
    }

    @Override
    public ResponseActor toResponse(Actor actor) {
        if ( actor == null ) {
            return null;
        }

        int id = 0;
        String nombre = null;
        String nacionalidad = null;
        int edad = 0;

        id = actor.getId();
        nombre = actor.getNombre();
        nacionalidad = actor.getNacionalidad();
        edad = actor.getEdad();

        ResponseActor responseActor = new ResponseActor( id, nombre, nacionalidad, edad );

        return responseActor;
    }
}
