package leetcode;

import java.util.HashSet;

public class RemoveVowelsFromString {

	/**
	 * 
	 * Given a string S, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, 
	 * and return the new string.
	 * 
	 * Input: "leetcodeisacommunityforcoders"
	   Output: "ltcdscmmntyfrcdrs"
	   
	   Input: "aeiou"
       Output: ""
	 * 
	 * 
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str1 = "leetcodeisacommunityforcoders";
		// String str2=""
		removeVowels(str1);
	}

	public static void removeVowels(String str1)
	{

		HashSet<Character> hset = new HashSet<Character>();

		String vowels = "aeiou";

		for (int i = 0; i < vowels.length(); i++) 
		{
		hset.add(vowels.charAt(i));
		}

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str1.length(); i++) 
		{
			if (!hset.contains(str1.charAt(i)))
			{
				sb.append(str1.charAt(i));
			}
		}
		
		System.out.println(sb.toString());
		//Output: "ltcdscmmntyfrcdrs"

	}

}
