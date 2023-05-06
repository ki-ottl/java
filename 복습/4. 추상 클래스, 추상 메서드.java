
abstract class Player { // 추상 클래스(미완성 클래스, 미완성 설계도)
	abstract void play(int pos); // 추상 메서드(미완성 메서드)
	abstract void stop(); // 추상 메서드(선언부만 있고, 구현부{}가 없는 메서드
		
	}

// 추상 클래스는 상속을 통해 완성해야 객체 생성 가능
class AudioPlayer extends Player { // 완성된 설계도
	void play(int pos) {System.out.println(pos+"위치부터 play합니다.");}
	void stop() {System.out.println("재생을 멈춥니다.");}
}

public class Ex {
	public static void main(String[] args) {
//		Player p = new Player(); // 추상 클래스의 객체를 생성 시 에러 발생(미완성 설계도이기 때문)
//		AudioPlayer ap = new AudioPlayer();
		Player ap = new AudioPlayer(); // 다형성. 실제 가리키는 객체는 AudioPlayer.
		ap.play(100);
		ap.stop();
	}
}
