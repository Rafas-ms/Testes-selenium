package atividadefelipe;
// Autor: Rafael Martins Silva
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestePesquisaGoogle {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Rafael Martins\\Desktop\\jar_files\\chromedriver.exe"); //Coloque o caminho para o seu chromedrive
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com.br/");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Selenium");
        element.submit(); // Pesquisa Selenium no google

        driver.close();
    }

}
