package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
final class zzcjr extends SSLSocketFactory {

    /* JADX INFO: renamed from: a */
    public final SSLSocketFactory f10257a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzcjs f10258b;

    public zzcjr(zzcjs zzcjsVar) {
        this.f10258b = zzcjsVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m5519a(Socket socket) throws SocketException {
        zzcjs zzcjsVar = this.f10258b;
        int i2 = zzcjsVar.f10274r;
        if (i2 > 0) {
            socket.setReceiveBufferSize(i2);
        }
        zzcjsVar.f10275s.add(socket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2) throws IOException {
        Socket socketCreateSocket = this.f10257a.createSocket(str, i2);
        m5519a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f10257a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f10257a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) throws IOException {
        Socket socketCreateSocket = this.f10257a.createSocket(str, i2, inetAddress, i3);
        m5519a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2) throws IOException {
        Socket socketCreateSocket = this.f10257a.createSocket(inetAddress, i2);
        m5519a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) throws IOException {
        Socket socketCreateSocket = this.f10257a.createSocket(inetAddress, i2, inetAddress2, i3);
        m5519a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i2, boolean z) throws IOException {
        Socket socketCreateSocket = this.f10257a.createSocket(socket, str, i2, z);
        m5519a(socketCreateSocket);
        return socketCreateSocket;
    }
}
