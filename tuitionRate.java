import java.util.Scanner;
public class tuitionRate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("what is the current tuition");
		double currenttuition = scanner.nextDouble();
		double sum= currenttuition;
		
		for (int i=1; i<4; i++){
		System.out.print("what is the percentage of tuition increase in decimal form");
		double tuitionincrease= scanner.nextDouble();
		sum= sum+ (currenttuition* (1+tuitionincrease));
		}
		System.out.print(sum);
	}
}
