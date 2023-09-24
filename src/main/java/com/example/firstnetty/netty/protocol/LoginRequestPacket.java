package com.example.firstnetty.netty.protocol;

import lombok.Data;

import static com.example.firstnetty.netty.protocol.Comand.LOGIN_REQUEST;

@Data
public class LoginRequestPacket extends Packet{
    private Integer userId;

    private String username;

    private String password;

    @Override
    public Byte getCommand() {
        return LOGIN_REQUEST;
    }
}
