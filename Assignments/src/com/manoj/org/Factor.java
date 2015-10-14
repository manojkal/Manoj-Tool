package com.manoj.org;

public class Factor {
public static void main(String[] args) {
	int ans = 1;
    for (int i = 1; i <= 5; i++) {
        ans = ans * i;
    }
    System.out.println("Print this before");
    System.out.println("The factorial of 5 is " + ans);
    
}
}
