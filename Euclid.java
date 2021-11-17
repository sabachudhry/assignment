public class Euclid{
  
  public static int gcd2(int p, int q)

{
while (q!=0) {
int temp = q;
q = p % q;
p = temp;
}
return p;
 }
     
        public static void main(String[] args){
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        int d2 = gcd2(p, q);
        System.out.println("gcd(" + p + ", " + q + ") = " + d2);
}
}