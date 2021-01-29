public class Expression {

	public static class ExpressionData {
		private char op;
		private Expression left;
		private Expression right;
		private int constant;

		public ExpressionData() {
		}

		public int getConstant() {
			return constant;
		}

		public void setConstant(int constant) {
			this.constant = constant;
		}

		public Expression getRight() {
			return right;
		}

		public void setRight(Expression right) {
			this.right = right;
		}

		public Expression getLeft() {
			return left;
		}

		public void setLeft(Expression left) {
			this.left = left;
		}

		public char getOp() {
			return op;
		}

		public void setOp(char op) {
			this.op = op;
		}
	}

	private ExpressionData data = new ExpressionData();

	public Expression(int constant) {
		this.data.setOp('c');
		this.data.setConstant(constant);
	}

	public Expression(char op, Expression left, Expression right) {
		this.data.setOp(op);
		this.data.setLeft(left);
		this.data.setRight(right);
	}

	public int evaluate() {
		switch (data.getOp()) {
		case 'c':
			return data.getConstant();
		case '+':
			return data.getLeft().evaluate() + data.getRight().evaluate();
		case '-':
			return data.getLeft().evaluate() - data.getRight().evaluate();
		case '*':
			return data.getLeft().evaluate() * data.getRight().evaluate();
		case '/':
			return data.getLeft().evaluate() / data.getRight().evaluate();
		default:
			throw new IllegalStateException();
		}
	}
}
