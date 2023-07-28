import java.util.Scanner;

class Calculation {
	 double area;
	 double radius;
	 int len,width;
	 
//return area=pi*r*r;}

	
	static void display_menu () {
		System.out.println("1-calculate the area of a circle.");
		System.out.println("2-calculate the area of a rectangle.");
		System.out.println("3-calculate the area of a square.");
		System.out.println("4-calculate the area of a triangle");
	}
	
	//Scanner sc= Scanner(System.in);
	//area obj1=new area();
	double circle (double r) {
		//Scanner sc = new Scanner(System.in);
		//double radius;
		double pi = 3.14;
		area = pi * r * r;
		
		//System.out.println("Area of circle : " + area);
		return area;
	}
	
	double rectangle (int w,int l) {
		//Scanner sc = new Scanner(System.in);
		
		//System.out.println("area of a rectangle is:"+(w*l));
		area=w*l;
		return area;
	}
	static void square(int length)
	{
		System.out.println("area of a square is:"+(length*length));
	}
	
	static void triangle(int height,int base){
		System.out.println("area of a triangle is:"+((height*base)/2));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculation obj =new Calculation();
		
		display_menu ();
		int choice;
		
		System.out.println("Enter your choice between 1 - 4");
		choice = sc.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println("Enter the radius : ");
				obj.radius = sc.nextDouble();
				//circle (radius);
				System.out.println("Area of Circle : "+obj.circle(obj.radius));
				break;
			case 2:
				System.out.println("Enter the length : ");
			obj.len = sc.nextInt();
				System.out.println("Enter the width : ");
				obj.width = sc.nextInt();
				//rectangle (len,width);
				System.out.println("area of rectangle :"+obj.rectangle(obj.len,obj.width));
				break;
			case 3:
				System.out.println("Enter the length : ");
				int le = sc.nextInt();
				square(le);
				break;
				
			case 4:
				System.out.println("Enter the height : ");
				int height = sc.nextInt();
				
				System.out.println("Enter the base : ");
				int base = sc.nextInt();
				triangle(height,base);
				break;
			
				
		}
	}
}