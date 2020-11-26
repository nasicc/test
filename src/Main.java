
public class Main {

	public static void  main(String []args){
	    float s=1;
	    float pi=0;
	    float i=(float) 1.0;
	    float n=(float) 1.0;
	    while(Math.abs(i)>=1e-8){ //这里是结束精度，为了能更好说明并行计算的威力，这里可以尽量取小一点
	        pi+=i;
	        n=n+2;
	        // 这里设计的很巧妙，每次正负号都不一样 
	        s=-s; 
	        i=s/n;
	    }
	    pi=4*pi;
	    //System.out.println("")
	    System.out.printf("pi的值为：%.6f\n",pi);
	    
	   // return 0;
	}
	 
}
