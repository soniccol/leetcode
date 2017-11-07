package leetcode;
public class RomanToInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//I（1）、V（5）、X（10）、L（50）、C（100）、D（500）和M（1000）
		//左減的數字有限制，僅限於I、X、C。比如45不可以寫成VL，只能是XLV
		RomanToInteger romanToInteger = new RomanToInteger();
		System.out.println(romanToInteger.romanToInt("CXCIX"));
	}

	public int romanToInt(String s) {
		int result=0;
		char digit[]=s.toCharArray();
		int  digit_data[]=new int[digit.length];
		for(int i=0;i<digit.length;i++){
			if(digit[i]=='I'){
				digit_data[i]=1;
			}else if(digit[i]=='V'){
				digit_data[i]=5;
			}else if(digit[i]=='X'){
				digit_data[i]=10;
			}else if(digit[i]=='L'){
				digit_data[i]=50;
			}else if(digit[i]=='C'){
				digit_data[i]=100;
			}else if(digit[i]=='D'){
				digit_data[i]=500;
			}else if(digit[i]=='M'){
				digit_data[i]=1000;
			}
		}
		for(int i=0;i<digit_data.length;i++){
			if(i==0){
				result=digit_data[i];
				if(i+1<digit_data.length){
					if(digit_data[i]>digit_data[i+1]){
						result+=digit_data[i+1];
					}else if(digit_data[i]<digit_data[i+1]){
						result-=(digit_data[i]);
						result+=(digit_data[i+1]-digit_data[i]);
					}else{
						result+=digit_data[i+1];
					}
				}
			}else{
				if(i+1<digit_data.length){
					if(digit_data[i]>digit_data[i+1]){
						result+=digit_data[i+1];
					}else if(digit_data[i]<digit_data[i+1]){
						result-=(digit_data[i]);
						result+=(digit_data[i+1]-digit_data[i]);
					}else{
						result+=digit_data[i+1];
					}
				}
			}
		}		
		return result;
    }
		
}
