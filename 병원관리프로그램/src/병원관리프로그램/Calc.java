/*
    작성자: 홍인표
    작성일: 2024-07-20
    작성환경: Windows 10
            JDK 17.0.11
            IntelliJ IDEA 2024.1.4 (Community Edition)
 */

import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Calc {

    private List<Patient> patients;


    public Calc(List<Patient> patients) {
        this.patients = patients;
    }

    private String getDepartmentName(String code) {
        switch (code) {
            case "MI":
                return "외과";
            case "NI":
                return "내과";
            case "SI":
                return "피부과";
            case "TI":
                return "소아과";
            case "VI":
                return "산부인과";
            case "WI":
                return "비뇨기과";
            default:
                return "Unknown Department";

        }
    }

    public void calc() {
        for (Patient partient : patients) {
            int age = partient.getAge();
            int examPrice = age < 10 ? 7000 :
                    age < 20 ? 5000 :
                            age < 30 ? 8000 :
                                    age < 40 ? 7000 :
                                            age < 50 ? 4500 : 2300;


            int hosDate = partient.getHosData();
            double rate = hosDate < 10 ? 1.00 :
                    hosDate < 15 ? 0.85 :
                            hosDate < 20 ? 0.80 :
                                    hosDate < 30 ? 0.77 :
                                            hosDate < 100 ? 0.72 : 0.68;

            int dayPrice = (hosDate <= 3) ? 30000 : 25000;
            int totalHosPrice = dayPrice * partient.getHosData();
            double hosPrice = totalHosPrice * rate;
            double totalprice = examPrice + hosPrice;

            partient.setDepartment(getDepartmentName(partient.getCode()));
            partient.setExamPrice(examPrice);
            partient.setHosPrice(hosPrice);
            partient.setTotalprice(totalprice);

        }
    }

        public void quickSort () {
            Collections.sort(this.patients, new Comparator<Patient>() {
                @Override
                public int compare(Patient front, Patient back) {
                    return back.getPrtientNum() - front.getPrtientNum();
                }
            });

    }
}
