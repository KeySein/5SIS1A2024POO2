import java.util.*;
public class ManipularPersona{
    private List<Persona> personas;
    public ManipularPersona(){
        this.personas = new ArrayList<>();
    }
    public void menu(){//*no recibe ni devuelve */
        Scanner entrada= new Scanner(System.in);//*instancia de un objeto es decir mandar a llamar a la clase */
        int opcion;
        do{
        System.out.println("Bienvenido a este programa");
        System.out.println("eliga una instancia");
        System.out.println("1- Mostrar todos los registros de las personas");
        System.out.println("2-Registrar un nuevo objeto ");
        System.out.println("3- Editar ese objeto");
        System.out.println("4- Borrar el objeto");
        System.out.println("5- Borrar");
        opcion = entrada.nextInt();
        
            switch (opcion) {
                case 1:
                    mostrarPersonas();
                    break;
                case 2:
                    registrarPersona(entrada);
                    break;
                case 3:
                    editarPersona(entrada);
                    break;
                case 4:
                    eliminarPersona(entrada);
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 5);
    }

    private void mostrarPersonas() {
        System.out.println("Listado de personas:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    private void registrarPersona(Scanner entrada) {
        System.out.println("Ingrese el nombre:");
        String nombre = entrada.next();
        System.out.println("Ingrese la edad:");
        int edad = entrada.nextInt();
        System.out.println("Ingrese el ID:");
        int id = entrada.nextInt();

        personas.add(new Persona(id, nombre, edad));

        System.out.println("Persona registrada con éxito.");
    }

    private void editarPersona(Scanner entrada) {
        mostrarPersonas();
        System.out.println("Ingrese el ID de la persona a editar:");
        int id = entrada.nextInt();

        Persona personaSeleccionada = buscarPersonaPorId(id);

        if (personaSeleccionada != null) {
            System.out.println("Editando persona: " + personaSeleccionada);
            System.out.println("Ingrese el nuevo nombre:");
            String nuevoNombre = entrada.next();
            personaSeleccionada.setNombre(nuevoNombre);
            System.out.println("Ingrese la nueva edad:");
            int nuevaEdad = entrada.nextInt();
            personaSeleccionada.setEdad(nuevaEdad);

            System.out.println("Datos de la persona editados con éxito.");
        } else {
            System.out.println("ID no válido. No se pudo editar la persona.");
        }
    }

    private void eliminarPersona(Scanner entrada) {
        mostrarPersonas();
        System.out.println("Ingrese el ID de la persona a eliminar:");
        int id = entrada.nextInt();

        Persona personaBorrada = buscarPersonaPorId(id);

        if (personaBorrada != null) {
            personas.remove(personaBorrada);
            System.out.println("Persona eliminada con éxito: " + personaBorrada);
        } else {
            System.out.println("ID no válido. No se pudo borrar la persona.");
        }
    }

    private Persona buscarPersonaPorId(int id) {
        for (Persona persona : personas) {
            if (persona.getId() == id) {
                return persona;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ManipularPersona manipulador = new ManipularPersona();
        manipulador.menu();
    }
}
               
          
        




    
