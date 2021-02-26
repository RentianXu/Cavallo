package com.ac.uk.student.teamwork.info;

/**
* @description: Feedback to the front end
* @author: rentian
* @date: 2021-2-23
* @version: 1.0
*/
public class ResultInfo<T> {
    //Feedback to the front end
    private String msg;
    //Request status information
    private Boolean success = false;
    //Returns the detailed data
    private T detail = null;

    @Override
    public String toString() {
        return "ResultInfo{" +
                "msg='" + msg + '\'' +
                ", success=" + success +
                ", detail=" + detail +
                '}';
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public T getDetail() {
        return detail;
    }

    public void setDetail(T detail) {
        this.detail = detail;
    }
}
