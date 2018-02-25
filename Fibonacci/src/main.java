import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class main {
	static Scanner sc = new Scanner(System.in);
	
	public static void Fibonacci_Byte() {
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
	
	public static void Fibonacci_Short() {
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
	
	public static void Fibonacci_Int() {
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
	
	public static void Fibonacci_Long() {
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
	
	public static void Fibonacci_BigInteger() {
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
	
	public static void main(String[] args) {
		System.out.println("Fibonacci");
		System.out.println("Que tipo de dato desea utilizar");
		System.out.println("1. Byte");
		System.out.println("2. Short");
		System.out.println("3. Int");
		System.out.println("4. Long");
		System.out.println("5. Big Integer");
		System.out.println("6. End");
		int Option;
		Option = sc.nextInt();
		if(Option==1) {
			System.out.println("-------Byte-------");
			Fibonacci_Byte();
			main(args);
		}else if(Option==2) {
			System.out.println("------Short-------");
			Fibonacci_Short();
			main(args);
		}else if(Option==3) {
			System.out.println("-------Int--------");
			Fibonacci_Int();
			main(args);
		}else if(Option==4) {
			System.out.println("-------Long-------");
			Fibonacci_Long();
			main(args);
		}else if(Option==5) {
			System.out.println("----BigInteger----");
			Fibonacci_BigInteger();
			main(args);
		}else{
			System.out.println("Later");
		}
	}
}
//byte 11
//short 109
//int 1699
//long 3421
//BigInteger 22397
