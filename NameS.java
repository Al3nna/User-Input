//This program was made by Alenna for the CTE course "Software & Programming Development 2" instructed by Mr. Gross
//Email - alenna.castaneda@oneidaihla.org

//importing required class
import java.util.Scanner;

public class NameS {
    public static void main(String[] args) {
        boolean success = false;
        char space;
        String namef;
        String namel;
        //creating scan object that reads from System.in
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first and last name");

        //getting fullName from user input
        String fullName = scan.nextLine();
        //closing scan
        scan.close();

        //looping through fullName characters
        for (int i = 0; i < fullName.length(); i++) {
            space = fullName.charAt(i);
            //checking if current character is " "
            if (space == ' ') {
                //changing success status
                success = true;
                //acknowledging namef and namel positions
                //setting namef and namel
                namef = fullName.substring(0, i);
                namel = fullName.substring(i+1);
                System.out.println();
                System.out.println("Hello, Mr/Mrs "+namel+", or may I call you "+namef);
            }
            //if fullName has been looped and target was not found
            if (i == fullName.length()-1 && success == false) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("=-=-Error-=-=");
                System.out.println("Please enter your first and last name separated by a space");
                System.out.println("-------------------------------------------------------------");
            }
        }
    }
}