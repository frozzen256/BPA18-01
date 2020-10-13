import java.util.*;

public class Solution {
	/*
	*  Дано n - число уровней. Построить треугольник из символов #.
    * Пример для n = 4:
	*	   #	
	*	  ##
	*	 ###
	*	####
    */	

	    
	static void func1(int n) {
    	for(int stroke = 1; stroke <= n; stroke++){
			for (int symbol = 1; symbol <= n - stroke; symbol++){
				System.out.print(' ');
			}
			for (int symbol = 1; symbol <= stroke; symbol++){
				System.out.print('#');
			}
			System.out.println(' ');
		}
       }
    
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		func1(n);
		}
		  
	}