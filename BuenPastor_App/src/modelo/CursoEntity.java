
package modelo;

/**
 *
 * @author N.I.R.N
 */
public class CursoEntity {
    String nombre;
    int id ;
    boolean estado;

    public CursoEntity(String nombre, boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public CursoEntity() {
    }

    

    public CursoEntity( int id,String nombre) {
        this.id = id;
         this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }



    @Override
    public String toString() {
        return nombre;
    }
    

    

   
    
}
