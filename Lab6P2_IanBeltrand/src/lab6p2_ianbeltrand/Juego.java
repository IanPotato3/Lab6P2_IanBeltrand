package lab6p2_ianbeltrand;

public class Juego {
    
    //Atributos
    String Nombre = "";
    int Costo = 0;
    int Recompensa = 0;
    int ProbabilidadExito = 0;

    public Juego(String Nombre, int Costo, int Recompensa, int ProbabilidadExito) {
        this.Nombre = Nombre;
        this.Costo = Costo;
        this.ProbabilidadExito = ProbabilidadExito;
        this.Recompensa = Recompensa;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    public int getRecompensa() {
        return Recompensa;
    }

    public void setRecompensa(int Recompensa) {
        this.Recompensa = Recompensa;
    }

    public int getProbabilidadExito() {
        return ProbabilidadExito;
    }

    public void setProbabilidadExito(int ProbabilidadExito) {
        this.ProbabilidadExito = ProbabilidadExito;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Juego{" + "Costo=" + Costo + ", Recompensa=" + Recompensa + ", ProbabilidadExito=" + ProbabilidadExito + '}';
    }
    
    
}
