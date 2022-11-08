/**
@author Prof. Ricardo Conde
 */
package br.com.biometrics.controller;

import br.com.biometrics.model.Biometria;

public class IMC extends Biometria {

	float indice = 0;

	public IMC(float peso, float altura) {
		super(peso, altura);
	}

	public float calculaIMC() {
		indice = peso / (altura * altura);

		return indice;
	}
}
