package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzag {

    /* JADX INFO: renamed from: a */
    public final Uri f5240a;

    /* JADX INFO: renamed from: b */
    public final List f5241b;

    /* JADX INFO: renamed from: c */
    public final zzgwt f5242c;

    static {
        String str = zzfm.f16091a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public /* synthetic */ zzag(Uri uri, List list, zzgwt zzgwtVar) {
        this.f5240a = uri;
        ArrayList arrayList = zzas.f6816a;
        this.f5241b = list;
        this.f5242c = zzgwtVar;
        zzgzi zzgziVar = zzgwt.f18303t;
        zzgwq zzgwqVar = new zzgwq();
        if (zzgwtVar.size() <= 0) {
            zzgwqVar.m7214f();
        } else {
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzag)) {
            return false;
        }
        zzag zzagVar = (zzag) obj;
        return this.f5240a.equals(zzagVar.f5240a) && this.f5241b.equals(zzagVar.f5241b) && this.f5242c.equals(zzagVar.f5242c);
    }

    public final int hashCode() {
        return (int) ((((long) ((this.f5242c.hashCode() + ((this.f5241b.hashCode() + (this.f5240a.hashCode() * 923521)) * 961)) * 31)) * 31) - Long.MAX_VALUE);
    }
}
