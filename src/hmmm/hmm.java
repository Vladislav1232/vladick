package hmmm;
import java.util.Scanner;
public class hmm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			        Scanner sc = new Scanner(System.in);
			        System.out.print(" ¬ведите п€ть чисел: ");
			        String s = sc.nextLine();
			        sc.close();
			        for(int i = 0; i < s.length(); i++){
			            System.out.println(i < s.length() -1 ? s.substring(i, i + 1) : s.substring(i));
			        }
	}
}