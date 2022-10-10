public class Main
{
	public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;
        int temp = 0; // pomocna premenna do ktorej sa bude zapisovat vacsie cislo
        if (a >= b){
            temp = a; // a=1 takze je mensie ako b=2 neplati podmienka
        }
        else 
            temp = b; // vykona sa else ktory priradi b do premennej temp
	    
        if (c >= temp) {
            System.out.println(c);  //c=3 a temp=2 podmienka plati metoda vrati hodnotu ktora je v c
        }
        else
            System.out.println(temp); 
	}
}
