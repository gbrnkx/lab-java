package sts;

/*
 * Why the following loop will fail?
 * 
 * It will fail because the "end" variable is not used, instead the for loop uses a "limit" variable wich does not exist.
 */
class Test   
{  
    public static void main (String args[])   
    {  
    	int end = 0;
        for(int i=0; limit; i++)   
        {  
            System.out.println("Hello World");  
        }  
    }  
}  