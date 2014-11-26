package leetcode;


public class MergeArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	
    public void merge(int A[], int m, int B[], int n) {
        for(int i=0;i<B.length;i++){
        	A[m+i]=B[i];
        }        
        A=bubbleSort(A);
    }
	public static int[] bubbleSort(int A[]){
		for(int i=0;i<A.length;i++){
			for(int j=0;j<A.length-i-1;j++){
				if (A[j] > A[j+1]){
					int temp=A[j];
					A[j]=A[j+1];
					A[j+1]=temp;
				}
			}
		}
		return A;
	}
}
