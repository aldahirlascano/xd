import java.io.Serializable;
//Serializable: encargado de transformar  tipos de datos a otro tipo.
public class MiClase implements Serializable {
    //tipo de dato en el que almacenamos numeros y letras pero no es cadena, no es string.
    private static final long serialVersionUID=11;
    private String nombre;
    private int edad;

    public MiClase(java.lang.String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        ;}

    public String getNombre() {
        return nombre;}

    public void setNombre(String nombre) {
        this.nombre = nombre;}

    public int getEdad() {
        return edad;}

    public void setEdad(int edad) {
        this.edad = edad;}

    @Override
    public String toString(){
        return "Nombre: "+nombre+", edad:"+edad;
    }
}
