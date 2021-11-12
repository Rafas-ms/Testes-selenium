package atividadefelipe;
// Autor: Rafael Martins Silva
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class TesteTituloGoogle {

    public static void main(String[] args) {
        
        WebDriver driver = new HtmlUnitDriver();

        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Selenium");
        element.submit();
        String titulo = driver.getTitle();
        
        if (titulo.equalsIgnoreCase("Teste de pesquisa - Pesquisa Google")) { // Retorna o título e se ele está de acordo com o esperado
            System.out.println("O título da página é: " + titulo + ". E está correto!");
        } else {
            System.out.println("O título está incorreto: " + titulo);
        }

        driver.quit();

    }
}
