import clases.Product_list;
import clases.commands;
import clases.solutions_by_id.solutions_by_id;

import java.util.Scanner;

public class Main {
    static int balance = 0; //типа бомж

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean working = true;

        String action;
        int id_action = 0;

        while (working){

            if (Product_list.buy.equals("y")){
                if (balance >= Product_list.price[solutions_by_id.choice]){
                    balance = (balance - Product_list.price[solutions_by_id.choice]);
                    System.out.println("вы купили " + Product_list.name_product[solutions_by_id.choice]);
                    System.out.println("за " + Product_list.price[solutions_by_id.choice]);
                    Product_list.buy = "non";
                }else {
                    System.out.println("недостаточно денег");
                    Product_list.buy = "non";
                }
            }

            System.out.println("выберите действие: ");
            action = scanner.nextLine();

            switch (action){
                case "":
                    break;

                case "exit":
                    working = false;
                    break;

                case "list":
                    Product_list.Product_list();
                    break;
                case "купить":
                    solutions_by_id.solutions_by_id_0();
                    break;
                case "пополнить баланс":
                    System.out.println("выберите суппу для попалнения: ");
                    int symma = scanner.nextInt();
                    balance = (balance + symma);
                    scanner.nextLine();
                    break;

                case "баланс":
                    System.out.println("ваш баланн состовляет: " + balance);
                    break;

                default:
                commands.error_not_command();
            }
        }
    }
}
