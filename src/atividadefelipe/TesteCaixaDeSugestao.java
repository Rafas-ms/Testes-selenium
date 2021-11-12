package atividadefelipe;

import java.io.File;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCaixaDeSugestao {

    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Users\\Rafael Martins\\Desktop\\jar_files\\chromedriver.exe"); //Coloque o caminho para o seu chromedrive
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/webhp?complete=1&hl=en");

        WebElement query = driver.findElement(By.name("q"));
        query.sendKeys("Testes com Selenium");

        long end = System.currentTimeMillis() + 5000;
        while (System.currentTimeMillis() < end) {
            WebElement resultsDiv = driver.findElement(By.className("UUbT9"));

            if (resultsDiv.isDisplayed()) {
                break;
            }
        }

        List<WebElement> allSuggestions = driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]"));

        for (WebElement suggestion : allSuggestions) {
            System.out.println(suggestion.getText()); //Imprime as opções da caixa de sugestão no console
        }

        driver.quit();
    }
}
