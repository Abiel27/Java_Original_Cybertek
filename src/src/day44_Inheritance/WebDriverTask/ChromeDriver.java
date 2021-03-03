package src.day44_Inheritance.WebDriverTask;

public class ChromeDriver extends WebDriver {

    public ChromeDriver( ) {
        super("Chrome Browser", "V84.0.1");
    }

    @Override
    public void get(String URL) {
        System.out.println("opening "+URL+" the chrome driver");
    }

    @Override
    public void close() {
        System.out.println("closing chrome driver");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing chrome driver");
    }
}
