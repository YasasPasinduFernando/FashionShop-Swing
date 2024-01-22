/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Yasas Pasindu
 */
public class Customer {
    
	private String id;
	private int phoneNumber;
	private String size;
	private String status="processing";
	private int amount;
	private  int qty;
	
		
	//=====getters==================
	public String getId(){
		return id;
	}
	public int getPhoneNumber(){
		return phoneNumber;
	}
	public String getSize(){
		return size;
	}
	public String getStatus(){
		return status;
	}
	public int getAmount(){
		return amount;
	}
	public int getQty(){
		return qty;
		}
	//=====setters=================
	public void setPhoneNumber(int phoneNumber){
		this.phoneNumber=phoneNumber;
		}
	public void setAmount(int amount){
		this.amount=amount;
		}
	public void setQty(int qty){
		this.qty=qty;
		}
	public void setId(String id){
		this.id=id;
		}
	public void setSize(String size){
		this.size=size;
		}
	public void setStatus(String status){
		this.status=status;
		}
	//constructor==========
	public Customer(String id,int phoneNumber, String size, int amount,int qty){
	this.id=id;
	this.phoneNumber=phoneNumber;
	this.size=size;
	this.amount=amount;
	this.qty=qty;	
	}
	Customer(){
		//used this one to sorting arrays
	}	
		
	
}
