package Practica1;

import javax.swing.JOptionPane;

public class OperacionesCalculadora {
//En esta clase le damos las �rdenes a las simbolog�as para que sepan que problema hacer 
	public String opResultado(String operador, int pNum, int sNum){

		/*Le pusimos un switch para que la calculadora sepa que operaci�n queremos hacer 
		 * con la simbolog�a(operacion)queremos hacer*/
		switch(operador){
		case"+":
			int suma= pNum +sNum;
			return suma+"";
			
		case "-":
		int resta=pNum-sNum;
		return resta+"";
		
		case "/":
			if (pNum>0 && sNum>0){
				int divicion=pNum/sNum;
				return divicion +"";
			}else {
				
				JOptionPane.showMessageDialog(null,"No se puede dividir entre 0");
			}
			
		case "*":
			int multiplicacion=pNum*sNum;
			return multiplicacion+"";
			
		case "^":
			if(sNum !=0){
				double elevar = Math.pow(pNum, sNum);
				return elevar + "";
			}
			
			break;
			default:
			return"";
				
		}
		return null;
		
	}
	
	
}
