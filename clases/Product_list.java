package clases;

import java.util.Scanner;

public class Product_list {
    public static String buy = "non";
    static int quantity = 3;
    static public int full_id_goods = 3;
    public static boolean statys = false;

    public static int Purchase_ID = -1;

    public static int[] price = {100, 150, 200};
    public static String[] name_product = {"пипирони", "сырная", "маргарита"};

    public static void Product_list(){
        System.out.println();

        for (int i = 0; i< quantity; i ++){
                System.out.println(i + " " + name_product[i] + " цена: " + price[i]);
        }
        System.out.println();
    }
    public static void Product_selection(int args){
        if (args >= 0 && args <= full_id_goods){
            Scanner scanner = new Scanner(System.in);
            System.out.println("хотите ли вы заказать " + name_product[args] + " за " + price[args]);
            System.out.println("y/n");

            String action = scanner.nextLine();
            if (args <= full_id_goods){
                if (action.equals("y")){
                    Purchase_ID = args;
                    buy = "y";
                } else if (action.equals("n")) {
                    System.out.println("действие отменено");
                }else {
                    commands.error_not_command();
                }
            }else {
                System.out.println("неверно упазан ID");
            }

        }
    }
    public static void sbros_statys(){
        Product_list.statys = false;
    }
}
