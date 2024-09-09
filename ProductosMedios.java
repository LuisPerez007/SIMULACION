package FORMULA;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductosMedios {

	public static void main(String[] args) {
		Scanner read=new Scanner (System.in);
		ArrayList<Integer> vec=new ArrayList();
		System.out.println("introdusca \nXo x2");
		int x=read.nextInt(),x2=read.nextInt();
		int d=0;
		if((x+"").length()>(x2+"").length()) {
			d=(x+"").length();
		}else {
			d=(x2+"").length();
		}
		if(x>3) {
			for(int i=0;i<vec.size()+1;i++) {
			long y=(x*x2);
			System.out.println(i-1+" x:   "+x+" Y :   "+y+" ri:   "+(0+","+x+""));
			x=x2;
			x2=medio(y,d);
			if(!vec.contains(x2)) {
				vec.add(x2);
			}else {
				System.out.print("ciclo de vida TERMINADO:  N="+(vec.size()-1));
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
