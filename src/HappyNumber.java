    public static boolean isHappy(int n) {
        java.util.HashSet<Integer> hashSet=new HashSet<Integer>();
        int digit=0;
        int m=0;
        while(n!=1&&hashSet.add(n)){
        	m=0;
        	while(n>0){
        		digit=n%10;
        		m+=digit*digit;
        		n=n/10;
        	}
        	n=m;        	
        }        
    	return n==1;
    }
