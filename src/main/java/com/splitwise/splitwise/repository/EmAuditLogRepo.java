package com.splitwise.splitwise.repository;

import com.splitwise.splitwise.entities.EmAuditLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmAuditLogRepo extends JpaRepository<EmAuditLog,Integer> {
    EmAuditLog findByEmAuditLogPkId(int id);

    void deleteByEmAuditLogPkId(int id);
}
