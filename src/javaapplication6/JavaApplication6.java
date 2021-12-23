/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
      System.out.println("Nhap vao mot so nguyen:");
      Scanner sc = new Scanner(System.in);

      n = sc.nextInt();

      switch (n)
      {
         case 0: System.out.println("Không"); break;
         case 1: System.out.println("Một"); break;
         case 2: System.out.println("Hai"); break;
         case 3: System.out.println("Ba"); break;
         case 4: System.out.println("Bốn"); break;
         case 5: System.out.println("Năm"); break;
         case 6: System.out.println("Sáu"); break;
         case 7: System.out.println("Bảy"); break;
         case 8: System.out.println("Tám"); break;
         case 9: System.out.println("Chín"); break;
         default:
            System.out.println("Chỉ có 0 - 9 thôi :D");
            break;
      }
    }
    
}
