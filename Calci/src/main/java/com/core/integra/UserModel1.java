package com.core.integra;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class UserModel1 {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
	private String num1;
	private String num2;
	private String op;
	private String res;
	
	public UserModel1(int id, String num1, String num2, String op, String res) {
		this.id = id;
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
		this.res = res;
	}
	public String getNum1() {
		return num1;
	}
	public void setNum1(String num1) {
		this.num1 = num1;
	}
	public String getNum2() {
		return num2;
	}
	public void setNum2(String num2) {
		this.num2 = num2;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
	@Override
	public String toString() {
		return "UserModel [num1=" + num1 + ", num2=" + num2 + ", op=" + op + ", res=" + res + "]";
	}
	public UserModel1() {
	}
	
	
	

}
