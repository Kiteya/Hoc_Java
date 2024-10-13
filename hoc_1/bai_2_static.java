//Giả sử có 500 sinh viên trong trường đại học, bây giờ instance của các thành viên dữ liệu
//sẽ lấy bộ nhớ mỗi khi đối tượng được tạo. Tất cả sinh viên có rollno và name duy nhất
//vì thế instance của thành viên dữ liệu là tốt. Ở đây, college là thuộc tính chung của tất cả đối tượng.
//Nếu chúng ta tạo nó là static, thì trường này sẽ chỉ lấy bộ nhớ một lần.
class Student8{
    int rollno;
    String name;
    static String college ="BachKhoa";

    Student8(int r,String n){
        rollno = r;
        name = n;
    }
    void display (){System.out.println(rollno+" "+name+" "+college);}

    public static void main(String args[]){
        Student8 s1 = new Student8(111,"Hoang");
        Student8 s2 = new Student8(222,"Thanh");

        s1.display();
        s2.display();
    }
}