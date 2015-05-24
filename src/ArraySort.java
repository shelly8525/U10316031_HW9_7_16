
public class ArraySort {
	//main method
	public static void main(String[] args){
		//create the array
		int m[][] = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
		//invoke sort method
		sort(m);
		//invoke printArray method
		printArray(m);
	}
	//sort method
	public static void sort(int m[][]){
		//the for loop of the array
		for(int a = 1;a < m.length;a++){
			//the for loop
			for(int i = 0;i < m.length-1;i++){
				//sort the first number
				if(m[i][0] > m[i+1][0]){
					int temp[] = m[i];
					m[i] = m[i+1];
					m[i+1] = temp;
				}	
					//sort the second number
					if(m[i][1] > m[i+1][1] && m[i][0] == m[i+1][0]){
						int temp1[] = m[i];
						m[i] = m[i+1];
						m[i+1] = temp1;
					}
					
			}
		}
	}
	//printArray method
	public static void printArray(int m[][]){
		//the for loop to print sort
		for(int i = 0;i < m.length;i++){
			System.out.println(m[i][0]+","+m[i][1]);
		}
	}
}
