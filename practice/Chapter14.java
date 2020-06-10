package practice;

import java.util.ArrayList;
import java.util.List;

/* 戦士の会心の一撃！
   ヒットポイント：100
   遊び人は、ただ遊んでいるだけだった！
   ヒットポイント：0 */

public class Chapter14 {
  public static void main(String[] args) {
    List<Character> party = new ArrayList<Character>();
    // プログラムを作成
    // インスタンスをaddメソッドで追加する
    party.add(new Soldier());
    party.add(new Playboy());

    Chapter14.partyAttack(party);
  }

public static void partyAttack(List<Character> party) {
    for (Character character : party) {
        int hp = character.attack();
        System.out.println("ヒットポイント：" + hp);
    }
  }
}