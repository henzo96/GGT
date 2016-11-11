/**
 * 
 */

/**
 * @author henning
 *
 */
public class GGT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long m = Long.parseLong(args[0]);
		long n = Long.parseLong(args[1]);
		long k = m ;
		long s = n ;
		long r = n-m ;
		
	if (m<0) {
		System.out.println("nur positive ganze Zahlen als Argumente erlaubt");
		System.exit(-1);}
	if (n<0) {
		System.out.println("nur positive ganze Zahlen als Argumente erlaubt");
		System.exit(-1);}
	
	while (r != 0) {
	if (m<n) {
		long x = m;
		m = n;
		n = x;
		 r = m-n;
	} else {
			 r = m-n;

			m=n ;
			n=r ;
	}
	}
	System.out.println("ggT(" +  k + " " + s + ")=" + m );
	}
	
}
