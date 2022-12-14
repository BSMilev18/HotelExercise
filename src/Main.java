import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void printMenu(String[] options){
        for (String option : options){
            System.out.println(option);
        }
    }
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel();
        System.out.print("Choose your option : ");
        String[] options = {"1 - Enter data",
                "2 - Output data",
                "3 - Show names and prices",
                "4 - Exit",
        };
        Scanner sc = new Scanner(System.in);
        int option = 1;
        while (option!=4){
            printMenu(options);
            try {
                option = sc.nextInt();
                switch (option){
                    case 1: option1(hotel1); break;
                    case 2: option2(hotel1);break;
                    case 3: option3(); break;
                    case 4: exit(0);
                }
            }
            catch (Exception ex){
                System.out.println("Please enter an integer value between 1 and " + options.length);
                sc.next();
            }
        }
    }

    private static void option1(Hotel hotel1) {
        System.out.println("Option 1 selected! Please enter data:");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter name:");
        String name1 = sc1.nextLine();
        System.out.println(" ");
        System.out.println("Enter ID:");
        int id1 = sc1.nextInt();
        System.out.println(" ");
        System.out.println("Enter family status - 1 for 'Married' | 2 for 'Single':");
        boolean familyStatus1 = true;
        int status1 = sc1.nextInt();
        if(status1 == 1){
            familyStatus1 = true;
        }
        else if(status1 == 2){
            familyStatus1 = false;
        }
        else{
            System.out.println("Incorrect input - please try again!");
            option1(hotel1);
        }
        System.out.println(" ");
        System.out.println("Please enter amount of nights stayed:");
        int stays1 = sc1.nextInt();
        System.out.println(" ");
        System.out.println("Please enter the price paid for the bed(s):");
        double bedPrice1 = sc1.nextDouble();
        System.out.println(" ");
        System.out.println("Please enter town:");
        String town1 = sc1.nextLine();
        System.out.println(" ");
        ArrayList<Hotel> hotel = new ArrayList<Hotel>();
        hotel1 = new Hotel(name1, id1, familyStatus1, stays1, bedPrice1, town1);
        hotel.add(hotel1);
        System.out.println("Information added!");
    }
    private static void option2(Hotel hotel1) {
        System.out.println("Option 2 selected! Here is the data:");
        /*for(Hotel h : hotel1){

        }*/
    }
    private static void option3() {
        System.out.println("Option 3 selected! Here are the names and prices paid by residents of that town:");
    }
}
