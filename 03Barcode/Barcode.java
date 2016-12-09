public class Barcode implements Comparable<Barcode>{
// instance variables
   private String _zip;
   private int _checkDigit;

// constructors
//precondtion: _zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
  public Barcode(String zip) 
      
      {if (!(_zip.length == 5 && zip.matches("[0-9]+"))){
	      throw new IllegalArgumentException;}
_zip = zip;  }

  private int toCode (string zipper){
      
      string[] zipArray = {":::||", " ::|:|", "::||:"  , " :|::|" , " :|:|:",  " :||::",  " |:::|",  " |::|:" ,  " |:|::",  " ||::: "   };
      return zipArray[Integer.valueof(zipper.substring(0))]

  }

// postcondition: computes and returns the check sum for _zip
  private int checkSum(){

}

//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){}


// postcondition: compares the zip + checkdigit, in numerical order. 
  public int compareTo(Barcode other){}
    
}
