//JAVIER IGNACIO TORRES RIOS 21059492220
package modelo;

/**
 *
 * @author javif
 */
public class Estudiante {
    private String nombre;
    private String matricula;
    private String carrera;
    private String correo;
    //constructor sobrecargado
    public Estudiante(){}
    public Estudiante(String nombre, String matricula, String carrera, String correo) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
        this.correo = correo;
    
    }
    //obtener y modificar información
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante{");
        sb.append("nombre=").append(nombre);
        sb.append(", matricula=").append(matricula);
        sb.append(", carrera=").append(carrera);
        sb.append(", correo=").append(correo);
        sb.append('}');
        return sb.toString();
    }
    
}
