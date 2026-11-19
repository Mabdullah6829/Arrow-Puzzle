package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import p003C.AbstractC0116g;
import p043a.AbstractC0878a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrs {

    /* JADX INFO: renamed from: a */
    public final zzsx f22834a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0116g f22835b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f22836c;

    /* JADX INFO: renamed from: d */
    public final Uri f22837d;

    public zzrs(zzrr zzrrVar) {
        this.f22834a = zzrrVar.f22829a;
        this.f22835b = zzrrVar.f22830b;
        this.f22836c = zzrrVar.f22831c;
        this.f22837d = zzrrVar.f22833e;
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m10628a(OutputStream outputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        ArrayList arrayList2 = this.f22836c;
        if (!arrayList2.isEmpty()) {
            int i2 = zzrq.f22827t;
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                zzta zztaVarZzb = ((zztb) obj).zzb();
                if (zztaVarZzb != null) {
                    arrayList3.add(zztaVarZzb);
                }
            }
            zzrq zzrqVar = !arrayList3.isEmpty() ? new zzrq(outputStream, arrayList3) : null;
            if (zzrqVar != null) {
                arrayList.add(zzrqVar);
            }
        }
        Iterator it = this.f22835b.iterator();
        if (it.hasNext()) {
            ((zztc) it.next()).m10651b((OutputStream) AbstractC0878a.m1801l(arrayList));
            throw null;
        }
        Collections.reverse(arrayList);
        return arrayList;
    }
}
