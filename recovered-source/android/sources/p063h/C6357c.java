package p063h;

import p011H.AbstractC0271e0;

/* JADX INFO: renamed from: h.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6357c {

    /* JADX INFO: renamed from: a */
    public final String f24414a;

    public C6357c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f24414a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6357c)) {
            return false;
        }
        return this.f24414a.equals(((C6357c) obj).f24414a);
    }

    public final int hashCode() {
        return this.f24414a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC0271e0.m403k(new StringBuilder("Encoding{name=\""), this.f24414a, "\"}");
    }
}
