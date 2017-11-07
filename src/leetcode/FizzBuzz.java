package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FizzBuzz FizzBuzz = new FizzBuzz();
		List<String> result =FizzBuzz.fizzBuzz(15);
		
		for(int i=0;i<result.size();i++){
			System.out.println(result.get(i));
		}
		
		
	}
	public List<String> fizzBuzz(int n) {
        
		List<String> resultList = new ArrayList<String>();
		if(n==0){
        	return resultList;
        }else{
        	for(int i=1;i<=n;i++){
        		if(i%3==0&&i%5==0){
        			resultList.add("FizzBuzz");
        		}else if(i%3==0){
        			resultList.add("Fizz");
        		}else if(i%5==0){
        			resultList.add("Buzz");
        		}else{
        			resultList.add(String.valueOf(i));
        		}
        	}
        }
		return resultList;
    }
}
