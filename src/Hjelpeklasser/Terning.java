package Hjelpeklasser;

import java.util.Random;

public class Terning {
	private static final Random RAND = new Random();
	private Integer verdi;
	
	public Terning () {
		
	}
	
	public void trill() {
		verdi = RAND.nextInt(6) + 1;
//		String dyret;
//		if(verdi == 1) {
//			dyret = "l�ve";
//		}else if(verdi == 2){
//			dyret = "slange";
//		}else if(verdi == 3) {
//			dyret = "panda";
//		}else if(verdi == 4){
//			dyret = "gris";
//		}else if(verdi == 5) {
//			dyret = "elefant";
//		}else{
//			dyret = "hval";
//		}
//		return dyret;
	}

	public int getVerdi() {
		return verdi;
	}
	
}