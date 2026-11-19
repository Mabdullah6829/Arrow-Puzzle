package p030R;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;
import p001B.AbstractC0076b;

/* JADX INFO: renamed from: R.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0546b {

    /* JADX INFO: renamed from: b */
    public static final C0546b f1154b = new C0546b(new IdentityHashMap());

    /* JADX INFO: renamed from: a */
    public final IdentityHashMap f1155a;

    public C0546b(IdentityHashMap identityHashMap) {
        this.f1155a = identityHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0546b.class != obj.getClass()) {
            return false;
        }
        IdentityHashMap identityHashMap = ((C0546b) obj).f1155a;
        IdentityHashMap identityHashMap2 = this.f1155a;
        if (identityHashMap2.size() != identityHashMap.size()) {
            return false;
        }
        for (Map.Entry entry : identityHashMap2.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey()) || !AbstractC0076b.m140o(entry.getValue(), identityHashMap.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f1155a.entrySet()) {
            iHashCode += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return iHashCode;
    }

    public final String toString() {
        return this.f1155a.toString();
    }
}
