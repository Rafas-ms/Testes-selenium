/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadefelipe;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestePreencherDados {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Rafael Martins\\Desktop\\jar_files\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tumblr.com/register?source=new_to_tumblr");

        WebElement email = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/section/div/form/div[1]/div[1]/input"));
        email.sendKeys("rafael.martinssilva@hotmail.com");

        WebElement senha = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/section/div/form/div[1]/div[2]/input"));
        senha.sendKeys("r@finha123");

        WebElement nomeBlog = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/section/div/form/div[1]/div[3]/input"));
        nomeBlog.sendKeys("SeleniumTutorial");

        WebElement submit = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/section/div/form/button/span"));
        submit.click();

        driver.close();

    }
}
