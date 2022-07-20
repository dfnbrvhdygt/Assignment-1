import java.util.Scanner;
class Main {
  //create a function that takes two integer arrays as input, compares them and stores them in another array and returns that array
   public static int[] compareTriplets(int a[], int b[]){
//Need a result array that store the results
//Need variables to keep track of alice and bob's points:
        int result[] = new int [2];
        int AlicePoints =0, BobPoints = 0;
        //run a loop that will run from 0 to index 2,
     //in each iteration of the loop, we will check if the current index's value for both a and b. If a's value is bigger, we will increment AlicePoints by 1, if b's value is bigger then we will increment BobPoints by 1. Otherwise it's a tie and we do not need to do anything:
        for(int i=0;i<3;i++){
            if(a[i]>b[i]){
                AlicePoints++;
            }
            else if(b[i]>a[i]){
                BobPoints++;
            }
        }
      
     //assign the values
        result[0]=AlicePoints;
        result[1]=BobPoints;
        
        return result;
        
        
        
    }
	public static void main(String[] args) {
    //take the whole line and separate them using split and store them in a string array.
//use parseInt() to parse those strings back to the integer values.
 //call the function in a result array and print the contents of the result array:
	    Scanner scanner = new Scanner(System.in);
	    int a[] = new int [3];
	    int b[]= new int [3];
	    int result[] =new int [2];
		System.out.println("Enter Alice's points: ");
		String s[]= scanner.nextLine().split(" ");
		
        for(int i =0 ;i < s.length;i++){
            a[i]= Integer.parseInt(s[i]);
        }
        
        System.out.println("Enter Bob's points: ");
        String s1[]= scanner.nextLine().split(" ");
		
        for(int i =0 ;i < s1.length;i++){
            b[i]= Integer.parseInt(s1[i]);
        }
        result = compareTriplets(a,b);
        System.out.println("Result are : ");
        for(int i=0;i<2;i++){
            System.out.print(result[i]+" ");
        }
        
		
	}
}
