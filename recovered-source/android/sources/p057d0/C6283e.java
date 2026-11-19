package p057d0;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: renamed from: d0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6283e implements Serializable {

    /* JADX INFO: renamed from: s */
    public final Object f24308s;

    /* JADX INFO: renamed from: t */
    public final Object f24309t;

    public C6283e(Object obj, Object obj2) {
        this.f24308s = obj;
        this.f24309t = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6283e)) {
            return false;
        }
        C6283e c6283e = (C6283e) obj;
        return AbstractC6452k.m12177a(this.f24308s, c6283e.f24308s) && AbstractC6452k.m12177a(this.f24309t, c6283e.f24309t);
    }

    public final int hashCode() {
        Object obj = this.f24308s;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f24309t;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f24308s + ", " + this.f24309t + ')';
    }
}
