package buttons;/*
* Tất cả các dòng sản phẩm đều có dòng giống nhau (MacOS/Windows)
*
* Đây là một button của Windows
*
* */

public class WindowsButton implements Button {
    
    @Override
    public void paint() {
        System.out.println("Bạn đã tạo một Windows Button!");
    }
}
