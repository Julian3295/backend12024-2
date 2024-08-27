package ejercicios;

import java.util.Scanner;

public class voidfunction {

    static int costumerId;
    static String costumerName;
    static String email;
    static String password;
    static Boolean Status;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        createCostumer();
        printCostumerData();

    }

    public static void createCostumer(){

        System.out.println("Ingrese el id");
        costumerId = sc.nextInt();
        sc.nextline();
        System.out.println("name");
        costumerName = sc.nextline();
        System.out.println("email");
        email = sc.nextline();
        System.out.println("ingrese el correo");
        password = sc.nextLine();
        System.out,println("selecciones un estado:");



    }

    public static void printCostumerData(){
        System.out.println("id" + costumerId + "\n" +
                "nombre" + costumerName + "\n" +
                "Correo" + email + "\n" +
                "Status"
        );
    }

    public static void selectStatus(int selection){
        if (selection == 1){
            return; StatusCostumer.TRUE;
        }
    }
}
