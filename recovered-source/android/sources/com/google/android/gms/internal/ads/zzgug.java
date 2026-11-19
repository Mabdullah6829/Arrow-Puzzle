package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgug {

    /* JADX INFO: renamed from: a */
    public final zzgtf f18197a;

    /* JADX INFO: renamed from: b */
    public final boolean f18198b;

    /* JADX INFO: renamed from: c */
    public final zzguf f18199c;

    public zzgug(zzguf zzgufVar, boolean z, zzgtf zzgtfVar) {
        this.f18199c = zzgufVar;
        this.f18198b = z;
        this.f18197a = zzgtfVar;
    }

    /* JADX INFO: renamed from: a */
    public static zzgug m7143a(final zzgtf zzgtfVar) {
        return new zzgug(new zzguf() { // from class: com.google.android.gms.internal.ads.zzgud
            @Override // com.google.android.gms.internal.ads.zzguf
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Iterator mo7142a(zzgug zzgugVar, CharSequence charSequence) {
                return new zzgtx(zzgugVar, charSequence, zzgtfVar);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static zzgug m7144b() {
        return new zzgug(new zzguc());
    }

    /* JADX INFO: renamed from: c */
    public final zzgug m7145c(zzgtf zzgtfVar) {
        zzgtfVar.getClass();
        return new zzgug(this.f18199c, this.f18198b, zzgtfVar);
    }

    /* JADX INFO: renamed from: d */
    public final Iterable m7146d(String str) {
        str.getClass();
        return new zzgua(this, str);
    }

    /* JADX INFO: renamed from: e */
    public final List m7147e(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itMo7142a = this.f18199c.mo7142a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (itMo7142a.hasNext()) {
            arrayList.add((String) itMo7142a.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public zzgug(zzguf zzgufVar) {
        this(zzgufVar, false, zzgtd.f18170t);
    }
}
