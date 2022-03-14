package checkboxes;/*
* Tất cả các dòng sản phẩm đều có dòng giống nhau (MacOS/Windows)
*
* Đây là một checkbox của Windows
*
* */

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Bạn đã tạo một Windows checkbox!");
    }
}
