public class D04L01{
	public static void main(String [] args){
		Test test = new Test();
		try{
			test.play();
			test.eat();
		
		}catch(MyException ex){
			System.out.println(ex.getMessage());
		}finally{
			System.out.println("file is closed\n");
		}
	}

}

class MyException extends Exception{

	public MyException(){
		super();
	}

	public MyException(String message){
  		super(message);
	}

} 

class Test {

	public void play() throws MyException{
		System.out.println("play function\n");
		throw new MyException("play exception message");
	}

	public void sleep() throws MyException{
		System.out.println("sleep function\n");
		throw new MyException("sleep exception message");

	}

	public void eat()throws MyException{
		System.out.println("eat function\n");
		throw new MyException("eat exception message");

	}

}