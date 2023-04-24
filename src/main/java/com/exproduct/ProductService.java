package com.exproduct;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements ProductServiceInterface {

	@Override
	public List<Product> findAll() {
		ArrayList<Product> products = new ArrayList<Product>();
		//adding products to the List
		products.add(new Product(100, "Mobile", "AppleIPhone 14Pro(128 GB)-DeepPurple ",119999.00,1));
		products.add(new Product(101, "Smart TV", "Samsung(55 inches)4K Ultra HD Smart QLED TV",75990.00, 2));
		products.add(new Product(102, "Washing Machine", "Bosch 8 Kg Fully Automatic Front Load Washing Machine",41990.00,3));
		products.add(new Product(103, "Laptop", "Apple 2022 MacBook Air", 105999.00, 4));
		products.add(new Product(104, "Air Conditioner", "Carrier2Ton 5Star InverterSplit AC", 52932.00, 5));
		products.add(new Product(105, "Refrigerator", "LG 688 L Frost Free Smart Inverter Side-by-Side Refrigerator", 77990.00,6));
		// TODO Auto-generated method stub
		return products;
	}

}
