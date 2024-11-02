import java.util.*;

public class OTP {
    public static void main(String[] args){
        // 6-digit OTP generator for 10-digit mobile number!

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the mobile number: ");
        String ph_num = input.nextLine();

        int rand_int = random.nextInt(100000, 1000000);

        if (ph_num.length() == 10){
            System.out.printf("The OTP for the mobile number %s is %d", ph_num, rand_int);
        }
        else {
            System.out.println("Enter a valid mobile number");
        }

    }
}
