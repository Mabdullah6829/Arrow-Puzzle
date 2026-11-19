package p038V;

import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p001B.C0086l;

/* JADX INFO: renamed from: V.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0853g extends C0857k {

    /* JADX INFO: renamed from: e */
    public final C0086l f2351e;

    /* JADX INFO: renamed from: f */
    public final C0086l f2352f;

    /* JADX INFO: renamed from: g */
    public final C0086l f2353g;

    /* JADX INFO: renamed from: h */
    public final C0086l f2354h;

    /* JADX INFO: renamed from: i */
    public final int f2355i;

    public C0853g(C0086l c0086l, C0086l c0086l2, C0086l c0086l3, C0086l c0086l4, Provider provider, int i2) {
        super(provider);
        this.f2351e = c0086l;
        this.f2352f = c0086l2;
        this.f2353g = c0086l3;
        this.f2354h = c0086l4;
        this.f2355i = i2;
    }

    @Override // p038V.C0857k
    /* JADX INFO: renamed from: c */
    public final void mo1766c(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.f2351e.m155i(sSLSocket, Boolean.TRUE);
            this.f2352f.m155i(sSLSocket, str);
        }
        Class<?> cls = sSLSocket.getClass();
        C0086l c0086l = this.f2354h;
        if (c0086l.m153f(cls) != null) {
            c0086l.m156j(sSLSocket, C0857k.m1770b(list));
        }
    }

    @Override // p038V.C0857k
    /* JADX INFO: renamed from: d */
    public final String mo1767d(SSLSocket sSLSocket) {
        byte[] bArr;
        Class<?> cls = sSLSocket.getClass();
        C0086l c0086l = this.f2353g;
        if (c0086l.m153f(cls) == null || (bArr = (byte[]) c0086l.m156j(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, AbstractC0860n.f2384b);
    }

    @Override // p038V.C0857k
    /* JADX INFO: renamed from: e */
    public final int mo1768e() {
        return this.f2355i;
    }
}
