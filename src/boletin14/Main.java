package boletin14;
import partes.*;

import java.util.Scanner;

/*
import partes.Monitor;
import partes.Procesador;
import partes.Teclado
 */

public class Main {
    public static void main(String[] args) {

        //Valores monitor
        Scanner scannerMonitor = new Scanner(System.in);
        System.out.print("Inserte el precio del monitor: ");
        float precioMonitor = Float.parseFloat(scannerMonitor.nextLine());
        System.out.print("Inserte la marca del monitor: ");
        String marcaMonitor = scannerMonitor.nextLine();

        //Valores teclado
        Scanner scannerTeclado = new Scanner(System.in);
        System.out.print("Inserte el precio del teclado: ");
        float precioTeclado = Float.parseFloat(scannerTeclado.nextLine());
        System.out.print("Inserte la marca del teclado: ");
        String marcaTeclado = scannerTeclado.nextLine();

        //Valores procesador
        Scanner scannerProcesador = new Scanner(System.in);
        System.out.print("Inserte el precio del procesador: ");
        float precioProcesador = Float.parseFloat(scannerProcesador.nextLine());
        System.out.print("Inserte la marca del procesador: ");
        String marcaProcesador = scannerProcesador.nextLine();
        System.out.print("Inserte la velocidad del procesador: ");
        float velocidadProcesador = Float.parseFloat(scannerProcesador.nextLine());

        //Valor precio ordenador
        Scanner scannerOrdenador = new Scanner(System.in);
        System.out.print("Inserte el precio del ordenador: ");
        float precioOrdenador = Float.parseFloat(scannerOrdenador.nextLine());

        //Objetos
        Monitor monitor = new Monitor(precioMonitor,marcaMonitor);
        Teclado teclado = new Teclado(precioTeclado,marcaTeclado);
        Procesador procesador = new Procesador(precioProcesador,marcaProcesador,velocidadProcesador);
        Ordenador ordenador = new Ordenador(monitor,teclado,procesador,precioOrdenador);

        //Mostrar
        System.out.println("1 - Todas as caracteristicas do ordenador: " + ordenador);
        System.out.println("2 - Precio do ordenador: " + ordenador.getPrecio());
        System.out.println("3 - Marca do teclado: " + teclado.getMarca());
        System.out.println("4 - Velocidade da CPU: " + procesador.getVelocidad());
    }
}