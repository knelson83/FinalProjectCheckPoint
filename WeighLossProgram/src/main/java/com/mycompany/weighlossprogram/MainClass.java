
package com.mycompany.weighlossprogram;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;


public class MainClass {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		File myFile = new File("C:\\blankfile.txt");
		Scanner inputFile = new Scanner(myFile);
		ArrayList <String> userList = new ArrayList();
		
		while (inputFile.hasNext()){
			userList.add(inputFile.next());
		
	}
	
		inputFile.close();
		Collections.sort(userList, Collator.getInstance());
		System.out.println(userList);
		System.out.println("=======================");
		
		}
}
