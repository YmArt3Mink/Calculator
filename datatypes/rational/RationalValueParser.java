package calculator.datatypes.rational;


import calculator.AbstractValue;
import calculator.OperationNotSupportedException;
import calculator.ParseValueException;
import calculator.datatypes.rational.RationalValue;


public class RationalValueParser {
	public AbstractValue parse(String value) throws ParseValueException {
		try {
			String[] s = value.split("/");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			
			return new RationalValue(a, b);
		} catch (NumberFormatException | OperationNotSupportedException exception) {
			throw new ParseValueException();
		}
	}

	public String getDatatypeName() {
		return "рациональное число";
	}


}
