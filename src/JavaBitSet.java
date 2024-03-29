import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        
        for(int i=0; i<m; i++) {
        	String s =  in.next();
        	int i1 = in.nextInt();
        	int i2 = in.nextInt();
        	
        	if(s.equals("AND")) {
        		if(i1 == 1) {
        			b1.and(b2);
        		} else {
        			b2.and(b1);
        		}
        	}
        	
        	if(s.equals("OR")) {
        		if(i1 == 1) {
        			b1.or(b2);
        		} else {
        			b2.or(b1);
        		}
        	}
        	
        	if(s.equals("XOR")) {
        		if(i1 == 1) {
        			b1.xor(b2);
        		} else {
        			b2.xor(b1);
        		}
        	}
        	
        	if(s.equals("FLIP")) {
        		if(i1 == 1) {
        			b1.flip(i2);
        		} else {
        			b2.flip(i2);
        		}
        	}
        	
        	if(s.equals("SET")) {
        		if(i1 == 1) {
        			b1.set(i2, true);
        		} else {
        			b2.set(i2, true);
        		}
        	}
        	
        	System.out.println(b1.cardinality() + " " + b2.cardinality());
        	
        }

	}

}
