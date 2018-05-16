package com.OO.jiekou;

public class Tset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pet pag1 = new Penguin();
		pag1.swim();
		Pet pet=new Gogg("狗狗乐乐");
		pet.eat();
		if (pet instanceof Gogg) {
			Gogg gogg =(Gogg)pet;
			gogg.catchingGlyDisc();
			
		}else if (pet instanceof Penguin) {
			Penguin pgn1 = (Penguin)pet;
			pgn1.swim();
		}
		
		Pet pet1= new Penguin("企鹅嗯嗯",100,12);
		pet1.print();
		//Penguin pgn1 = (Penguin)pet;
		//pgn.swim();
	}

}
