import java.util.concurrent.TimeUnit;

public class Main
{
    //functions here
    static long num (long a,long b){
        long result = a+b;
        return result;
    }
    
    
	public static void main(String[] args) {
		System.out.println("hi.");
		System.out.println("");
            try{
		        TimeUnit.SECONDS.sleep(2);
		        }catch(Exception e){}
		System.out.println("i shall crash ur computer.");
		System.out.println("");
            try{
		        TimeUnit.SECONDS.sleep(2);
		        }catch(Exception e){}
	    System.out.println("leave before its too late.");
		System.out.println("");
            try{
		        TimeUnit.SECONDS.sleep(5);
		        }catch(Exception e){}
		        
		
		long last = 1;
		long lastlast = 0;
		int count = 2;
        
        while (true){
            long newNum = num(last,lastlast);
            System.out.println("fibonacci # "+count+" : "+newNum);
            lastlast=last;
            last=newNum;
            try{
		        TimeUnit.MILLISECONDS.sleep(30);
		        }catch(Exception e){}
		    count++;
            
        }
	}
}
