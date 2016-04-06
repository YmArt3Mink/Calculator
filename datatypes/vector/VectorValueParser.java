package calculator.datatypes.vector;

import java.util.ArrayList;

import calculator.AbstractValue;
import calculator.AbstractValueParser;
import calculator.ParseValueException;

public class VectorValueParser implements AbstractValueParser {

	public AbstractValue parse(String value) throws ParseValueException {
		try {
			return parseVector(value);
		} catch (NumberFormatException exception) {
			throw new ParseValueException();
		}
	}

	public String getDatatypeName() {
		return "вектор";
	}

	public static VectorValue parseVector(String s) {
		ArrayList<Double> coord = new ArrayList<Double>();
		int pos1 = s.indexOf('(');
		String str = "";
		int l = s.length();
		if (pos1 != 0) {
			throw new NumberFormatException();
		}
		int i = 1;
		while (i < l) {
			while (i < l && s.charAt(i) != ',') {
				str += s.charAt(i);
				i++;
			}
			if (i != l) {
				coord.add(Double.parseDouble(str));
				str = "";
			} else {
				if (str.charAt(str.length() - 1) != ')') {
					throw new NumberFormatException();
				}
				coord.add(Double.parseDouble(str.substring(0, str.length() - 1)));
			}
			i++;
		}
		return new VectorValue(coord);
	}
}
