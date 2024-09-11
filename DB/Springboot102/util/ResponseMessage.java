package com.example.Springboot102.util;

public enum ResponseMessage {
    SUCCESS("성공했습ㄴ디ㅏ"),
    CREATE("만들어졌습니다"),
    BAD_REQUEST("잘 못 보냈습니다"),
    UNAUTHORIZED("ㄴㄱ"),
    NOT_FOUND("없습ㄴ디ㅏ"),
    SERVER_ERROR("망했다");



    private String code;

    ResponseMessage(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }



}
