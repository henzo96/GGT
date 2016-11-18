
public class Challo {
	public static void main(String[] args) {
	long full=0;
	
	int hit=0;
	int jan=32;
	int feb=60;
	int mrz=91;
	int apr=121;
	int mai=152;
	int jun=182;
	int jul=213;
	int aug=244;
	int sep=274;
	int oct=305;
	int nov=335;
	int dez=336;
	int gesucht = Integer.parseInt(args[0]);
	int ddmoon = 0;
	
	boolean Schaltjahr=false;
	
	int jahr=2013;
	
	
	
	for(int i=1;i<365;i++,full++){
		if(i==jan)hit=0;
		if(i==feb)hit=0;
		if(i==mrz)hit=0; //maerz
		if(i==apr)hit=0;
		if(i==mai)hit=0; //mai
		if(i==jun)hit=0;
		if(i==jul)hit=0;
		if(i==aug)hit=0; //august
		if(i==sep)hit=0;
		if(i==oct)hit=0; //october
		if(i==nov)hit=0;
		if(i==dez)hit=0;
		if(full%28==0)hit++;
		if (hit==2){System.out.println("Treffer");
		if(full<=30){System.out.println("Januar");break;}
		if(full<=58){System.out.println("Februar");break;}
		if(full<=89){System.out.println("März");break;}
		if(full<=119){System.out.println("April");break;}
		if(full<=150){System.out.println("Mai");break;}
		if(full<=180){System.out.println("Juni");break;}
		if(full<=211){System.out.println("Juli");break;}
		if(full<=242){System.out.println("August");break;}
		if(full<=272){System.out.println("September");break;}
		if(full<=303){System.out.println("Oktober");break;}
		if(full<=333){System.out.println("November");break;}
		if(full<=364){System.out.println("Dezember");break;}
		}
	;
	};
}
}