package mypack;

import java.lang.reflect.Method;
import java.util.Calendar;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvisor implements MethodBeforeAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		
		System.out.println("Executed at "+Calendar.getInstance().getTime());
		
	}

		
}
