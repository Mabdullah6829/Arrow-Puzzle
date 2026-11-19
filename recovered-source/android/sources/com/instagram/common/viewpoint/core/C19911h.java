package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1h */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C19911h extends AbstractC2509AQ {
    public int A00;
    public Uri A01;
    public DatagramSocket A02;
    public InetAddress A03;
    public MulticastSocket A04;
    public boolean A05;
    public final int A06;
    public final DatagramPacket A07;
    public final byte[] A08;

    public C19911h() {
        this(AdError.SERVER_ERROR_CODE);
    }

    public C19911h(int i2) {
        this(i2, 8000);
    }

    public C19911h(int i2, int i3) {
        super(true);
        this.A06 = i3;
        this.A08 = new byte[i2];
        this.A07 = new DatagramPacket(this.A08, 0, i2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final Uri A9P() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final long AGi(C22355i c22355i) throws C4986p1 {
        this.A01 = c22355i.A06;
        String str = (String) AbstractC21273y.A01(this.A01.getHost());
        int port = this.A01.getPort();
        A0G(c22355i);
        try {
            this.A03 = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.A03, port);
            if (this.A03.isMulticastAddress()) {
                this.A04 = new MulticastSocket(inetSocketAddress);
                this.A04.joinGroup(this.A03);
                this.A02 = this.A04;
            } else {
                this.A02 = new DatagramSocket(inetSocketAddress);
            }
            this.A02.setSoTimeout(this.A06);
            this.A05 = true;
            A0H(c22355i);
            return -1L;
        } catch (IOException e) {
            throw new C4986p1(e, AdError.INTERNAL_ERROR_CODE);
        } catch (SecurityException e2) {
            throw new C4986p1(e2, AdError.INTERNAL_ERROR_2006);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final void close() {
        this.A01 = null;
        if (this.A04 != null) {
            try {
                this.A04.leaveGroup((InetAddress) AbstractC21273y.A01(this.A03));
            } catch (IOException unused) {
            }
            this.A04 = null;
        }
        if (this.A02 != null) {
            this.A02.close();
            this.A02 = null;
        }
        this.A03 = null;
        this.A00 = 0;
        if (this.A05) {
            this.A05 = false;
            A0E();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC20482c
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            try {
                ((DatagramSocket) AbstractC21273y.A01(this.A02)).receive(this.A07);
                this.A00 = this.A07.getLength();
                A0F(this.A00);
            } catch (SocketTimeoutException e) {
                throw new C4986p1(e, AdError.CACHE_ERROR_CODE);
            } catch (IOException e2) {
                throw new C4986p1(e2, AdError.INTERNAL_ERROR_CODE);
            }
        }
        int length = this.A07.getLength() - this.A00;
        int packetOffset = this.A00;
        int bytesToRead = Math.min(packetOffset, i3);
        System.arraycopy(this.A08, length, bArr, i2, bytesToRead);
        int packetOffset2 = this.A00;
        this.A00 = packetOffset2 - bytesToRead;
        return bytesToRead;
    }
}
