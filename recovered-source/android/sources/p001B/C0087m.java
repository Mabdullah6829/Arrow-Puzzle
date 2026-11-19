package p001B;

import java.util.Arrays;

/* JADX INFO: renamed from: B.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C0087m {

    /* JADX INFO: renamed from: a */
    public final String f115a;

    /* JADX INFO: renamed from: b */
    public final C0086l f116b;

    /* JADX INFO: renamed from: c */
    public C0086l f117c;

    /* JADX INFO: renamed from: d */
    public boolean f118d;

    public C0087m(String str) {
        C0086l c0086l = new C0086l(0);
        this.f116b = c0086l;
        this.f117c = c0086l;
        this.f118d = false;
        this.f115a = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m157a(long j2, String str) {
        m160d(str, String.valueOf(j2));
    }

    /* JADX INFO: renamed from: b */
    public final void m158b(Object obj, String str) {
        C0086l c0086l = new C0086l(0);
        this.f117c.f114v = c0086l;
        this.f117c = c0086l;
        c0086l.f113u = obj;
        c0086l.f112t = str;
    }

    /* JADX INFO: renamed from: c */
    public final void m159c(String str, boolean z) {
        m160d(str, String.valueOf(z));
    }

    /* JADX INFO: renamed from: d */
    public final void m160d(String str, String str2) {
        C0085k c0085k = new C0085k(0);
        this.f117c.f114v = c0085k;
        this.f117c = c0085k;
        c0085k.f113u = str2;
        c0085k.f112t = str;
    }

    public final String toString() {
        boolean z = this.f118d;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f115a);
        sb.append('{');
        String str = "";
        for (C0086l c0086l = (C0086l) this.f116b.f114v; c0086l != null; c0086l = (C0086l) c0086l.f114v) {
            Object obj = c0086l.f113u;
            if ((c0086l instanceof C0085k) || obj != null || !z) {
                sb.append(str);
                String str2 = (String) c0086l.f112t;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String strDeepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
