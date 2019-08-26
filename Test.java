import java.util.*;
class A {
   int x=1;
   public int get() {
      return x;
   }
}
class B extends A {
   int x=2;
   public int get() {
      return x;
   }
}
class Test {
   static void t(A a) {
         System.out.println(a.x+"  "+a.get());
      }


   public static void main(String[] args) {
            t(new A());
      t(new B());
   }
}