import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class ViewProducts extends BaseClass{
@Test(priority = 0, description = "visit the website then scroll down for view items")
    public void viewItems() throws Exception{
        //scroll down
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(1000);
        //scroll down
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
    @Test(priority = 1, description = "hover on main menu")
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

}
