package com.splitwise.splitwise.entities;

import jakarta.persistence.*;
import jakarta.websocket.Decoder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Entity
@Table(name = "t_user_acess_request")
public class UserAcessRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UAR_PK_ID")
    private UUID uarPkId;

    @Column(name = "UAR_DESC")
    private String uarDesc;

    @Column(name = "UAR_WORKFLOW_ID")
    private UUID uarWorkflowId;

    public UUID getUarPkId() {
        return uarPkId;
    }

    public void setUarPkId(UUID uarPkId) {
        this.uarPkId = uarPkId;
    }

    public String getUarDesc() {
        return uarDesc;
    }

    public void setUarDesc(String uarDesc) {
        this.uarDesc = uarDesc;
    }

    public UUID getUarWorkflowId() {
        return uarWorkflowId;
    }

    public void setUarWorkflowId(UUID uarWorkflowId) {
        this.uarWorkflowId = uarWorkflowId;
    }
}
