// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.io.PrintStream;
import java.util.Scanner;

public class PalindromeChecker {
   public PalindromeChecker() {
   }

   static boolean isPalindromeIterative(String var0) {
      int var1 = 0;

      for(int var2 = var0.length() - 1; var1 < var2; --var2) {
         if (var0.charAt(var1) != var0.charAt(var2)) {
            return false;
         }

         ++var1;
      }

      return true;
   }

   static boolean isPalindromeRecursive(String var0) {
      return check(var0, 0, var0.length() - 1);
   }

   static boolean check(String var0, int var1, int var2) {
      if (var1 >= var2) {
         return true;
      } else {
         return var0.charAt(var1) != var0.charAt(var2) ? false : check(var0, var1 + 1, var2 - 1);
      }
   }

   static boolean isPalindromeArrayReversal(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = 0;

      for(int var3 = var1.length - 1; var2 < var3; --var3) {
         char var4 = var1[var2];
         var1[var2] = var1[var3];
         var1[var3] = var4;
         ++var2;
      }

      return var0.equals(new String(var1));
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter text: ");
      String var2 = var1.nextLine();
      PrintStream var10000 = System.out;
      String var10001 = isPalindromeIterative(var2) ? "Palindrome" : "Not Palindrome";
      var10000.println("Iterative: " + var10001);
      var10000 = System.out;
      var10001 = isPalindromeRecursive(var2) ? "Palindrome" : "Not Palindrome";
      var10000.println("Recursive: " + var10001);
      System.out.println("Array Reversal: " + (isPalindromeArrayReversal(var2) ? "Palindrome" : "Not Palindrome"));
      var1.close();
   }
}
