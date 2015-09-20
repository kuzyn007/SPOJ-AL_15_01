/**
 * Autor kodu: Sewery Adamczyk
 * Pochodzenie: http://pl.spoj.com/problems/AL_15_01/
 */

import java.util.*;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		String Darek = in.nextLine();
		String Jarek = in.nextLine();
		String Marek = in.nextLine();
		int suma=0;
		char odpD;
		char odpJ;
		char odpM;
		for(int i=0; i<Darek.length(); i++)
		{
			odpD = Darek.charAt(i);
			odpJ = Jarek.charAt(i);
			odpM = Marek.charAt(i);
			if(odpJ != odpD)
			{
				suma = suma + 1;
			}
			if(odpM != odpD && odpM == odpJ)
			{
				suma = suma + 1;
			}
			if(odpJ == odpD && odpM != odpJ)
			{
				suma = suma + 1;
			}
		}
		System.out.println(suma);
			
		in.close();
	}

}

