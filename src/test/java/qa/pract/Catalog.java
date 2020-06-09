package qa.pract;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import io.qameta.allure.*;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.CollectionCondition.*;

public class Catalog {

    @Test
    @Description("Some detailed test description")
    void sort(){
        Configuration.timeout = 6000;
        System.setProperty("chromeoptions.mobileEmulation", "deviceName=Nexus 5");

        open("https://www.wildberries.ru/catalog/zhenshchinam");

        element("#btnSort").click();
        element("#rate").click();

        element("#btnSort").click();
        element("#popular").click();

        element("#btnSort").click();
        element("#price").click();

        element("#btnSort").click();
        element("#newly").click();

        //elements("i-filter-sorter-list jsCont fixed active").shouldHave(size(5));
    }

    @Test
    void filter(){
        System.setProperty("chromeoptions.mobileEmulation", "deviceName=Nexus 5");

        open("https://www.wildberries.ru/catalog/zhenshchinam");

        element("#btnFilter").click();

        element("#lowPrice").clear();

        element("#applyFilter").click();
    }

    @Test
    void link(){
        System.setProperty("chromeoptions.mobileEmulation", "deviceName=Nexus 5");

        open("https://www.wildberries.ru/catalog/zhenshchinam");

        element("catalogContainer");
    }
}
