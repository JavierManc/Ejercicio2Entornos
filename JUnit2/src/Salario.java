
public class Salario {

	
	Salario(){
	}
	
	
	public static float calculaSalarioBruto(String tipo, float ventasMes, float horasExtra) {
		float salario = 0;
		
		if(tipo.equals("vendedor")) {
			salario+=1000;
		}else {
			if(tipo.equals("encargado")) {
				salario+=1500;
			}
		}
		
		if(ventasMes>=1000 && ventasMes<1500) {
			salario+=100;
		}else {
			if(ventasMes>=1500) {
				salario+=200;
			}
		}
		
		salario+=(horasExtra*20);
		
		return salario;
	}
	
	
	public static float calculaSalarioNeto(float salarioBruto) {
		float salario=salarioBruto;
		
		if(salarioBruto>=1000 && salarioBruto<1500){
			salario=(float) (salario-(salario*0.16));
		}
		
		if(salarioBruto>=1500) {
			salario=(float) (salario-(salario*0.18));
		}
		
			
		return salario;
	}
}
