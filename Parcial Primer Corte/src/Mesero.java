
/**
 *
 * @author Miguel Andrés
 */
public class Mesero {
    private int documento;
    private String nombre;
    private String apellido;
    private int edad;
    private int aexperiencia;
    private int nmaxmesero;
    
    public Mesero() {
        this.documento = 0;
        this.nombre = " ";
        this.apellido = " ";
        this.edad = 0;
        this.aexperiencia = 0;
        this.nmaxmesero = 0;
    }

    public Mesero(int documento, String nombre, String apellido, int edad, int aexperiencia, int nmaxmesero) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.aexperiencia = aexperiencia;
        this.nmaxmesero = nmaxmesero;
    }
     
    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAexperiencia() {
        return aexperiencia;
    }

    public void setAexperiencia(int aexperiencia) {
        this.aexperiencia = aexperiencia;
    }

    public int getNmaxmesero() {
        return nmaxmesero;
    }

    public void setNmaxmesero(int nmaxmesero) {
        this.nmaxmesero = nmaxmesero;
    }
    
    
    
    
    
}
