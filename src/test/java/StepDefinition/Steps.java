package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;
	@Given("abrir Chrome")
	public void abrir_Chrome() {
		System.out.println("En este paso abre el navegador google chrome");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ricardo\\Downloads\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		driver.get("http://localhost:8081/ReservaHora");
	}
	
	@When("ingresa Username {string} y Password {string}")
	public void ingresa_Username_y_Password(String string1, String string2) {
		System.out.println("En este paso ingresa las credenciales de usuario");
		driver.findElement(By.name("username")).sendKeys(string1);
		driver.findElement(By.name("password")).sendKeys(string2);
	}
	
	@Then("inicia sesion")
	public void inicia_sesion() {
		System.out.println("En este paso inicia sesion con los datos ingresados desde el archivo MyTest.feature");
		driver.findElement(By.name("Enviar")).click();
	}
	
	@Then("cerrar")
	public void cerrar() {
		driver.quit();
	}
	
	@Given("ir al formulario")
	public void ir_al_formulario() {
		System.out.println("En este paso va al formulario");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ricardo\\Downloads\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8081/ReservaHora/agregarAgenda.jsp");
		//driver.findElement(By.xpath("//a[text(),'Agendamiento']")).click();
	}
	
	@When("llenar campos {string}, {string}, {string}, {string} y {string}")
	public void llenar_campos(String int1, String string1, String string2, String string3, String string4) {
		System.out.println("En este paso ingresa los datos del agendamiento");
		driver.findElement(By.name("idMascota")).sendKeys(int1);
		driver.findElement(By.name("rutDuenho")).sendKeys(string1);
		driver.findElement(By.name("nombreMascota")).sendKeys(string2);
		driver.findElement(By.name("hora")).sendKeys(string3);
		driver.findElement(By.name("fecha")).sendKeys(string4);
	}
	
	@Then("presionar boton")
	public void presionar_boton() {
		System.out.println("En este paso ingresa los datos en DB");
		driver.findElement(By.name("Enviar")).click();
	}
}
