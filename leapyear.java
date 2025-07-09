class leapyear{
         public static void main(String[] args){
            int year=2038;
            if((year%4==0&& year%100!=0)||year%400==0){
               System.out.println("leapyear");
            }else{
               System.out.println("Not a leapyear");
            }
     }
}