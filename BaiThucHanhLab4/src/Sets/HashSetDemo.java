package Sets;

import java.util.HashSet;
import java.util.Scanner;

import QLStudent.Student;

public class HashSetDemo {
   
    public static void main(String[] args) {
    HashSet<Student> stdhash = new HashSet();
    Scanner sc = new Scanner(System.in);
    QLStudent.Student st = new Student();
   do{
    System.out.println("Quản lý sinh viên!");
    System.out.println("1. Thêm thông tin sinh viên");
    System.out.println("2. Sửa thông tin sinh viên");
    System.out.println("3. Xoá thông tin sinh viên");
    System.out.println("4. Thông tin sinh viên ");
    System.out.println("Vui lòng chọn:");
    int chon = sc.nextInt();
    switch (chon) {
        case 1:
            System.out.println("Nhập số lượng sinh viên: ");
            int n = sc.nextInt();
            st.dienthongtin(stdhash, n);
            break;
        case 2:
            st.suathongtin(stdhash, sc);    
            break;
        case 3:
        st.XoaSinhVien(stdhash, sc);    
            break;
        case 4:
        st.hienthithongtin(stdhash);
           break;
        default:
        System.out.println("chọn sai yêu cầu vui lòng nhập lại");
            break;
    }
} while(true);
}
}
