package com.urdomain.lecture.ch13;

public class ProductExample {

	public static void main(String[] args) {
		
		Product<String, Integer> product = new Product<>();
	
		product.setKind("벤츠");
		product.setModel(400);
		
		System.out.println("내가 구매하는 차는 : " + product.getKind() + " - " + product.getModel() + " 입니다.");
		
		Product<Tv, String> product2 = new Product<>();	
//		product2.setKind(new Tv());
		
		
		//	product2 -> setKind -> field 로 대입
		
		Tv tv = new Tv();
		product2.setKind(tv);
		product2.setModel("OLED TV");
		
		Tv rtTv  = product2.getKind();
		String rtString = product2.getModel();
		
		System.out.println(rtTv + ":" + rtString);
	
	
	//	Car
	
		Product<Car, String> product3 = new Product<>();
		
		Car car = new Car();
		product3.setKind(car);
		product3.setModel("Avante");
		
		Car rtCar = product3.getKind();
		String rtString2 = product3.getModel();
		
		System.out.println(rtCar + ":" + rtString2);
	}
}
