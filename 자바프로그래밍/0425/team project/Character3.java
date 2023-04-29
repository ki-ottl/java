import java.util.Random;

public class Character3 extends Base {

	Character3(String name) { // 아르마딜로
      this.name = name;
      this.hp = 180;
      this.power = 30;
   }

	@Override
	public void underAttack(int attack) {
		Random r = new Random();
		int inputNum = r.nextInt(3) + 1;

		int attackResult = attack;

		if (inputNum == 1) {

			System.out.println();
			System.out.println("┌─────────┐");
			System.out.println("│　　　　　│");
			System.out.println("└∩───∩────┘");
			System.out.println("(`･ω･´)");
			System.out.println();
			System.out.println(this.name + "(이)가 방패를 사용하여 공격을 회피했다!");
			attackResult = attack - 10;
			
		} else if (inputNum == 2) {
			System.out.println();
			System.out.println("╭◜◝ ͡ ◜◝ ╮");
			System.out.println("(Ꮚ´꒳`Ꮚ");
			System.out.println("└╰ ͜ ◟◞╯");
			System.out.println();
			System.out.println(this.name + "(이)가 둥글게 몸을 말아 공격을 회피했다!");
			attackResult = attack - 20;
		} else if (inputNum == 3) {
			System.out.println();
			System.out.println(".　∧∧");
			System.out.println(" ( *'ω'*)");
			System.out.println("  (　　)");
			System.out.println("　ｖｖ");
			System.out.println();
			System.out.println("　  川　　폴-짝");
			System.out.println("  ((　))");
			System.out.println();
			System.out.println(this.name + "(이)가 폴짝 뛰어 공격을 회피했다!");
			attackResult = attack - 30;
		}

      System.out.println(this.name+"(이)가 "+attack+"만큼 공격을 받았지만, 방어에 성공하여 "+attackResult+"만큼 데미지를 받았다" );
      this.hp = this.hp - attackResult;
   }

	@Override
	public int Attack() {
		Random r = new Random();
		int inputNum = r.nextInt(3) + 1;

		if (inputNum == 1) {

			this.power = 10;
			System.out.println();
			System.out.println(this.name + "(이)가 '굴러가며 박치기'를 시전했다!");
			System.out.println();
			System.out.println("　　　빙");
			System.out.println("　　　글");
			System.out.println("　　　☝ ╭☞빙그르");
			System.out.println("　　　╰(•́⍛•̀) ╮");
			System.out.println(" 빙그르☜╯  ☟");
			System.out.println("　　　　　　빙");
			System.out.println("　　　　　　글");
			System.out.println();
			System.out.println(this.name + "(이)가 '굴러가며 박치기'로 " + this.power + " 데미지로 공격했습니다.");

		} else if (inputNum == 2) {
         this.power = 20;
			System.out.println();
			System.out.println(this.name + "(이)가 '꼬리 휘두르기'를 시전했다!");
			System.out.println();
			System.out.println("　　 　 ∧＿∧");
			System.out.println("　　　　(´∀｀)");
			System.out.println("　　 　/　　　ヽ");
			System.out.println("　　   / 人　　＼＼ 彡");
			System.out.println("　     ⊂ノ　)　　 ヽ⊃");
			System.out.println("　　　　  /　人　(");
			System.out.println("　　　    (＿ノ (＿_)");
			System.out.println();
			System.out.println(this.name + "(이)가 '꼬리 휘두르기'로 " + this.power + " 데미지로 공격했습니다.");
      } else if (inputNum == 3) {
         this.power = 30;
			System.out.println();
			System.out.println(this.name + "(이)가 '돌주먹 날리기'를 시전했다!");
			System.out.println();
			System.out.println("∧＿∧");
			System.out.println("(　･ω･)＝つ≡つ");
			System.out.println("(っ　≡つ＝つ");
			System.out.println("./　　　) 바바바바");
			System.out.println("( /￣∪");
			System.out.println();
			System.out.println(this.name + "(이)가 '돌주먹 날리기'로 " + this.power + " 데미지로 공격했습니다.");
      }
    
      return power;
   }
}