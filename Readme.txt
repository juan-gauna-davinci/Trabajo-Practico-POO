Trabajo práctico
Cree una aplicación que simule las funciones de una cuenta bancaria. Para lo siguiente debe crear
una clase llamada CuentaBancaria con los siguientes atributos: nombreCliente (String),
dniCliente(String), saldo o balance (double) y ultimoMovimiento (double). Dos constructores, el
primer constructor debe recibir como parámetros los atributos: nombreCliente y dniCliente; el
segundo constructor debe recibir como parámetros todos los atributos, excepto el atributo
ultimoMovimiento. Los siguientes métodos: depositar y retirar, ambos deben recibir un parámetro
llamado cantidad (double), en caso de ser positiva sume (depositar) o reste (retirar) al atributo saldo,
dicha cantidad debe guardarse en el atributo ultimoMovimiento, con signo positivo si invoca al
método depositar y con signo negativo si invoca al método retirar (sea coherente con los métodos
en cuestión). Un método llamado consultarUltimoMovimiento y que muestre los siguientes
mensajes por pantalla, dependiendo si el último movimiento fue un depósito o retiro:
Si el último movimiento fue un depósito: “Cantidad depositada: “ + ultimoMovimiento
Si el último movimiento fue un retiro: “Cantidad retirada: “ + ultimoMovimiento
Si aún no ha realizado ningún movimiento: “No se han realizado transacciones”
También cree un método llamado mostrarMenu que de la bienvenida al cliente y le muestre las
siguientes opciones:
“Bienvenido “ + nombreCliente
Ingrese una opción:
Opción A: Consultar Saldo.
Opción B: Depositar
Opción C: Retirar
Opción D: Consultar último movimiento
Opción E: Salir.
La acciones a ejecutar en cada opción son las siguientes:
Opción A: debe mostrar el atributo saldo (o balance).
Opción B: debe invocar el método depositar y previamente permitirle al usuario ingresar la cantidad
a depositar, y luego mostrar nuevamente el menú de opciones.
Opción C: debe invocar el método retirar y previamente permitirle al usuario ingresar la cantidad a
retirar, y luego mostrar nuevamente el menú de opciones.
Opción D: debe invocar el método consultarUltimoMovimiento y luego mostrar nuevamente el
menú de opciones.
Opción E: debe finalizar la ejecución del método mostrarMenu y mostrar un mensaje de despedida.
En caso que marque una opción no válida, muestre el siguiente mensaje:
“Opción inválida, intente de nuevo”
Para finalizar, cree una clase Main con un método main, e instancie un objeto del tipo
CuentaBancaria con su nombre y dni, e invoque al método mostrarMenu.

¡Éxitos!