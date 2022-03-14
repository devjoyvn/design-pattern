import app.Application;
import factories.GUIFactory;
import factories.MacOsFactory;
import factories.WindowsFactory;

public class Main {

    /*
    * App chọn kiểu factory và tạo nó trong thời gian chạy, tuỳ thuộc vào cấu hình hoặc biến môi trường
    * */

    private static Application configApplication() {
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacOsFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configApplication();
        app.paint();
    }
}
