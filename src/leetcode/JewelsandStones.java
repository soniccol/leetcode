package leetcode;

public class JewelsandStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JewelsandStones j=new JewelsandStones();
		j.numJewelsInStones("aA","aAAbbbb");
		
		
	}
	public int numJewelsInStones(String J, String S) {
		int result=0;
		for(int i=0;i<J.length();i++){
			char a=J.charAt(i);
			for(int j=0;j<S.length();j++){
				char b=S.charAt(j);
				if(a==b){
					result++;
				}
			}
		}
		
		return result;
    }
}
