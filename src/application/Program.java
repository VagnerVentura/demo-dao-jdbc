package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "books");
		System.out.println(obj);
		
		Seller seller = new Seller(10,"Vagner","vagnerventura@hotmail.com",new Date(),200.00);
		
		System.out.println(seller);
	}

}
