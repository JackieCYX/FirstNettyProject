package com.example.firstnetty.protocol.command;

import com.example.firstnetty.netty.protocol.Packet;
import com.example.firstnetty.netty.protocol.PacketCodeC;
import com.example.firstnetty.netty.protocol.request.LoginRequestPacket;
import com.example.firstnetty.netty.serialize.Serializer;
import com.example.firstnetty.netty.serialize.impl.JSONSerializer;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class PacketCodeCTest {
    @Test
    public void encode() {

        Serializer serializer = new JSONSerializer();
        LoginRequestPacket loginRequestPacket = new LoginRequestPacket();

        loginRequestPacket.setVersion(((byte) 1));
        loginRequestPacket.setUserId(UUID.randomUUID().toString());
        loginRequestPacket.setUsername("zhangsan");
        loginRequestPacket.setPassword("password");

        PacketCodeC packetCodeC = PacketCodeC.INSTANCE;
        ByteBuf byteBuf = packetCodeC.encode(ByteBufAllocator.DEFAULT, loginRequestPacket);
        Packet decodedPacket = packetCodeC.decode(byteBuf);

        Assert.assertArrayEquals(serializer.serialize(loginRequestPacket), serializer.serialize(decodedPacket));

    }
}
