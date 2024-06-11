import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class ViewProducts extends BaseClass{
@Test(priority = 0, description = "visit the website then scroll Up down for view items")
    public void viewItems() throws Exception{
        //scroll down
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(1000);
        //scroll up
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
        Thread.sleep(1000);
        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
    @Test(priority = 1, description = "hover on multiple menu")
    public void hoverOnMenu() throws  Exception{
        //hover on main menu
        WebElement element_to_hover_main_menu = driver.findElement(By.xpath("//*[@id=\"menu-main-menu\"]/li[2]"));
        Actions actions = new  Actions(driver);
        actions.moveToElement(element_to_hover_main_menu).perform();
        Thread.sleep(1000);
        //hover on sub menu
        WebElement element_to_hover_sub_menu = driver.findElement(By.xpath(" //*[@id=\"menu-main-menu\"]/li[2]/ul/li[1]"));
        Actions actions1 = new  Actions(driver);
        actions1.moveToElement(element_to_hover_sub_menu).perform();
        Thread.sleep(1000);
        //hover on minor menu
        WebElement element_to_hover_minor_menu = driver.findElement(By.xpath(" //*[@id=\"menu-main-menu\"]/li[2]/ul/li[1]/ul/li[1]"));
        Actions actions2 = new  Actions(driver);
        actions2.moveToElement(element_to_hover_minor_menu).perform();
        Thread.sleep(1000);
        //hover on sub minor menu & click
        WebElement element_to_hover_sub_minor_menu = driver.findElement(By.xpath("//*[@id=\"menu-main-menu\"]/li[2]/ul/li[1]/ul/li[1]/ul/li[2]"));
        Actions actions3 = new  Actions(driver);
        actions3.moveToElement(element_to_hover_sub_minor_menu).click().perform();
        Thread.sleep(1000);

    }
    @Test(priority = 2, description = "set price range with the slider")
    public void setPriceRange() throws  Exception{
    driver.get("https://www.excelbd.com/product-category/wi-fi-networking/router/wireless-n-router/mercusys-wireless-n-router/");
    WebElement leftSlider = driver.findElement(By.xpath("//*[@id=\"wpfSliderRange\"]/span[1]"));
    WebElement rightSlider = driver.findElement(By.xpath("//*[@id=\"wpfSliderRange\"]/span[2]"));

        // Initialize Actions class
        Actions actions = new Actions(driver);

        // Move the left slider to the desired position
        moveSlider(actions, leftSlider, 50);

        // Move the right slider to the desired position
        moveSlider(actions, rightSlider, -50);
    }

    private void moveSlider(Actions actions, WebElement slider, int xOffset) {
        actions.clickAndHold(slider).moveByOffset(xOffset, 0).release().perform();
    }

    }


