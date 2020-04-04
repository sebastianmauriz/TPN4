
package trabajoPractico4;

public class Alumno {
    private String nombre;
    private int dni;
    public Grupo[] pertenece = new Grupo[6];

    public Alumno() {
        
    }

    public Alumno(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    

    public Alumno(String nombre, int dni, Grupo[] pertenece) {
        this.nombre = nombre;
        this.dni = dni;
        this.pertenece = pertenece;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    
}
