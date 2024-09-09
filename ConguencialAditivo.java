package FORMULA;

import java.util.ArrayList;
import java.util.Scanner;

public class ConguencialAditivo {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		ArrayList<Integer> vec=new ArrayList<>();
		System.out.println("PONGA LA CANTIDAD DE LA SECUENCIA DE LOS NUMEROS:");
		int cant=read.nextInt();
		for(int i=0;i<cant;i++) {
        	System.out.print(" secuencia: "+i+" ");
        	vec.add(read.nextInt());
		}
		System.out.println("INTRODUSCA \nM:");
		int m=read.nextInt();
		if(1==1) {
			while(1==1) {
				int v=(int)(vec.get(vec.size()-1)+vec.get(vec.size()-cant))%m;
				if(!vec.contains(v)) {
					vec.add(v);
				}else {
					System.out.println("ciclo de vida terminado:   N="+(vec.size()-cant));
					break;
				}
			}
            for(int i=cant;i<vec.size();i++) {
            	System.out.println("  X"+(i+1)+" :   "+vec.get(i)+"   ri: "+(float)vec.get(i)/(m-1));
			}
		}
		
	}
}
