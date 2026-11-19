package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbip {

    /* JADX INFO: renamed from: a */
    public final ArrayList f7983a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f7984b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f7985c = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final ArrayList m5023a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f7984b;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            String str = (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a((zzbio) obj);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        zzbiy.m5033a(arrayList3, new zzbkh("", "gad:dynamite_module:experiment_id", 4));
        zzbiy.m5033a(arrayList3, zzbku.f9018a);
        zzbiy.m5033a(arrayList3, zzbku.f9019b);
        zzbiy.m5033a(arrayList3, zzbku.f9020c);
        zzbiy.m5033a(arrayList3, zzbku.f9021d);
        zzbiy.m5033a(arrayList3, zzbku.f9022e);
        zzbiy.m5033a(arrayList3, zzbku.f9038u);
        zzbiy.m5033a(arrayList3, zzbku.f9023f);
        zzbiy.m5033a(arrayList3, zzbku.f9030m);
        zzbiy.m5033a(arrayList3, zzbku.f9031n);
        zzbiy.m5033a(arrayList3, zzbku.f9032o);
        zzbiy.m5033a(arrayList3, zzbku.f9033p);
        zzbiy.m5033a(arrayList3, zzbku.f9034q);
        zzbiy.m5033a(arrayList3, zzbku.f9035r);
        zzbiy.m5033a(arrayList3, zzbku.f9036s);
        zzbiy.m5033a(arrayList3, zzbku.f9037t);
        zzbiy.m5033a(arrayList3, zzbku.f9024g);
        zzbiy.m5033a(arrayList3, zzbku.f9025h);
        zzbiy.m5033a(arrayList3, zzbku.f9026i);
        zzbiy.m5033a(arrayList3, zzbku.f9027j);
        zzbiy.m5033a(arrayList3, zzbku.f9028k);
        zzbiy.m5033a(arrayList3, zzbku.f9029l);
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m5024b() {
        ArrayList arrayListM5023a = m5023a();
        ArrayList arrayList = this.f7985c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String str = (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a((zzbio) obj);
            if (!TextUtils.isEmpty(str)) {
                arrayListM5023a.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        zzbiy.m5033a(arrayList2, zzblj.f9131a);
        arrayListM5023a.addAll(arrayList2);
        return arrayListM5023a;
    }
}
