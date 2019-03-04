package lu.snt.rsfol.visitors;

import lu.snt.rsfol.LOGICOP;
import lu.snt.rsfol.RELOP;
import lu.snt.rsfol.Signal;
import lu.snt.rsfol.SignalID;
import lu.snt.rsfol.SignalMatrix;
import lu.snt.rsfol.SignalVector;
import lu.snt.rsfol.Tvariable;
import lu.snt.rsfol.atoms.ExpressionComparison;
import lu.snt.rsfol.atoms.SignalComparison;
import lu.snt.rsfol.atoms.SignalConstantComparison;
import lu.snt.rsfol.atoms.Value;
import lu.snt.rsfol.expression.AbsoluteExpression;
import lu.snt.rsfol.expression.BinaryExpression;
import lu.snt.rsfol.expression.CosExpression;
import lu.snt.rsfol.expression.NormExpression;
import lu.snt.rsfol.expression.SQRTExpression;
import lu.snt.rsfol.expression.SignedExpression;
import lu.snt.rsfol.expression.SinExpression;
import lu.snt.rsfol.formulae.BinaryFormula;
import lu.snt.rsfol.formulae.Bound;
import lu.snt.rsfol.formulae.ExistsFormula;
import lu.snt.rsfol.formulae.ForallFormula;
import lu.snt.rsfol.formulae.NotFormula;
import lu.snt.rsfol.formulae.RSFOLFormula;
import lu.snt.rsfol.timedterm.InfiniteTerm;
import lu.snt.rsfol.timedterm.TimedTermExpression;
import lu.snt.rsfol.timedterm.TimedTermNumber;

public class RSFOLPushNegations implements RSFOLVisitor<RSFOLFormula>{

	private boolean negate;
	
	public RSFOLPushNegations(boolean negate){
		this.negate=negate;
	}

	public RSFOLFormula visit(SignalID signal) {
		return signal;
	}

	public RSFOLFormula visit(Tvariable tvariable) {
		return tvariable;
	}

	public RSFOLFormula visit(Signal signal) {
		return signal;
	}
	public RSFOLFormula visit(SignalVector signalVector) {
		return signalVector;
	}

	public RSFOLFormula visit(SignalMatrix signalMatrix) {
		return signalMatrix;
	}

	public RSFOLFormula visit(ForallFormula forallFormula) {
		if(negate) {
			return new ExistsFormula(forallFormula.getBound(),
					forallFormula.getFormula().accept(new RSFOLPushNegations(true)));
		}
		return 
				new ForallFormula(forallFormula.getBound(), 
				forallFormula.getFormula().accept(new RSFOLPushNegations(false)));
	}

	@Override
	public RSFOLFormula visit(NotFormula notFormula) {
		if (negate) {
			return notFormula.getSubformula().accept(new RSFOLPushNegations(false));
		}
		return notFormula.getSubformula().accept(new RSFOLPushNegations(true));
	}

	@Override
	public RSFOLFormula visit(BinaryFormula binaryFormula) {
		if (negate) {
			
			LOGICOP op2=LOGICOP.CONJ;
			if(binaryFormula.getOp().equals(LOGICOP.CONJ)) {
				op2=LOGICOP.DISJ;
			}
			if(binaryFormula.getOp().equals(LOGICOP.DISJ)) {
				op2=LOGICOP.CONJ;
			}
			return new BinaryFormula(binaryFormula.getSubformula1().accept(new RSFOLPushNegations(true)), op2, binaryFormula.getSubformula2().accept(new RSFOLPushNegations(true)));
		}
		return 
			new BinaryFormula(binaryFormula.getSubformula1().accept(new RSFOLPushNegations(false)), binaryFormula.getOp(), binaryFormula.getSubformula2().accept(new RSFOLPushNegations(false)));
			
	}

	@Override
	public RSFOLFormula visit(SignalConstantComparison signalConstantComparison) {
		if (negate) {
			return new SignalConstantComparison(signalConstantComparison.getSignal(), 
					RELOP.negate(signalConstantComparison.getOp())
					, signalConstantComparison.getValue());
		}
		return signalConstantComparison;
	}

	@Override
	public RSFOLFormula visit(SignalComparison signalComparison) {

		if (negate) {
			return new SignalComparison(signalComparison.getSignal1(), 
					RELOP.negate(signalComparison.getOp())
					, signalComparison.getSignal2());
		}
		return signalComparison;
	}
	
	@Override
	public RSFOLFormula visit(ExpressionComparison expressionComparison) {
		if (negate) {
			return new ExpressionComparison(expressionComparison.getExpression1(), 
					RELOP.negate(expressionComparison.getOp())
					, expressionComparison.getExpression2());
		}
		return expressionComparison;
	}

	@Override
	public RSFOLFormula visit(TimedTermExpression timedTermExpression) {
		return timedTermExpression;
	}

	@Override
	public RSFOLFormula visit(TimedTermNumber timedTermNumber) {
		return timedTermNumber;
	}

	@Override
	public RSFOLFormula visit(Bound bound) {

		return  bound;
	}

	@Override
	public RSFOLFormula visit(InfiniteTerm infiniteTerm) {
		return infiniteTerm;
	}

	@Override
	public RSFOLFormula visit(BinaryExpression binaryExpression) {
		return binaryExpression;
	}

	@Override
	public RSFOLFormula visit(AbsoluteExpression modulusExpression) {
		return modulusExpression;
	}

	@Override
	public RSFOLFormula visit(NormExpression normExpression) {
		return normExpression;
	}

	@Override
	public RSFOLFormula visit(SinExpression sinExpression) {
		return sinExpression;
	}

	@Override
	public RSFOLFormula visit(CosExpression cosExpression) {		
		return cosExpression;
	}

	@Override
	public RSFOLFormula visit(SQRTExpression sqrtExpression) {
		return sqrtExpression;
	}

	

	

	@Override
	public RSFOLFormula visit(Value value) {
		return value;
	}

	@Override
	public RSFOLFormula visit(SignedExpression signedExpression) {
		return signedExpression;
	}

	@Override
	public RSFOLFormula visit(ExistsFormula existsFormula) {
		if(negate) {
			return new ForallFormula(existsFormula.getBound(),
					existsFormula.getFormula().accept(new RSFOLPushNegations(true)));
		}
		return new ExistsFormula(existsFormula.getBound(), 
				existsFormula.getFormula().accept(new RSFOLPushNegations(false)));
	}

}
