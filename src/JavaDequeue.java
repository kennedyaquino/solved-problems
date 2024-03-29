import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class JavaDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        HashSet<Integer> hs = new HashSet<>();
        int max = -1;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            hs.add(num);
            
            if(deque.size()==m) {
            	if(hs.size()> max) {
            		max = hs.size();
            	}
            	
            	int first =  deque.remove();
            	if(!deque.contains(first)) {
            		hs.remove(first);
            	}
            }
        }
        
        System.out.println(max);
	}

}
