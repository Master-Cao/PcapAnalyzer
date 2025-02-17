package com.jingdai.pcapanalyzer.entity.format;

/**
 * Frame Header(Ethernet Header)
 */

public class FrameHeader {

    public static final int PROTOCOL_IP = 2048;

    private int protocol;

    public int getProtocol() {
        return protocol;
    }

    public void setProtocol(int protocol) {
        this.protocol = protocol;
    }

    public FrameHeader() {}
}
