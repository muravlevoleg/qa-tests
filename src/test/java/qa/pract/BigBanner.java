
package qa.pract;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.CollectionCondition.*;


public class BigBanner {

    @Test
    void shouldSearch(){
        System.setProperty("chromeoptions.mobileEmulation", "deviceName=Nexus 5");

        open("https://www.wb.ru");

        element(byClassName("big-banner-link")).pressEnter();

        //elements("i-catalog-prev-item j-catalog-prev-item").shouldHave((5));
    }
}
