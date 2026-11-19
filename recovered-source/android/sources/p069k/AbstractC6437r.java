package p069k;

import android.util.Base64;
import p011H.AbstractC0271e0;
import p063h.EnumC6358d;

/* JADX INFO: renamed from: k.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6437r {
    /* JADX INFO: renamed from: a */
    public final C6430k m12169a(EnumC6358d enumC6358d) {
        C6430k c6430k = (C6430k) this;
        String str = c6430k.f24598a;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        if (enumC6358d != null) {
            return new C6430k(str, c6430k.f24599b, enumC6358d);
        }
        throw new NullPointerException("Null priority");
    }

    public final String toString() {
        C6430k c6430k = (C6430k) this;
        byte[] bArr = c6430k.f24599b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(c6430k.f24598a);
        sb.append(", ");
        sb.append(c6430k.f24600c);
        sb.append(", ");
        return AbstractC0271e0.m403k(sb, strEncodeToString, ")");
    }
}
