package sec05.chap06.ex01;

public class Main {
    public static void main(String[] args) {
//        //가능 - 자식 클래스는 부모 클래스에 속함
//        Button button1 = new Button("Enter");
//        Button button2 = new ShutDownButton();
//        Button button3 = new ToggleButton("CapsLock" , true);
//
//
////        // 불가
////        ShutDownButton button4 = new Button("Enter");
////        ToggleButton button5 = new ShutDownButton();
//
//        Button[] buttons = {
//                new Button("Space"),
//                new ToggleButton("NumLock", false),
//                new ShutDownButton()
//        };
//
//        for ( Button button : buttons) {
//            // 모든 Button들은 func 메서드를 가지므로
//            button.func();
//        }



        Button button = new Button("버튼");
        ToggleButton toggleButton = new ToggleButton("토글", true);
        ShutDownButton shutDownButton = new ShutDownButton();

        //  true
        boolean typeCheck1 = button instanceof Button;
        boolean typeCheck2 = toggleButton instanceof Button;
        boolean typeCheck3 = shutDownButton instanceof Button;

        //  false
        boolean typeCheck4 = button instanceof ShutDownButton;
        boolean typeCheck5 = button instanceof ToggleButton;

        //  ⚠️ 컴파일 에러
//        boolean typeCheck6 = toggleButton instanceof ShutDownButton;
//        boolean typeCheck7 = shutDownButton instanceof ToggleButton;


//         `instanceof` 연산자
//        - 뒤에 오는 클래스의 자료형에 속하는(족보상 같거나 아래인) 인스턴스인지 확인
//        - 이후 배울 인터페이스에 대해서도 사용 가능
//        - 상속관계가 아닌 클래스끼리는 컴파일 오류


        Button[] buttons = {
                new Button("Space"),
                new ToggleButton("NumLock", false),
                new ShutDownButton()
        };

        for (Button btn : buttons) {
            if (btn instanceof ShutDownButton) continue; // ⭐️
            btn.func();
        }

                for ( Button buttonn : buttons) {
            // 모든 Button들은 func 메서드를 가지므로
            button.func();
        }


    }
}
