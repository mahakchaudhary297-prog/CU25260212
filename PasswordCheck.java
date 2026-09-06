import java.util.Scanner;
public class PasswordCheck {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String password;
	do{
		System.out.println("Enter a password:");
		password=sc.nextLine();
		}
		while(!password.equals("1234"));
		System.out.println("Correct password");
    }
}	
