package com.kct.bluetooth_demo;


public class MessageEvent {

    public static final String RECEIVE_DATA = "receive_data";
    public static final String CONNECT_DEVICE = "connect_device";
    public static final String CONNECT_STATE = "connect_state";
    public static final String OTA = "ota";
    public static final String FLASH = "flash";
    public static final String FLASH_DATA = "flash_data";
    public static final String RSP_INFO = "rsp_info";
    public static final String DEVICE_NOTI_INFO = "noti_info";

    private String message;
    private Object object;

    public MessageEvent(String message, Object object) {
        this.message = message;
        this.object = object;
    }

    public MessageEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
