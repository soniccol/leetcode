package leetcode;
public class CompareVersionNumbers {

	public static void main(String[] args) {

		System.out.println(compareVersion("1.0", "1.01.0"));
	}
    public static int compareVersion(String version1, String version2) {
    		
        String v1[]=version1.split("\\.");
        String v2[]=version2.split("\\.");
    	        
        if(!version1.contains(".")&&!version2.contains(".")){
    		int t1=Integer.parseInt(version1);
    		int t2=Integer.parseInt(version2);
    		if(t1>t2) return 1;
    		else if(t1<t2) return -1;
    	}        
        if(!version1.contains(".")){
        	int t1=0;
        	int t2=0;
        	
        	for(int i=0;i<v2.length;i++){
        		if(i>v1.length-1){
        			t1=0;
            		t2=Integer.parseInt(v2[i]);	
        		}else{
        			t1=Integer.parseInt(v1[i]);
            		t2=Integer.parseInt(v2[i]);
        		}        		
        		if(t1>t2) return 1;
        		else if(t1<t2) return -1;
        	}    		        	
        }else if(!version2.contains(".")){
        	int t1=0;
        	int t2=0;
        	for(int i=0;i<v1.length;i++){
        		if(i>v2.length-1){
        			t1=Integer.parseInt(v1[i]);
            		t2=0;	
        		}else{
        			t1=Integer.parseInt(v1[i]);
            		t2=Integer.parseInt(v2[i]);
        		}        		
        		if(t1>t2) return 1;
        		else if(t1<t2) return -1;
        	}
        	        	
        }else{
        
        if(v1.length>v2.length){
        	for(int i=0;i<v1.length;i++){
        		int t1=0;
        		int t2=0;
        		if(i>v2.length-1){
        			t1=Integer.parseInt(v1[i]);
            		t2=0;	
        		}else{
        			t1=Integer.parseInt(v1[i]);
            		t2=Integer.parseInt(v2[i]);
        		}        		
        		if(t1>t2) return 1;
        		else if(t1<t2) return -1;
        	}
        	
        }else if(v1.length<v2.length){
        	for(int i=0;i<v2.length;i++){
        		int t1=0;
        		int t2=0;
        		if(i>v1.length-1){
        			t1=0;
            		t2=Integer.parseInt(v2[i]);	
        		}else{
        			t1=Integer.parseInt(v1[i]);
            		t2=Integer.parseInt(v2[i]);
        		}        		
        		if(t1>t2) return 1;
        		else if(t1<t2) return -1;
        	}        	
        }else{
	        	for(int i=0;i<v1.length;i++){
	        		int t1=Integer.parseInt(v1[i]);
	        		int t2=Integer.parseInt(v2[i]);
	        		if(t1>t2) return 1;
	        		else if(t1<t2) return -1;
	        	}
        	
        }
        }
    	return 0;
    }
}
