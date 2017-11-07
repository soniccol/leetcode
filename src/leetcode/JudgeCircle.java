package leetcode;

public class JudgeCircle {

	public static void main(String[] args) {
		JudgeCircle judgeCircle = new JudgeCircle();
		System.out.println(judgeCircle.judgeCircle("UD"));
	}
	
	public boolean judgeCircle(String moves) {
		int ud=0;
		int lr=0;
		
		if(moves!=null&&!moves.equals("")){
			for(int i=0;i<moves.length();i++){
				String substr=moves.substring(i, i+1);
				if(substr!=null&&!substr.equals("")){
					if(substr.equals("U")){
						ud++;
					}else if(substr.equals("D")){
						ud--;
					}else if(substr.equals("L")){
						lr++;
					}else if(substr.equals("R")){
						lr--;
					}
				}
			}
		}else{
			return true;
		}
		
		if(ud==0&&lr==0){
			return true;
		}else{
			return false;	
		}
    }
}
