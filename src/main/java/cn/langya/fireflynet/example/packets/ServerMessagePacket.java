package cn.langya.fireflynet.example.packets;

import cn.langya.fireflynet.api.Packet;

/**
 * @author LangYa
 * @since 2024/12/18 02:14
 */
public class ServerMessagePacket extends Packet {
    public ServerMessagePacket(Packet packet) {
        super(1, packet.getData());
        this.packet = packet;
        this.run();
    }

    private final Packet packet;

    public void run() {
        System.out.println("有新消息:" + packet.getDataWithString());
    }
}
