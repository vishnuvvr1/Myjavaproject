public class Myclass {
         public void add(int a, int y)
         {

             System.out.println(a + y);

         }

         public void von(int x, int y, int z)
         {
             System.out.println(x + y + z);

         }

         public void doub(double x, double y)
         {
             System.out.println(x + y);
         }

         public void str(String s, String d) {
             System.out.println(s + d);
         }
         public static void main (String[]args){
             Myclass a1 = new Myclass();
             a1.add(10, 20);
             a1.von(10, 20, 56);
             a1.doub(20.1, 2014.1);
             a1.str("vishnu", "safi");

         }
     }