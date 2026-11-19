package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzjz {

    /* JADX INFO: renamed from: a */
    public final HashMap f20182a = new HashMap();

    /* JADX INFO: renamed from: b */
    public zzjb f20183b = zzjb.f20074b;

    public /* synthetic */ zzjz(zzlj zzljVar) {
    }

    /* JADX INFO: renamed from: b */
    public static final zzjb m8621b(zzjb zzjbVar, List list) {
        zzja zzjaVar = new zzja(zzjbVar);
        HashSet hashSet = new HashSet(list);
        Iterator it = zzjbVar.f20075a.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            HashMap map = zzjaVar.f20073a;
            if (!zHasNext) {
                return new zzjb(map);
            }
            String str = (String) it.next();
            if (!hashSet.contains(str)) {
                map.remove(str);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m8622a(zzjb zzjbVar) {
        for (Map.Entry entry : new HashMap(this.f20182a).entrySet()) {
            zzjc zzjcVar = (zzjc) entry.getKey();
            List list = (List) entry.getValue();
            if (!m8621b(zzjbVar, list).equals(m8621b(this.f20183b, list))) {
                zzjcVar.zza();
            }
        }
        this.f20183b = zzjbVar;
    }
}
