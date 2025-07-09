class temp{
    public static void main(String[] args){
         
         int a=5;
         int b=10;
         int c=15;
         a=a+b+c;
         b=a-(b+c);
         c=a-(b+c);
         a=a-(b+c);
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
    }
}