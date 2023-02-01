package store;

/**
 * 편의점
 * 
 * @author User
 *
 */
public class Store {

	/**
	 * 멤버변수(인스턴스 필드) 선언
	 */

	/**
	 * 물
	 */
	Product water = new Product();
	/**
	 * 과자
	 */
	Product snack = new Product();
	/**
	 * 음료
	 */
	Product drink = new Product();

	/**
	 * 재고 확인 재고를 확인해서 개수를 출력
	 */
	
	/**
	 * 제품 입고
	 */
	public void addProducts() {
		drink.name = "콜라";
		drink.quantity= 10;
		
		snack.name = "홈런볼";
		snack.quantity = 0;
		
		water.name = "삼다수";
		water.quantity = 1;
	}
	
	
	
	
	
	public void checkQuantity() {

		// 재고가 2개 이상일 경우 : "물건 이름" 제품은 재고가 00개 있습니다.
		// 재고가 0개 인 경우 : "물건 이름" 제품은 품절 되었습니다.
		// 재고가 1개 인 경우 : "물건 이름" 제품은 재고가 1개 있습니다. 재주문이 필요합니다.

		// 물건 이름
		String productName = water.name;
		// 재고
		int productQuantity = water.quantity;

		boolean outOfStock = productQuantity == 0;
		boolean needOrder = productQuantity == 1;

		if (outOfStock) {
			System.out.printf("%s 제품은 품절되었습니다.\n", productName);
		} else if (needOrder) {
			System.out.printf("%s 제품은 재고가 %d개 있습니다. 재주문이 필요합니다.\n", productName, productQuantity);
		} else {
			System.out.printf("%s 제품은 재고가 %d개 있습니다.\n", productName, productQuantity);
		}

		// 물건 이름
		productName = snack.name;
		// 재고
		productQuantity = snack.quantity;

		outOfStock = productQuantity == 0;
		needOrder = productQuantity == 1;

		if (outOfStock) {
			System.out.printf("%s 제품은 품절되었습니다.\n", productName);
		} else if (needOrder) {
			System.out.printf("%s 제품은 재고가 %d개 있습니다. 재주문이 필요합니다.\n", productName, productQuantity);
		} else {
			System.out.printf("%s 제품은 재고가 %d개 있습니다.\n", productName, productQuantity);
		}
		
		
		// 물건 이름
		productName = drink.name;
		// 재고
		productQuantity = drink.quantity;

		outOfStock = productQuantity == 0;
		needOrder = productQuantity == 1;

		if (outOfStock) {
			System.out.printf("%s 제품은 품절되었습니다.\n", productName);
		} else if (needOrder) {
			System.out.printf("%s 제품은 재고가 %d개 있습니다. 재주문이 필요합니다.\n", productName, productQuantity);
		} else {
			System.out.printf("%s 제품은 재고가 %d개 있습니다.\n", productName, productQuantity);
		}

	}
}
