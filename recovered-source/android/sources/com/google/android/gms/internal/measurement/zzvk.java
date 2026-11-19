package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p011H.AbstractC0290s;
import p011H.InterfaceC0237A;

/* JADX INFO: loaded from: classes2.dex */
final class zzvk extends AbstractC0290s {

    /* JADX INFO: renamed from: A */
    public final int f22982A;

    /* JADX INFO: renamed from: z */
    public zzvm f22983z;

    public zzvk(zzvm zzvmVar, int i2) {
        this.f22983z = zzvmVar;
        this.f22982A = i2;
    }

    @Override // p011H.AbstractC0290s
    /* JADX INFO: renamed from: c */
    public final void mo340c() {
        AtomicLong atomicLong;
        long j2;
        int i2;
        int i3;
        boolean z;
        zzvm zzvmVar = this.f22983z;
        this.f22983z = null;
        if (zzvmVar == null) {
            return;
        }
        AtomicReference atomicReference = zzvmVar.f22987c;
        do {
            atomicLong = zzvmVar.f22986b;
            j2 = atomicLong.get();
            i2 = (int) j2;
            long j3 = j2 >>> 32;
            if (i2 == Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 13);
                sb.append("Refcount is: ");
                sb.append(j2);
                throw new AssertionError(sb.toString());
            }
            i3 = (int) j3;
            z = i2 == -2147483647;
            if (z) {
                i3++;
            }
        } while (!atomicLong.compareAndSet(j2, (((long) i3) << 32) | (4294967295L & ((long) (i2 - 1)))));
        if (z) {
            while (true) {
                zzvl zzvlVar = (zzvl) atomicReference.get();
                if (zzvlVar != null) {
                    if (zzvlVar.f22984z <= this.f22982A) {
                        zzvlVar.cancel(true);
                        while (!atomicReference.compareAndSet(zzvlVar, null)) {
                            if (atomicReference.get() != zzvlVar) {
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // p011H.AbstractC0290s
    /* JADX INFO: renamed from: j */
    public final String mo342j() {
        InterfaceC0237A interfaceC0237A;
        zzvm zzvmVar = this.f22983z;
        if (zzvmVar == null || (interfaceC0237A = zzvmVar.f22985a.f22973s) == null) {
            return null;
        }
        String string = interfaceC0237A.toString();
        String strM2450q = AbstractC1456a.m2450q(new StringBuilder(string.length() + 11), "callable=[", string, "]");
        zzvl zzvlVar = (zzvl) this.f22983z.f22987c.get();
        if (zzvlVar == null) {
            return strM2450q;
        }
        int length = strM2450q.length();
        String string2 = zzvlVar.toString();
        return AbstractC1456a.m2451r(new StringBuilder(string2.length() + length + 9 + 1), strM2450q, ", trial=[", string2, "]");
    }
}
