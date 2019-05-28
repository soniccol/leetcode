class Solution {
    public boolean judgeCircle(String moves) {
        int ud=0;
        int lr=0;
        
        for(int i=0;i<moves.length();i++){
            String t=moves.substring(i,i+1);
            
            if(t.equals("U")){
                ud++;
            }else if(t.equals("D")){
                ud--;
            }else if(t.equals("L")){
                lr++;
            }else if(t.equals("R")){
                lr--;
            }           
        }
        
        if(ud==0&&lr==0){
            return true;
        }else{
            return false;
        }

    }
}