
public class ArraySort {
	public static void main(String[] args){
		int m[][] = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
		
		sort(m);
		
		printArray(m);
	}
	
	public static void sort(int m[][]){
		for(int a = 1;a < m.length;a++){
			for(int i = 0;i < m.length-1;i++){
				if(m[i][0] > m[i+1][0]){
					int temp[] = m[i];
					m[i] = m[i+1];
					m[i+1] = temp;
				}	
					
					if(m[i][1] > m[i+1][1] && m[i][0] == m[i+1][0]){
						int temp1[] = m[i];
						m[i] = m[i+1];
						m[i+1] = temp1;
					}
					
			}
		}
	}
	
	public static void printArray(int m[][]){
		for(int i = 0;i < m.length;i++){
			System.out.println(m[i][0]+","+m[i][1]);
		}
	}
}
