package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class PhoneController {
	
	private static Map<String, String> phone = new HashMap<String, String>() {{
		put("1", "1");
		put("0", "0");
		put("2", "2abc");
	    put("3", "3def");
	    put("4", "4ghi");
	    put("5", "5jkl");
	    put("6", "6mno");
	    put("7", "7pqrs");
	    put("8", "8tuv");
	    put("9", "9wxyz");
	    
	  }};

	  private List<String> output = new ArrayList<String>();

	  public void backtrack(String combination, String next_digits) {
	    // if there is no more digits to check
	    if (next_digits.length() == 0) {
	      // the combination is done
	      output.add(combination);
	    }
	    // if there are still digits to check
	    else {
	      // iterate over all letters which map 
	      // the next available digit
	      String digit = next_digits.substring(0, 1);
	      String letters = phone.get(digit);
	      for (int i = 0; i < letters.length(); i++) {
	        String letter = phone.get(digit).substring(i, i + 1);
	        // append the current letter to the combination
	        // and proceed to the next digits
	        backtrack(combination + letter, next_digits.substring(1));
	      }
	    }
	  }
	  
	  public List<String> letterCombinations(String digits) {
		    if (digits.length() != 0)
		      backtrack("", digits);
		    return output;
		  }
	  
	 
    @GetMapping("/phonenumbers/{phoneNumber}")
    public List<String> getAllPhoneCombinations(@PathVariable(value = "phoneNumber") String phoneNumber)
         {
		output = new ArrayList<String>();
		return letterCombinations(phoneNumber);
    }
}