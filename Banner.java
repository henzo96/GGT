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
		int laenge = Integer.parseInt(args[0]);

		
		
		int length = String.valueOf(laenge).length();
		
		
		if(length>10)
			{length=10;};
			
		
		String[][]zerro ={
				{
				 "  ###   "
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
		
		
		int []ausgabe= new int[length];
		
				for (int i = 0;  i<length; i++)
					{ausgabe[i] = Character.getNumericValue(on.charAt(i)) ;
					System.out.println(zerro[ausgabe[i]][0]);
					System.out.println(zerro[ausgabe[i]][1]);
					System.out.println(zerro[ausgabe[i]][2]);
					System.out.println(zerro[ausgabe[i]][3]);
					System.out.println(zerro[ausgabe[i]][4]);
					System.out.println(zerro[ausgabe[i]][5]);
					System.out.println(zerro[ausgabe[i]][6]);
					System.out.println(zerro[ausgabe[i]][7]);}
		

	}

}
