package checkboxes;/*
* Tất cả các dòng sản phẩm đều có dòng giống nhau (MacOS/Windows)
*
* Đây là một checkbox của MacOs
*
* */

public class MacOsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Bạn đã tạo một MacOS checkbox!");
    }
}
