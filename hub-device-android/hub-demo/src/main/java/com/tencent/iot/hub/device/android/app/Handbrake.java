package com.tencent.iot.hub.device.android.app;

public class Handbrake {
    private String timestamp,type,status,taskid;

    public Handbrake(String timestamp, String type, String status, String taskid) {
        this.timestamp = timestamp;
        this.type = type;
        this.status = status;
        this.taskid = taskid;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }
}
