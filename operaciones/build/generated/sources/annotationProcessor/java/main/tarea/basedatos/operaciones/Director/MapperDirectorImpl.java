package tarea.basedatos.operaciones.Director;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-09-17T17:43:51+0000",
    comments = "version: 1.6.3, compiler: IncrementalProcessingEnvironment from gradle-java-compiler-worker-9.7.1.jar, environment: Java 25.0.4.1 (Microsoft)"
)
@Component
public class MapperDirectorImpl implements MapperDirector {

    @Override
    public Director toDirector(RequestDirector request) {
        if ( request == null ) {
            return null;
        }

        Director director = new Director();

        director.setNombre( request.nombre() );
        director.setNacionalidad( request.nacionalidad() );
        director.setAniosExperiencia( request.aniosExperiencia() );

        return director;
    }

    @Override
    public ResponseDirector toResponse(Director director) {
        if ( director == null ) {
            return null;
        }

        int id = 0;
        String nombre = null;
        String nacionalidad = null;
        int aniosExperiencia = 0;

        id = director.getId();
        nombre = director.getNombre();
        nacionalidad = director.getNacionalidad();
        aniosExperiencia = director.getAniosExperiencia();

        ResponseDirector responseDirector = new ResponseDirector( id, nombre, nacionalidad, aniosExperiencia );

        return responseDirector;
    }
}
