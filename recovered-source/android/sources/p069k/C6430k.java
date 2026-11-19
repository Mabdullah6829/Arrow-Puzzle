package p069k;

import java.util.Arrays;
import p063h.EnumC6358d;

/* JADX INFO: renamed from: k.k */
/* JADX INFO: loaded from: classes.dex */
public final class C6430k extends AbstractC6437r {

    /* JADX INFO: renamed from: a */
    public final String f24598a;

    /* JADX INFO: renamed from: b */
    public final byte[] f24599b;

    /* JADX INFO: renamed from: c */
    public final EnumC6358d f24600c;

    public C6430k(String str, byte[] bArr, EnumC6358d enumC6358d) {
        this.f24598a = str;
        this.f24599b = bArr;
        this.f24600c = enumC6358d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6437r) {
            AbstractC6437r abstractC6437r = (AbstractC6437r) obj;
            if (this.f24598a.equals(((C6430k) abstractC6437r).f24598a)) {
                if (Arrays.equals(this.f24599b, abstractC6437r instanceof C6430k ? ((C6430k) abstractC6437r).f24599b : ((C6430k) abstractC6437r).f24599b)) {
                    if (this.f24600c.equals(((C6430k) abstractC6437r).f24600c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f24598a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f24599b)) * 1000003) ^ this.f24600c.hashCode();
    }
}
