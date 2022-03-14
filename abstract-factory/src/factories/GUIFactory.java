package factories;

import buttons.Button;
import checkboxes.Checkbox;

/*
* Factory có tất cả các loại sản phẩm
* */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
