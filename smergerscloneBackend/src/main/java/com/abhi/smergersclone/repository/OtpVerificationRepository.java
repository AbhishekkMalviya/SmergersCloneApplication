package com.abhi.smergersclone.repository;

import com.abhi.smergersclone.entity.OtpVerification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OtpVerificationRepository extends JpaRepository<OtpVerification,Long> {

    Optional<OtpVerification> findTopByEmailOrderByIdDesc(String email);
}
