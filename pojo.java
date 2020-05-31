package week5;

//public class pojo {
	import java.util.Arrays; 
	import java.lang.*;
	public class pojo extends Exception{

	    public String[] name;
	    int[] id ;
	    String[] city;
	    public int n;
	    pojo(int n)
	    {
	        this.n=n;
	        name = new String[n];
	        id = new int[n];
	        city = new String[n];
	    }
	    pojo(String str)
	    {
	        super(str);
	    }
	    //setter function
	    public void student_pojo(int ind,String name, int id, String city) {
	        this.name[ind] = name;
	        this.id[ind] = id;
	        this.city[ind] = city;
	    }
	    public void display()
	    {
	        for(int i=0;i<n;i++)
	        {
	            System.out.println(name[i]+" "+id[i]+" "+city[i]);
	            //either display here or return these values 
	        }
	    }
	    public void fun1(String city_name)
	    {
	        for(int i=0;i<n;i++)
	        {
	            if(city[i].equals(city_name))
	            {
	                System.out.println(name[i]+" "+id[i]);
	            }
	        }    
	    }
	    public void sort_name()
	    {
	        String [] cpy_name = name;
	        Arrays.sort(cpy_name); 
	        for(int i=0;i<n;i++)
	        {
	            System.out.println(cpy_name[i]);
	        }
	    }
	    
	    public void sort_city()
	    {
	        String [] cpy_city = city;
	        Arrays.sort(cpy_city); 
	        for(int i=0;i<n;i++)
	        {
	            System.out.println(cpy_city[i]);
	        }
	    }
	    public void fun2(int identifier)
	    {
	        int index=n;
	            for(int i=0;i<n;i++)
	            {
	                if(id[i]==(identifier))
	                {
	                    index=i;
	                    break;
	                }
	            } 
	        try{
	            if(index==n)
	            {
	                pojo me = new pojo("Record does not exists!"); 
	                throw me; 
	            }
	            else
	            {
	                System.out.println(name[index]+" "+id[index]+" "+city[index]);
	            }
	        }
	        catch (pojo e) { 
	            e.printStackTrace(); 
	        } 
	        
	    }
	    
	}
