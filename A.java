class A {
   int x=1;
   int get() {
      return x;
   }
}
class B extends A {
   int x=2;
   int get() {
      return x;
   }
}
class Test {
   public static void main(String[] args) {
      void  t(A a){
         System.out.println(a.x+"  "+a.get());
      }
      t(new A);
      t(new B);
   }
}