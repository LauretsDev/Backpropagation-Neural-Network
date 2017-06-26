package diego.redeneural;


public class RedeNeuralBackprop {

	private Camada[] camadas;
	
	public RedeNeuralBackprop(int tamanhoInput, int tamanhoOculto, int tamanhoOutput) {
		camadas = new Camada[2];
		camadas[0] = new Camada(tamanhoInput, tamanhoOculto);
		camadas[1] = new Camada(tamanhoOculto, tamanhoOutput);
	}

	public Camada getCamada(int index) {
		return camadas[index];
	}

	public float[] run(float[] input) {
		float[] entradaAtivacao = input;
		for (int i = 0; i < camadas.length; i++) {
			entradaAtivacao = camadas[i].run(entradaAtivacao);
		}
		return entradaAtivacao;
	}

	public void train(float[] input, float[] outputTarget, float learningRate, float momentum) {
		
		float[] outputCalculado = run(input);
		float[] erro = new float[outputCalculado.length];
		
		for (int i = 0; i < erro.length; i++) {
			erro[i] = outputTarget[i] - outputCalculado[i]; 
		}
		
		for (int i = camadas.length - 1; i >= 0; i--) {
			erro = camadas[i].train(erro, learningRate, momentum);
		}
	}
}
