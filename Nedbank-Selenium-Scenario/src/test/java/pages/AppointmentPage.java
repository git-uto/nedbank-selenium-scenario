package pages;

import base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AppointmentPage extends BaseClass {
    WebDriver webDriver;

    public AppointmentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(xpath = "//input[@id='chk_hospotal_readmission']")
    private WebElement CHK_READMISSION;
    @FindBy(xpath = "//select[@id='combo_facility']")
    private WebElement DD_FACILITY;

    @FindBy(xpath = "//input[@id='radio_program_none']")
    private WebElement RB_NONE;
    @FindBy(xpath = "//input[@id='txt_visit_date']")
    private  WebElement DATE_VISIT;
    @FindBy(xpath = "//textarea[@id='txt_comment']")
    private WebElement TXT_COMMENT;
    @FindBy(xpath = "//button[@id='btn-book-appointment']")
    private WebElement BTN_BOOK_APPOINTMENT;
    @FindBy(xpath = "//p[@id='facility']")
    private WebElement P_FACILITY_NAME;

    public void bookAppointment(String visitDate, String comment)
    {
        RB_NONE.click();
        DATE_VISIT.sendKeys(visitDate);
        TXT_COMMENT.sendKeys(comment);
        BTN_BOOK_APPOINTMENT.click();

    }
    public void selectFacility()
    {
        Select  select = new Select(DD_FACILITY);
        select.selectByVisibleText("Hongkong CURA Healthcare Center");
        RB_NONE.click();
    }
    public String getTheFacilityName()
    {
        String facilityName =  P_FACILITY_NAME.getText();
        System.out.println("The Facility Name is" + facilityName);
        return facilityName;
    }

}
