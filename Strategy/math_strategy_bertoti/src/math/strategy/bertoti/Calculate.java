package math.strategy.bertoti;

public class Calculate{
	private OperationStrategy operationStrategy;

	public void setOperationStrategy(OperationStrategy operationStrategy) {
		this.operationStrategy = operationStrategy;
	}
	
	public int mathOperation(int A, int B) {
		return operationStrategy.mathOperation(A,B);
	}	
}
