package br.upe;
import java.util.Scanner;

import static br.upe.service.StringManipulador.quebrarString;

public class App {

    public static void main(String[] args) {
        // TODO: Fazer a checagem do sistema operacional 
	Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.printf("> ");
            String entrada = scanner.nextLine();
            if (entrada.equals("exit")) {
                System.out.println("Bye!! ");
                scanner.close();
                break;
            }
        }    // TODO: Fazer o método receberEntrada(entrada);
//            receberEntrada(entrada);



    }
}
