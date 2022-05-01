package array;


public class Array_Object {
	
	public static void main(String[] args) {
		Object [] name=new Object[10];
		
		name[0]="ravi";
		name[1]=14.51f;
		name[2]=20;
		name[3]="preet";
		name[4]=true;
		name[5]="cutie";
		name[6]="akash";
		name[7]=45.1254d;
		name[8]='a';
		name[9]="zeke";
		System.out.println(name);
		for (Object a:name) 
		{
			System.out.println(a);
		}

		
		
	}

}
