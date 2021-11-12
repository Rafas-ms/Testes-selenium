/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestePreencherDados {
    
@Test
public void teste(){
    try {
     File file = new File("C:\\Users\\Rafael Martins\\Desktop\\jar_files\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.inflectra.com/CustomerArea/Register.aspx");
        
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement email = driver.findElement(By.id("txtEmailAddress"));
        email.sendKeys("rafaela.cruz.mor.2021");

        WebElement firstName = driver.findElement(By.id("txtFirstName"));
        firstName.sendKeys("Rafaela");

        WebElement middleName = driver.findElement(By.id("txtMiddleInitial"));
        middleName.sendKeys("Rafaela");

        WebElement lastName = driver.findElement(By.id("txtLastName"));
        lastName.sendKeys("Priscila Cruz Moreira");

        Select country = new Select(driver.findElement(By.id("cplMainContent_ddlCountry")));
        country.selectByValue("31");

        WebElement passwd = driver.findElement(By.id("txtPassword"));
        passwd.sendKeys("Rafa@@@123");

        WebElement confPasswd = driver.findElement(By.id("txtPasswordConfirm"));
        confPasswd.sendKeys("Rafa@@@123");

        Select question = new Select(driver.findElement(By.id("cplMainContent_ddlSecurityQuestion")));
        question.selectByValue("What was your childhood nickname?");

        WebElement answer = driver.findElement(By.id("txtSecurityAnswer"));
        answer.sendKeys("Azul");

        WebElement notify = driver.findElement(By.id("chkNotifyLocal"));
        notify.click();

        WebElement captcha = driver.findElement(By.id("txtCaptcha"));
        captcha.sendKeys("1234");

        WebElement submit = driver.findElement(By.id("btnRegister"));
        submit.click();
        
        Assertions.assertEquals("The Email Address is not valid", driver.findElement(By.xpath("//*[@id=\"frmRegister\"]/div[1]/div/small[2]")).getText());

       
    }
    catch (Exception e){
        System.out.println(e.getMessage());
    }

}
}
