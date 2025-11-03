package com.splitwise.splitwise.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "EM_AUDIT_LOG")
public class EmAuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EM_AUDIT_LOG_PK_ID")
    private int emAuditLogPkId;

    @Column(name = "EM_USER_FK_ID")
    private int emUserFkId;  // which user performed the action

    @Column(name = "EM_ACTION_TYPE")
    private String emActionType;  // e.g., "CREATE", "UPDATE", "DELETE", "LOGIN"

    @Column(name = "EM_ACTION_DESCRIPTION")
    private String emActionDescription;  // details about the action

    @Column(name = "EM_ACTION_TIMESTAMP")
    private LocalDateTime emActionTimestamp = LocalDateTime.now(); // auto timestamp

    // ===== Getters & Setters =====
    public int getEmAuditPkId() {
        return emAuditLogPkId;
    }

    public void setEmAuditPkId(int emAuditPkId) {
        this.emAuditLogPkId = emAuditPkId;
    }

    public int getEmUserFkId() {
        return emUserFkId;
    }

    public void setEmUserFkId(int emUserFkId) {
        this.emUserFkId = emUserFkId;
    }

    public String getEmActionType() {
        return emActionType;
    }

    public void setEmActionType(String emActionType) {
        this.emActionType = emActionType;
    }

    public String getEmActionDescription() {
        return emActionDescription;
    }

    public void setEmActionDescription(String emActionDescription) {
        this.emActionDescription = emActionDescription;
    }

    public LocalDateTime getEmActionTimestamp() {
        return emActionTimestamp;
    }

    public void setEmActionTimestamp(LocalDateTime emActionTimestamp) {
        this.emActionTimestamp = emActionTimestamp;
    }
}
