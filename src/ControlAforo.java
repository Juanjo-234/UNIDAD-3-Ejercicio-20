public class ControlAforo {
    private int capacidadMaxima;
    private int asistentesActuales;

    public ControlAforo(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima > 0 ? capacidadMaxima : 10;
        this.asistentesActuales = 0;
    }


    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getAsistentesActuales() {
        return asistentesActuales;
    }

    public boolean registrarIngreso(){
        if(asistentesActuales < capacidadMaxima){
            asistentesActuales++;
            return true;
        }
        return false;
    }

    public void registrarSalida(){
        if(asistentesActuales > 0){
            asistentesActuales--;
        }
    }
}
