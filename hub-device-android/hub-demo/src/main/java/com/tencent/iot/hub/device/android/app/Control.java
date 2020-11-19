package com.tencent.iot.hub.device.android.app;

public class Control {
    public String timestamp,type,speed,acceleration,wheel_angle;

    public Control(String timestamp, String type, String speed, String acceleration, String wheel_angle) {
        this.timestamp = timestamp;
        this.type = type;
        this.speed = speed;
        this.acceleration = acceleration;
        this.wheel_angle = wheel_angle;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(String acceleration) {
        this.acceleration = acceleration;
    }

    public String getWheel_angle() {
        return wheel_angle;
    }

    public void setWheel_angle(String wheel_angle) {
        this.wheel_angle = wheel_angle;
    }
}
