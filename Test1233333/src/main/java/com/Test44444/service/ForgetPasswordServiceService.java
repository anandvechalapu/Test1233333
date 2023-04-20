package com.Test44444.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Test44444.model.ForgetPasswordService;
import com.Test44444.repository.ForgetPasswordServiceRepository;

@Service
public class ForgetPasswordServiceService {

    @Autowired
    private ForgetPasswordServiceRepository forgetPasswordServiceRepository;

    public ForgetPasswordService findByUsername(String username) {
        return forgetPasswordServiceRepository.findByUsername(username);
    }

    public ForgetPasswordService findByOtp(String otp) {
        return forgetPasswordServiceRepository.findByOtp(otp);
    }

    public void updatePassword(String password, String username) {
        forgetPasswordServiceRepository.updatePassword(password, username);
    }
}