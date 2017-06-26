package diego.redeneural;

import java.util.Arrays;
import java.util.Random;

public class Camada {

	private float[] saida;
	private float[] entrada;
	private float[] pesos;
	private float[] dPesos;
	private Random random;

	public Camada(int tamanhoInput, int tamanhoOutput) {
		saida = new float[tamanhoOutput];
		entrada = new float[tamanhoInput + 1];
		pesos = new float[(1 + tamanhoInput) * tamanhoOutput];
		dPesos = new float[pesos.length];
		this.random = new Random();
		initPesos();
	}

	public void initPesos() {
		for (int i = 0; i < pesos.length; i++) {
			pesos[i] = (random.nextFloat() - 0.5f) * 4f;
		}
	}

	public float[] run(float[] entradaArray) {
		
		System.arraycopy(entradaArray, 0, entrada, 0, entradaArray.length);
		entrada[entrada.length - 1] = 1; // bias
		int offset = 0;
		
		for (int i = 0; i < saida.length; i++) {
			for (int j = 0; j < entrada.length; j++) {
				saida[i] += pesos[offset + j] * entrada[j];
			}
			saida[i] = FuncaoAtivacao.sigmoid(saida[i]);
			offset += entrada.length;
		}
		
		return Arrays.copyOf(saida, saida.length);
	}

	public float[] train(float[] erro, float learningRate, float momentum) {
		
		int offset = 0;
		float[] proximoErro = new float[entrada.length];
		
		for (int i = 0; i < saida.length; i++) {
			
			float delta = erro[i] * FuncaoAtivacao.dSigmoid(saida[i]); // a saida é sigmoid(x)
			// o calculo do delta de sa´da é diferente do calculo do delta da camada oculta
			
			// tem uma camada oculta
			for (int j = 0; j < entrada.length; j++) {
				int indexPesoAnterior = offset + j;
				proximoErro[j] = proximoErro[j] + pesos[indexPesoAnterior] * delta;
				float dw = entrada[j] * delta * learningRate;
				pesos[indexPesoAnterior] += dPesos[indexPesoAnterior] * momentum + dw;
				dPesos[indexPesoAnterior] = dw;
			}
			
			offset += entrada.length;
		}
		
		return proximoErro;
	}
}
