package calculator.datatypes.rational;

import calculator.AbstractValue;
//import calculator.DivisionByZeroException;
import calculator.OperationNotSupportedException;


public class RationalValue extends AbstractValue{
	private final int num; //числитель может быть отрицательным, знаменатель - нет 
	private final int dem;

	public int getNum() {return this.num;}
	public int getDem() {return this.dem;}
	
	private int Euclid(int a, int b, int temp1, int temp2) {
		if (temp1 == temp2) return temp1;
		int d1 = Math.max(temp1, temp2) - Math.min(temp1, temp2);
		int d2 = Math.min(temp1, temp2);
		return Euclid(a, b, d1, d2);
	}
	
	public RationalValue(int num, int dem) throws OperationNotSupportedException {
		if(dem == 0) 
			{throw new OperationNotSupportedException(
					"создание рационального числа с 0 в знаменателе");}
		
		int a = Math.abs(num);
		int b = Math.abs(dem);
		
		int d = Euclid(a, b, a, b);
		if(num*dem<0) {this.num = -a/d; this.dem =b/d; }
		else {this.num = a/d; this.dem =b/d; }
	}

	
	public String toString() {
		return (num + "/" + dem);
	}

	public AbstractValue add(AbstractValue operand) throws OperationNotSupportedException {
			int a = this.num * ((RationalValue) operand).dem
					+ ((RationalValue) operand).num * this.dem;
			int b = this.dem * ((RationalValue) operand).dem;
			RationalValue n = new RationalValue(a, b);
			return n;
		}
	
	public AbstractValue sub(AbstractValue operand) throws OperationNotSupportedException{
		int a = this.num * ((RationalValue) operand).dem
				- ((RationalValue) operand).num * this.dem;
		int b = this.dem * ((RationalValue) operand).dem;
		RationalValue n = new RationalValue(a, b);
		return n;
	}
	
	public AbstractValue mul(AbstractValue operand) throws OperationNotSupportedException{
		int a = this.num * ((RationalValue) operand).num;
		int b = this.dem * ((RationalValue) operand).dem;
		RationalValue n = new RationalValue(a, b);
		return n;
	}
	
	public AbstractValue div(AbstractValue operand) throws OperationNotSupportedException{
		int a = this.num * ((RationalValue) operand).dem;
		int b = this.dem * ((RationalValue) operand).num;
		RationalValue n = new RationalValue(a, b);
		return n;
	}


}
