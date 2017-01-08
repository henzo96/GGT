/**
 * 
 */

/**
 * @author henning
 *
 */
class Bigs {
	// addiert die Ziffernfelder a und b
	public static int[ ] add (int[ ] a, int[ ] b)
	{
		int length_m,length_n;
		int []m; //larger number
		int []n; //smaller number
		if(less(a,b)){
			length_m=b.length;
			length_n=a.length;
			m = copy(b);
			n = copy(a);
		}
		else {
			length_m=a.length;
			length_n=b.length;	
			m = copy(a); 
			n = copy(b);
		}	
		//rest
		int x=0;
		int []y;
		y = fromInt(x);
		
		//createing an integer [] for the final result
		int []addoutput=new int [length_m];

		int i=1;
		//adding smaller number
		while (i<=length_n){
			x = m[i-1] + n[i-1] + div10(y)[0];
			y = fromInt(x);
			addoutput[i-1]=y[0];
			i++;
		}
		//adding only rest, after smaller number has been added
		while (i<=length_m){	
			x = m[i-1] + div10(y)[0];
			y = fromInt(x);
			addoutput[i-1]=mod10(y);
			i++;
		}
		//in case last digit is not 0 (like 999 + 1 = 1000)
		if (div10(y)[0]>0){
			int []k = new int [addoutput.length+1];
			i=addoutput.length;
			k[i]=div10(y)[0];
			while (i>0){
				k[i-1]=addoutput[i-1];
				i--;
			}
			return k;
		}
		return addoutput;
	}
	// gibt das Ziffernfeld n in lesbarer dezimaler Form aus
	// bei sehr langen Zahlen soll das Format verwendet werden, welches auch von bc (s.u.)
	// benutzt wird: Umbruch nach 68 Ziffern mit einem \ am Ende
	static void print (int[ ] n)
	{
		int i=n.length,j=0;
		while (i>0){
			//Zeilenumbruch nach 68 Ziffern
			if (j==68){
				System.out.println("\\");
				j=0;
			}
		
			System.out.print(n[i-1]);
			i--;

			//Zeilenumbruch nach 68 Ziffern
			j++;
		}
	}
	// konstruiert ein einstelliges Ziffernfeld aus der Ziffer d
	static int[ ] digit(int d)
	{
		return fromInt(d);
       	}

