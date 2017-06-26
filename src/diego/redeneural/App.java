package diego.redeneural;

public class App {

	public static void main(String[] args) throws Exception {

		float[][] dadosTreinamento = new float[][] { 
				
				// 42 NOTAS VERDADEIRAS -> 0 
				new float[] { 3.6216f, 8.6661f, -2.8073f, -0.44699f }, 
				new float[] { 4.5459f, 8.1674f, -2.4586f, -1.4621f }, 
				new float[] { 3.866f, -2.6383f, 1.9242f, 0.10645f }, 
				new float[] { 3.4566f, 9.5228f, -4.0112f, -3.5944f }, 
				new float[] { 0.32924f, -4.4552f, 4.5718f, -0.9888f }, 
				new float[] { 4.3684f, 9.6718f, -3.9606f, -3.1625f }, 
				new float[] { 3.5912f, 3.0129f, 0.72888f, 0.56421f }, 
				new float[] { 2.0922f, -6.81f, 8.4636f, -0.60216f }, 
				new float[] { 3.2032f, 5.7588f, -0.75345f, -0.61251f }, 
				new float[] { 1.5356f, 9.1772f, -2.2718f, -0.73535f }, 
				new float[] { 1.2247f, 8.7779f, -2.2135f, -0.80647f }, 
				new float[] { 3.9899f, -2.7066f, 2.3946f, 0.86291f }, 
				new float[] { 1.8993f, 7.6625f, 0.15394f, -3.1108f }, 
				new float[] { -1.5768f, 10.843f, 2.5462f, -2.9362f }, 
				new float[] { 3.404f, 8.7261f, -2.9915f, -0.57242f }, 
				new float[] { 4.6765f, -3.3895f, 3.4896f, 1.4771f }, 
				new float[] { 2.6719f, 3.0646f, 0.37158f, 0.58619f }, 
				new float[] { 0.80355f, 2.8473f, 4.3439f, 0.6017f }, 
				new float[] { 1.4479f, -4.8794f, 8.3428f, -2.1086f }, 
				new float[] { 5.2423f, 11.0272f, -4.353f, -4.1013f }, 
				new float[] { 5.7867f, 7.8902f, -2.6196f, -0.48708f },
				new float[] { 0.3292f, -4.4552f, 4.5718f, -0.9888f }, 
				new float[] { 3.9362f, 10.1622f, -3.8235f, -4.0172f }, 
				new float[] { 0.93584f, 8.8855f, -1.6831f, -1.6599f }, 
				new float[] { 4.4338f, 9.887f, -4.6795f, -3.7483f }, 
				new float[] { -0.2062f, 9.2207f, -3.7044f, -6.8103f }, 
				new float[] { -0.0068919f, 9.2931f, -0.41243f, -1.9638f }, 
				new float[] { 0.96441f, 5.8395f, 2.3235f, 0.066365f },
				new float[] { 2.8561f, 6.9176f, -0.79372f, 0.48403f }, 
				new float[] { -0.7869f, 9.5663f, -3.7867f, -7.5034f }, 
				new float[] { 2.0843f, 6.6258f, 0.48382f, -2.2134f }, 
				new float[] { -0.7869f, 9.5663f, -3.7867f, -7.5034f }, 
				new float[] { 3.9102f, 6.065f, -2.4534f, -0.68234f }, 
				new float[] { 1.6349f, 3.286f, 2.8753f, 0.087054f }, 
				new float[] { 4.3239f, -4.8835f, 3.4356f, -0.5776f },
				new float[] { 5.262f, 3.9834f, -1.5572f, 1.0103f }, 
				new float[] { 3.1452f, 5.825f, -0.51439f, -1.4944f }, 
				new float[] { 2.6606f, 3.1681f, 1.9619f, 0.18662f }, 
				new float[] { 3.931f, 1.8541f, -0.023425f, 1.2314f }, 
				new float[] { 0.01727f, 8.693f, 1.3989f, -3.9668f }, 
				new float[] { 3.2414f, 0.40971f, 1.4015f, 1.1952f }, 
				new float[] { 2.2504f, 3.5757f, 0.35273f, 0.2836f },
				
				// 53 NOTAS FALSAS -> 1
				new float[] { -1.3971f, 3.3191f, -1.3927f, -1.9948f }, 
				new float[] { 0.39012f, -0.14279f, -0.031994f, 0.35084f },
				new float[] { -1.6677f, -7.1535f, 7.8929f, 0.96765f },
				new float[] { -3.8483f, -12.8047f, 15.6824f, -1.281f },
				new float[] { -3.5681f, -8.213f, 10.083f, 0.96765f },
				new float[] { -2.2804f, -0.30626f, 1.3347f, 1.3763f },
				new float[] { -1.7582f, 2.7397f, -2.5323f, -2.234f },
				new float[] { -0.89409f, 3.1991f, -1.8219f, -2.9452f },
				new float[] { 0.3434f, 0.12415f, -0.28733f, 0.14654f },
				new float[] { -0.9854f, -6.661f, 5.8245f, 0.5461f },
				new float[] { -2.4115f, -9.1359f, 9.3444f, -0.65259f },
				new float[] { -1.5252f, -6.2534f, 5.3524f, 0.59912f },
				new float[] { -0.61442f, -0.091058f, -0.31818f, 0.50214f },
				new float[] { -0.36506f, 2.8928f, -3.6461f, -3.0603f },
				new float[] { -5.9034f, 6.5679f, 0.67661f, -6.6797f },
				new float[] { -1.8215f, 2.7521f, -0.72261f, -2.353f },
				new float[] { -0.77461f, -1.8768f, 2.4023f, 1.1319f },
				new float[] { -1.8187f, -9.0366f, 9.0162f, -0.12243f },
				new float[] { -3.5801f, -12.9309f, 13.1779f, -2.5677f },
				new float[] { -1.8219f, -6.8824f, 5.4681f, 0.057313f },
				new float[] { -0.39416f, -0.020702f, -0.066267f, -0.44699f },
				new float[] { -1.522f, -6.6383f, 5.7491f, -0.10691f },
				new float[] { -2.8267f, -9.0407f, 9.0694f,-0.98233f },
				new float[] { -1.7263f, -6.0237f, 5.2419f, 0.29524f },
				new float[] { -0.94255f, 0.039307f, -0.24192f, 0.31593f },
				new float[] { -0.89569f, 3.0025f, -3.6067f, -3.4457f },
				new float[] { -6.2815f, 6.6651f, 0.52581f, -7.0107f },
				new float[] { -2.3211f, 3.166f, -1.0002f, -2.7151f },
				new float[] { -1.3414f, -2.0776f, 2.8093f, 0.60688f },
				new float[] { -2.258f, -9.3263f, 9.3727f, -0.85949f },
				new float[] { -3.8858f, -12.8461f, 12.7957f, -3.1353f },
				new float[] { -1.8969f, -6.7893f, 5.2761f, -0.32544f },
				new float[] { -0.52645f, -0.24832f, -0.45613f, 0.41938f },
				new float[] { 0.0096613f, 3.5612f, -4.407f, -4.4103f },
				new float[] { -3.8826f, 4.898f, -0.92311f, -5.0801f },
				new float[] { -2.1405f, -0.16762f, 1.321f, -0.20906f },
				new float[] { -2.4824f, -7.3046f, 6.839f, -0.59053f },
				new float[] { -2.9098f, -10.0712f, 8.4156f, -1.9948f },
				new float[] { -0.60975f, -4.002f, 1.8471f, 0.6017f },
				new float[] { 0.83625f, 1.1071f, -2.4706f, -0.062945f },
				new float[] { 0.60731f, 3.9544f, -4.772f, -4.4853f },
				new float[] { -4.8861f, 7.0542f, -0.17252f, -6.959f },
				new float[] { 1.3451f, 0.23589f, -1.8785f, 1.3258f },
				new float[] { 2.2279f, 4.0951f, -4.8037f, -2.1112f },
				new float[] { 1.2572f, 4.8731f, -5.2861f, -5.8741f },
				new float[] { -5.3857f, 9.1214f, -0.41929f, -5.9181f },
				new float[] { -2.9786f, 2.3445f, 0.52667f, -0.40173f },
				new float[] { -1.5851f, -2.1562f, 1.7082f, 0.9017f },
				new float[] { -0.21888f, -2.2038f, -0.0954f, 0.56421f },
				new float[] { 1.3183f, 1.9017f, -3.3111f, 0.065071f },
				new float[] { 1.4896f, 3.4288f, -4.0309f, -1.4259f },
				new float[] { 0.11592f, 3.2219f, -3.4302f, -2.8457f },
				new float[] { -3.3924f, 3.3564f, -0.72004f, -3.5233f }
		};

		float[][] dadosResultado = new float[][] {
				
				// 42 NOTAS VERDADEIRAS -> 0
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				new float[] { 0 },
				
				// 53 NOTAS FALSAS -> 1
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 },
				new float[] { 1 }
		};

