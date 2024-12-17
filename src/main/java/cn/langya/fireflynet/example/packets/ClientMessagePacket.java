package cn.langya.fireflynet.example.packets;

import cn.langya.fireflynet.api.Packet;

/**
 * @author LangYa
 * @since 2024/12/18 02:14
 */
public class ClientMessagePacket extends Packet {
    public ClientMessagePacket(byte[] data) {
        super(2, data);
        this.run();
    }

    public void run() {
        System.out.println("有新客户端消息:" + new String(data));
    }
}
