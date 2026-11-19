package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzg {

    /* JADX INFO: renamed from: a */
    public final zzg f22493a;

    /* JADX INFO: renamed from: b */
    public final zzaw f22494b;

    /* JADX INFO: renamed from: c */
    public final HashMap f22495c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f22496d = new HashMap();

    public zzg(zzg zzgVar, zzaw zzawVar) {
        this.f22493a = zzgVar;
        this.f22494b = zzawVar;
    }

    /* JADX INFO: renamed from: a */
    public final zzao m9950a(zzao zzaoVar) {
        return this.f22494b.m9808b(this, zzaoVar);
    }

    /* JADX INFO: renamed from: b */
    public final zzao m9951b(zzae zzaeVar) {
        zzao zzaoVarM9808b = zzao.f22237k;
        Iterator itM9587q = zzaeVar.m9587q();
        while (itM9587q.hasNext()) {
            zzaoVarM9808b = this.f22494b.m9808b(this, zzaeVar.m9590t(((Integer) itM9587q.next()).intValue()));
            if (zzaoVarM9808b instanceof zzag) {
                break;
            }
        }
        return zzaoVarM9808b;
    }

    /* JADX INFO: renamed from: c */
    public final zzg m9952c() {
        return new zzg(this, this.f22494b);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9953d(String str) {
        if (this.f22495c.containsKey(str)) {
            return true;
        }
        zzg zzgVar = this.f22493a;
        if (zzgVar != null) {
            return zzgVar.m9953d(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m9954e(String str, zzao zzaoVar) {
        zzg zzgVar;
        HashMap map = this.f22495c;
        if (!map.containsKey(str) && (zzgVar = this.f22493a) != null && zzgVar.m9953d(str)) {
            zzgVar.m9954e(str, zzaoVar);
        } else {
            if (this.f22496d.containsKey(str)) {
                return;
            }
            if (zzaoVar == null) {
                map.remove(str);
            } else {
                map.put(str, zzaoVar);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m9955f(String str, zzao zzaoVar) {
        if (this.f22496d.containsKey(str)) {
            return;
        }
        HashMap map = this.f22495c;
        if (zzaoVar == null) {
            map.remove(str);
        } else {
            map.put(str, zzaoVar);
        }
    }

    /* JADX INFO: renamed from: g */
    public final zzao m9956g(String str) {
        HashMap map = this.f22495c;
        if (map.containsKey(str)) {
            return (zzao) map.get(str);
        }
        zzg zzgVar = this.f22493a;
        if (zzgVar != null) {
            return zzgVar.m9956g(str);
        }
        throw new IllegalArgumentException(AbstractC0271e0.m414v(str, " is not defined"));
    }
}
