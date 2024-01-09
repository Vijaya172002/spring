package com.demo;

import org.springframework.stereotype.Service;

@Service
public class cal {
public int Add(int a, int b) {
	return a+b;
}
public int Sub(int a,int b) {
	return a-b;
}
public int Mul(int a, int b) {
	return a*b;
}
public int Div(int a, int b) {
	return a/b;
}
public int Mod(int a, int b) {
	return a%b;
}
}
