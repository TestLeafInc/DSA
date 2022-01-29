package day11;

public class LearnLambda {
	
	@FunctionalInterface
	interface Shopping{
		public boolean makePayment();
	}
	
	@FunctionalInterface
	interface Cancel{
		public void cancelOrder(int orderNum);
	}

	
	
	public static void main(String[] args) {
		
		Shopping shop = () -> {
			return true;
		};
		
		Cancel cancelOrder = (orderNumber) -> {
			
		};
		System.out.println(shop.makePayment());
	}
	
}
