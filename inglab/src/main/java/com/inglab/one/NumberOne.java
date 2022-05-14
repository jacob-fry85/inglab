package com.inglab.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberOne {
	public int[] maxColLengths(List<String[]> rows) {
		int count =-1;
		int[][] twoDcount = new int[rows.size()][4];
		int[] count_result = new int[4];
		for(String[] a : rows) {
			count++;
			for(int i = 0 ; i < a.length; i++) {
				twoDcount[count][i] = a[i].length();
			}
		}
		
		count = -1;
		
		for(int i = 0; i < twoDcount.length; i++) {
			count++;
			for(int j = 0; j < twoDcount[i].length; j++) {
				if(j == 0) {
					if(count == 0) {
						count_result[0] = twoDcount[i][j];
					} else {
						if(twoDcount[i][j] > count_result[0]) {
							count_result[0] = twoDcount[i][j];
						}
					}
				}
				if(j == 1) {
					if(count == 0) {
						count_result[1] = twoDcount[i][j];
					} else {
						if(twoDcount[i][j] > count_result[0]) {
							count_result[1] = twoDcount[i][j];
						}
					}
				}
				if(j == 2) {
					if(count == 0) {
						count_result[2] = twoDcount[i][j];
					} else {
						if(twoDcount[i][j] > count_result[2]) {
							count_result[2] = twoDcount[i][j];
						}
					}
				}
				if(j == 3) {
					if(count == 0) {
						count_result[3] = twoDcount[i][j];
					} else {
						if(twoDcount[i][j] > count_result[3]) {
							count_result[3] = twoDcount[i][j];
						}
					}
				}
			}
		}
		
		for(int i = 0; i < count_result.length; i++) {			
				System.out.print(count_result[i]);			
		}
		
		return count_result;
	}

	public static void main(String[] args) {
		NumberOne one = new NumberOne();
		
		List<String[]> stringArray = new ArrayList<String[]>();
		
		String first[] = {"abcdqw","aafdcw4ffs","ddheehed","ddwq43334"};
		String second[] = {"ab","acbdw","dddddddddd","fdfdfdfdffe333d"};
		String third[] = {"fdswddddd","ab","dddd","ddd3dffff3"};
		
		stringArray.add(first);
		stringArray.add(second);
		stringArray.add(third);
		
		one.maxColLengths(stringArray);
	}
}
