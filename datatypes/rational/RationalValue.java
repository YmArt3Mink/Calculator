package calculator.datatypes.rational;

import calculator.AbstractValue;
import calculator.DivisionByZeroException;

public class RationalValue extends AbstractValue {
	private final double num;
	private final double denom;

	public RationalValue(double num, double denom) {
		super();
		this.num = num;
		this.denom = denom;
	}

	public double getNum() {
		return this.num;
	}

	public double getDenom() {
		return this.denom;
	}

	public String toString() {
		String str;
		if(this.denom == 1){
			str = String.valueOf(num);
		}
		else{
			str = String.valueOf(num) + "/" + String.valueOf(denom);
		}
		return (str);
	}

	public AbstractValue add(AbstractValue operand) {
		double n = this.num * ((RationalValue) operand).denom + this.denom * ((RationalValue) operand).num;
		double d = this.denom * ((RationalValue) operand).denom;
		return new RationalValue(n, d);
	}

	public AbstractValue sub(AbstractValue operand) {
		return new RationalValue(num * ((RationalValue) operand).denom - num * ((RationalValue) operand).denom,
				denom * denom);
	}

	public AbstractValue mul(AbstractValue operand) {
		return new RationalValue(num * ((RationalValue) operand).num, denom * ((RationalValue) operand).denom);
	}

	public AbstractValue div(AbstractValue operand) throws DivisionByZeroException {

		double denomValue = ((RationalValue) operand).getDenom();
		if (denomValue == 0.0)
			throw new DivisionByZeroException();

		return new RationalValue(num * ((RationalValue) operand).denom, denom * ((RationalValue) operand).num);
	}

	// оепедекюрэ
	public static RationalValue parseRational(String s) {
		int posi = s.indexOf('/');
		double numpart, denompart;
		numpart = 0;
		denompart = 0;
		if (posi == -1) {
			numpart = Double.parseDouble(s);
		} else {
			numpart = Double.parseDouble(s.substring(0, posi));
			denompart = Double.parseDouble(s.substring(posi + 1));
		}

		return new RationalValue(numpart, denompart);
	}
}