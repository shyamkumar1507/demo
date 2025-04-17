package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LengthOfSubStringWithoutRepeating {

	public static int lengthOfLongestSubstring(String s) {

//		int n = s.length(), count =0, start =0;
//		for (int end = 0; end<n; end++) {
//			for (int i=start; i< end; i++) {
//				if (s.charAt(i) == s.charAt(end)) {
//					start = i+1;
//					break;
//				}
//			}
//			count = Math.max(count, end-start+1);
//		}
//
//		return count;

		int strLength = s.length(), windowStart = 0, count = 0;
		for (int windowEnd =0; windowEnd<strLength; windowEnd++) {
			for (int i=windowStart; i<windowEnd; i++) {
				if (s.charAt(i) == s.charAt(windowEnd)) {
					windowStart = i+1;
					break;
				}
			}
			count = Math.max(count, windowEnd-windowStart+1);
		}
		return count;
	}

	public static void main(String[] args) {

		int maLen = lengthOfLongestSubstring("abcabcbb");
		System.out.println("Maximum length is: "+maLen);

	}

}
