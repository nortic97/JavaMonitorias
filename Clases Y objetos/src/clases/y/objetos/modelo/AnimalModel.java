
package clases.y.objetos.modelo;


public class AnimalModel {
        
    int id;
    String pelaje; //varchar en sql 
    String grupo;
    boolean invertebrado;

    public AnimalModel(int id, String pelaje, String grupo, boolean invertebrado) {
        this.id = id;
        this.pelaje = pelaje;
        this.grupo = grupo;
        this.invertebrado = invertebrado;
    }

    public AnimalModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public boolean isInvertebrado() {
        return invertebrado;
    }

    public void setInvertebrado(boolean invertebrado) {
        this.invertebrado = invertebrado;
    }

    @Override
    public String toString() {
        return "\n\nAnimal {" + "\nid=" + id + ", \npelaje=" + pelaje + ", \ngrupo=" + grupo + ", \ninvertebrado=" + invertebrado + '}';
    }
    
    
    
}
