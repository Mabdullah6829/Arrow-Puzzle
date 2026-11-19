package p033S0;

import java.util.ArrayList;
import java.util.Map;
import p058e0.AbstractC6305m;
import p058e0.AbstractC6318z;
import p058e0.C6314v;

/* JADX INFO: renamed from: S0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0619m {

    /* JADX INFO: renamed from: a */
    public final boolean f1353a;

    /* JADX INFO: renamed from: b */
    public final boolean f1354b;

    /* JADX INFO: renamed from: c */
    public final Long f1355c;

    /* JADX INFO: renamed from: d */
    public final Long f1356d;

    /* JADX INFO: renamed from: e */
    public final Long f1357e;

    /* JADX INFO: renamed from: f */
    public final Long f1358f;

    /* JADX INFO: renamed from: g */
    public final Map f1359g = AbstractC6318z.m12131y(C6314v.f24339s);

    public C0619m(boolean z, boolean z2, Long l2, Long l3, Long l4, Long l5) {
        this.f1353a = z;
        this.f1354b = z2;
        this.f1355c = l2;
        this.f1356d = l3;
        this.f1357e = l4;
        this.f1358f = l5;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f1353a) {
            arrayList.add("isRegularFile");
        }
        if (this.f1354b) {
            arrayList.add("isDirectory");
        }
        Long l2 = this.f1355c;
        if (l2 != null) {
            arrayList.add("byteCount=" + l2);
        }
        Long l3 = this.f1356d;
        if (l3 != null) {
            arrayList.add("createdAt=" + l3);
        }
        Long l4 = this.f1357e;
        if (l4 != null) {
            arrayList.add("lastModifiedAt=" + l4);
        }
        Long l5 = this.f1358f;
        if (l5 != null) {
            arrayList.add("lastAccessedAt=" + l5);
        }
        Map map = this.f1359g;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return AbstractC6305m.m12105A(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }
}
