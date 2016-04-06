package calculator.datatypes.vector;

import calculator.AbstractValue;
//import calculator.AbstractValueParser;
import calculator.ParseValueException;
import calculator.datatypes.vector.VectorValue;


public class VectorValueParser {

	public AbstractValue parse(String value) throws ParseValueException {
			try {
				String[] s = value.split(", ");
				int len = s.length;
				double[] v = new double[len];
				for(int i=0; i<len; i++)
				{
					v[i]=Double.parseDouble(s[i]);
				}
				return new VectorValue(v);
			} catch (NumberFormatException exception) {
				throw new ParseValueException();
			}
		}

		public String getDatatypeName() {
			return "вектор";
		}

	}

