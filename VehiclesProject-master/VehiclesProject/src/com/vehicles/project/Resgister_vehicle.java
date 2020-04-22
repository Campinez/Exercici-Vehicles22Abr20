package com.vehicles.project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Resgister_vehicle {

	public static void main(String[] args) {
		//Declaro Scanner para recoger datos por consola
		Scanner register1= new Scanner(System.in);
		
		//Recogo por consola los daots de matrícula, marca y color
		System.out.println("Enter license plate");
		String plate= register1.nextLine();
		System.out.println("Enter brand");
		String brand= register1.nextLine();
		System.out.println("Enter color");
		String color= register1.nextLine();
		
		//Instancio un objeto de la clase coche con los parametros recogidos en el Scanner anterior
		Car car1= new Car(plate,brand,color);
		//Compruebo con Override to String que se ha instanciado correctamente el coche
		System.out.println(car1);
		
		Scanner register2= new Scanner(System.in);
		Scanner register3= new Scanner(System.in);
		
		//Recogo por consola los datos de los pneumáticos traseros
		System.out.println("Enter brand of rear wheels");
		String rearWheelsBrand=register2.nextLine();
		System.out.println("Enter size of rear wheels");
		Double rearWheelsSize=register3.nextDouble();
		
		//Recogo por consola los datos de los pneumáticos delanteros
		System.out.println("Enter brand of front wheels");
		String frontWheelsBrand=register2.nextLine();
		System.out.println("Enter size of front wheels");
		Double frontWheelsSize=register3.nextDouble();
		
		//Instancio los pneumaticos traseros
		Wheel wheelsBack1= new Wheel(rearWheelsBrand,rearWheelsSize);
		Wheel wheelsBack2= new Wheel(rearWheelsBrand,rearWheelsSize);
		
		//Instancio los pneumaticos delanteros
		Wheel wheelsFront1= new Wheel(frontWheelsBrand,frontWheelsSize);
		Wheel wheelsFront2= new Wheel(frontWheelsBrand,frontWheelsSize);
		
		//Creo arrayList neumaticos traseros y los meto en el Array
		ArrayList <Wheel> backWheels = new ArrayList <Wheel>();
		backWheels.add(wheelsBack1);
		backWheels.add(wheelsBack2);
			
		//Creo arrayList neumaticos delanteros y los meto en el Array
		ArrayList <Wheel> frontWheels = new ArrayList <Wheel>();
		frontWheels.add(wheelsFront1);
		frontWheels.add(wheelsFront2);
		
		//Invoco al metodo de añadir ruedas con una excepción indicada en la linea 11 de Car.java
		try {
		car1.addWheels(backWheels,frontWheels);
		}catch(Exception e) {
			System.out.println("No se han podido cargar las ruedas.");
		}
		
		System.out.println(car1);
		
	}
	

}
