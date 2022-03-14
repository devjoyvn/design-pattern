package buttons;

/*
* Abstract Factory giả định rằng bạn có một số họ sản phẩm
* được cấu trúc thành các phân lớp riêng biệt (gòm buttons.Button và Checkbox).
* Tất cả sản phẩm đều có interface riêng
*
* Đây là interface chung của buttons.Button
*
* */
public interface Button {
    void paint();
}
