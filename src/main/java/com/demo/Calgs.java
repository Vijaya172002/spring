package com.demo;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.AllArgsConstructor;
import lombok.Data;

@EntityScan
@Data
@AllArgsConstructor
public class Calgs {
public int a,b;

//public int getA() {
//	return a;
//}
//
//public void setA(int a) {
//	this.a = a;
//}
//
//public int getB() {
//	return b;
//}
//
//public void setB(int b) {
//	this.b = b;
//}

}
