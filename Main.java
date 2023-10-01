public class Main {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Jumbo", "Bélgica");
        Velocista velocista1 = new Velocista(1234, "Peter Sagan", 50, 70);
        Escalador escalador = new Escalador(5678, "Nairo Quintana", 20, 15);
        Contrarelojista contrarelojista1 = new Contrarelojista(1357, "Esteban Chavez", 120);
        //Imprimir listar equipo
     protected void imprimir(){
            super.imprimir();
            System.out.println("Nombre del equipo: " + nombreEquipo);
            System.out.println("País del equipo: " + paisEquipo);
            System.out.println("Integrantes del equipo:");
        }
    }

}
