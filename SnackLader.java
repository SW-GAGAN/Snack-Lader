package com.bridgelabs.SL;
import java.util.*;
public class SnackLader {
	public static void main(String[] args){
		int start = 0, end = 100, count = 0; 
		Random rand1 = new Random();
		int dice = rand1.nextInt(6)+1;
		int Snack_Ladder = rand1.nextInt(2);
		if(Snack_Ladder == 1 && start<=100) {
			start = start+dice;
		}
		else if (start > dice) {
			start = start-1;
		}
	}
}
