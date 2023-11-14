import java.util.Scanner;

public class deneme23 {
  public static int cıkarma(int a,int b) {
	
	  System.out.print("Sonuç: ");
	
	  return a-b;
	//return dan sonra fonksiyon biter...
	
	
}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("iki tane sayı giriniz: ");
		int sayi = scanner.nextInt();
		int sayi1 = scanner.nextInt();
		
		System.out.println(cıkarma(sayi,sayi1));
			scanner.close();
		}
		
	}

/*
public class deneme23 {
    public static int ikiilecarp(int a) {
        return a*2;
        
    }
    public static int ikiiletopla(int a) {
        
        return a + 2;
    }
    public static int dortilecarp(int a) {
        
        return a * 4;
        
    }
    public static void main(String[] args) {
        
       
        System.out.println("Sonuç " + dortilecarp(ikiiletopla(ikiilecarp(3))));
        
    }
}
*/