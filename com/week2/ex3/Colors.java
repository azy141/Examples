package com.fdmgroup.com.week2.ex3;

import java.awt.Color;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Scanner;

public class Colors {

    public static void main(String[] args) {
        
        Colors chosecolors = new Colors();
        HashMap<String,Color> colourNames_ = new HashMap<String,Color>();
        
        colourNames_ = chosecolors.methodcolours();
        System.out.println("Please enter a Colour");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if (colourNames_.containsKey(line))
               System.out.println(colourNames_.get(line));
        
        
        
 }

    public HashMap<String, Color> methodcolours(){
		
			HashMap<String,Color> hashMapColours = new HashMap<String,Color>();

				hashMapColours.put("Red", Color.red);
				hashMapColours.put("Blue", Color.blue);
				hashMapColours.put("Green", Color.green);
				hashMapColours.put("Yellow", Color.yellow);
				hashMapColours.put("Orange", Color.orange);			
				return hashMapColours;


}}
