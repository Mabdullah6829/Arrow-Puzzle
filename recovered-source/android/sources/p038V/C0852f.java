package p038V;

import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: V.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0852f implements PrivilegedExceptionAction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2350a;

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() {
        switch (this.f2350a) {
            case 0:
                return SSLEngine.class.getMethod("getApplicationProtocol", null);
            case 1:
                return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            default:
                return SSLSocket.class.getMethod("getApplicationProtocol", null);
        }
    }
}
