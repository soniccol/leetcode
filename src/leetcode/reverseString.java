class reverseString {
    public void reverseString(char[] s) {
        int front=0;
        int rear=s.length-1;
               
        while(front<rear){
            char c = s[front];
            s[front]=s[rear];
            s[rear]=c;
            front++;
            rear--;
        }        
    }
}
