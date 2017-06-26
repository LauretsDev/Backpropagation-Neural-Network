package diego.redeneural;

public class FuncaoAtivacao {

	public static float sigmoid(float x) {
		return (float) (1 / (1 + Math.exp(-x)));
	}

	public static float dSigmoid(float x) {
		return x*(1-x); // o x já é resultado de sigmoid(x), não precisa aplicar novamente
	}
}
