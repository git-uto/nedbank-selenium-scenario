package stepdefinitions;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AppointmentPage;
import pages.LoginPage;

public class BookAppointmentSteps extends BaseClass {
    LoginPage loginPage = new LoginPage(webDriver);
    AppointmentPage appointmentPage = new AppointmentPage(webDriver);
    @Given("the User has Logged in using the username {string} and the password {string}")
    public void the_user_has_logged_in_using_the_username_and_the_password(String username, String password) {
        loginPage.userLogin(username, password);
    }

    @When("the user selects Hong Kong Center with readmission")
    public void theUserSelectsHongKongCenterWithReadmission() {
        appointmentPage.selectFacility();
    }

    @And("the user completes the appointment by entering the visit Date {string}, comments {string}")
    public void theUserCompletesTheAppointmentByEnteringTheVisitDateComments(String date, String comments) {
        appointmentPage.bookAppointment(date, comments);
    }

    @Then("the appointment is created")
    public void theAppointmentIsCreated() {
        appointmentPage.getTheFacilityName();
    }

}
