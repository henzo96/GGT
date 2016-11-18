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
	
	while(ddmoon<gesucht){if (jahr % 4 == 0) {                                                                                                                                                                                       
        Schaltjahr = true;
      }      
      if (jahr % 100 == 0) {
        Schaltjahr = false;
      }
      if (jahr % 400 == 0) {
        Schaltjahr = true;
      }   
     if(Schaltjahr=false) {
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
		if(i==364)jahr++;
		if (hit==2){ddmoon++;System.out.println("Treffer");
			
			if(full<=30){System.out.println("Januar"+jahr);hit=0;continue;}
			if(full<=58){System.out.println("Februar");continue;}
			if(full<=89){System.out.println("März");continue;}
			if(full<=119){System.out.println("April");continue;}
			if(full<=150){System.out.println("Mai");continue;}
			if(full<=180){System.out.println("Juni");continue;}
			if(full<=211){System.out.println("Juli");continue;}
			if(full<=242){System.out.println("August");continue;}
			if(full<=272){System.out.println("September");continue;}
			if(full<=303){System.out.println("Oktober");continue;}
			if(full<=333){System.out.println("November");continue;}
			if(full<=364){System.out.println("Dezember");continue;}
		}
		else {
				for(int q=1;q<365;q++,full++){
					if(q==jan)hit=0;
					if(q==feb)hit=0;
					if(q==mrz)hit=0; //maerz
					if(q==apr)hit=0;
					if(q==mai)hit=0; //mai
					if(q==jun)hit=0;
					if(q==jul)hit=0;
					if(q==aug)hit=0; //august
					if(q==sep)hit=0;
					if(q==oct)hit=0; //october
					if(q==nov)hit=0;
					if(q==dez)hit=0;
					if(full%28==0)hit++;
					if(q==364)jahr++;
					if (hit==2){ddmoon++;System.out.println("Treffer");
						
						if(full<=30){System.out.println("Januar"+jahr);hit=0;continue;}
						if(full<=58){System.out.println("Februar");continue;}
						if(full<=89){System.out.println("März");continue;}
						if(full<=119){System.out.println("April");continue;}
						if(full<=150){System.out.println("Mai");continue;}
						if(full<=180){System.out.println("Juni");continue;}
						if(full<=211){System.out.println("Juli");continue;}
						if(full<=242){System.out.println("August");continue;}
						if(full<=272){System.out.println("September");continue;}
						if(full<=303){System.out.println("Oktober");continue;}
						if(full<=333){System.out.println("November");continue;}
						if(full<=364){System.out.println("Dezember");continue;}
					}}}
	;
	};
     }}
}}