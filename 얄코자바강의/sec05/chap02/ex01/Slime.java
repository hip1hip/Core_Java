package sec05.chap02.ex01;

public class Slime {
    double hp = 50;
    int attack = 8;
    double defencse = 0.2;

    void attack (Slime enemy){  // 다른 슬라임을 인자로 받음
        enemy.hp -= attack * (1 - enemy.defencse);
    }
}
