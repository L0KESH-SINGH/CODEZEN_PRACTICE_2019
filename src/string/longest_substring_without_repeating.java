package string;

import java.util.HashSet;

public class longest_substring_without_repeating {
	
	public static int lengthOfLongestSubstring(String s) {
		int max = 0;
		HashSet<Character> set = new HashSet<>();
		int n = s.length();
		int i = 0, j = 0;
		while (i < n && j < n) {
			if (set.contains(s.charAt(j))) {
				set.remove(s.charAt(i));
				i++;
			} else {
				set.add(s.charAt(j));
				j++;
				max = Math.max(max, j - i);
			}
		}
		return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "dvdf" ;
		System.out.println(lengthOfLongestSubstring(str));
	}

}
