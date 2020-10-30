package test;

import com.abraham.pcWorld.*;

import java.util.Scanner;

public class TestPcStore{

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Scanner consoleNumbers = new Scanner(System.in);
        int opc = 1;
        String computerName;
        String mouseType;
        String mouseMark;
        String keyBoardType;
        String keyBoardMark;
        String displayMark;
        double size;
        Order order = new Order();
        do {

            switch (opc) {
                case 1 -> {
                    System.out.println("Ingresa nombre de computadora");
                    computerName = console.nextLine();
                    System.out.println("Ingresa tipo de raton");
                    mouseType = console.nextLine();
                    System.out.println("Ingresa marca de raton");
                    mouseMark = console.nextLine();
                    System.out.println("Ingresa tipo de teclado");
                    keyBoardType = console.nextLine();
                    System.out.println("Ingresa marca de teclado");
                    keyBoardMark = console.nextLine();
                    System.out.println("Ingresa marca de monitor");
                    displayMark = console.nextLine();
                    System.out.println("Ingresa tamaño de monitor");
                    size = consoleNumbers.nextDouble();

                    Mouse mouse = new Mouse(mouseType, mouseMark);
                    KeyBoard keyBoard = new KeyBoard(keyBoardType, keyBoardMark);
                    Display display = new Display(displayMark, size);
                    Computer computer = new Computer(computerName, display, keyBoard, mouse);
                    order.addComputer(computer);
                }
                case 2 -> {
                    order.showOrder();
                }
            }
            TestPcStore.menu();
            opc = consoleNumbers.nextInt();
        } while (opc != 0);
    }

    public static void menu() {
        System.out.println("Elije: \n" +
                "1.Agregar computadora \n 2.Mostrar Orden\n\n");
    }
}
