//package jenkinsRegistrationForm.steps;
//
//import jenkinsRegistrationForm.components.Calendar;
//import jenkinsRegistrationForm.components.StateAndCity;
//import jenkinsRegistrationForm.pages.RegistrationPage;
//import com.codeborne.selenide.Condition;
//import com.codeborne.selenide.WebDriverRunner;
//import io.qameta.allure.Attachment;
//import io.qameta.allure.Step;
//
//import java.io.File;
//import java.nio.charset.StandardCharsets;
//
//import static com.codeborne.selenide.Condition.text;
//import static com.codeborne.selenide.Selectors.byText;
//import static com.codeborne.selenide.Selenide.open;
//
//public class RegistrationStep extends RegistrationPage {
//
//    public Calendar calendar = new Calendar();
//    public StateAndCity stateAndCity = new StateAndCity();
//
//    @Step("��������� ���� � ������ ��� ����������")
//    public RegistrationStep openRegistrationPage() {
//        open("https://demoqa.com/automation-practice-form");
//        return this;
//    }
//
//    @Step("������ ���")
//    public RegistrationStep setFirstName(String value) {
//        firstName.setValue(value);
//        return this;
//    }
//
//    @Step("������ �������")
//    public RegistrationStep setLastName(String value) {
//        lastname.setValue(value);
//        return this;
//    }
//
//    @Step("������ ����������� �����")
//    public RegistrationStep setUserEmail(String value) {
//        userEmail.setValue(value);
//        return this;
//    }
//
//    @Step("������ ����� ��������")
//    public RegistrationStep setUserPhoneNumber(String value) {
//        userNumberPhone.setValue(value);
//        return this;
//    }
//
//    @Step("�������� ���")
//    public RegistrationStep setUserMale() {
//        userMale.click();
//        return this;
//    }
//
//    @Step("������ ���� ��������")
//    public RegistrationStep setBirthDate() {
//        calendar.setDate();
//        return this;
//    }
//
//    @Step("�������� ������� ��������")
//    public RegistrationStep setSubject(String value) {
//        userSubject.setValue(value).pressEnter();
//        return this;
//    }
//
//    @Step("�������� �����")
//    public RegistrationStep setHobbies(String... hobbies) {
//        for (int i = 0; i < hobbies.length; i++) {
//            if (hobbies[i].equals("Sports")) userHobbiesSport.click();
//            else if (hobbies[i].equals("Reading")) userHobbiesReading.click();
//            else if (hobbies[i].equals("Music")) userHobbiesMusic.click();
//        }
//        return this;
//    }
//
//    @Step("��������� ���� �� ��������")
//    public RegistrationStep setFile() {
//        userFile.uploadFile(new File("src/test/resources/img/1.png"));
//        return this;
//    }
//
//    @Step("������ �����")
//    public RegistrationStep setUserAddress(String value) {
//        userAddress.setValue(value).scrollTo();
//        return this;
//    }
//
//    @Step("������ ����� � ���� ����������")
//    public RegistrationStep setStateAndCity() {
//        stateAndCity.setStateAndCity();
//        return this;
//    }
//
//    @Step("�������� �� ������ '���������' ")
//    public RegistrationStep pressSubmit() {
//        buttonSubmit.click();
//        return this;
//    }
//
//    @Step("��������� ���������� ����������� �����")
//    public RegistrationStep checkModalIsVisible() {
//        modal.shouldHave(Condition.visible);
//        return this;
//    }
//
//    @Step("��������� ���� � ������������ �����")
//    public RegistrationStep checkFieldFromResultPracticeForm(String label, String value) {
//        check.$(byText(label)).parent().shouldHave(text(value));
//        return this;
//    }
//
//    @Attachment(value = "Screenshot", type = "text/html", fileExtension = "html")
//    public byte[] attachPageSource() {
//        return WebDriverRunner.source().getBytes(StandardCharsets.UTF_8);
//    }
//}

