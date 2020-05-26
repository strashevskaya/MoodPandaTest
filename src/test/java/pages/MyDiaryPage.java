package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MyDiaryPage extends BasePage {

    By hugButton = By.id("7662728,1184060,mcw1,1,Hug");
    By hugReplyField = By.id("media-comment0");

    public MyDiaryPage openPage() {
        open("https://moodpanda.com/Feed/?Me=1");
        return this;
    }

    public MyDiaryPage isPageOpened() {
        $(By.id("ContentPlaceHolderContent_MyMoodPandaNav1_UserStats")).waitUntil(Condition.visible, 30000);
        return this;
    }

    public MyDiaryPage addHug() {
        $(hugButton).click();
        return this;
    }

    public MyDiaryPage verifyHug() {
        Assert.assertTrue($(hugReplyField).isDisplayed(), "Hug button works incorrectly");
        return this;
    }
}
