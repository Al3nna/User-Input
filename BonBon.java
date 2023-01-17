//This program was made by Alenna for the CTE course "Software & Programming Development 2" instructed by Mr. Gross
//Email - alenna.castaneda@oneidaihla.org

//Importing required classes
import java.util.InputMismatchException;
import java.util.Scanner;

public class BonBon {

    public static void main(String[] args) {
        //creating attributes
        boolean error = false;
        int fluff = 0;
        float cake = 0;
        int addedFluff = 0;

        //creating scan object that reads from System.in
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to BonBon pet creation!");
        System.out.println();
        System.out.println("Name your BonBon");

        //getting name value from user input
        String name = scan.nextLine();
        System.out.println("BonBon Name = "+name);

        System.out.println();
        System.out.println("On a scale of 1-10, how fluffy is "+name+"?");

        //attempting to get fluff lvl from user input
        try {
            fluff = scan.nextInt();
               
        } catch (InputMismatchException e) {  //catching mismatch error
            System.out.println();
            System.out.println("=-=-Error-=-=");
            System.out.println("Input must be a whole number within the scale of 1 - 10. Try again");
            //updating error status
            error = true;
        }

        //making sure an error didn't occur
        if (error != true) {
            //checking if fluff is out of bounds
            if (fluff < 1 || fluff > 10) {
                System.out.println();
                System.out.println("=-=-Error-=-=");
                System.out.println("Input must be a whole number within the scale of 1 - 10. Try again");
                //updating error status
                error = true;
                fluff = 0;
            } else {
                System.out.println("Fluff Lvl = "+fluff);
            }
        }

        //making sure an err didn't occur
        if (error != true) {
            System.out.println();
            System.out.println("Time for cake!");
            System.out.println();
            System.out.println("How much cake will you feed "+name+"? (Please enter a whole or decimal number)");
            //attempting to get cake from user input
            try {
                cake = scan.nextFloat();
                System.out.println("Cakes Eaten = "+cake);
            } catch (InputMismatchException e) {  //catching mismatch error
                System.out.println();
                System.out.println("=-=-Error-=-=");
                System.out.println("Input must be a whole number or decimal (e.g. 1.25, 5, 82). Try again");
                //updating error status
                error = true;
            } finally {
                //closing scan
                scan.close();
            }
        }

        //setting addedFluff value
        addedFluff += cake;

        //making sure an error hasn't occured AND cake > 0
        if (cake > 0 && error != true) {
            //adding addedFluff value to fluff
            fluff += addedFluff;
            System.out.println();
            System.out.println(name+"'s fluff has increased by "+addedFluff+" points!");
            //if fluff is off the scale
            if (fluff > 10) {
                System.out.println();
                System.out.println(name+" broke the scale and has reached ultimate fluff!!!");
            }
        }

        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("BonBon Information");
        System.out.println();
        System.out.println("Name: "+name);
        System.out.println("Fluff: "+fluff+"/10");
        System.out.println();
        //if BonBon was given cake
        if (cake > 0) {
            System.out.println(name+" thanks you for the "+cake+" cakes!");
        } else {  //if BonBon was not given cake
            System.out.println('"'+"I wish I had cake"+'"'+" - "+name);
        }
        System.out.println("--------------------------------------------");    
        }
    }