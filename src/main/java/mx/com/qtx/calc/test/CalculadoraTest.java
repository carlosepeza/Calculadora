package mx.com.qtx.calc.test;

import mx.com.qtx.calc.servicios.Calculadora;

public class CalculadoraTest {

	public static void main(String[] args) {
		test_suma();
	}

	private static void test_suma() {
		Calculadora miMaizoro = new Calculadora();
		int resultado = (int) miMaizoro.sumar(100, 150);
		
		System.out.println("Resultado suma = " + resultado);
		
		System.out.println("Resultado resta = " + miMaizoro.restar(100, 150));
		
		System.out.println("Resultado multiplicar = " + miMaizoro.multiplicar(100, 150));
	}

}
