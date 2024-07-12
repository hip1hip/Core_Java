package 급여관리프로그램;

public class Calculation {

    private final int[][] SALARY_TABLE =
                    {{95000, 80_000},
                    {92_000, 75_000},
                    {89_000, 70_000},
                    {86_000, 65_000},
                    {83_000, 60_000}};
    
    
    void calc(Employee[] array) {

        for (Employee e : array) {
        	if(!e.getIsInit()) {
        		continue;
        	}
            double salary = e.getAllowance() + SALARY_TABLE[e.getStep() - 1][e.getGrade() - 1];
            e.setSalary(salary);

            double taxRate = salary < 70_000 ? 0. :
                    salary < 79_999 ? 0.005 :
                            salary < 89_999 ? 0.007 : 0.012;

            int num = salary < 70_000 ? 0 :
                    salary < 79_999 ? 300 :
                            salary < 89_999 ? 500 : 1000;

            double tax = (salary * taxRate) - num;

            double adjustedSalary = salary - tax;
            e.setTax(tax);
            e.setAdjustedSalary(adjustedSalary);
        }
    }
}