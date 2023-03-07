package math.strategy.bertoti;

public class Application {
	
	public static void main(String[] args) {
	    Calculate calculate = new Calculate();
	    calculate.setOperationStrategy(new SumOperation());
	    int resultado = calculate.mathOperation(10, 5);
	    System.out.println("Resultado da soma: " + resultado);

	    calculate.setOperationStrategy(new SubOperation());
	    resultado = calculate.mathOperation(10, 5);
	    System.out.println("Resultado da subtração: " + resultado);

	    calculate.setOperationStrategy(new MultiOperation());
	    resultado = calculate.mathOperation(10, 5);
	    System.out.println("Resultado da multiplicação: " + resultado);

	    calculate.setOperationStrategy(new DivOperation());
	    resultado = calculate.mathOperation(10, 5);
	    System.out.println("Resultado da divisão: " + resultado);
	}

}
