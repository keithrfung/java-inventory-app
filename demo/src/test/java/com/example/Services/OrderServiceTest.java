package com.example.Services;

import static org.junit.Assert.assertTrue;

import com.example.Services.mocks.MockInventoryService;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class OrderServiceTest {
    @Test
    public void shouldProcessSuccessfully() {
        // Arrange
        InventoryService mockInventory = new MockInventoryService();
        OrderService service = new OrderService(mockInventory);
        // User user = new MockUser()
        // Order order = new MockOrder()

        // Act
        boolean successfulOrder = service.ProcessOrder(); // (order, user)

        // Assert
        assertTrue(successfulOrder);

        // did email send?
        // Why did it fail? Payment failed, inventory failed,
    }

    @Test
    public void shouldProcessUnsuccessfully() {
        // Arrange
        InventoryService mockInventory = new MockInventoryService();
        OrderService service = new OrderService(mockInventory);

        // Act
        boolean successfulOrder = service.ProcessOrder();

        // Assert
        assertFalse(successfulOrder);
    }
}