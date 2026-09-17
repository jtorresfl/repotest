package tarea.basedatos.operaciones.Resena;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-09-17T17:25:43+0000",
    comments = "version: 1.6.3, compiler: IncrementalProcessingEnvironment from gradle-java-compiler-worker-9.7.1.jar, environment: Java 25.0.4.1 (Microsoft)"
)
@Component
public class MapperResenaImpl implements MapperResena {

    @Override
    public Resena toResena(RequestResena request) {
        if ( request == null ) {
            return null;
        }

        Resena resena = new Resena();

        resena.setPeliculaId( request.peliculaId() );
        resena.setAutor( request.autor() );
        resena.setComentario( request.comentario() );
        resena.setPuntuacion( request.puntuacion() );

        return resena;
    }

    @Override
    public ResponseResena toResponse(Resena resena) {
        if ( resena == null ) {
            return null;
        }

        int id = 0;
        int peliculaId = 0;
        String autor = null;
        String comentario = null;
        int puntuacion = 0;

        id = resena.getId();
        peliculaId = resena.getPeliculaId();
        autor = resena.getAutor();
        comentario = resena.getComentario();
        puntuacion = resena.getPuntuacion();

        ResponseResena responseResena = new ResponseResena( id, peliculaId, autor, comentario, puntuacion );

        return responseResena;
    }
}
