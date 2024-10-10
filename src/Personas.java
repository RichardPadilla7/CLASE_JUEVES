public class Personas{
    //Atributos
    String nombre, direccion, ocupacion;
    int edad, telefono;

    //Constructor
    public Personas(String nombre, String direccion,String ocupacion, int edad, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ocupacion = ocupacion;
        this.edad = edad;
        this.telefono = telefono;
    }

    //Funcion
    public void presentarse(){
        System.out.println("Hola!, Mi nombre es " + nombre + " y vivo en " + direccion + ". Soy " + ocupacion +
                " con edad de " + edad + ". Contactame a este numero " + telefono);
    }

    public void correr(){
        System.out.println("Con extio!!. El corredor "+ nombre + " del sector " + direccion + " con edad "+ edad + ". A ganado la medalla de mejor recorido en la maraton. Contactos: " + telefono);
    }



    public static void main(String[] args) {
        /*
        Personas estudiante1 = new Personas("Richard","Zabala","Estudiante",20,979169393);
        estudiante1.presentarse();

        Personas Docente1 = new Personas("Yadira","Solca","Docente",25,321654987);
        Docente1.presentarse();

        Personas Secretario1 = new Personas("Melany","Zabala","Secretaria",20,987654321);
        Secretario1.presentarse();
        */

        Personas corredor1 = new Personas("Melany", "Zabala", "Secretaria", 20, 321654987);
        corredor1.correr();












    }
}
