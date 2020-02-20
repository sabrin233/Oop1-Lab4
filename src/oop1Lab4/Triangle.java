package oop1Lab4;
import java.util.Scanner;


public class Triangle {
	
	private int x;
	private int y;
	private int z;
	
	public Triangle() {
		super();
	}

	public Triangle(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public String toString() {
		return "Triangle [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	public void showinfo() {
		System.out.println(x + " " + y +" "+z);
	}
	
		
		public static void main(String[] args) {

	        Scanner s1= new Scanner(System.in);
	        int x = s1.nextInt();
	        int y = s1.nextInt();
	        int z = s1.nextInt();

		  if(x==y && y==z) 
	            System.out.println("Equilteral");
		  

	        else if ((x==y && y!=z ) || (x!=y && z==x) || (z==y && z!=x))
	            System.out.println("Isosceles");

	        else if(x!=y && y!=z && z!=x)
	            System.out.println("Scalene");
	   
		}
	}



