package calculator.datatypes.complex;

import calculator.AbstractValue;
import calculator.AbstractValueParser;
import calculator.ParseValueException;
import calculator.datatypes.complex.ComplexValue;

public class ComplexValueParser implements AbstractValueParser {

	public AbstractValue parse(String value) throws ParseValueException {
		try {
			return parseComplex(value);
		} catch (NumberFormatException exception) {
			throw new ParseValueException();
		}
	}

	public String getDatatypeName() {
		return "комплексные числа";
	}

	public static ComplexValue parseComplex(String s) {
		int posi = s.indexOf('i');
		char sign = '+';
		int poss = s.indexOf(sign);
		double realpart, imenpart;
		realpart = 0;
		imenpart = 0;
		if (posi == -1) {
			realpart = Double.parseDouble(s);
		}
		if (poss == -1) {
			sign = '-';
			poss = s.indexOf(sign);
		}
		if (poss == -1) {
			sign = '=';
		}
		if ((posi != -1) && (poss == -1)) {
			if (s.endsWith("i")) {
				imenpart = 1;
			} else {
				imenpart = Double.parseDouble(s.substring(1));
			}
		}
		if ((posi != -1) && (poss != -1)) {
			realpart = Double.parseDouble(s.substring(0, poss));
			if (s.endsWith("i")) {
				imenpart = Double.parseDouble(s.substring(poss,posi));
			} else {
				imenpart = Double.parseDouble(s.substring(posi + 1));
			}
		}
		if (sign == '-') {
			imenpart = -imenpart;
		}
		return new ComplexValue(realpart, imenpart);
	}
}
