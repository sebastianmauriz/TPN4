
package trabajoPractico4;


public class Asignatura {
    private String nombre;
    private char aula;
    private String hora;
    public Grupo recibe = new Grupo();
    private Profesor imparte = new Profesor();

    public Asignatura() {
    }

    public Asignatura(String nombre, char aula, String hora) {
        this.nombre = nombre;
        this.aula = aula;
        this.hora = hora;
    }

    
    public Asignatura(String nombre, char aula, String hora, Grupo recibe, Profesor imparte) {
        this.nombre = nombre;
        this.aula = aula;
        this.hora = hora;
        this.recibe = recibe;
        this.imparte = imparte;
    }

    public Asignatura(char aula, Profesor imparte) {
        this.aula = aula;
        this.imparte = imparte;
    }

    public Grupo getRecibe() {
        return recibe;
    }

    public void setRecibe(Grupo recibe) {
        this.recibe = recibe;
    }

    

    public String getNombre() {
        return nombre;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getAula() {
        return aula;
    }

    public void setAula(char aula) {
        this.aula = aula;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Profesor getImparte() {
        return imparte;
    }

    public void setImparte(Profesor imparte) {
        this.imparte = imparte;
    }
    
    
}
