package tarea.basedatos.operaciones.pelicula;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-09-17T17:43:51+0000",
    comments = "version: 1.6.3, compiler: IncrementalProcessingEnvironment from gradle-java-compiler-worker-9.7.1.jar, environment: Java 25.0.4.1 (Microsoft)"
)
@Component
public class MapperPeliculaImpl implements MapperPelicula {

    @Override
    public Pelicula toPelicula(RequestPelicula request) {
        if ( request == null ) {
            return null;
        }

        Pelicula pelicula = new Pelicula();

        pelicula.setNombre( request.nombre() );
        pelicula.setAutor( request.autor() );
        pelicula.setGenero( request.genero() );
        pelicula.setPresupuesto( request.presupuesto() );

        return pelicula;
    }

    @Override
    public ResponsePelicula toResponse(Pelicula pelicula) {
        if ( pelicula == null ) {
            return null;
        }

        int id = 0;
        String nombre = null;
        String autor = null;
        String genero = null;
        double presupuesto = 0.0d;

        id = pelicula.getId();
        nombre = pelicula.getNombre();
        autor = pelicula.getAutor();
        genero = pelicula.getGenero();
        presupuesto = pelicula.getPresupuesto();

        ResponsePelicula responsePelicula = new ResponsePelicula( id, nombre, autor, genero, presupuesto );

        return responsePelicula;
    }
}
