//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
ControlAforo controlAforo = new ControlAforo(5);

    controlAforo.registrarIngreso();
    controlAforo.registrarIngreso();
    controlAforo.registrarIngreso();
    controlAforo.registrarIngreso();
    controlAforo.registrarIngreso();

    controlAforo.registrarSalida();

    System.out.println("Capacidad máxima permitida: " + controlAforo.getCapacidadMaxima());
    System.out.println("Asistentes actuales: " + controlAforo.getAsistentesActuales() + "\n");
}
