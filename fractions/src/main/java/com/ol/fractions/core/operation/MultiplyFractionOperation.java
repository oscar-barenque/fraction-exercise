package com.ol.fractions.core.operation;

import com.ol.fractions.core.Fraction;
import com.ol.fractions.core.Operator;

/**
 * Multiply operation implementation
 * @author OBarenque
 *
 */
public class MultiplyFractionOperation extends AbstractFractionOperation{

	public MultiplyFractionOperation() {
		super(Operator.MULTIPLY);
	}

	public Fraction executeOperation(final Fraction term1, final Fraction term2) {
		boolean negative=term1.isNegative()!=term2.isNegative();
		Fraction result=new Fraction(0,term1.getNumerator()*term2.getNumerator(),term1.getDenominator()*term2.getDenominator(),negative);
		simplifyAndconvertToMixedNumbers(result);
		return result;
	}

}
