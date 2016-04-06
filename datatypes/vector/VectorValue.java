package calculator.datatypes.vector;

import java.util.ArrayList;
import calculator.AbstractValue;
import calculator.OperationNotSupportedException;

public class VectorValue extends AbstractValue {
	private double vec[];

	public VectorValue(ArrayList<Double> coord) {
		vec = new double[coord.size()];
		for (int i = 0; i < coord.size(); i++) {
			vec[i] = coord.get(i);
		}
	}

	public VectorValue(VectorValue operand) {
		vec = new double[operand.vec.length];
		for (int i = 0; i < vec.length; ++i) {
			vec[i] = operand.vec[i];
		}
	}

	public String toString() {
		String str = "(";
		int l = this.vec.length;
		for (int i = 0; i < l - 1; i++) {
			str += String.valueOf(this.vec[i]) + ',';
		}
		str += String.valueOf(this.vec[l - 1]) + ')';
		return str;
	}

	public AbstractValue add(AbstractValue operand) {
		VectorValue res = new VectorValue(this);
		for (int i = 0; i < vec.length; i++) {
			res.vec[i] += ((VectorValue) operand).vec[i];
		}
		return res;
	}

	public AbstractValue sub(AbstractValue operand) {
		VectorValue res = new VectorValue(this);
		for (int i = 0; i < vec.length; i++) {
			res.vec[i] -= ((VectorValue) operand).vec[i];
		}
		return res;
	}

	public AbstractValue mul(AbstractValue operand) throws OperationNotSupportedException {
		throw new OperationNotSupportedException("*");
	}

	public AbstractValue div(AbstractValue operand) throws OperationNotSupportedException {
		throw new OperationNotSupportedException("/");
	}

}
