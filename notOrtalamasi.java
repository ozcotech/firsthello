import java.util.Scanner;

public class notOrtalamasi {
  
  public static void main(String[] args) {
    
    int mat, fiz, kim, turk, tar, muz;
    
    Scanner notumuz = new Scanner(System.in);
   
    System.out.println("Matematik Notunuz: ");
    mat = notumuz.nextInt();
    System.out.println("Matematik Notunuz: " + mat);
    
    System.out.println("Fizik Notunuz: ");
    fiz = notumuz.nextInt();
    System.out.println("Matematik Notunuz: " + fiz);
    
    System.out.println("Kimya Notunuz: ");
    kim = notumuz.nextInt();
    System.out.println("Matematik Notunuz: " + kim);
    
    System.out.println("Türkçe Notunuz: ");
    turk = notumuz.nextInt();
    System.out.println("Matematik Notunuz: " + turk);
    
    System.out.println("Tarih Notunuz: ");
    tar = notumuz.nextInt();
    System.out.println("Matematik Notunuz: " + tar);
    
    System.out.println("Müzik Notunuz: ");
    muz = notumuz.nextInt();
    System.out.println("Matematik Notunuz: " + muz);
    
    double orta = (mat + fiz + kim + turk + tar + muz) / 6;
    
    boolean a = (orta >= 60.0); 
    
    String durum = a ? "Geçtiniz ": "Kaldınız"; 
    
    System.out.println(durum);
    
    System.out.println("Ortalamanız: " + orta);
   
    notumuz.close();

  
    
}

}
