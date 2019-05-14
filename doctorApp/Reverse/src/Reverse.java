
public class Reverse 
{
	public void reverse(String str)
	{
		String[] words=str.split(" ");
		String reversString="";

		for (int i=0;i<words.length;i++)
		{
			
			String word=words[i];
			String reverseWord="";
			
			for (int j=word.length()-1;j>=0;j--)	
			{
				if(word.length()>=5)
				{
					reverseWord=reverseWord+word.charAt(j);
				}
				else
				{
					reverseWord=word;
				}
			}
			reversString = reversString+reverseWord+ " ";	
		}
		
		System.out.println(str);
		System.out.println(reversString);
	}
	public static void main(String args[])
	{
		Reverse obj=new Reverse();
		obj.reverse("my name is shubhangi");
	}
}