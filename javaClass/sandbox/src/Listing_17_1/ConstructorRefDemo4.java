package Listing_17_1;

//Implement a simple class factory for an array
interface MyArrayCreator<T> {
   T func(int n);
}

class MyClass {
   // This constructor takes an argument. 
   MyClass(int v) {
      val = v;
   }

   // This is the default constructor. 
   MyClass() {
      val = 0;
   }

   // ... 

   int getVal() {
      return val;
   };
   
   private int val;
}

class ConstructorRefDemo4 {
   public static void main(String args[]) {
      MyArrayCreator<MyClass[]> mcArrayCons = MyClass[]::new;
      MyClass[] a = mcArrayCons.func(2);
      a[0] = new MyClass(1);
      a[1] = new MyClass(2);
      
      System.out.println(" a[0] = " +  a[0].getVal());
      System.out.println(" a[1] = " +  a[1].getVal());
   }
}
