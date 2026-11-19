package p069k;

import java.util.HashMap;
import p011H.AbstractC0271e0;

/* JADX INFO: renamed from: k.i */
/* JADX INFO: loaded from: classes.dex */
public final class C6428i {

    /* JADX INFO: renamed from: a */
    public String f24578a;

    /* JADX INFO: renamed from: b */
    public Integer f24579b;

    /* JADX INFO: renamed from: c */
    public C6433n f24580c;

    /* JADX INFO: renamed from: d */
    public Long f24581d;

    /* JADX INFO: renamed from: e */
    public Long f24582e;

    /* JADX INFO: renamed from: f */
    public HashMap f24583f;

    /* JADX INFO: renamed from: g */
    public Integer f24584g;

    /* JADX INFO: renamed from: h */
    public String f24585h;

    /* JADX INFO: renamed from: i */
    public byte[] f24586i;

    /* JADX INFO: renamed from: j */
    public byte[] f24587j;

    /* JADX INFO: renamed from: a */
    public final void m12164a(String str, String str2) {
        HashMap map = this.f24583f;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public final C6429j m12165b() {
        String strM414v = this.f24578a == null ? " transportName" : "";
        if (this.f24580c == null) {
            strM414v = strM414v.concat(" encodedPayload");
        }
        if (this.f24581d == null) {
            strM414v = AbstractC0271e0.m414v(strM414v, " eventMillis");
        }
        if (this.f24582e == null) {
            strM414v = AbstractC0271e0.m414v(strM414v, " uptimeMillis");
        }
        if (this.f24583f == null) {
            strM414v = AbstractC0271e0.m414v(strM414v, " autoMetadata");
        }
        if (strM414v.isEmpty()) {
            return new C6429j(this.f24578a, this.f24579b, this.f24580c, this.f24581d.longValue(), this.f24582e.longValue(), this.f24583f, this.f24584g, this.f24585h, this.f24586i, this.f24587j);
        }
        throw new IllegalStateException("Missing required properties:".concat(strM414v));
    }
}
