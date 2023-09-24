package com.example.firstnetty.netty.protocol.request;

import com.example.firstnetty.netty.protocol.Packet;
import lombok.Data;

import static com.example.firstnetty.netty.protocol.command.Command.LOGIN_REQUEST;

@Data
public class LoginRequestPacket extends Packet {
    private String userId;

    private String username;

    private String password;

    @Override
    public Byte getCommand() {
        return LOGIN_REQUEST;
    }
}
