package com.example.firstnetty.netty.protocol.request;

import com.example.firstnetty.netty.protocol.Packet;
import lombok.Data;

import static com.example.firstnetty.netty.protocol.command.Command.MESSAGE_REQUEST;

@Data
public class MessageRequestPacket extends Packet {

    private String message;
    @Override
    public Byte getCommand() {
        return MESSAGE_REQUEST;
    }
}
