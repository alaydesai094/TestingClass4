import static org.junit.Assert.*;

import org.junit.Test;

public class ShoppingCartTest {
	// Test case 1 : Creating a new cart has 0 items
	
	@Test
	public void testCreateNewCart() {
		// create a cart
		ShoppingCart cart = new ShoppingCart();
		
		//check how many items are in it
		int numItems = cart.getItemCount();
		
		// compare your result
		assertEquals(0,numItems);
		
		
		
	}

	
	// Empty cart has 0 items
	@Test
	public void testEmptyCart() {
		// create a cart
		ShoppingCart cart = new ShoppingCart();
		
		//Empty the cart
		cart.empty();
		
		//check how many items are in it
		int numItems = cart.getItemCount();
		
		// compare your result
		assertEquals(0,numItems);
		
		
		
	}
	
	
	// Empty cart has 0 items
		@Test
		public void testAddCart() {
			// create a cart
			ShoppingCart cart = new ShoppingCart();
			
			//Empty the cart
			cart.empty();
			
			//add to the Cart\
			cart.addItem(new Product ("Samsung", 1000));
			
			//check how many items are in it
			int numItems = cart.getItemCount();
			
			// compare your result
			assertEquals(1,numItems);
			
			
			
		}
}
