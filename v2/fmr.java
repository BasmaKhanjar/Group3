import java.util.*;
import java.util.regex.*;

public class fmr{

	public static void main(String[] args){

		for(int i=0; i < args.length; i++){
			if(args[i].equals("-h")){
				System.out.println("this program takes in an input");
				System.exit(0);
			}//if
		}//for

		String line = args[0];
		String regrex = args[1];
		Pattern pattern = Pattern.compile(regrex);
		Matcher matcher = pattern.matcher(line);
		boolean found = false;
		
		while(matcher.find()){
			System.out.println("I found text "+matcher.group()+"Starting at index "+matcher.start()+
				"ending at index "+matcher.end());	
		
		}//while

		if(!found)
		{
			System.out.println("No match found");
		}//if

	}//main
}//class

