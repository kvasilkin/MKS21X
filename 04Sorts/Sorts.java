
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
   
      for (int i = 0; i < data.length ; i ++){
      int min = data[i];
      int hold = 0;

	  for(int j = 0; j < data.length ; j++){
	      if (data[j] < min){
		  min = data[j];
}
}
	  data[i] = min;}
  }

    public static void insertionSort(int[] data){
	int temp = 0;
	int hold = 0;
	for (int i = 1; i < data.length - 1 ; i++){
	    if (data[i] > data [i+1]){

		temp = data [i+1];
		
		for (int j = 0; j < data.length; j++){
		    if (temp < data[j]){
			hold = data[j];
			

			for (int k = data.length; k > j ; k++){
			    data[k] = data[k-1];}
		    }
			data[j] = temp;
			data[j + 1] = hold;
		   

		}}}}

    public static void bubbleSort (int[]data){
	int hold = 0;
	int complete = 0;
	int counter = 0;
	for (int i = 0; i < data.length - counter; i++){
	    if(data[i] > data[i+1]){
		hold = data[i];
		data[i] = data[i+1];
		data[i+1] = hold;
		complete ++;}
	   
	    if (counter > 0){
		counter = 0;
		complete ++;}
	    else {return ;
	    }
	}}

public static void main (String [] args){
    int [] emptyTester = {};
    int [] descending  = new int [20]; 
    int [] acending  = new int [20];
    int [] random = new int [20];
    int [] repeat = new int [20];
}

