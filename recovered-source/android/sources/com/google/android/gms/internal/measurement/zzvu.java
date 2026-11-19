package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import java.util.WeakHashMap;
import p003C.AbstractC0110a;
import p003C.AbstractC0116g;
import p003C.C0113d;
import p003C.C0129t;
import p011H.AbstractC0242F;
import p011H.AbstractC0243G;

/* JADX INFO: loaded from: classes2.dex */
public final class zzvu {

    /* JADX INFO: renamed from: a */
    public static final WeakHashMap f23006a = new WeakHashMap();

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap f23007b = new WeakHashMap();

    /* JADX WARN: Code duplicated, block: B:53:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x0108 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static void m10683a(Throwable th) {
        Throwable cause;
        zzxc zzxcVar;
        zzws zzwsVarZzb;
        int i2;
        WeakHashMap weakHashMap = f23007b;
        synchronized (weakHashMap) {
            cause = th;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            weakHashMap.put(th, Boolean.valueOf(cause != null));
        }
        if (cause != null) {
            return;
        }
        WeakHashMap weakHashMap2 = f23006a;
        synchronized (weakHashMap2) {
            Throwable cause2 = th;
            while (cause2 != null) {
                try {
                    if (weakHashMap2.containsKey(cause2)) {
                        break;
                    } else {
                        cause2 = cause2.getCause();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (cause2 == null) {
                zzxcVar = null;
            } else {
                weakHashMap2.put(th, (zzww) weakHashMap2.get(cause2));
                zzxcVar = new zzxc();
            }
        }
        if (zzxcVar != null || (zzwsVarZzb = zzvy.m10686c().f23052b) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (zzwsVarZzb = zzvy.m10686c().f23052b; zzwsVarZzb != null; zzwsVarZzb = zzwsVarZzb.zzb()) {
            arrayList.add(zzwsVarZzb);
        }
        zzvo zzvoVar = new zzvo();
        UUID uuidZzc = ((zzws) arrayList.get(0)).zzc();
        if (uuidZzc == null) {
            throw new NullPointerException("Null rootTraceId");
        }
        zzvoVar.f22998c = uuidZzc;
        ((zzws) arrayList.get(0)).getClass();
        zzvoVar.f22999d = -1L;
        zzvoVar.f23000e = (byte) 1;
        int size = arrayList.size();
        C0113d c0113d = AbstractC0116g.f168t;
        AbstractC0243G.m371i(size, "expectedSize");
        AbstractC0243G.m371i(size, "initialCapacity");
        Object[] objArrCopyOf = new Object[size];
        int size2 = arrayList.size();
        AbstractC0243G.m371i(size2, "expectedSize");
        AbstractC0243G.m371i(size2, "initialCapacity");
        Object[] objArrCopyOf2 = new Object[size2];
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        for (zzws zzwsVar : AbstractC0242F.m359p(arrayList)) {
            String strMo10674a = zzwsVar.mo10674a();
            strMo10674a.getClass();
            int i5 = i4 + 1;
            if (objArrCopyOf2.length < i5) {
                objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, AbstractC0110a.m184b(objArrCopyOf2.length, i5));
            } else {
                if (z2) {
                    objArrCopyOf2 = (Object[]) objArrCopyOf2.clone();
                }
                int i6 = i4 + 1;
                objArrCopyOf2[i4] = strMo10674a;
                zzwl zzwlVarZzh = zzwsVar.zzh();
                zzwlVarZzh.getClass();
                i2 = i3 + 1;
                if (objArrCopyOf.length < i2) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, AbstractC0110a.m184b(objArrCopyOf.length, i2));
                } else {
                    if (z) {
                        objArrCopyOf = (Object[]) objArrCopyOf.clone();
                    }
                    objArrCopyOf[i3] = zzwlVarZzh;
                    i3++;
                    i4 = i6;
                }
                z = false;
                objArrCopyOf[i3] = zzwlVarZzh;
                i3++;
                i4 = i6;
            }
            z2 = false;
            int i7 = i4 + 1;
            objArrCopyOf2[i4] = strMo10674a;
            zzwl zzwlVarZzh2 = zzwsVar.zzh();
            zzwlVarZzh2.getClass();
            i2 = i3 + 1;
            if (objArrCopyOf.length < i2) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, AbstractC0110a.m184b(objArrCopyOf.length, i2));
            } else {
                if (z) {
                    objArrCopyOf = (Object[]) objArrCopyOf.clone();
                }
                objArrCopyOf[i3] = zzwlVarZzh2;
                i3++;
                i4 = i7;
            }
            z = false;
            objArrCopyOf[i3] = zzwlVarZzh2;
            i3++;
            i4 = i7;
        }
        WeakHashMap weakHashMap3 = f23006a;
        synchronized (weakHashMap3) {
            try {
                C0129t c0129tM191m = AbstractC0116g.m191m(i4, objArrCopyOf2);
                if (c0129tM191m == null) {
                    throw new NullPointerException("Null spansNames");
                }
                zzvoVar.f22996a = c0129tM191m;
                C0129t c0129tM191m2 = AbstractC0116g.m191m(i3, objArrCopyOf);
                if (c0129tM191m2 == null) {
                    throw new NullPointerException("Null extras");
                }
                zzvoVar.f22997b = c0129tM191m2;
                weakHashMap3.put(th, zzvoVar.m10676a());
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
