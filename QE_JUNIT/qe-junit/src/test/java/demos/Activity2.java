package demos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Activity2 {

    @Test
    void notEnoughFunds() {
        // Create an object for BankAccount class with balance 9
        BankAccount account = new BankAccount(9);

        // Assertion for exception: expecting withdrawal of 10 to fail
        assertThrows(NotEnoughFundsException.class, () -> account.withdraw(10));
    }

    @Test
    void enoughFunds() {
        // Create an object for BankAccount class with balance 100
        BankAccount account = new BankAccount(100);

        // Assertion for no exceptions: expecting withdrawal of 100 to succeed
        assertDoesNotThrow(() -> account.withdraw(100));
    }
}