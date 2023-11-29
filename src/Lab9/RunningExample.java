package Lab9;

public class RunningExample {
	
    public static void main(String[] args) {
    	
        // TODO Auto-generated method stub
    	System.out.println("Sample array:");
        int[]arr1 = {100,200,333,431,198, 257, 947, 123, 743, 376, 134};
        int[]arr2 = {100,200,333,431,198, 257, 947, 123, 743, 376, 134};
        
        
        
        for(int i : arr1) {
        	System.out.print(i + ", ");
        }
        System.out.print("\n");
        
        
        // RADIX SORT QUEUE-- ETHAN
        System.out.println("Radix Sort Queue Method Result:");
        RadixSortQueue r = new RadixSortQueue();
        r.sort(arr1);
        
        for(int i : arr1) {
        	System.out.print(i + ", ");
        }
        System.out.println();
        
        //RADIX SORT RUN COUNTS - NATE
        System.out.println("Radix Sort Queue Method Result:");
        RadixSortRC r2 = new RadixSortRC();
        r2.sort(arr2);
        
        for(int i : arr2) {
        	System.out.print(i + ", ");
        }
        
    }

}
