package com.example.firstnetty.netty.protocol.response;

import com.example.firstnetty.netty.protocol.Packet;
import lombok.Data;

import static com.example.firstnetty.netty.protocol.command.Command.LOGIN_RESPONSE;

@Data
public class LoginResponsePacket extends Packet {
    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {
        return LOGIN_RESPONSE;
    }
}
