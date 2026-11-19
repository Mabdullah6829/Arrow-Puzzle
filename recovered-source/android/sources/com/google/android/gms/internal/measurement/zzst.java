package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import p043a.AbstractC0878a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzst implements zzrt {
    private zzst() {
    }

    /* JADX INFO: renamed from: b */
    public static zzst m10647b() {
        return new zzst();
    }

    /* JADX INFO: renamed from: c */
    public static final InputStream m10648c(zzrs zzrsVar) throws IOException {
        InputStream inputStreamMo10631a = zzrsVar.f22834a.mo10631a(zzrsVar.f22837d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(inputStreamMo10631a);
        ArrayList arrayList2 = zzrsVar.f22836c;
        if (!arrayList2.isEmpty()) {
            int i2 = zzrp.f22825t;
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                zzsz zzszVarZza = ((zztb) obj).zza();
                if (zzszVarZza != null) {
                    arrayList3.add(zzszVarZza);
                }
            }
            zzrp zzrpVar = !arrayList3.isEmpty() ? new zzrp(inputStreamMo10631a, arrayList3) : null;
            if (zzrpVar != null) {
                arrayList.add(zzrpVar);
            }
        }
        Iterator it = zzrsVar.f22835b.iterator();
        if (it.hasNext()) {
            ((zztc) it.next()).m10650a((InputStream) AbstractC0878a.m1801l(arrayList));
            throw null;
        }
        Collections.reverse(arrayList);
        return (InputStream) arrayList.get(0);
    }

    @Override // com.google.android.gms.internal.measurement.zzrt
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10531a(zzrs zzrsVar) {
        return m10648c(zzrsVar);
    }
}
