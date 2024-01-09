package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Arthimetic {
	
	@Autowired
	cal obj;

	@GetMapping
public String display() {
	return "Hii";
	}

	@GetMapping("Add/{a}/{b}")
	public String Add(@PathVariable int a,@PathVariable int b) {
		return "The sum of "+a+"and"+b+"="+obj.Add(a, b);
}
	@GetMapping("Sub")
	public String Sub(@RequestParam int a,@RequestParam int b) {
		return "The sub of "+a+"and"+b+"="+obj.Sub(a,b);
	}
	@GetMapping("Mul/{a}/{b}")
	public String Mul(@PathVariable int a,@PathVariable int b) {
		return "the Mul of "+a+" and "+b+" = "+obj.Mul(a,b);
	}
//	@PostMapping("Div")
//	public String Div(@RequestBody Calgs s) {
//		try {
//			int sum = obj.Div(s.getA(),s.getB());
//		}
//		catch(Exception e) {
//			return "Exception"+e;
//		}
//		return "the Div of "+s.getA()+" and "+s.getB()+"="+obj.Div(s.a,s.b);
//	}
	@PostMapping("Mod")
	public String Mod(@RequestBody Calgs obj1) {
		return Integer.toString(obj1.a%obj1.b);
	}
}
