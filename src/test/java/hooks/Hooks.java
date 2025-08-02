package hooks;

import Drivers.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setup() {

        DriverManager.driverSetUp();

        DriverManager.getDriver().manage().window().maximize();
    }

    @After
    public void teardown() {
        DriverManager.quitDriver();
    }
}
