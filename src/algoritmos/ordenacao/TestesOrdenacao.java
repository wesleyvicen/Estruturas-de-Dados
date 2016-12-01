package algoritmos.ordenacao;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TestesOrdenacao {
	public static void main(String[] args) {
		Random ran = new Random();
		List<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i < 20; i++) {
			lista.add(ran.nextInt(100));
		}
		System.out.println(lista);
		Ordenador.quickSort(lista);
		System.out.println(lista);
	}
}
