import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombreEquipo;
    private String paisEquipo;
    private static double sumaTiempos;
    private List<Ciclista> integrantes; // Lista para almacenar los ciclistas del equipo

    public Equipo(String nombreEquipo, String paisEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.paisEquipo = paisEquipo;
        this.integrantes = new ArrayList<>(); // Inicializamos la lista de integrantes
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getPaisEquipo() {
        return paisEquipo;
    }

    public void setPaisEquipo(String paisEquipo) {
        this.paisEquipo = paisEquipo;
    }

    public static double getSumaTiempos() {
        return sumaTiempos;
    }

    public static void setSumaTiempos(double sumaTiempos) {
        Equipo.sumaTiempos = sumaTiempos;
    }

    // Método para agregar un ciclista al equipo
    public void añadirCiclista(Ciclista ciclista) {
        integrantes.add(ciclista);
    }

    // Método para listar la información del equipo
   protected void Imprimir() {
        super.imprimir();
        System.out.println("Nombre del equipo: " + nombreEquipo);
        System.out.println("País del equipo: " + paisEquipo);
        System.out.println("Integrantes del equipo:");
        for (Ciclista ciclista : integrantes) {
            System.out.println("- " + ciclista.getNombre()); 
       }
      }
}

    

}

    

