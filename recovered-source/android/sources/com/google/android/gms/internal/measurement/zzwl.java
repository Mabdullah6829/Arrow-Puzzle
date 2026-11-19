package com.google.android.gms.internal.measurement;

import androidx.collection.SimpleArrayMap;
import p001B.AbstractC0076b;
import p003C.AbstractC0120k;

/* JADX INFO: loaded from: classes2.dex */
public class zzwl {

    /* JADX INFO: renamed from: d */
    public static final zzwj f23030d = zzwj.m10692a();

    /* JADX INFO: renamed from: a */
    public final zzwl f23031a;

    /* JADX INFO: renamed from: b */
    public final SimpleArrayMap f23032b;

    /* JADX INFO: renamed from: c */
    public boolean f23033c = false;

    public /* synthetic */ zzwl(zzwl zzwlVar, SimpleArrayMap simpleArrayMap) {
        if (zzwlVar != null) {
            AbstractC0076b.m130e(zzwlVar.f23033c);
        }
        this.f23031a = zzwlVar;
        this.f23032b = simpleArrayMap;
    }

    /* JADX INFO: renamed from: a */
    public static zzwl m10693a(zzwl zzwlVar, zzwl zzwlVar2) {
        zzwlVar.getClass();
        zzwl zzwlVar3 = zzwk.f23028e;
        if (zzwlVar == zzwlVar3) {
            return zzwlVar2;
        }
        zzwlVar2.getClass();
        if (zzwlVar2 == zzwlVar3) {
            return zzwlVar;
        }
        AbstractC0120k<zzwl> abstractC0120kM204n = AbstractC0120k.m204n(2, zzwlVar, zzwlVar2);
        if (abstractC0120kM204n.isEmpty()) {
            return zzwlVar3;
        }
        if (abstractC0120kM204n.size() == 1) {
            return (zzwl) abstractC0120kM204n.iterator().next();
        }
        int size = 0;
        for (zzwl zzwlVar4 : abstractC0120kM204n) {
            do {
                size += zzwlVar4.f23032b.size();
                zzwlVar4 = zzwlVar4.f23031a;
            } while (zzwlVar4 != null);
        }
        if (size == 0) {
            return zzwk.f23028e;
        }
        SimpleArrayMap simpleArrayMap = new SimpleArrayMap(size);
        for (zzwl zzwlVar5 : abstractC0120kM204n) {
            do {
                int i2 = 0;
                while (true) {
                    SimpleArrayMap simpleArrayMap2 = zzwlVar5.f23032b;
                    if (i2 >= simpleArrayMap2.size()) {
                        break;
                    }
                    AbstractC0076b.m129d("Duplicate bindings: %s", simpleArrayMap.put((zzwj) simpleArrayMap2.keyAt(i2), simpleArrayMap2.valueAt(i2)) == null, simpleArrayMap2.keyAt(i2));
                    i2++;
                }
                zzwlVar5 = zzwlVar5.f23031a;
            } while (zzwlVar5 != null);
        }
        return new zzwk(null, simpleArrayMap).m10694b();
    }

    /* JADX INFO: renamed from: b */
    public final zzwl m10694b() {
        if (this.f23033c) {
            throw new IllegalStateException("Already frozen");
        }
        this.f23033c = true;
        zzwl zzwlVar = this.f23031a;
        return (zzwlVar == null || !this.f23032b.isEmpty()) ? this : zzwlVar;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10695c(zzwj zzwjVar) {
        if (this.f23032b.containsKey(zzwjVar)) {
            return true;
        }
        zzwl zzwlVar = this.f23031a;
        return zzwlVar != null && zzwlVar.m10695c(zzwjVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (zzwl zzwlVar = this; zzwlVar != null; zzwlVar = zzwlVar.f23031a) {
            for (int i2 = 0; i2 < zzwlVar.f23032b.size(); i2++) {
                sb.append("[");
                sb.append(this.f23032b.valueAt(i2));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
