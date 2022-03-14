package factories;

import buttons.Button;
import buttons.WindowsButton;
import checkboxes.Checkbox;
import checkboxes.WindowsCheckbox;

/*
* Mỗi factory cụ thể mở rộng factory cơ bản và
* chịu trách nhiệm tạo ra sản phẩm một loại duy nhất.
* */

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
