package Examples;

import org.testng.ITestResult;
import org.testng.ITestListener;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class Listener_Demo implements ISuiteListener {
  @Test
  public void f() {
  }

@Override
public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	
	System.out.println("The name of the testcase passed is :" + result.getName());
	
}

@Override
public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	
	System.out.println("The name of the failed testcase is: " + result.getName());
	
}

@Override
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	
	System.out.println("The name of the skipped testcase is: " + result.getName());
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	System.out.println(context.getName() + "test case started");
	
}

@Override
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
	
}
}
