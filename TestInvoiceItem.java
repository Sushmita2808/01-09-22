package com.test.bill;

public class TestInvoiceItem {
	public static void main(String[] args) {
		InvoiceItem obj=new InvoiceItem("11111","BOOK",5,49);
		
			System.out.println(obj);
			
			
			System.out.println("\nID:"+obj.getID());
			System.out.println("\nDESC:"+obj.getDesc());
			System.out.println("\nQTY:"+obj.getQty());
			
			
			System.out.println("\n Items:"+obj.toString());
			
			System.out.println("\n Total Amount:"+obj.getTotal());
	
			obj.setQty(4);
			System.out.println(obj);
			
		}

}
