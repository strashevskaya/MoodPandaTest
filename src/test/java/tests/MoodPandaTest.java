package tests;


import org.testng.annotations.Test;

public class MoodPandaTest extends BaseTest {

    @Test()
    public void login() {
        loginPage
                .openPage()
                .login("krisssStr@mailinator.com", "password23")
                .openRateHappinessModal()
                .updateMood(5)
                .goToMyDiary();
    }
}
