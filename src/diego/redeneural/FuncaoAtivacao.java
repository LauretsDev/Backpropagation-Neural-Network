package diego.redeneural;

public class FuncaoAtivacao {

	public static float sigmoid(float x) {
		return (float) (1 / (1 + Math.exp(-x)));
	}

	public static float dSigmoid(float x) {
		return x*(1-x); // o x j� � resultado de sigmoid(x), n�o precisa aplicar novamente
	}
}
