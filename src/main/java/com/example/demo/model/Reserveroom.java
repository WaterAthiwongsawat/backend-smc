package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reserveroom")
public class Reserveroom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer reserveroomId;
    private Integer roomId;
    private String userId;
    private String reserveDate;
    private String reserveTime;

    public Reserveroom() {
        // คอนสตรักเตอร์ว่างเพื่อให้ JPA ทำงานได้ถูกต้อง
    }

    public Reserveroom(Integer reserveroomId, Integer roomId, String userId) {
        this.reserveroomId = reserveroomId;
        this.roomId = roomId;
        this.userId = userId;
    }

    // เมทอด getter และ setter สำหรับคอลัมน์
    public Integer getReserveroomId() {
        return reserveroomId;
    }

    public void setReserveroomId(Integer reserveroomId) {
        this.reserveroomId = reserveroomId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getReserveDate() {
        return reserveDate;
    }

    public void setReserveDate(String reserveDate) {
        this.reserveDate = reserveDate;
    }

    public String getReserveTime() {
        return reserveTime;
    }

    public void setReserveTime(String reserveTime) {
        this.reserveTime = reserveTime;
    }
}
