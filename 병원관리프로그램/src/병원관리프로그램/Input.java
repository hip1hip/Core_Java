/*
    작성자: 홍인표
    작성일: 2024-07-20
    작성환경: Windows 10
            JDK 17.0.11
            IntelliJ IDEA 2024.1.4 (Community Edition)
 */

import java.util.List;
import java.util.Scanner;

public class Input {
    public void patientInfo(List<Patient> patients) {

        Scanner sc = new Scanner(System.in);
        String ioSelect = "";

        do {
            System.out.print("번호");
            int patientNum = sc.nextInt();
            System.out.print("진료코드");
            String code = sc.next();
            System.out.print("입원일수 ");
            int hosDate = sc.nextInt();
            System.out.print("나이");
            int age = sc.nextInt();

            patients.add(new Patient(patientNum, code, hosDate, age));

            System.out.print("입력/출력(I/O)? : ");
            ioSelect = sc.next();

        } while (ioSelect.equalsIgnoreCase("i"));

    }
}
