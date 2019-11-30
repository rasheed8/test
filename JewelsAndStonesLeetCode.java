public class JewelsAndStonesLeetCode {

	/**
	 * You're given strings J representing the types of stones that are jewels,
	 * and S representing the stones you have. Each character in S is a type of
	 * stone you have. You want to know how many of the stones you have are also
	 * jewels.
	 * 
	 * The letters in J are guaranteed distinct, and all characters in J and S
	 * are letters. Letters are case sensitive, so "a" is considered a different
	 * type of stone from "A".
	 * 
	 * Example 1:
	 * 
	 * Input: J = "aA", S = "aAAbbbb" Output: 3 Example 2:
	 * 
	 * Input: J = "z", S = "ZZ" Output: 0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String J = "z";
		String S = "ZZ";

		int count = 0;

		char[] ch = J.toCharArray();
		for (int i = 0; i < S.length(); i++) {
			if (checkContains(ch, S.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);
	}

	private static boolean checkContains(char[] ch, char charAt) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == charAt) {
				return true;
			}
		}
		return false;
	}

}
