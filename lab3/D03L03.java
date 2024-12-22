//import java.lang.annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.*;

public class D03L03{

	public static void main(String [] args){
		Func();

	}

	@Author(str="annotation message" , val =5)
	public static void Func(){
		System.out.println("Hello from function");
		D03L03 ob = new D03L03();
		try{
			Class <?> obClass=ob.getClass();
			Method method = obClass.getMethod("Func");
			Author anno = method.getAnnotation(Author.class);
			System.out.println(anno.str() + " "+anno.val());
			
		}catch(NoSuchMethodException exc){
			System.out.println("Method Not Found.");
		}
		

	}


}



@Retention(RetentionPolicy.RUNTIME)
@interface Author{
	String str();
	int val();
}