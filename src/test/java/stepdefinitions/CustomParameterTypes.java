package stepdefinitions;


import io.cucumber.java.ParameterType;

public class CustomParameterTypes {

    @ParameterType(".*")
    public String city(String city) {
        return city; // You can customize the logic if needed.
    }
}
