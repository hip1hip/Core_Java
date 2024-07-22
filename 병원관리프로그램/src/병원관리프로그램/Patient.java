/*
    작성자: 홍인표
    작성일: 2024-07-20
    작성환경: Windows 10
            JDK 17.0.11
            IntelliJ IDEA 2024.1.4 (Community Edition)
 */

public class Patient {
    private int prtientNum;  //환자번호
    private String code; // 진료코드
    private int hosDate; // 입원일수
    private int age; // 나이
    private String department; //진찰부서
    private int examPrice; // 진찰비
    private double hosPrice; //입원비
    private double totalprice;//진료비

    public Patient(int prtientNum, String code, int hosData, int age) {
        this.prtientNum = prtientNum;
        this.code = code;
        this.hosDate = hosData;
        this.age = age;
    }

    public int getPrtientNum() {
        return prtientNum;
    }

    public void setPrtientNum(int prtientNum) {
        this.prtientNum = prtientNum;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getHosData() {
        return hosDate;
    }

    public void setHosData(int hosData) {
        this.hosDate = hosData;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getExamPrice() {
        return examPrice;
    }

    public void setExamPrice(int examPrice) {
        this.examPrice = examPrice;
    }

    public double getHosPrice() {
        return hosPrice;
    }

    public void setHosPrice(double hosPrice) {
        this.hosPrice = hosPrice;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

    @Override
    public String toString() {


        return String.format("%3d\t %8s\t %7d\t %7s\t %7s" , prtientNum , department , examPrice , hosPrice ,totalprice);

    }


}
