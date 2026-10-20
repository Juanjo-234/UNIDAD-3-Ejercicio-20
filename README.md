Este programa está diseñado para modelar y gestionar el control de aforo y ocupación de un evento o establecimiento asegurando el cumplimiento estricto de los límites de capacidad mediante la aplicación del principio de encapsulamiento (ocultación de datos) y validaciones defensivas de admisión en programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase ControlAforo: Declara atributos privados (capacidadMaxima y asistentesActuales) para proteger el estado de ocupación frente a modificaciones externas no controladas.

Implementa el método boolean registrarIngreso(): Verifica de manera estricta si hay espacio disponible (asistentesActuales < capacidadMaxima) antes de permitir el acceso e incrementar el contador. Si el aforo está completo, rechaza la admisión de inmediato devolviendo false.

Implementa el método registrarSalida(): Decrementa el contador de asistentes al registrarse una salida, asegurando mediante un control lógico que el valor nunca descienda por debajo de cero (0).

Ejecuta la prueba en el main: Instancia el control de aforo para un evento con un límite específico, simula ingresos masivos que intentan superar la capacidad máxima (demostrando el rechazo a los excedentes), procesa algunas salidas y muestra los resultados de la admisión por consola.
