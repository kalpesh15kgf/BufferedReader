import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SummationBuff {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value to do the sum :");
        int n = Integer.parseInt(br.readLine());
        int sum = 0, k;
        while (n != 0) {
            k = n % 10;
            sum = sum + k;
            n = n / 10;
        }
        System.out.print("\nSum of individual digits : " + sum);
	}

}
