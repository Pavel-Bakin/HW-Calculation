public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    private double calculateOperation(int arg0, int arg1, Calculator.Operation operation) {
        Calculator.Formula formula = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(operation);
        return formula.result();
    }

    @Override
    public int sum(int arg0, int arg1) {
        return (int) calculateOperation(arg0, arg1, Calculator.Operation.SUM);
    }

    @Override
    public int mult(int arg0, int arg1) {
        return (int) calculateOperation(arg0, arg1, Calculator.Operation.MULT);
    }

    @Override
    public int pow(int a, int b) {
        return (int) calculateOperation(a, b, Calculator.Operation.POW);
    }
}
