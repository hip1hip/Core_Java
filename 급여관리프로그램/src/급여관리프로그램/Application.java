package 급여관리프로그램;

import 급여관리프로그램.calc.Calculation;
import 급여관리프로그램.input.ConsoleReader;
import 급여관리프로그램.input.InputView;
import 급여관리프로그램.output.Output;

public class Application {

    public static void main(String[] args) {
    	Employees employees = new Employees();
//    	Employee[] employees = new Employee[5];
    	
    	
        InputView inputView = new InputView(new ConsoleReader());
        inputView.inputEmployees(employees);
        
        Calculation calculation = new Calculation();
        calculation.calc(employees);
        
        
        Output Output = new Output();
        Output.displayEmployeeData(employees);
        
        System.out.println("Programming is over..");
    }
}


