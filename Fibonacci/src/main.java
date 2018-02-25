import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =1;
		while (N>0) {
			N = sc.nextInt();
			BigInteger one = BigInteger.ZERO;
			BigInteger two = BigInteger.ONE;
			BigInteger Help = BigInteger.ZERO;
			if (N == 2) {
				Help = BigInteger.ONE;
			} else {
				for (int i = 1; i < N - 1; i++) {
					Help = one.add(two);
					one = two;
					two = Help;
				}
			}
			System.out.println(Help);
			System.out.println("---------------------");
		}
	}
}
//byte 12
//short 110
//int 1700
//long 3422
//BigInteger 22396