		// 4 entradas, 5 neurons na camada oculta, 1 saida
		RedeNeuralBackprop backpropagationNeuralNetworks = new RedeNeuralBackprop(4, 5, 1);
		
		int notasVerdadeiras = 0;
		int notasFalsas = 0;

		float[] valoresFinais = new float[dadosResultado.length];
		for (int iterations = 0; iterations < RedeNeuralConstantes.ITERACOES; iterations++) {

			for (int i = 0; i < dadosResultado.length; i++) {
				backpropagationNeuralNetworks.train(dadosTreinamento[i], dadosResultado[i],
						RedeNeuralConstantes.LEARNING_RATE, RedeNeuralConstantes.MOMENTUM);
			}

			System.out.println();
			for (int i = 0; i < dadosResultado.length; i++) {
				float[] t = dadosTreinamento[i];
				System.out.printf("Iteracao: %d\n", iterations + 1);
				float resultadoBackProp = backpropagationNeuralNetworks.run(t)[0];
				valoresFinais[i] = resultadoBackProp;
				System.out.printf("%f, %f, %f, %f --> %.3f\n", t[0], t[1], t[2], t[3], resultadoBackProp);
			}
		}
		
		for(int i=0; i<valoresFinais.length; i++) {
			// se for menor ou igual a  0.1 é uma nota autentica se nao é falsa
			if(valoresFinais[i] <= 0.1f) {
				notasVerdadeiras++;
			}
			else {
				notasFalsas++;
			}
		}
		System.out.println("Notas verdadeiras: "+notasVerdadeiras);
		System.out.println("Notas falsas: "+notasFalsas);
	}
}