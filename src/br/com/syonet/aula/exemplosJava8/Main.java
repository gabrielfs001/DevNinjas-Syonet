package br.com.syonet.aula.exemplosJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        List<List<Integer>> listOfListofInts = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList( 7, 8, 9));
	        System.out.println(listOfListofInts.stream().flatMap(List::stream).collect(Collectors.toList()));
	        System.out.println(listOfListofInts.stream().map(List::stream).collect(Collectors.toList()));

	    }
	}
