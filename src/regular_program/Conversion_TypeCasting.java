package regular_program;

public class Conversion_TypeCasting {
	

	public static void main(String[] args) {
		
		/*	Conversion_TypeCasting obj=new Conversion_TypeCasting();
			System.out.println(obj.b);
			System.out.println(obj.f);
			System.out.println(obj.y); */

        double a=20;
        int b= (int) a;                // narrowing type casting. (larger type converted into smaller type)
        System.out.println(b);
        
        int c=14;
        float d=c;
        System.out.println(d);        //widening type casting.(smaller type converted into larger type)
	
	
	
	
	}

}
