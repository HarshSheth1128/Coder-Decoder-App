package com.app;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Decoder {

    private String input = "";
    private String output = "";
    private char[] charList;

    private final char letters[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u',
            'v','w','x','y','z'};

    public Decoder(String input, int key){
        input.toLowerCase();
        this.input = input;
        makeCharList();
        convert(charList, key);
    }

    //Gets the string from the user
    public void getString(){
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
    }

    //Converts the string into an array of chars
    public void makeCharList(){
        int size = input.length();
        charList = new char[size];
        for (int i = 0; i < input.length(); i++){
            charList[i] = input.charAt(i);
        }
        //Testing
        /*
        for (int i = 0; i < charList.length; i++){
            System.out.println(charList[i]);
        }*/
    }


    //Checks it the array number is over 0 and if not makes it over 0
    //RENAME TO OVER 0
    public int under25(int i){
        if (i < 0){
            i = i + 26;
            return i;
        }else {
            return i;
        }
    }

    //Converts the chars into a string
    public String toString(){
        for (int i = 0; i < charList.length; i++){
            output += charList[i];
        }
        return output;
    }

    public void printString(){
        System.out.println(output);
    }

    public int getKey(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public void convert(char[] c, int key){
        //Goes through every char in list
        for (int i = 0; i < charList.length; i++){
            //variable for the corresponding letter in letter array
            int letterNum;
            //tests charList[i]
            switch (charList[i]){
                case ('a'):
                    //add the key + original value in the letter array
                    letterNum = 0 - key;
                    //run the under25 method
                    charList[i] = letters[under25(letterNum)];
                    break;
                //repeated for all other letters
                case ('b'):
                    letterNum = 1 - key;
                    charList[i] = letters[under25(letterNum)];
                    break;
                case ('c'):
                    letterNum = 2 - key;
                    charList[i] = letters[under25(letterNum)];
                    break;
                case ('d'):
                    letterNum = 3 - key;
                    charList[i] = letters[under25(letterNum)];
                    break;
                case ('e'):
                    letterNum = 4 - key;
                    charList[i] = letters[under25(letterNum)];
                    break;
                case ('f'):
                    letterNum = 5 - key;
                    charList[i] = letters[under25(letterNum)];
                    break;
                case ('g'):
                    letterNum = 6 - key;
                    charList[i] = letters[under25(letterNum)];
                    break;
                case ('h'):
                    letterNum = 7 - key;
                    charList[i] = letters[under25(letterNum)];
                    break;
                case ('i'):
                    letterNum = 8 - key;
                    charList[i] = letters[under25(letterNum)];
                    break;
                case ('j'):
                    letterNum = 9 - key;
                    charList[i] = letters[under25(letterNum)];
                    break;
                case ('k'):
                    letterNum = 10 - key;
                    charList[i] = letters[under25(letterNum)];
                    break;
                case ('l'):
                    letterNum = 11 - key;
                    charList[i] = letters[under25(letterNum)];
                    break;
                case ('m'):
                    letterNum = 12 - key;
                    charList[i] = letters[under25(letterNum)];
                    break;
                case ('n'):
                    letterNum = 13 - key;
                    charList[i] = letters[under25(letterNum)];
                    break;
                case ('o'):
                    letterNum = 14 - key;
                    charList[i] = letters[under25(letterNum)];
                    break;
                case ('p'):
                    letterNum = 15 - key;
                    charList[i] = letters[under25(letterNum)];
                    break;
                case ('q'):
                    letterNum = 16 - key;
                    charList[i] = letters[under25(letterNum)];
                    break;
                case ('r'):
                    letterNum = 17 - key;
                    charList[i] = letters[under25(letterNum)];
                    break;
                case ('s'):
                    letterNum = 18 - key;
                    charList[i] = letters[under25(letterNum)];
                    break;
                case ('t'):
                    letterNum = 19 - key;
                    charList[i] = letters[under25(letterNum)];
                    break;
                case ('u'):
                    letterNum = 20 - key;
                    charList[i] = letters[under25(letterNum)];
                    break;
                case ('v'):
                    letterNum = 21 - key;
                    charList[i] = letters[under25(letterNum)];
                    break;
                case ('w'):
                    letterNum = 22 - key;
                    charList[i] = letters[under25(letterNum)];
                    break;
                case ('x'):
                    letterNum = 23 - key;
                    charList[i] = letters[under25(letterNum)];
                    break;
                case ('y'):
                    letterNum = 24 - key;
                    charList[i] = letters[under25(letterNum)];
                    break;
                case ('z'):
                    letterNum = 25 - key;
                    charList[i] = letters[under25(letterNum)];
                    break;

            }
        }
    }
}



