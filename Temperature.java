public class Temperature{
    public static double  CtoF(double  cels){
	return (cels * (9/5.0) + 32);}
   public static double  FtoC(double  fahrs){
       return ((fahrs - 32) * (5/9.0));}



public static void main(String[] args) {
    System.out.println ( CtoF(0));
    //32
 System.out.println ( CtoF(-40));
 // -40
 System.out.println ( CtoF(100));
 //212
 System.out.println ( CtoF(30));
 //86
 System.out.println ( FtoC(32));
 //0
 System.out.println ( FtoC(212));
 //100
 System.out.println ( FtoC(-40));
 //-40








}}
