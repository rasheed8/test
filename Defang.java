package leetcode;

public class Defang {

	/*
	 * Given a valid (IPv4) IP address, return a defanged version of that IP
	 * address.
	 * 
	 * A defanged IP address replaces every period "." with "[.]".
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: address = "1.1.1.1" Output: "1[.]1[.]1[.]1"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1.1.1.1";
		char[] ch = str.toCharArray();

		char chr = '.';
		char[] chf = new String("[.]").toCharArray();
		StringBuffer sb = new StringBuffer();
		for (char ch1 : ch) {
			if (ch1 == chr) {
				sb.append(chf);
			} else {
				sb.append(ch1);
			}
		}
		System.out.println(sb.toString());

		// String str2=str.replace(".","[.]");

	}

}
