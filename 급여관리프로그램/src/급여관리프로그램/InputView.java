package 급여관리프로그램;

public class InputView {
    private ConsoleReader reader;

    public InputView(ConsoleReader reader) {
        this.reader = reader;
    }

    public void inputEmployees(Employee[] employees) {
        String isInput = "";
        int index = 0;

        do {
            System.out.print("사원번호: "); // 출력
            int empId = reader.nextInt();
            System.out.print("급: "); // 출력
            int grade = reader.nextInt();
            System.out.print("호: "); // 출력
            int level = reader.nextInt();
            System.out.print("수당: "); // 출력
            int salary = reader.nextInt();

            employees[index++] = new Employee(empId, grade, level, salary);

            System.out.print("입력/출력(I/O)? ");
            isInput = reader.read();
        } while(isInput.equalsIgnoreCase("i"));
    }
}