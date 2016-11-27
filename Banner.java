/**
 * 
 */

/**
 * @author henning
 *
 */
public class Banner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String on= (args[0]);
		long laenge = Long.parseLong(args[0]);

	
		
		int length = String.valueOf(laenge).length();
		
		
	
			
		
		String[][]zerro ={
				{"  ###   "
," #   #  "
,"#     # "
,"#     # "  
,"#     # "
," #   #  "
,"  ###   "
,"        "
		},
		 {   "   #    "
		    ,"  ##    "
		    ," # #    "
		    ,"   #    "
		    ,"   #    "
		    ,"   #    "
		    ," #####  "	
		    ,"        "
				
				 } , 
		{     
			 " #####  "
			,"#     # "
			,"      # "
			," #####  "
			,"#       "
			,"#       "
			,"####### "
			,"        "
		},
			{
				 " #####  "
				,"#     # "
				,"      # "
				," #####  "
				,"      # "
				,"#     # "
				," #####  "
				,"        "
		
		
			},
			{    "#       "
				,"#    #  "
				,"#    #  "
				,"#    #  "
				,"####### "
				,"     #  "
				,"     #  "
				,"        "
			},
			{
		     "####### "
			,"#       "
			,"#       "
			,"######  "
			,"      # "
			,"#     # "
			," #####  "
			,"        "
			
			},
			{    " #####  "
				,"#     # "
				,"#       "
				,"######  "
				,"#     # "
				,"#     # "
				," #####  "
				,"        "
				
			},
			 {   "####### "
			    ,"#    #  "
			    ,"    #   "
			    ,"   #    "
			    ,"  #     "
			    ,"  #     "
			    ,"  #     "	
			    ,"        "
					
					 } , 
			            {    " #####  "
							,"#     # "
							,"#     # "
							," #####  "
							,"#     # "
							,"#     # "
							," #####  "
							,"        "
							
						},
			            {    " #####  "
							,"#     # "
							,"#     # "
							," ###### "
							,"      # "
							,"#     # "
							," #####  "
							,"        "
							
						},
				 };
		String[]finalx  ={"","","","","","","",""};
		
		
		int []ausgabe= new int[length];
		
				for (int i = 0;  i<length+1; i++)
					
					{
					if(i>10){break;};
					if(i>length){break;};
					if (i==on.length())
					{  
						break;};
					ausgabe[i] = Character.getNumericValue(on.charAt(i)) ;
					
					finalx[0]=finalx[0]+(zerro[ausgabe[i]][0]);
					finalx[1]=finalx[1]+(zerro[ausgabe[i]][1]);
					finalx[2]=finalx[2]+(zerro[ausgabe[i]][2]);
					finalx[3]=finalx[3]+(zerro[ausgabe[i]][3]);
					finalx[4]=finalx[4]+(zerro[ausgabe[i]][4]);
					finalx[5]=finalx[5]+(zerro[ausgabe[i]][5]);
					finalx[6]=finalx[6]+(zerro[ausgabe[i]][6]);
					finalx[7]=finalx[7]+(zerro[ausgabe[i]][7]);}
				
				System.out.println(finalx[0]);		
				System.out.println(finalx[1]);		
				System.out.println(finalx[2]);		
				System.out.println(finalx[3]);		
				System.out.println(finalx[4]);		
				System.out.println(finalx[5]);		
				System.out.println(finalx[6]);		
				System.out.println(finalx[7]);		
	}
	
}
