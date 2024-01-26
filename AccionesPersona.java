import java.util.*;
public class AccionesPersona {
    /*vamos hacer un crud */
    //mostrar personas
    public ArrayList<Persona>listaPersonas=new ArrayList<Persona>();
    //listar a las personas
    public ArrayList<Persona>mostrasPersonas(){
        return listaPersonas;
    }
    public void agregarPersona(Persona p){
        listaPersonas.add(p);
    }
    //buscar persona
    public Persona buscarPersona(int id){
        Persona encontrada = new Persona();
        for(Persona p : listaPersonas){
            if(id== p.getId()){
                encontrada = p;
            }else{
                System.out.println("Persona no encontrada");
            }
        }
         return encontrada;
    }
    //actualizar
    public void actualizarPersona(Persona actualizada){
        buscarPersona(actualizada.getId());
        listaPersonas.remove(actualizada);
    }
    public void eliminarPersona(Persona eliminar){
        listaPersonas.remove(eliminar);
    }
}
