package Java;
public class CapitalizedProgram {  
	static String convert(String sentence)  
	 
	{ 
		char letter[]=sentence.toCharArray(); 
		for(int i=0;i<sentence.length();i++) 
		{ 
			if(i==0 && letter[i]!=' '|| letter[i]!=' '&& letter[i-1]==' ') 
			{ 
				if(letter[i]>='a'&& letter[i]<='z') 
				{ 
					letter[i]=(char)(letter[i]-'a'+'A');
				}
			} 
			else if(letter[i]>='A'&& letter[i]<='Z') 
			{ 
				letter[i]=(char)(letter[i]+'a'-'A');
			} 
			
		} 
		String st=new String(letter); 
		return st;
		
	}
	



	public static  void main(String[] args)   
	{  
		String sentence="the quick brown fox jumps over the lazy dog";  
		System.out.println(convert(sentence));
		
		
        } 
	}
		
		