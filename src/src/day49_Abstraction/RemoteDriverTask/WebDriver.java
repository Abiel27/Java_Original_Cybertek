package src.day49_Abstraction.RemoteDriverTask;

public interface WebDriver {

    void get(String URL);
    void close();
    void quit();


}
