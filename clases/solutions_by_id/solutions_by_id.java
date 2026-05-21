package clases.solutions_by_id;

import clases.Product_list;
import java.util.Scanner;

public class solutions_by_id {
    public static int choice;
    public static void solutions_by_id_0(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("выберите тавар: ");
        choice = scanner.nextInt();

        Product_list.Product_selection(choice);

    }
}
