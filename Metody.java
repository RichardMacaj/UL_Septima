import java.util.Scanner;

public class Main
{
    Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	    Main obj = new Main();
	    //obj.nas3();
	    //System.out.println();
	    //obj.test();
	    obj.cifSum();
	    
	    
		}
		
		public void test(){
		    
	        System.out.print(" Zadaj cislo ");
		    int a = sc.nextInt(); 
		    int b = 100;
		    
		    for (int i  = a; i < 100  ; i ++ ){
		        if (i % 7 == 0 && i %2 != 0 )
		            System.out.print(i + " ");
		        }
		}
		
		public void nas3(){
		    System.out.print(" Zadaj cislo ");
		    int a = sc.nextInt();
		    int b = 100;
		    while(a <= b){
		        if(a % 3 == 0 ){
		            System.out.print(a + " ");
		        }
		         a++;  
		    }
		        
		}
		public void cifSum(){
		    int num = 213;
		    int sum;
		    int n1,n2,n3;
		    
		    n1 = num %10;
		    num /=10;
		    n2 = num %10;
		    num /=10;
		    n3 = num %10;
		    num /=10;
		    
		    sum = n1+n2+n3;
		    System.out.print("ciferny sucet je: ");
		    System.out.print(sum);
		    System.out.println();
		    if(n1 == n2 && n2 == n3){
		        System.out.print("3");
		    }
		    else if (n1 == n2 ||n1 == n3 ||n2 == n3 ){
		        System.out.print("2");
		    }
		    else {
		        System.out.print("1");
		    }
	
        }
}
