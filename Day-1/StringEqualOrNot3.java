import java.util.*;
class Stringequal{

public static void main(String args [])
{
	System.out.println("Enter The First Stringg: ");
                         //creating object
	Scanner sc = new Scanner(System.in);
	String name1 = sc.nextLine();
	//System.out.println("Enter The First String: " +name1);

      System.out.println("Enter the second string: " );
	String name2 = sc.nextLine();
	//System.out.println("Enter the second string: " +name2);

	//check both string are equal or not
	System.out.println("strings Are Equal: ");

	if (name1.equals(name2) == true){
	System.out.println("Y E S");
}
	else{
	System.out.println("N O");
}

	}
			}