import java.util.Scanner;
public class FizzBuzz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("数字を入力。");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++){

		if(i%3==0 && i%5==0) {
			System.out.println("FizzBuzz");
			}else if(i%3==0) {
				System.out.println("Fizz");
			}else if(i%5==0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}
	}
}

