package com.Test44444.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Test44444.model.ForgetPasswordService;

public interface ForgetPasswordServiceRepository extends JpaRepository<ForgetPasswordService, Long> {

    @Query("SELECT u FROM ForgetPasswordService u WHERE u.username= :username")
    ForgetPasswordService findByUsername(@Param("username") String username);

    @Query("SELECT u FROM ForgetPasswordService u WHERE u.otp= :otp")
    ForgetPasswordService findByOtp(@Param("otp") String otp);

    @Query("UPDATE ForgetPasswordService u SET u.password = :password WHERE u.username= :username")
    void updatePassword(@Param("password") String password, @Param("username") String username);
}