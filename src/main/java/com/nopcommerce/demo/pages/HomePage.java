package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By computer=By.xpath("//div[@class='header-menu']/ul[1]/li[1]/a");
    By electronics=By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a");
    By apparel=By.xpath("//div[@class='header-menu']/ul[1]/li[3]/a");
    By digitalDownloads=By.xpath("//div[@class='header-menu']/ul[1]/li[4]/a");
    By books=By.xpath("//div[@class='header-menu']/ul[1]/li[5]/a");
    By jewelry=By.xpath("//div[@class='header-menu']/ul[1]/li[6]/a");
    By giftCards=By.xpath("//div[@class='header-menu']/ul[1]/li[7]/a");


    public void clickOnComputer(){
        clickOnElement(computer);
    }
    public void clickOnElectronicsr(){
        clickOnElement(electronics);
    }
    public void clickOnAppearals(){
        clickOnElement(apparel);
    }
    public void clickOndigitalDownloads(){
        clickOnElement(digitalDownloads);
    }
    public void clickOnbooks(){
        clickOnElement(books);

    }
    public void clickOnJewelary(){
        clickOnElement(jewelry);
    }
    public void clickOnGiftCards(){
        clickOnElement(giftCards);
    }
    public String getUrl() {
        return driver.getCurrentUrl();
    }


}
