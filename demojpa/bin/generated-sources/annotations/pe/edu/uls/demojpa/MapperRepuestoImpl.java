package pe.edu.uls.demojpa;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-09-17T17:42:33+0000",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.46.100.v20260826-1225, environment: Java 21.0.12.1 (Eclipse Adoptium)"
)
@Component
public class MapperRepuestoImpl implements MapperRepuesto {

    @Override
    public Repuesto toRepuesto(RequestRepuesto nuevo) {
        if ( nuevo == null ) {
            return null;
        }

        Repuesto repuesto = new Repuesto();

        repuesto.setNombre( nuevo.nombre() );
        repuesto.setMarca( nuevo.marca() );
        repuesto.setPrecio( nuevo.precio() );

        return repuesto;
    }

    @Override
    public ResponseRepuesto tResponseRepuesto(Repuesto repuesto) {
        if ( repuesto == null ) {
            return null;
        }

        int id = 0;
        String nombre = null;
        String marca = null;
        double precio = 0.0d;

        id = repuesto.getId();
        nombre = repuesto.getNombre();
        marca = repuesto.getMarca();
        precio = repuesto.getPrecio();

        ResponseRepuesto responseRepuesto = new ResponseRepuesto( id, nombre, marca, precio );

        return responseRepuesto;
    }

    @Override
    public ResponseRepuesto toRepuesto(Repuesto repuesto) {
        if ( repuesto == null ) {
            return null;
        }

        int id = 0;
        String nombre = null;
        String marca = null;
        double precio = 0.0d;

        id = repuesto.getId();
        nombre = repuesto.getNombre();
        marca = repuesto.getMarca();
        precio = repuesto.getPrecio();

        ResponseRepuesto responseRepuesto = new ResponseRepuesto( id, nombre, marca, precio );

        return responseRepuesto;
    }

    @Override
    public ResponseRepuesto toResponse(Repuesto consultarRepuesto) {
        if ( consultarRepuesto == null ) {
            return null;
        }

        int id = 0;
        String nombre = null;
        String marca = null;
        double precio = 0.0d;

        id = consultarRepuesto.getId();
        nombre = consultarRepuesto.getNombre();
        marca = consultarRepuesto.getMarca();
        precio = consultarRepuesto.getPrecio();

        ResponseRepuesto responseRepuesto = new ResponseRepuesto( id, nombre, marca, precio );

        return responseRepuesto;
    }
}
