package br.com.mystudies.scala;

public class UsingScalaMethodsFromJava {

	public static void main(String[] args) {


		// see the br.com.mystudies.Car
		Car car = new Car(2017);

		System.out.println(car);
		car.drive(10);
		System.out.println(car);

	}
}
