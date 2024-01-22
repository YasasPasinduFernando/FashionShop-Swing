/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DB.DBConnection;
import model.Customer;
import model.CustomerList;


/**
 *
 * @author Yasas Pasindu
 */
public class Controller {

    public static boolean addCustomer(Customer c) {
        CustomerList customerList = DBConnection.getInstance().getCustomerList();
        boolean isAdd = customerList.add(c);
        return isAdd;
    }

    public static Customer searchCustomer(String id) {
        CustomerList customerList = DBConnection.getInstance().getCustomerList();
        Customer c = customerList.getCustomer(id);
        return c;
    }

    public static boolean deleteCustomer(String id) {
        CustomerList customerList = DBConnection.getInstance().getCustomerList();
        boolean isDeleted = customerList.remove(id);
        return isDeleted;
    }
    
    public static boolean ChangeStatus(Customer customer , String Status){
        //CustomerList customerList = DBConnection.getInstance().getCustomerList();
        customer.setStatus(Status);
        return true;
    }
    public static Customer[] bestInCustomers(){
        CustomerList customerList = DBConnection.getInstance().getCustomerList();
        Customer[] c = customerList.BestInCustomer();
        return c;
    }
    public static Customer[] itemsByQty(){
        CustomerList customerList = DBConnection.getInstance().getCustomerList();
        Customer[] q = customerList.toArray();
        return q;
    }
    public static Customer[] allOrders(){
        CustomerList customerList = DBConnection.getInstance().getCustomerList();
        Customer[] c = customerList.toArray();
        return c;
    }
    public static Customer[] allOdersByAmount(){
     CustomerList customerList = DBConnection.getInstance().getCustomerList();
     Customer temp[] = customerList.toArray();
		boolean b =true;
		while(b){
			b= false;
		for (int i = 0; i < temp.length-1 ; i++)
		
		{
			if (temp[i].getAmount()< temp[i+1].getAmount())
			{
				b=true;
				int t =  temp[i].getAmount();
				 temp[i].setAmount(temp[i+1].getAmount());
				  temp[i+1].setAmount(t);
				  t = temp[i].getQty();
				 temp[i].setQty(temp[i+1].getQty());
				  temp[i+1].setQty(t);
				   t = temp[i].getPhoneNumber();
				    temp[i].setPhoneNumber(temp[i+1].getPhoneNumber());
				     temp[i+1].setPhoneNumber(t);
				     String  s =  temp[i].getSize();
				    temp[i].setSize(temp[i+1].getSize());
				     temp[i+1].setSize(s);
				     s =   temp[i].getStatus();
				    temp[i].setStatus(temp[i+1].getStatus());
				     temp[i+1].setStatus(s);
				      s =   temp[i].getId();
				    temp[i].setId( temp[i+1].getId());
				     temp[i+1].setId(s);
				     
			}
		}
		}
     return temp;
    }
    
    public static Customer[] viewCustomers(){
    CustomerList customerList = DBConnection.getInstance().getCustomerList();
        Customer[] c = customerList.ViewCustomers();
        return c;
    
    }
    public static Customer[] allCustomerReports(){
    CustomerList customerList = DBConnection.getInstance().getCustomerList();
        Customer[] c = customerList.toArray();
        return c;
    }

    public static Customer[] itemsByAmount() {
      CustomerList customerList = DBConnection.getInstance().getCustomerList();
        Customer[] q = customerList.toArray();
        return q;
    }
}
