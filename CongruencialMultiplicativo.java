package FORMULA;

import java.util.ArrayList;
import java.util.Scanner;

public class CongruencialMultiplicativo {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("INTRODUSCA \nX: A: M:");
		int x=read.nextInt(),a=read.nextInt(),m=read.nextInt();
		ArrayList<Integer> vec=new ArrayList<>();
		if(x>0) {
			while(1==1) {
				int v=(a*x)%m;
				if(!vec.contains(v)) {
					vec.add(v);
				}else {
					System.out.println("ciclo de vida terminado:   N="+vec.size());
					break;
				}
				x=v;
			}
            for(int i=0;i<vec.size();i++) {
            	System.out.println("  X"+(i+1)+" :   "+vec.get(i)+"   ri: "+(float)vec.get(i)/(m-1));
			}
		}
	}
}
