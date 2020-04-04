
package trabajoPractico4;


public class Profesor {
    private String nombre;
    private int dni;
    private char departamento;
    private Asignatura [] imparte = new Asignatura [6];

    public Profesor() {
     
    }

    public Profesor(String nombre, int dni, char departamento) {
        this.nombre = nombre;
        this.dni = dni;
        this.departamento = departamento;
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

    public char getDepartamento() {
        return departamento;
    }

    public void setDepartamento(char departamento) {
        this.departamento = departamento;
    }

    public Asignatura[] getImparte() {
        return imparte;
    }

    public void setImparte(Asignatura[] imparte) {
        this.imparte = imparte;
    }
    
    
    
}