	// konstruiert das Ziffernfeld, welches den Wert Null repraesentiert
	static int[ ] Null()
	{
		return digit(0);
	}
	// konstruiert das Ziffernfeld, welches den Wert Eins repraesentiert
	static int[ ] One()
	{
		return digit(1);
	}
	// Rest des Ziffernfeldes n bei Division durch 10 (eine int-Zahl!)
	static int mod10(int[ ] n)
	{
		return n[0];
	}
	// ganzzahliger Quotient bei Division durch 10
	static int[ ] div10(int[ ] n)
	{
		if (n.length<=1){
			return Null();
		}

		int []m = new int [n.length-1];
		int i=2;
		while (i<=n.length){
			m[i-2]=n[i-1];
			i++;
		}
		return m;
	}
	// Umwandlung einer beliebigen int-Zahl in ein Ziffernfeld
	static int[ ] fromInt(int n)
	{	
		if (n==0){
			int []m = new int [1];
			m[0]=0;
			return m;
		}
		int length_n = (int)(Math.log10(n)+1);
		int []m = new int [length_n];

		int i=1,n2;
		while (n!=0){
			//getting rid of the first digit of n, int can only store whole numbers
			n2=n;
			n2=n2/10;
			n2=n2*10;

			//adding one digit to m
			m[i-1]=n-n2;

			//next digit of n
			n=n/10;

			i++;
		}
		return m;
	}
	// kopiert den Wert von n
	static int[ ] copy(int[ ] n)
	{
		int i=n.length;
		int m[] = new int [i];
		while(i>0){
			m[i-1]=n[i-1];
			i--;
		}
		return m;
	}
	// multipliziert das Ziffernfeld n mit einer (einstelligen!) int-Zahl
	static int[ ] times(int[ ] n, int d)
	{
		if (d==0 || n[n.length-1]==0){
			return Null();
		}
		int []m=new int [n.length];//output
		int ra[];//rest array
		int x=0;//rest integer
		int i=1;
		ra = fromInt(x);
		while (i<=n.length){
			x=n[i-1]*d+div10(ra)[0];
			ra=fromInt(x);
			m[i-1]=mod10(ra);
			i++;
		}
		//in case last rest is not 0
		if (div10(ra)[0]>0){
			int []k = new int [m.length+1];
			i=m.length;
			k[i]=div10(ra)[0];
			while (i>0){
				k[i-1]=m[i-1];
				i--;
			}
			return k;
		}
		return m;
	}
	// multipliziert das Ziffernfeld n mit 10
	static int[ ] times10(int[ ] n)
	{
		if (n[n.length-1]==0)
		{
			return Null();
		}
		int []m = new int [n.length+1];
		m[0]=0;
		int i=1;
		while (i<=n.length){
			m[i]=n[i-1];
			i++;
		}
		return m;
	}
	// multipliziert zwei Ziffernfelder
	static int[ ] times(int[ ]a, int[ ] b)
	{
		int length_x,length_y;
		int []x; //larger number
		int []y; //smaller number
		if(less(a,b)){
			length_x=b.length;
			length_y=a.length;
			x = b;
			y = a;
		}
		else {
			length_x=a.length;
			length_y=b.length;	
			x = a; 
			y = b;
		}
		int []m=new int [1]; //end result
		int []n;

		int i=1,j;
	
		while(i<=length_y){
			n=times(copy(x),y[i-1]);
			j=1;
			while(j<i){
				n=times10(copy(n));
				j++;
			}
			
			m=add(copy(n),copy(m));
			i++;
		}
		return m;
	}
	// Test auf kleiner-Relation zweier Ziffernfelder: a < b ?
	static boolean less (int[ ] a, int[ ] b)
	{
		if (equal(a,b)){
			return false;
		}
		if(a.length<b.length){
			return true;
		}
		
		if(a.length>b.length){
			return false;
		}

		if(a.length==b.length){
			int i=a.length;
			while (i>0){
				if (a[i-1]<b[i-1]){
					return true;
				}
				if (a[i-1]>b[i-1]){
					return false;
				}
				i--;
			}
			return false;
		}
		return true;//this point is never reached, but still solves some syntax problems
	}
	// Test auf Gleichheit zweier Ziffernfelder
	static boolean equal (int[ ] a, int[ ] b)
	{
		if(a.length!=b.length){
			return false;
		}

		if(a.length==b.length){
			int i=a.length;
			while (i>0){
				if (a[i-1]!=b[i-1]){
					return false;
				}
				i--;
			}
			return true;
		}
		return true;//again solves syntax problems, like in less()
	}
	// Test auf Korrektheit eines Ziffernfeldes: 
	// Feld existiert und enthaelt mindenstens eine Ziffer,
	// alle Positionen liegen zwischen 0 und 9, 
	// keine fuehrenden Nullen (ausser bei Null selbst)
	static boolean ok (int[ ] n)
	{
		int i = n.length;
		if (i<=0){
			return false;
		}
		if (i==1){
			if (n[0]>=0 && n[0]<=9){
				return true;
			}
			return false;
		}
		
		if( !(n[i-1]>=1 && n[i-1]<=9)){
			return false;
		}
		i--;
		while (i>0){
			if( !(n[i-1]>=0&&n[i-1]<=9)){
				return false;
			}
			i--;
		}
		return true;
	}	
	
	public static void main (String[ ] s) {
		int[ ] a = One();
		for (int i=0; i<10000; ++i) {
			a = times(a, 2);
		}
		System.out.println("2^10000 hat " + a.length + " Stellen");
		print(a); // 2 hoch 10000
		System.out.println();
		int[ ] b = fromInt(775);
		int[ ] c = copy(b);
		for (int i=1; i<1042; ++i) {
			c=times(c, b);
		}
		System.out.println("775^1042 hat " + c.length + " Stellen");
		print(c);
		// 775 hoch 1042
		System.out.println();
		System.out.println(less(a,c)); // beantwortet die Frage aus der Aufgabenueberschrift
	}
}

