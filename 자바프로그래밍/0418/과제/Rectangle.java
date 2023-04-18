public class Rectangle extends Triangle { // 삼각형을 상속받으면 메모리
	Rectangle() {
		this.name = "사각형";
	}
	
	@Override // calcSize라는 부분을 재정의했다. override했다.
	public void calcSize() {
		this.size = this.width * this.height;
	}
}
