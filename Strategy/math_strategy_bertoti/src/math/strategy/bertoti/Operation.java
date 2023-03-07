package math.strategy.bertoti;

class SumOperation implements OperationStrategy {
    @Override
    public int mathOperation(int A, int B) {
        return A + B;
    }
}

class SubOperation implements OperationStrategy {
    @Override
    public int mathOperation(int A, int B) {
        return A - B;
    }
}

class MultiOperation implements OperationStrategy {
    @Override
    public int mathOperation(int A, int B) {
        return A * B;
    }
}

class DivOperation implements OperationStrategy {
    @Override
    public int mathOperation(int A, int B) {
        return A / B;
    }
}

