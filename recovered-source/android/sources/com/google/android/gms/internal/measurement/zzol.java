package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class zzol implements zzoh {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f22695a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f22696b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f22697c;

    public zzol() {
        new ConcurrentHashMap();
        this.f22696b = new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.f22697c = new ConcurrentHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:42:0x0030 A[EDGE_INSN: B:42:0x0030->B:40:0x0030 BREAK  A[LOOP:1: B:12:0x0050->B:45:?], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final void m10577a(zzacr zzacrVar, Set set, String str) {
        zzok[] zzokVarArr;
        if (!set.isEmpty() && !this.f22695a.getAndSet(true)) {
            zzbu.m9823a().f22332a.add(0, new zzoj());
        }
        final byte[] bArrM9383q = zzacrVar.m9383q();
        this.f22696b.compute(str, new BiFunction() { // from class: com.google.android.gms.internal.measurement.zzoi
            @Override // java.util.function.BiFunction
            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                byte[] bArr = (byte[]) obj2;
                byte[] bArr2 = bArrM9383q;
                return Arrays.equals(bArr, bArr2) ? bArr : bArr2;
            }
        });
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AtomicReference atomicReference = (AtomicReference) this.f22697c.putIfAbsent((String) it.next(), new AtomicReference(new zzok(str, bArrM9383q)));
            if (atomicReference != null) {
                while (true) {
                    Object obj = atomicReference.get();
                    if (obj instanceof zzok) {
                        zzok zzokVar = (zzok) obj;
                        if (str.equals(zzokVar.f22693s)) {
                            zzokVar.m10576b(bArrM9383q);
                            break;
                        }
                        zzok zzokVar2 = new zzok(str, bArrM9383q);
                        zzokVarArr = str.compareTo(zzokVar.f22693s) < 0 ? new zzok[]{zzokVar2, zzokVar} : new zzok[]{zzokVar, zzokVar2};
                        do {
                            if (atomicReference.compareAndSet(obj, zzokVarArr)) {
                                break;
                            }
                        } while (atomicReference.get() == obj);
                    } else {
                        zzok[] zzokVarArr2 = (zzok[]) obj;
                        int iBinarySearch = Arrays.binarySearch(zzokVarArr2, str);
                        if (iBinarySearch >= 0) {
                            zzokVarArr2[iBinarySearch].m10576b(bArrM9383q);
                            break;
                        }
                        int i2 = ~iBinarySearch;
                        int length = zzokVarArr2.length;
                        int i3 = length + 1;
                        int i4 = length - i2;
                        if (i4 == 0) {
                            zzokVarArr = (zzok[]) Arrays.copyOf(zzokVarArr2, i3);
                        } else {
                            zzok[] zzokVarArr3 = new zzok[i3];
                            System.arraycopy(zzokVarArr2, 0, zzokVarArr3, 0, i2);
                            System.arraycopy(zzokVarArr2, i2, zzokVarArr3, i2 + 1, i4);
                            zzokVarArr = zzokVarArr3;
                        }
                        zzokVarArr[i2] = new zzok(str, bArrM9383q);
                        do {
                            if (atomicReference.compareAndSet(obj, zzokVarArr)) {
                                break;
                                break;
                            }
                        } while (atomicReference.get() == obj);
                    }
                }
            }
        }
    }
}
