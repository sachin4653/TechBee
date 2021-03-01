import java.util.Scanner;
//creating a class
public class Palindrome2
{
public static void main(String[] args){
int rem,rev=0;
Scanner sc = new Scanner(System.in); 

/* setting up the scannner to read the number for checking palindrome*/

System.out.println("Enter a number to check if it is palindrome or not");
int num =sc.nextInt();

int temp = num;

// starting the loop

while(num>0){
 ;
rev= rev*10 + num%10;
num /=10;
}
if(rev==temp)
{
System.out.println("this is palindrome");
}
else
System.out.println("this is not palindrome");
}
}

