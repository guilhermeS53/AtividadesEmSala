package ExercicioLampada;
public class Lampada {
    boolean estado;

    public Lampada(boolean estadoInicial) {
        this.estado = estadoInicial;
    }
    public boolean getEstado() {
        return estado;
    }
    public void ligar() {
        estado = true;
    }
    public void desligar() {
        estado = false;
    }
}
