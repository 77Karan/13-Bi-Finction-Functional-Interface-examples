package pack01.multiplication;

import java.util.function.BiFunction;

public class MainFuncation
{
	public static void main(String[] args) 
	{
		BiFunction<Integer,Integer,Integer> bifi = (i,j) -> i*j;
		System.out.println(bifi.apply(12,12));
		
	}

}
