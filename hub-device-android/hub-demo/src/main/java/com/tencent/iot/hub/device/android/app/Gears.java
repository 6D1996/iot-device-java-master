package com.tencent.iot.hub.device.android.app;

public class Gears {
    public String timestamp,type,gear,taskid;

    public Gears(String timestamp, String type, String gear, String taskid) {
        this.timestamp = timestamp;
        this.type = type;
        this.gear = gear;
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

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }
}
