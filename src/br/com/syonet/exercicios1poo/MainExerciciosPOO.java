package br.com.syonet.exercicios1poo;

public class MainExerciciosPOO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imovel imovel1 = new Imovel((155500.51f),(30.21f));
		System.out.println(imovel1.exibeInfo());
		Terreno terreno1 = new Terreno((250000.52f),(40.25f));
		System.out.println(terreno1.exibeInfo());
		Apartamento apartamento1 = new Apartamento((50000.58f), (20.50f), 2, true);
		System.out.println(apartamento1.exibeInfo());
		Casa casa1 = new Casa((80000.14f),(25.82f),3,(35.50f));
		System.out.println(casa1.exibeInfo());
	}

}
