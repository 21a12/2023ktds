package store;

/**
 * 실행 클래스
 * 
 * @author User
 *
 */
public class Main {
	Store store = new Store();

	public static void main(String[] args) {

		Main main = new Main();

		// 편의점 변수(인스턴스 | 객체)
		main.store.addProducts();
		main.store.checkQuantity();

	}
}
