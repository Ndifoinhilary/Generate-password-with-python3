package com.work;

public class Frequentcy_of_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "enter your string here";
		int[] freq = new int[str.length()];
		int i ,j ;
		char string[] = str.toCharArray();
		for(i  =0 ; i < str.length(); i ++) {
			freq[i] =1;
			for(j = i+1 ; j < str.length() ; j ++) {
				if(string[i] == string[j]) {
					freq[i]+=1;
					string[j] = '0';
				}
			}
		}
		
		System.out.println("Characters in the above string ");
		
		for(i = 0 ; i < str.length(); i ++) {
			if(string[i] != ' ' && string[i] !='0') {
				System.out.println(string[i] + "-" + freq[i] );
			}
		}

	}

}
