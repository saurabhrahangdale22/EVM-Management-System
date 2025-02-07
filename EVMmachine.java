

import java.util.Scanner;
class EVMmachine 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		int bjp = 0 ,cng =0, ss =0, aap =0, mns =0, nota= 0 ;
		
		System.out.println();
		System.out.println("         WELCOME    ");
	    System.out.println();
	    System.out.println("ENTER THE POPULATION :");
	   int population = sc.nextInt();
	   for(int i=1; i<=population ;i++)
		{
				 
	  System.out.println("******** LIST OF PARTIES **********   ");
	  System.out.println("1.BJP");
	 System.out.println("2.CONGRESS ");
	 System.out.println("3. SHIV SHENA   ");
	 System.out.println("4.AAP");
	 System.out.println("5.MNS");
	 System.out.println("6.NOTA");
	 System.out.println();
						
	System.out.println("ENTER THE OPTION ");
	 int opt = sc.nextInt();
	 if (opt>1 && opt<=6){
	 if(opt ==1)
	{
	bjp++;
	System.out.println(" ACHE DIN AAYENGE   ");
								
	}
	if (opt ==2)
	{
	cng++;
	System.out.println("BHARAT JODO  ");
								
	}
	if (opt ==3)
	{
	ss++;
  System.out.println(" HUM HAIN ASLI SENA   ");
								
	}
						
	if (opt ==4)
	{
	aap++;
	System.out.println("MUJE AAZAD KRO ");
	}
	if (opt ==5)
	{
	mns++;
	System.out.println(" JAI MAHARASTRA  ");
	}
	if(opt ==6)
	{
	 nota++;
	 		System.out.println(" YOU ARE EDUCATED PERSON   ");
	}
	 if (!(opt>=1 && opt<=6))
		 { i--;
				System.out.println("  IVALIDE OPTION  "); 
	 }
	if (bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota)
	{
	System.out.println("BJP HAS WIN THE ELECTIONS BY "+ bjp+ "votes");	
	}
	if (cng>=cng && cng>=ss &&  cng>=aap && cng>=nota){
	
	System.out.println("CNG HAS WIN THE ELECTIONS BY " + cng+ "votes");	
		
	}
	if (ss>=cng && ss>=bjp &&  ss>=aap && ss>=mns && ss>=nota)
	{
	System.out.println("SS HAS WIN THE ELECTIONS BY " + ss +"votes");	
	}
	}
		}
	}
	}

	

