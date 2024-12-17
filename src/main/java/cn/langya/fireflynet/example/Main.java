package cn.langya.fireflynet.example;

import cn.langya.fireflynet.api.Packet;
import cn.langya.fireflynet.client.ClientHandler;
import cn.langya.fireflynet.client.ClientMain;
import cn.langya.fireflynet.example.packets.ServerMessagePacket;

import java.io.IOException;

/**
 * @author LangYa
 * @since 2024/12/18 01:55
 */
public class Main {
    public static ClientMain clientMain;
    public static void main(String[] args) throws IOException {
        String host = "localhost";
        int port = 11451;
        // host 和 port 根据实际需求替换
        clientMain = new ClientMain(host, port, new ClientHandler() {
            @Override
            public void onConnected() throws IOException {
                System.out.println("连接成功");
            }

            @Override
            public void onDisconnected() throws IOException {
                System.out.println("已断开连接");
            }

            @Override
            public void onPacketRev(Packet packet) throws IOException {
                if (packet.getId() == 1) new ServerMessagePacket(packet);
                // 其他包代码实现
            }
        });
    }
}
