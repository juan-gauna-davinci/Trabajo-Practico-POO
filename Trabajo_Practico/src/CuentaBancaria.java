import java.util.Scanner;

public class CuentaBancaria {

    //ATRIBUTOS

    String nombreCliente;
    String dniCliente;
    double saldo;
    double ultimoMovimiento;

    //CONTRUCTORES

    public CuentaBancaria(String nombreCliente, String dniCliente) {
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
    }

    public CuentaBancaria(String nombreCliente, String dniCliente, double saldo) {
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.saldo = saldo;
    }

    //METODOS

    public void Depositar(double cantidad){
        ultimoMovimiento = 0;
        if (cantidad < 0){
            System.out.println("No se puede realizar esta transaccion");
            return;
        }
        saldo += cantidad;
        ultimoMovimiento += cantidad;
    }

    public void Retirar(double cantidad){
        ultimoMovimiento = 0;
        if (cantidad < 0 ){
            System.out.println("No se puede realizar esta transaccion");
            return;
        }
        saldo -= cantidad;
        if (saldo < 0){
            System.out.println("No se puede realizar esta transaccion");
            saldo += Math.abs(cantidad);
        } else {
            ultimoMovimiento -= cantidad;
        }
    }

    public String ConsultarUltimoMovimiento(){
        if (ultimoMovimiento > 0 ) {
           return "Cantidad depositada:" + ultimoMovimiento;
        } else if (ultimoMovimiento < 0){
            return "Cantidad Retirada:" + ultimoMovimiento;
        }
        return "No se han realizado transacciones";
    }

    public void MostrarMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido " + this.nombreCliente);
        int num = 0;
            do {
                System.out.println("------------------------");
                System.out.println("Ingrese una opción:\n" +
                        "Opción 1: Consultar Saldo\n" +
                        "Opción 2: Depositar\n" +
                        "Opción 3: Retirar\n" +
                        "Opción 4: Consultar último movimiento\n" +
                        "Opción 5: Salir");
                System.out.println("------------------------");
                double cantidad = 0;
                num = scanner.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("Su saldo es: " + saldo);
                        break;
                    case 2:
                        System.out.println("Ingrese cantidad a depositar:");
                        cantidad = scanner.nextDouble();
                        this.Depositar(cantidad);
                        break;
                    case 3:
                        System.out.println("Ingrese cantidad a Retirar:");
                        cantidad = scanner.nextDouble();
                        this.Retirar(cantidad);
                        break;
                    case 4:
                        String consulta = this.ConsultarUltimoMovimiento();
                        System.out.println("Ultimo Movimiento:\n" + consulta);
                        break;
                    case 5:
                        System.out.println("Muchas gracias " + this.nombreCliente + " por haber utilizado nuestro Banco");
                        break;
                    default:
                        System.out.println("Opción inválida, intente de nuevo");
                }
            } while (num!=5);
    }

}
