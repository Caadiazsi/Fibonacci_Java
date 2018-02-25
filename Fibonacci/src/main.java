import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class main {
	static Scanner sc = new Scanner(System.in);
	
	public static void Fibonnacci_Byte() {
		int N =1;
		while (N>0) {
			System.out.println("Ingrese N, 0 para salir.");
			N = sc.nextInt();
			byte one =  1;
			byte two =  2;
			byte Help =  0;
			if (N == 2) {
				Help =  1;
			} else {
				for (int i = 1; i < N - 1; i++) {
					Help = (byte) (one + two);
					one = two;
					two = Help;
				}
			}
			System.out.println(Help);
			System.out.println("---------------------");
		}
	}
	
	public static void Fibonnacci_Short() {
		int N =1;
		while (N>0) {
			System.out.println("Ingrese N, 0 para salir.");
			N = sc.nextInt();
			short one =  1;
			short two =  2;
			short Help =  0;
			if (N == 2) {
				Help =  1;
			} else {
				for (int i = 1; i < N - 1; i++) {
					Help = (short) (one + two);
					one = two;
					two = Help;
				}
			}
			System.out.println(Help);
			System.out.println("---------------------");
		}
	}
	
	public static void Fibonnacci_Int() {
		int N =1;
		while (N>0) {
			System.out.println("Ingrese N, 0 para salir.");
			N = sc.nextInt();
			int one =  1;
			int two =  2;
			int Help =  0;
			if (N == 2) {
				Help =  1;
			} else {
				for (int i = 1; i < N - 1; i++) {
					Help = one + two;
					one = two;
					two = Help;
				}
			}
			System.out.println(Help);
			System.out.println("---------------------");
		}
	}
	
	public static void Fibonnacci_Long() {
		int N =1;
		while (N>0) {
			System.out.println("Ingrese N, 0 para salir.");
			N = sc.nextInt();
			Long one = (long) 1;
			Long two = (long) 2;
			Long Help = (long) 0;
			if (N == 2) {
				Help = (long) 1;
			} else {
				for (int i = 1; i < N - 1; i++) {
					Help = one + two;
					one = two;
					two = Help;
				}
			}
			System.out.println(Help);
			System.out.println("---------------------");
		}
	}
	
	public static void Fibonnacci_BigInteger() {
		int N =1;
		while (N>0) {
			System.out.println("Ingrese N, 0 para salir.");
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
