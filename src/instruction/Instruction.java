package instruction;

public class Instruction {
    private Operation operation;
    private Object param1=null;

    public Instruction(Operation operation) {
        this.operation = operation;
    }

    public Instruction(Operation operation, Object param1) {
        this.operation = operation;
        this.param1 = param1;
    }

    public Operation getOperation() {
        return operation;
    }

    public Object getParam1() {
        return param1;
    }

    public void setParam1(Object param1) {
        this.param1 = param1;
    }

    @Override
    public String toString() {
        return operation +
                "(" + param1 +
                ')';
    }
}
