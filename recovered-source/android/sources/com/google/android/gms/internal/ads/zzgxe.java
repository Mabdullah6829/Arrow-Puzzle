package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgxe extends zzgwz {
    /* JADX INFO: renamed from: a */
    public final void m7246a(Object obj, Object... objArr) {
        List listAsList = Arrays.asList(objArr);
        if (obj == null) {
            Iterator it = listAsList.iterator();
            StringBuilder sb = new StringBuilder("[");
            boolean z = true;
            while (it.hasNext()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(it.next());
                z = false;
            }
            sb.append(']');
            throw new NullPointerException("null key in entry: null=".concat(sb.toString()));
        }
        Iterator it2 = listAsList.iterator();
        if (it2.hasNext()) {
            Map zzgwaVar = this.f18318a;
            if (zzgwaVar == null) {
                zzgwaVar = new zzgwa();
                this.f18318a = zzgwaVar;
            }
            zzgwo zzgwoVarM7243u = (zzgwo) ((zzgwa) zzgwaVar).get(obj);
            if (zzgwoVarM7243u == null) {
                zzgwoVarM7243u = zzgxd.m7243u(listAsList instanceof Set ? Math.max(4, ((Set) listAsList).size()) : 4);
                Map zzgwaVar2 = this.f18318a;
                if (zzgwaVar2 == null) {
                    zzgwaVar2 = new zzgwa();
                    this.f18318a = zzgwaVar2;
                }
                ((zzgwa) zzgwaVar2).put(obj, zzgwoVarM7243u);
            }
            while (it2.hasNext()) {
                Object next = it2.next();
                zzgvp.m7174a(obj, next);
                zzgwoVarM7243u.mo7202a(next);
            }
        }
    }
}
