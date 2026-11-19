package p030R;

import java.util.concurrent.atomic.AtomicLong;
import p001B.AbstractC0076b;

/* JADX INFO: renamed from: R.K */
/* JADX INFO: loaded from: classes.dex */
public final class C0529K {

    /* JADX INFO: renamed from: d */
    public static final AtomicLong f1123d = new AtomicLong();

    /* JADX INFO: renamed from: a */
    public final String f1124a;

    /* JADX INFO: renamed from: b */
    public final String f1125b;

    /* JADX INFO: renamed from: c */
    public final long f1126c;

    public C0529K(String str, String str2, long j2) {
        AbstractC0076b.m133h(str, "typeName");
        AbstractC0076b.m131f(!str.isEmpty(), "empty type");
        this.f1124a = str;
        this.f1125b = str2;
        this.f1126c = j2;
    }

    /* JADX INFO: renamed from: a */
    public static C0529K m1254a(Class cls, String str) {
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return new C0529K(simpleName, str, f1123d.incrementAndGet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1124a + "<" + this.f1126c + ">");
        String str = this.f1125b;
        if (str != null) {
            sb.append(": (");
            sb.append(str);
            sb.append(')');
        }
        return sb.toString();
    }
}
