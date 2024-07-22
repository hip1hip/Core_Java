/*
    작성자: 홍인표
    작성일: 2024-07-20
    작성환경: Windows 10
            JDK 17.0.11
            IntelliJ IDEA 2024.1.4 (Community Edition)
 */

import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        Input input = new Input();
        input.patientInfo(patients);

        Calc calc = new Calc(patients);
        calc.calc();
        calc.quickSort();

        Output output = new Output(patients);
        output.viewPatients();
    }
}