package p072l;

import android.content.Context;
import p011H.AbstractC0271e0;
import p049b0.C1887c;

/* JADX INFO: renamed from: l.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6467b extends AbstractC6469d {

    /* JADX INFO: renamed from: a */
    public final Context f24644a;

    /* JADX INFO: renamed from: b */
    public final C1887c f24645b;

    /* JADX INFO: renamed from: c */
    public final C1887c f24646c;

    /* JADX INFO: renamed from: d */
    public final String f24647d;

    public C6467b(Context context, C1887c c1887c, C1887c c1887c2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f24644a = context;
        if (c1887c == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f24645b = c1887c;
        if (c1887c2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f24646c = c1887c2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f24647d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6469d) {
            AbstractC6469d abstractC6469d = (AbstractC6469d) obj;
            if (this.f24644a.equals(((C6467b) abstractC6469d).f24644a)) {
                C6467b c6467b = (C6467b) abstractC6469d;
                if (this.f24645b.equals(c6467b.f24645b) && this.f24646c.equals(c6467b.f24646c) && this.f24647d.equals(c6467b.f24647d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f24644a.hashCode() ^ 1000003) * 1000003) ^ this.f24645b.hashCode()) * 1000003) ^ this.f24646c.hashCode()) * 1000003) ^ this.f24647d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f24644a);
        sb.append(", wallClock=");
        sb.append(this.f24645b);
        sb.append(", monotonicClock=");
        sb.append(this.f24646c);
        sb.append(", backendName=");
        return AbstractC0271e0.m403k(sb, this.f24647d, "}");
    }
}
