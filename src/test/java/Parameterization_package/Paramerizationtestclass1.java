package Parameterization_package;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramerizationtestclass1 {
 @Test
 @Parameters({" browser","url"})
 public void Testmethod(@Optional("Firefox")String browser,String url){
  System.out.println("Browser:"+browser);
  System.out.println("url:"+url);


 }
}
