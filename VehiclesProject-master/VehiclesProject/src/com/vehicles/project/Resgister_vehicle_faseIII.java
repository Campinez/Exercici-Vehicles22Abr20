package com.vehicles.project;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Resgister_vehicle_faseIII {

	public static void main(String[] args) {
		
//Declaro Scanner para recoger datos por consola
		Scanner register1= new Scanner(System.in);
		
//Recogo la opción moto o coche y lo asigno a una variable
		System.out.println("Do you want to register a: 1-BIKE or 2-CAR.");
		int bikeOrCar=register1.nextInt();
		
//Recogo por consola los datos de matrícula con validación de formatos de entrada
		boolean checkPlate;
		String plate;
		do{
			System.out.println("Enter license plate");
			plate= register1.nextLine();
//Valido matrícula formato antiguo
			checkPlate=plate.toUpperCase().matches("[A-Z]{1,2}+\\d{4}+[A-Z]{1,2}");
//Valido matrícula formato europeo con un if para que solo entre en caso de que la anterior comprobación no sea válida
			if(checkPlate==false) {
				checkPlate=plate.toUpperCase().matches("(E)+\\d{4}+[A-Z]{3}");
			}
		}while(checkPlate==false);
		
		
//Recogo por consola los datos de marca y color
		System.out.println("Enter brand");
		String brand= register1.nextLine();
		System.out.println("Enter color");
		String color= register1.nextLine();
		
		if(bikeOrCar==2) {
//Instancio un objeto de la clase coche con los parametros recogidos en el Scanner anterior
			Car car1= new Car(plate,brand,color);
//Compruebo con Override to String que se ha instanciado correctamente el coche
			System.out.println(car1);
		
//Cambio el idioma de Scanner para poder usar punto como coma en el diametro de la rueda
			Scanner register2= new Scanner(System.in);
			Scanner register3= new Scanner(System.in);
			register3.useLocale(Locale.US);
		
//Recogo por consola la marca de los pneumáticos traseros
			System.out.println("Enter brand of rear wheels");
			String rearWheelsBrand=register2.nextLine();
//Recogo la medida de los neumáticos traseros y aplico restricciones en los datos
			boolean checkRearkWheels;
			double sizeRearkWheels;
			do {
				System.out.println("Enter size of rear wheels");
				sizeRearkWheels=register3.nextDouble();
				if (sizeRearkWheels>0.4 && sizeRearkWheels<4) {
					checkRearkWheels=true;
				}else {checkRearkWheels=false;}
			}while(!checkRearkWheels);
		
//Recogo por consola la marca de los pneumáticos delanteros
			System.out.println("Enter brand of front wheels");
			String frontWheelsBrand=register2.nextLine();
//Recogo la medida de los neumáticos delanteros y aplico restricciones en los datos
			boolean checkFrontkWheels;
			double sizeFrontkWheels;
			do {
				System.out.println("Enter size of front wheels");
				sizeFrontkWheels=register3.nextDouble();
				if (sizeFrontkWheels>0.4 && sizeFrontkWheels<4) {
					checkFrontkWheels=true;
				}else {checkFrontkWheels=false;}
			}while(!checkFrontkWheels);
		
//Instancio los pneumaticos traseros
			Wheel wheelsBack1= new Wheel(rearWheelsBrand,sizeRearkWheels);
			Wheel wheelsBack2= new Wheel(rearWheelsBrand,sizeRearkWheels);
		
//Instancio los pneumaticos delanteros
			Wheel wheelsFront1= new Wheel(frontWheelsBrand,sizeFrontkWheels);
			Wheel wheelsFront2= new Wheel(frontWheelsBrand,sizeFrontkWheels);
		
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
		if(bikeOrCar==1) {
//Instancio un objeto de la clase moto con los parametros recogidos en el Scanner anterior
			Bike bike1= new Bike(plate,brand,color);
//Compruebo con Override to String que se ha instanciado correctamente el coche
			System.out.println(bike1);
		
//Cambio el idioma de Scanner para poder usar punto como coma en el diametro de la rueda
			Scanner register2= new Scanner(System.in);
			Scanner register3= new Scanner(System.in);
			register3.useLocale(Locale.US);
		
//Recogo por consola la marca del pneumático trasero
			System.out.println("Enter brand of rear wheel");
			String rearWheelsBrand=register2.nextLine();
//Recogo la medida del neumático trasero.
			System.out.println("Enter size of rear wheel");
			double sizeRearkWheels=register3.nextDouble();
//Recogo por consola la marca del pneumático delantero
			System.out.println("Enter brand of front wheel");
			String frontWheelsBrand=register2.nextLine();
//Recogo la medida del neumático delantero
			System.out.println("Enter size of front wheels");
			double sizeFrontkWheels=register3.nextDouble();
//Instancio el pneumatico trasero
			Wheel wheelsBack1= new Wheel(rearWheelsBrand,sizeRearkWheels);
//Instancio el pneumatico delantero
			Wheel wheelsFront1= new Wheel(frontWheelsBrand,sizeFrontkWheels);
		
//Creo arrayList neumatico trasero y lo meto en el Array
			ArrayList <Wheel> backWheels = new ArrayList <Wheel>();
			backWheels.add(wheelsBack1);
//Creo arrayList neumatico delantero y lo meto en el Array
			ArrayList <Wheel> frontWheels = new ArrayList <Wheel>();
			frontWheels.add(wheelsFront1);
			
//Invoco al metodo de añadir ruedas con una excepción indicada en la linea 11 de Car.java
			try {
				bike1.addWheels(backWheels,frontWheels);
			}catch(Exception e) {
				System.out.println("No se han podido cargar las ruedas.");
			}
		
			System.out.println(bike1);
		}
	}
}

