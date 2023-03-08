package math.strategy.bertoti;

class SumOperation implements OperationStrategy {
    public int mathOperation(int A, int B) {
        return A + B;
    }
}

class SubOperation implements OperationStrategy {
    public int mathOperation(int A, int B) {
        return A - B;
    }
}

class MultiOperation implements OperationStrategy {
    public int mathOperation(int A, int B) {
        return A * B;
    }
}

class DivOperation implements OperationStrategy {
	public int mathOperation(int A, int B) {
        return A / B;
    }
}

