package app;

/*
* Người dùng factory không quan tâm họ sử dụng factory cụ thể nào
* vì họ làm việc với các factory và sản phẩm qua các abstract interface
* */

import buttons.Button;
import checkboxes.Checkbox;
import factories.GUIFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
