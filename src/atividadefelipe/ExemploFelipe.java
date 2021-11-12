package atividadefelipe;
// Autor: Rafael Martins Silva
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class ExemploFelipe {
public static void main(String[] args) {
abrirChrome();
}
private static void abrirChrome() {
File file = new File("C:\\Users\\Rafael Martins\\Desktop\\jar_files\\chromedriver.exe"); //Coloque o caminho para o seu chromedrive
System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
WebDriver driver = new ChromeDriver();
driver.get("https://github.com/Rafas-ms");
String i = driver.getCurrentUrl();
System.out.println(i); // Imprime no console a Url do site
driver.close();
}
}
