package dataProvider_Package;

import org.testng.annotations.DataProvider;

public class LoginData {

    @DataProvider(name = "login data")
    public Object[][] LoginData(){
        Object[][] data = {
                {"username1", "password1"},
        };
        return data;
    }
}
