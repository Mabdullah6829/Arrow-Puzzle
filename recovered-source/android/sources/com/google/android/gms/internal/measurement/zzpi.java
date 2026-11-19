package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.Objects;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
final class zzpi implements zzph {

    /* JADX INFO: renamed from: a */
    public volatile zzon f22733a;

    /* JADX INFO: renamed from: b */
    public zzpg f22734b;

    @Override // com.google.android.gms.internal.measurement.zzph
    /* JADX INFO: renamed from: a */
    public final zzpg mo10582a(final zzlk zzlkVar) {
        final zzon zzonVar = this.f22733a;
        zzon zzonVar2 = zzpg.f22724j;
        if (zzonVar != zzonVar2) {
            zzpe zzpeVar = zzpg.f22723i;
            zzpeVar.getClass();
            final zzpd zzpdVar = new zzpd();
            zzpdVar.f22720a = false;
            zzoo zzooVar = (zzoo) zzpeVar.f22721a.computeIfAbsent(zzonVar.m10578a(zzlkVar.f22619b), new Function() { // from class: com.google.android.gms.internal.measurement.zzpb
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    zzoo zzooVar2 = new zzoo(new zzpg(zzlkVar, zzonVar));
                    zzpdVar.f22720a = true;
                    return zzooVar2;
                }
            });
            if (zzpdVar.f22720a) {
                Context context = zzlkVar.f22619b;
                zzoz zzozVar = new zzoz(zzpeVar);
                if (zzql.f22775a == null) {
                    synchronized (zzql.class) {
                        try {
                            if (zzql.f22775a == null) {
                                if (!Objects.equals(context.getPackageName(), "com.google.android.gms")) {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        context.registerReceiver(new zzql(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                                    } else {
                                        context.registerReceiver(new zzql(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                                    }
                                }
                                zzql.f22775a = zzozVar;
                                zzqk zzqkVar = zzql.f22775a;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            this.f22734b = zzooVar.f22702a;
            this.f22733a = zzonVar2;
        }
        return this.f22734b;
    }
}
