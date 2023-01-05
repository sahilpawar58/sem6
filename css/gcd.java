// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class gcd {
    public static void main(String[] args) {
        int a=464;
        int b=238;
        System.out.println(gcd(a,b));
    }
    public static int gcd(int a,int b){
        if(a ==0 || b==0){
            return (a==0) ?b:a;
        }
        if(b>a){
            return gcd(a,b%a);
        }else if(a>b){
            return gcd(a%b,b);
        }
        return -1;
    }
}