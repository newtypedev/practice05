package prob5;

public class MyStack {
	private int top;
	private String[] buffer;
	
	
	public MyStack(){}
	
	public MyStack(int i){
		this.top = 0;
		buffer = new String[i];
		
		for(int k=0; k<buffer.length;k++)
			buffer[k]="";
	}
	
	public boolean isEmpty(){
		if(top==0){
			return true;
		}
		return false;
	}
	
	public String pop() throws MyStackException{
		int count = top-1;
		
		if(count<0)
				throw new MyStackException("stack is Empty");
		String value="";
		if(count>=0){
			top--;
		value = buffer[count];
	
		}
		return value;

	}
	
	public void push(String str) {
		
		if(top==buffer.length){
			int size = top*top;
			
			
			String[] nbuffer = buffer;
			
			buffer = new String[size];
			
			for(int k=0; k<buffer.length;k++){
				buffer[k]="";}
			
			for(int k=0; k<nbuffer.length;k++){
				
				buffer[k]=nbuffer[k];}
			
		}
		buffer[top] = str;
		top++;

		
	}


}
