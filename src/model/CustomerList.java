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
public class CustomerList {
        int size;
    	int index;
	double factor;
	private Customer[] customerArray ;
	//======Public Methos==============
	public Customer[] toArray(){
		Customer temp[] = new Customer[index];
		for (int i = 0; i < index; i++)
		{
			temp[i]=customerArray[i];
		}
		
		return  temp;
		}
	
	public  String search(String id){
		int tempIndex=getIndex(id);
		if (tempIndex==-1)
		{
			return "\t\t\t\tinvalid ID...\n\n";
		}
		if (isEmpty())
		{
			return "\t\t\t\tinvalid ID...\n\n";
		}
			return ""+customerArray[tempIndex];
		} 
	public boolean  remove (String id ){
		for (int i = getIndex(id); i < index-1; i++)
		{
			customerArray[i]=customerArray[i+1];
		}
		index--;
                return true;
		}
	public boolean add(Customer customer){
		if (isFull())
		{
			extendArrays();
		}
		customerArray[index++]=customer;
                return true;
		}
	public Customer getCustomer(String id){
            int temp =getIndex(id);
                if (temp==-1) {
                return null;
            }
                return customerArray[temp];
		
        }
	public int getIndex(String id){
		for (int i = 0; i <index ; i++)
		{
			if (customerArray[i].getId().equalsIgnoreCase(id))
			{
				return i;
			}
		}
		
		return -1;
		}
	public int getIndex(){
		return index;
		}
	public int getStatusOfCustomer(String id){
		int tempIndex = getIndex(id);
		if (customerArray[tempIndex].getStatus().equals("processing"))
		{
			return 0;
		}
		if (customerArray[tempIndex].getStatus().equals("Delivering"))
		{
			return 1;
		}
		if (customerArray[tempIndex].getStatus().equals("Deliverd"))
		{
			return 2;
		}
		return -1;
		}
	//======private methods============
	private boolean isValidIndex(){
		return index>0&&index<customerArray.length;
		}
	private boolean isEmpty (){
		return index==0;
		}
	private boolean isFull (){
		return index==customerArray.length;
		}
	private void extendArrays(){
		Customer temp[]=new Customer [index+(int)(index*factor)];
		for (int i = 0; i < index; i++)
		{
			temp[i]=customerArray[i];
		}
		
		customerArray=temp;
		}
        private static Customer[] extendArrays(Customer ar[]){
		Customer [] temp=new Customer[ar.length+1];
		for (int i = 0; i < ar.length; i++)
		{
			temp[i]=ar[i];
		}
		temp[temp.length-1]=new Customer();
		return temp;
	  }
        public Customer[] BestInCustomer(){
	 Customer temp[] =ViewCustomers();
         boolean b =true;
			while (b)
			{
				b=false;
				
			for (int i = 0; i <temp.length-1 ; i++)
			{
				if (temp[i].getAmount()<temp[i+1].getAmount())
				{
					b=true;
					int t =temp[i].getAmount();
					temp[i].setAmount(temp[i+1].getAmount());
					temp[i+1].setAmount(t);
					t=temp[i].getQty();
					temp[i].setQty(temp[i+1].getQty());
					temp[i+1].setQty(t);
					t = temp[i].getPhoneNumber();
					temp[i].setPhoneNumber(temp[i+1].getPhoneNumber());
					temp[i+1].setPhoneNumber(t);
				}
			}
			
			}
		
		return  temp;
		}
	   
        
	public CustomerList(int size, double factor){
		customerArray= new Customer[size];
		this.factor=factor;
                this.size=size;
		}

    public Customer[] ViewCustomers() {
        Customer tempar[] = toArray();
                Customer[] temp = new Customer[0];
		f:	for (int i = 0; i < tempar.length ; i++)
		{
			for (int k = 0; k < i; k++)
			{
				if (tempar[i].getPhoneNumber()==tempar[k].getPhoneNumber())
				{
					continue f;
				}
			}
			int totQty=0;
			int totAmuont=0;
			
			for (int j = i; j < tempar.length; j++)
			{
					if (tempar[i].getPhoneNumber()==tempar[j].getPhoneNumber())
					{
						totQty+=tempar[j].getQty();
						totAmuont+=tempar[j].getAmount();
					
					}
				
			}
			temp = extendArrays(temp);
				temp[temp.length-1].setPhoneNumber(tempar[i].getPhoneNumber());
				temp[temp.length-1].setAmount(totAmuont);
				temp[temp.length-1].setQty(totQty);
			
			}
                return temp;
    }
                
}
