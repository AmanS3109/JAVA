public class FractionClass {
    public static fraction add(fraction f1, fraction f2){
        int num = f1.numerator* f2.denominator + f2.numerator* f2.denominator;
        int den = f1.denominator* f2.denominator;
        fraction f3 = new fraction(num, den);
        return f3;
    }
    public static int gcd(int numerator, int denominator){
        int min = Math.min(numerator, denominator);
        for (int i = min; i >= 1; i--) {
            if (numerator%min==0 && denominator%min==0) return  i;
        }
        return min;
    }
    public static class fraction{
        int numerator;
        int denominator;
        public void simplify() {
            int hcf = gcd(numerator, denominator);
            numerator/=hcf;
            denominator/=hcf;
        }
        public fraction(int numerator, int denominator){
            this.numerator = numerator;
            this.denominator = denominator;
            simplify();
        }
    }
    public static void main(String[] args) {
        fraction f1 = new fraction(7, 21);
        System.out.println(f1.numerator + "/" + f1.denominator);
        fraction f2 = new fraction(7, 2);
        System.out.println(f2.numerator + "/" + f2.denominator);
        fraction f3 = add(f1, f2);
        System.out.println(f3.denominator + "/" + f3.numerator);
    }
}
