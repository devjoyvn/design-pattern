package vn.devjoy;

import vn.devjoy.editor.Editor;
import vn.devjoy.listeners.EmailNotificationListener;
import vn.devjoy.listeners.LogOpenListener;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
