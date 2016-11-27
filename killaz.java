public class killaz {
	public static int querprodukt(int i){
	      if(i<10) return i;
	      else{ return querprodukt(i/10) * (i%10);}}

   public static void main(String[] args) {
	   int[]erey=new int[378889111];
	   int schritte=2;
	   for (int i = 1;  i<10; i++){
		   erey[i]=0;
		   
	   }
	   for (int i = 10;  i<378889111; i++){
		   erey[i]=erey[querprodukt(i)] + 1;
		   if (erey[i]==schritte){
			   System.out.println(schritte+" Schritte "+i);
			   schritte++;
		   }
		   }
}}