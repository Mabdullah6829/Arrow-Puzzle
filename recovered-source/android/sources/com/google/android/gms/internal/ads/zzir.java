package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzir extends zzhj {

    /* JADX INFO: renamed from: e */
    public final byte[] f20025e;

    /* JADX INFO: renamed from: f */
    public final DatagramPacket f20026f;

    /* JADX INFO: renamed from: g */
    public Uri f20027g;

    /* JADX INFO: renamed from: h */
    public DatagramSocket f20028h;

    /* JADX INFO: renamed from: i */
    public MulticastSocket f20029i;

    /* JADX INFO: renamed from: j */
    public InetAddress f20030j;

    /* JADX INFO: renamed from: k */
    public boolean f20031k;

    /* JADX INFO: renamed from: l */
    public int f20032l;

    public zzir() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    /* JADX INFO: renamed from: b */
    public final int mo4082b(byte[] bArr, int i2, int i3) throws zziq {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.f20032l;
        DatagramPacket datagramPacket = this.f20026f;
        if (i4 == 0) {
            try {
                DatagramSocket datagramSocket = this.f20028h;
                if (datagramSocket == null) {
                    throw null;
                }
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f20032l = length;
                m7470i(length);
            } catch (SocketTimeoutException e) {
                throw new zziq(e, AdError.CACHE_ERROR_CODE);
            } catch (IOException e2) {
                throw new zziq(e2, AdError.INTERNAL_ERROR_CODE);
            }
        }
        int length2 = datagramPacket.getLength();
        int i5 = this.f20032l;
        int iMin = Math.min(i5, i3);
        System.arraycopy(this.f20025e, length2 - i5, bArr, i2, iMin);
        this.f20032l -= iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: c */
    public final long mo5494c(zzhv zzhvVar) throws zziq {
        Uri uri = zzhvVar.f19195a;
        this.f20027g = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f20027g.getPort();
        m7468f(zzhvVar);
        try {
            this.f20030j = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f20030j, port);
            if (this.f20030j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f20029i = multicastSocket;
                multicastSocket.joinGroup(this.f20030j);
                this.f20028h = this.f20029i;
            } else {
                this.f20028h = new DatagramSocket(inetSocketAddress);
            }
            this.f20028h.setSoTimeout(8000);
            this.f20031k = true;
            m7469h(zzhvVar);
            return -1L;
        } catch (IOException e) {
            throw new zziq(e, AdError.INTERNAL_ERROR_CODE);
        } catch (SecurityException e2) {
            throw new zziq(e2, AdError.INTERNAL_ERROR_2006);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: d */
    public final void mo5495d() {
        this.f20027g = null;
        MulticastSocket multicastSocket = this.f20029i;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f20030j;
                if (inetAddress == null) {
                    throw null;
                }
                multicastSocket.leaveGroup(inetAddress);
                this.f20029i = null;
            } catch (IOException unused) {
            }
        }
        DatagramSocket datagramSocket = this.f20028h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f20028h = null;
        }
        this.f20030j = null;
        this.f20032l = 0;
        if (this.f20031k) {
            this.f20031k = false;
            m7471k();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        return this.f20027g;
    }

    public zzir(int i2) {
        super(true);
        byte[] bArr = new byte[AdError.SERVER_ERROR_CODE];
        this.f20025e = bArr;
        this.f20026f = new DatagramPacket(bArr, 0, AdError.SERVER_ERROR_CODE);
    }
}
