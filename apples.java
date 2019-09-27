import java.util.Scanner;

public class apples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, select;
		System.out.println("Enter First Number : ");
		a = sc.nextInt();
		System.out.println("Enter Second Number : ");
		b = sc.nextInt();
		System.out.println("---Select Option---");
		System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n");
		select = sc.nextInt();
		while(select>4) {
			System.out.println("Please Enter a correct selection!");
			select = sc.nextInt();
		}
		Cal m = new Cal();
		if(select == 1)
		{
			c=m.add(a, b);
			System.out.println("Your answer is : "+c);
		}else if(select == 2)
		{
			c=m.sub(a, b);
			System.out.println("Your answer is : "+c);
		}else if(select == 3)
		{
			c=m.mul(a, b);
			System.out.println("Your answer is : "+c);
		}else if(select == 4)
		{
			c=m.div(a, b);
			System.out.println("Your answer is : "+c);
		}
	sc.close();
	}
}
