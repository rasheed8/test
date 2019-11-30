public class JewelsAndStonesLeetCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String J="z";
		String S="ZZ";
		
		int count =0;
		
		char[] ch=J.toCharArray();
		for(int i=0;i<S.length();i++)
		{
			if(checkContains(ch,S.charAt(i)))
			{
				count++;
			}
		}
		System.out.println(count);
	}

	private static boolean checkContains(char[] ch, char charAt) {
		// TODO Auto-generated method stub
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==charAt)
			{
				return true;
			}
		}
		return false;
	}

}
