package FORMULA;

import java.util.ArrayList;
import java.util.Scanner;

public class CuadradosMedios {

	public static void main(String[] args) {
		Scanner read=new Scanner (System.in);
		ArrayList<Integer> vec=new ArrayList();
		System.out.println("introdusca Xo :");
		int x=read.nextInt();
		int d=(x+"").length();
		if(x>3) {
			for(int i=0;i<vec.size()+1;i++) {
				long y=((long)Math.pow(x,2));
				System.out.println(i+" x: "+x+" Y : "+y+" ri: "+(0+","+(x+"")));
				x=medio(y,d);
				if(!vec.contains(x)) {
					vec.add(x);
				}else {
					System.out.println("ciclo de vida TERMINADO:  N="+(vec.size())+"\n");
					break;
				}
			}		
		}
////////////////////MEDIA//////////////////////////////////////////
		float b=0;
		for(int j=0;j<vec.size();j++) {
			b+=(float)(vec.get(j)/Math.pow(10, d));
		}
		float med=(float)b/vec.size();
		System.out.println("MEDIA\nsuma total media: "+b+"\nMEDIA: "+med+"\n");
//////////////////VARIANZA//////////////////////////////////////////
		float c=0;
		for(int j=0;j<vec.size();j++) {
			c+=Math.pow(((vec.get(j)/Math.pow(10, d))-med),2);
		}
		float var=c/vec.size()-1;
		System.out.print("VARIANZA\nsuma total varianza: "+c+"\nMEDIA: "+var);
	}
	public static int medio(long n, int d) {
		///LOGICA
		/// m = (tamaño  -  digito a sacar)/2 OBTENEMOS LOS DIGITOS SOBRANTES Y LO DIVIDIMOS POR 2
		/// CON SUBSTRING EXTRAER ( M , M+D)  DESDE M, HASTA M mas D digitos a extraer
		
		int m=((n+"").length()-d)/2;
		int med=Integer.parseInt((n+"").substring(m, (d+m)));
		return med;
	}
}
