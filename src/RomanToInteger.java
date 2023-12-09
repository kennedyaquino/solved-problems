import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		Map<String, Integer> model = new HashMap<>();
		model.put("I", 1);
		model.put("V", 5);
		model.put("X", 10);
		model.put("L", 50);
		model.put("C", 100);
		model.put("D", 500);
		model.put("M", 1000);
		
		int aux = 0;
		int result = 0;
		
		for(int i=s.length(); i>0; i--) {
			int value = model.get(String.valueOf(s.charAt(i - 1)));
			
			if(aux == 0) {
				result += value;
				aux = value;
			} else if(value < aux) {
				result -= value;
				aux = value;
			} else if(value > aux) {
				result += value;
				aux = value;
			} else if(value == aux) {
				result += value;
				aux = value;
			}
			
		}
		
		sc.close();
		System.out.println(result);
		

	}

}
