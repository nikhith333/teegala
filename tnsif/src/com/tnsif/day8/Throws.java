package com.tnsif.day8;
import java.io.*;

public class Throws {

	    public static void main(String[] args) {
	        try {
	            readFile(); // method may throw IOException
	        } catch (IOException e) {
	            System.out.println("Exception caught: " + e);
	        }
	    }

	    static void readFile() throws IOException {
	        FileReader fr = new FileReader("test.txt"); // if file not found
	        System.out.println("File opened successfully.");
	    }
	}


