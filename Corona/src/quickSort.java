package src;
public class quickSort {
	
	public quickSort() {
		
	}
	/**
     * Recursively call the sort method on two halves of the array
     * @param provinces Array of all cities stored as province objects
     * @param low the lowest index of the section of the array we want to partition
     * @param high the highest index of the section of the array we want to partition
     * @param confirmed whether we want to sort by deaths or confirmed cases
    */
	public static void sort(Province[] provinces, int low, int high, boolean confirmed) {
		if (low < high) {
			int pi = partition(provinces, low, high, confirmed);
			sort(provinces, low, pi-1, confirmed);
			sort(provinces, pi+1, high, confirmed);
		}
	}
	
	/**
     * Partition the array about the specified indices
     * @param provinces Array of all cities stored as province objects
     * @param low the lowest index of the section of the array we want to partition
     * @param high the highest index of the section of the array we want to partition
     * @param confirmed whether we want to sort by deaths or confirmed cases
    */
	public static int partition(Province[] provinces, int low, int high, boolean confirmed) {
		Province pivot = provinces[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
        	if (confirmed) { // Sort by confirmed cases
                if (provinces[j].cases < pivot.cases) { 
                    i++; 
                    // swap arr[i] and arr[j] 
                    Province temp = provinces[i]; 
                    provinces[i] = provinces[j]; 
                    provinces[j] = temp; 
                } 
        	} else { // Sort by deaths
        		if (provinces[j].deaths < pivot.deaths) { 
                    i++; 
                    Province temp = provinces[i]; 
                    provinces[i] = provinces[j]; 
                    provinces[j] = temp; 
                } 
        	}
        } 
        // swap arr[i+1] and arr[high] (or pivot) 
        Province temp = provinces[i+1]; 
        provinces[i+1] = provinces[high]; 
        provinces[high] = temp; 
        return i+1; 
	}
}
