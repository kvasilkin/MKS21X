
public class Sorts{
  /**EDIT THIS METHOD TO MATCH YOUR NAME 
  */
  public static String name(){
    return "09.Vasilkin.Katherine"; 
  }

  /**Selection sort of an int array. 
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void selectionSort(int[] data){
      int min = data[i];
      for (int i = 0; i < data.length ; i ++){
	  for(int j = 0; j < data.length ; j++){
	      if (data[j] < min){
		  min = data[j];}}
	  data[i] = min;}
}

 


}

}

