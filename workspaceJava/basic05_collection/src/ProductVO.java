
public class ProductVO<T> { // T�� ������� ���� ���ʸ��� �̸�, ��ġ���� �ʾƵ��ǳ� �Ϲ��� ��Ģ
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
