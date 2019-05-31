/*
 * WIP XI Computer Programing 
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author sittiwatlcp
 */
public class WIPCargo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int item = 0;
        int limit = 10;
        int menu = 0;
        int amount=0;
        while (true) {
            System.out.println("1.Add\n2.Remove\n3.Check\n");
            System.out.print("menu : ");
            menu = sc.nextInt();

            if (menu == 1) {
                if (item == limit) {
                    System.out.println("ไอเท็มเต็ฒแล้ว");
                } else {
                    System.out.print("Amount : ");
                    amount = sc.nextInt();
                }
                if (item + amount > limit) {
                    System.out.println("ไอเท็มเกินลิมิต");
                } else {
                    item += amount;
                    System.out.println("Item : " + item);
                    System.out.println("Limit : " + limit);
                }
            } else if (menu == 2) {
                if (item == 0) {
                    System.out.println("ไม่มีไอเท็มในโกดัง");
                } else {
                    amount = sc.nextInt();
                }
                if (item - amount > limit) {
                    System.out.println("ไอเท็มไม่เพียงพอ");
                } else {
                    item -= amount;
                    System.out.println("Item : " + item);
                    System.out.println("Limit : " + limit);
                }
            } else {
                System.out.println("Item : " + item);
                System.out.println("Limit : " + limit);
            }
            // System.out.println("Limit : " + limit);
            System.out.println("----------------------------");
        }
    }
}
