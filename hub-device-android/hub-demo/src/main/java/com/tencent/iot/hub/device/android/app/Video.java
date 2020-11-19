package com.tencent.iot.hub.device.android.app;

public class Video {
    public String timestamp,type,video_type,operation,taskid;

    public Video(String timestamp, String type, String video_type, String operation, String taskid) {
        this.timestamp = timestamp;
        this.type = type;
        this.video_type = video_type;
        this.operation = operation;
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

    public String getVideo_type() {
        return video_type;
    }

    public void setVideo_type(String video_type) {
        this.video_type = video_type;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }
}
