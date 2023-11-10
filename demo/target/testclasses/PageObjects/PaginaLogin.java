import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaLogin {

	private WebDriver driver;
	
	public PaginaLogin(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement campoEmail() {
		return driver.findElement(By.id("email"));
	}
	
	public WebElement campoSenha() {
		return driver.findElement(By.id("senha"));
	}
}
