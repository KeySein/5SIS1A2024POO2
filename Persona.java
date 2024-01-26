/*vamos a crear
*private static 
*private static finaly aunque haya encapsulamiento no va a cambiar 
*constantes= a lo ya establecido como pi euler las constantes no cambian
*tenemos que analizar las caracteristicas del atributo para saber si son privados o 
*/
public class Persona {
    private int id;
    private String nombre;
    private int edad;
    /*constructor= inicializar las variables definir la instancia del objeto 
 parametros de un metodo de entrada son las variables que se necesitan para hacer la accion ya sea de entrada o salida
    diferencias: metodo puede darte un resultado o no, las funciones siempre hay un resultado*/
    public Persona(String nombre, int edad, int id){
        this.id= id;
        this.nombre= nombre;
        this.edad= edad;
    }
    public Persona(int id, String nombre, int edad) {
        
    }
    public int getId(){
       return id; 
    }
      public void setId(int id){
        this.id = id;
      }
      public int getNombre(){
        return nombre; 
     }
       public void setId(String nombre){
         this.nombre = nombre;
       }
       public int getEdad(){
        return edad; 
     }
       public void setEdad(int edad){
         this.edad= edad;
       }
}
