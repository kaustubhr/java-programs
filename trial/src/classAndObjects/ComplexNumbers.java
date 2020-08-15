package classAndObjects;



public class ComplexNumbers {
	
		double real,imag;
		
		ComplexNumbers(){
			this.real = 0.0;
			this.imag = 0.0;
		}
		
		public ComplexNumbers(double r,double i){
			this.real = r;
			this.imag = i;
		}
		public static ComplexNumbers sum(ComplexNumbers c1,ComplexNumbers c2) {
			ComplexNumbers temp = new ComplexNumbers(0, 0);

	        temp.real = c1.real + c2.real;
	        temp.imag = c1.imag + c2.imag;
	        
	        return temp;
		}
		
		public static ComplexNumbers difference(ComplexNumbers c1,ComplexNumbers c2) {
			ComplexNumbers temp = new ComplexNumbers(0, 0);

	        temp.real = c1.real - c2.real;
	        temp.imag = c1.imag - c2.imag;
	        
	        return temp;
		}
		public static ComplexNumbers multiply (ComplexNumbers c1,ComplexNumbers c2) {
			ComplexNumbers temp = new ComplexNumbers(0, 0);

	        temp.real = c1.real * c2.real - c1.imag*c2.imag;
	        temp.imag = c1.real * c2.imag + c1.imag * c2.real;
	        
	        return temp;
		}
		
	
	

	public static void main(String[] args) {
		
	ComplexNumbers c1 = new ComplexNumbers(5.5, 4);
	ComplexNumbers c2 = new ComplexNumbers(1.2, 3.5);
	ComplexNumbers temp;
	temp = sum(c1, c2);
	System.out.printf("Sum is: "+ temp.real+" + "+ temp.imag +"i");	
	temp = difference(c1,c2);
	System.out.printf("Difference is: "+ temp.real+" + "+ temp.imag +"i");	
	temp = multiply(c1,c2);
	System.out.printf("Multiply product is: "+ temp.real+" + "+ temp.imag +"i");	
	}//end of main



	

}

