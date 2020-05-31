package week5;

//public class MainClass {
	import java.util.Scanner;
	public class MainClass {
	    public static void main(String args[])
	    {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Input number of students:");
	        int n = Integer.parseInt(in.nextLine().trim());
	        String name;
	        int id,identifier;
	        String city_name, city;
	        System.out.println("Input Student Name, ID, City:");
	        pojo stu = new pojo(n);
	        for (int i = 0; i < n; i ++) {
	                name = in.next();
	                id = in.nextInt();
	                city = in.next();
	            stu.student_pojo(i,name,id,city);
	        }
	        stu.display();
	        System.out.println("Input citynname:");
	        city_name = in.next();
	        stu.fun1(city_name);
	        stu.sort_name();
	        stu.sort_city();
	        System.out.println("Input ID:");
	        identifier = in.nextInt();
	        stu.fun2(identifier);
	    }
	    
	}
	
