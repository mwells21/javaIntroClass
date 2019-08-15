// implements Comparable
class MyClass {
    private double val;
     MyClass(double v) {
        val = v;
     }
     /*
      @Override
      public int compareTo(MyClass o) {
          return new Double(val).compareTo( o.val);
      }
      @Override
      public String toString() {
          return String.valueOf(val);
      }
      */
  
     double getVal() {
        return val;
     }
  
  
  }