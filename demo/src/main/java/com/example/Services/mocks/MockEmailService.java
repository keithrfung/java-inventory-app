package com.example.Services.mocks;

import com.example.Services.EmailService;

public class MockEmailService implements EmailService {
    boolean success;

    public MockEmailService(boolean success) {
        this.success = success;
    }

    @Override
    public boolean SendEmail(String email) {
        return this.success;
    }

}
