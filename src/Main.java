
public class Main {

	public static void  main(String []args){
	    float s=1;
	    float pi=0;
	    float i=(float) 1.0;
	    float n=(float) 1.0;
	    while(Math.abs(i)>=1e-8){ //�����ǽ������ȣ�Ϊ���ܸ���˵�����м����������������Ծ���ȡСһ��
	        pi+=i;
	        n=n+2;
	        // ������Ƶĺ����ÿ�������Ŷ���һ�� 
	        s=-s; 
	        i=s/n;
	    }
	    pi=4*pi;
	    //System.out.println("")
	    System.out.printf("pi��ֵΪ��%.6f\n",pi);
	    
	   // return 0;
	}
	 
}
