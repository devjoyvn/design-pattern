package factories;

import buttons.Button;
import buttons.MacOsButton;
import checkboxes.Checkbox;
import checkboxes.MacOsCheckbox;

/*
* Mỗi factory cụ thể mở rộng factory cơ bản và
* chịu trách nhiệm tạo ra sản phẩm một loại duy nhất.
* */

public class MacOsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}
