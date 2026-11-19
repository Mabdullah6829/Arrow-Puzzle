package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzinl implements zzimz {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f20015c = 0;

    /* JADX INFO: renamed from: a */
    public final List f20016a;

    /* JADX INFO: renamed from: b */
    public final List f20017b;

    static {
        zzina.m8549a(Collections.EMPTY_SET);
    }

    public /* synthetic */ zzinl(List list, List list2) {
        this.f20016a = list;
        this.f20017b = list2;
    }

    /* JADX INFO: renamed from: a */
    public static zzink m8559a(int i2, int i3) {
        return new zzink(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        List list = this.f20016a;
        int size = list.size();
        List list2 = this.f20017b;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Collection collection = (Collection) ((zzini) list2.get(i2)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object objZzb = ((zzini) list.get(i3)).zzb();
            objZzb.getClass();
            hashSet.add(objZzb);
        }
        int size4 = arrayList.size();
        for (int i4 = 0; i4 < size4; i4++) {
            for (Object obj : (Collection) arrayList.get(i4)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
