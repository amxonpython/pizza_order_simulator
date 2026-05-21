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

            if (Product_list.buy.equals("y") && balance >= Product_list.price[solutions_by_id.choice] && Product_list.statys){
                    balance = (balance - Product_list.price[solutions_by_id.choice]);
                    System.out.println("вы купили " + Product_list.name_product[solutions_by_id.choice]);
                    System.out.println("за " + Product_list.price[solutions_by_id.choice]);
                    Product_list.buy = "non";

            } else if (Product_list.buy.equals("n")) {
                System.out.println("действие отменено");

            } else if (solutions_by_id.choice >= 0 && solutions_by_id.choice <= Product_list.full_id_goods) {
                if (balance < Product_list.price[solutions_by_id.choice] && Product_list.statys) {
                    Product_list.buy = "non";

                    System.out.println("недостаточно денег");
                }
            }else {
                System.out.println("невенрный id");
            }
            Product_list.sbros_statys();

            System.out.println("выберите действие: ");
            action = scanner.nextLine();

            if (!Product_list.statys){
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
                        Product_list.statys = true;
                        solutions_by_id.solutions_by_id_0();
                        break;
                    case "пополнить баланс":
                        System.out.println("выберите сумму для попалнения: ");
                        int summa = scanner.nextInt();
                        balance = (balance + summa);
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
}
