//I worked on this assignment alone, using course materials.

import java.util.Scanner;

public class Doomsday {
    public static void main(String[] args) {
        System.out.println("Welcome to the Doomsday Calculator!");
        Scanner scan = new Scanner(System.in);
        char answer;
        do  {
            System.out.print("Enter year (1900-1999): ");
            int year = scan.nextInt();
            System.out.print("Enter month (1-12): ");
            int month = scan.nextInt();
            System.out.print("Enter day: ");
            int day = scan.nextInt();

            if ((year < 1900 || year > 1999) || (month < 1 || month > 12)
                || (day < 1 || day > 31)) {
                System.out.println("The entered date is invalid!");
                System.out.println(" ");
                System.out.println("Do you want to enter another date "
                    + "(type 'y' or 'n')");
                answer = scan.next().charAt(0);
                System.out.println(" ");
                continue;
            }
            int doomsday1, doomsday2, doomsday3;
            doomsday1 = (year - 1900) / 12;
            doomsday2 = (year - 1900) % 12;
            doomsday3 = doomsday2 / 4;
            int almostDoomsday = (doomsday1 + doomsday2 + doomsday3 + 3) % 7;
            int doomsday = 0;

            if (year % 4 == 0) {
                switch (month) {
                case 1:
                    doomsday = 4;
                    break;
                case 2:
                    doomsday = 29;
                    break;
                case 3:
                    doomsday = 4;
                    break;
                case 4:
                    doomsday = 29;
                    break;
                case 5:
                    doomsday = 4;
                    break;
                case 6:
                    doomsday = 29;
                    break;
                case 7:
                    doomsday = 4;
                    break;
                case 8:
                    doomsday = 29;
                    break;
                case 9:
                    doomsday = 4;
                    break;
                case 10:
                    doomsday = 29;
                    break;
                case 11:
                    doomsday = 4;
                    break;
                case 12:
                    doomsday = 29;
                    break;
                default:
                    doomsday = 0;
                }
            }   else {
                switch (month) {
                case 1:
                    doomsday = 4;
                    break;
                case 2:
                    doomsday = 28;
                    break;
                case 3:
                    doomsday = 7;
                    break;
                case 4:
                    doomsday = 4;
                    break;
                case 5:
                    doomsday = 9;
                    break;
                case 6:
                    doomsday = 6;
                    break;
                case 7:
                    doomsday = 11;
                    break;
                case 8:
                    doomsday = 8;
                    break;
                case 9:
                    doomsday = 5;
                    break;
                case 10:
                    doomsday = 10;
                    break;
                case 11:
                    doomsday = 7;
                    break;
                case 12:
                    doomsday = 12;
                    break;
                default:
                    doomsday = 0;
                }
            }
            doomsday = (day - doomsday + almostDoomsday + 7) % 7;
            if (doomsday == 0) {
                System.out.println(month + "/" + day + "/" + year
                    + " was on a Sunday.");
            }
            if (doomsday == 1) {
                System.out.println(month + "/" + day + "/" + year
                    + " was on a Monday.");
            }
            if (doomsday == 2) {
                System.out.println(month + "/" + day + "/" + year
                    + " was on a Tuesday.");
            }
            if (doomsday == 3) {
                System.out.println(month + "/" + day + "/" + year
                    + " was on a Wednesday.");
            }
            if (doomsday == 4) {
                System.out.println(month + "/" + day + "/" + year
                    + " was on a Thursday.");
            }
            if (doomsday == 5) {
                System.out.println(month + "/" + day + "/" + year
                    + " was on a Friday.");
            }
            if (doomsday == 6) {
                System.out.println(month + "/" + day + "/" + year
                    + " was on a Saturday.");
            }
            System.out.println(" ");
            System.out.println("Do you want to enter another date "
                + "(type 'y' or 'n')");
            answer = scan.next().charAt(0);
            System.out.println(" ");
        } while (answer == 'y');
    }
}
