package com.splitwise.splitwise.entities;

import jakarta.persistence.*;

@Entity
@Table (name="to_do_table")
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="TO_DO_PK_ID")
    private Integer toDoPkId;

    @Column(name="TO_DO_TITLE")
    private String toDoTitle;

    @Column(name="TO_DO_DES")
    private String toDoDes;

    @Column(name="IS_COMPLETED")
    private boolean isCompleted;

    @Column(name="CREATED_DATE_TIME")
    private String createdDateTime;

    public Integer getToDoPkId() {
        return toDoPkId;
    }

    public void setToDoPkId(Integer toDoPkId) {
        this.toDoPkId = toDoPkId;
    }

    public String getToDoTitle() {
        return toDoTitle;
    }

    public void setToDoTitle(String toDoTitle) {
        this.toDoTitle = toDoTitle;
    }

    public String getToDoDes() {
        return toDoDes;
    }

    public void setToDoDes(String toDoDes) {
        this.toDoDes = toDoDes;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public String getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }
}
