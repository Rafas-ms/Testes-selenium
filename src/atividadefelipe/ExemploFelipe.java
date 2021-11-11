/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadefelipe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class ExemploFelipe {
public static void main(String[] args) {
abrirChrome();
}
private static void abrirChrome() {
File file = new File("C:\\Users\\Rafael Martins\\Desktop\\jar_files\\chromedriver.exe");
System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
WebDriver driver = new ChromeDriver();
driver.get("https://github.com/Rafas-ms");
String i = driver.getCurrentUrl();
System.out.println(i);
driver.close();
}
}
