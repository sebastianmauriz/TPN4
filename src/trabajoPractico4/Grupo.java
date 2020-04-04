
package trabajoPractico4;


public class Grupo {
    private int curso;
    private char letra;
    public Asignatura[] recibe = new Asignatura[5];
    public Alumno[] pertenece = new Alumno[5];

    public Grupo() {
    }

    public Grupo(int curso, char letra) {
        this.curso = curso;
        this.letra = letra;
    }

    public Grupo(Alumno[] pertenece) {
        this.pertenece = pertenece;
    }

    
    public Grupo(int curso, char letra,  Alumno[] pertenece) {
        this.curso = curso;
        this.letra = letra;
       
        this.pertenece = pertenece;
    }

        
    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    
    
}
