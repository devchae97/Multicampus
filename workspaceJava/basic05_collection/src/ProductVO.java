
public class ProductVO<T> { // T는 변수명과 같이 제너릭의 이름, 일치하지 않아도되나 암묵적 규칙
	// <T> type <E> Elements <K> Key <V> Value <N> Number

	private T productName;
	
	public ProductVO() {
		
	}

	public T getProductName() {
		return productName;
	}

	public void setProductName(T productName) {
		this.productName = productName;
	}
	
}
