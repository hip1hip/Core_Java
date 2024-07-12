package 급여관리프로그램;

public class Application {

    public static void main(String[] args) {
        InputView inputView = new InputView(new ConsoleReader());
        
        Employee[] employees = new Employee[5];
        for (int i = 0; i < 5; i++) {
			employees[i] = new Employee();
		}
        inputView.inputEmployees(employees);
        Calculation calculation = new Calculation();
        calculation.calc(employees);
        Output Output = new Output();
        Output.displayEmployeeData(employees);
        
        System.out.println("Programming is over..");
    }
}


