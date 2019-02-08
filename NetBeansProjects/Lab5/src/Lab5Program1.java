/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dean Pektas
 */
import javax.swing.*;

public class Lab5Program1 {

	public static void main(String[] args) {
            
                
                System.out.println(args[0]);
                
                String[] wordArray = new String[50];
                
                int number = inputFromFile(args[0], wordArray);
                
                for(int i = 0; i < number; i++){
                    System.out.println(wordArray[i]);
                }
                
	
		//  String[] wordArray = { "hello", "goodbye", "cat", "dog", "red", "green", "sun", "moon" };
		String isOrIsNot, inputWord;
		
                
                while(true){
		// This line asks the user for input by popping out a single window
		// with text input
		inputWord = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");
		System.out.println(inputWord);
                if(inputWord.equals("STOP")){
                   
                    JOptionPane.showMessageDialog(null, "Exit!!!");
                    System.exit(0);
                }
                    
		// if the inputWord is contained within wordArray return true
		if (wordIsThere(inputWord, wordArray)) 
			isOrIsNot = "is"; // set to is if the word is on the list
		else
			isOrIsNot = "is not"; // set to is not if the word is not on the list
		
		// Output to a JOptionPane window whether the word is on the list or not
		JOptionPane.showMessageDialog(null, "The word " + inputWord + " " + isOrIsNot + " on the list.");
                }
            } //main

	public static boolean wordIsThere(String findMe, String[] theList) {
            
            for(int i = 0; i < theList.length; i++){
                if(findMe.equals(theList[i])){
                    return true;
                }
            }
            return false;
	}
        
        public static int inputFromFile(String filename, String[] wordArray){
            int num = 0;
            TextFileInput file = new TextFileInput(filename);
            
            wordArray[num] = file.readLine();
            
            while(num <= 50 && wordArray[num].equals(file)){
                num++;
                wordArray[num] = file.readLine();
            }
            
            return num;
        }
} // class Lab5Program1
