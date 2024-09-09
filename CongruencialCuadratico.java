package FORMULA;

import java.util.ArrayList;
import java.util.Scanner;

public class CongruencialCuadratico {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("INTRODUSCA \nX: A: B: C: M:");
		int x=read.nextInt(),a=read.nextInt(),b=read.nextInt(),c=read.nextInt(),m=read.nextInt();
		ArrayList<Integer> vec=new ArrayList<>();
		if(x>0) {
			while(1==1) {
				int v=(int)(a*(Math.pow(x, 2))+(b*x)+c)%m;
				if(!vec.contains(v)) {
					vec.add(v);
				}else {
					System.out.println("ciclo de vida terminado:   N="+vec.size());
					break;
				}
				x=v;
			}
			float y=0;
            for(int i=0;i<vec.size();i++) {
            	System.out.println("  X"+(i+1)+" :   "+vec.get(i)+"   ri: "+(float)vec.get(i)/(m-1));
			y+=(float)vec.get(i)/(m-1);
            }
////////////MEDIA////////////////////
            float med=y/vec.size();
            System.out.println("\n\nMEDIA: "+ med);
///////////VARIANZA//////////////////
            float z=0;
            for(int i=0;i<vec.size();i++) {
			z+=Math.pow(((float)vec.get(i)-med),2);
            }
            float var=z/(vec.size()-1);
            System.out.println("\n\nVARIANZA: "+ var);
            
		}
	}
}
