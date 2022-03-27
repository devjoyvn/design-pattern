package vn.devjoy.safe_multi_thread;

public final class Singleton {
    // Biến phải được khai báo là volatile để hoạt động chính xác
    private static volatile Singleton instance;

    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        // Cách khởi tạo ở đây được gọi là khoá kiếm tra kép (DCL).
        // Nó tồn tại để ngăn chặn tình trạng nhiều luồng tạo ra singleton cùng một lúc
        // Do đó nó tạo ra các phân đoạn riêng biệt
        //
        // Nhìn có vẻ biến "result" hoàn toàn vô nghĩa.
        // Tuy nhiên, có một lưu ý quan trọng khi triển khai khoá hai lần trong Java
        // điều này được giải quyết bằng cách đưa vào biến cục bộ này.
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized(Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
