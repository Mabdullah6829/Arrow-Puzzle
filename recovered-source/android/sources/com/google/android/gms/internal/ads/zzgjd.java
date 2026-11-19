package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import androidx.constraintlayout.widget.C1137R;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgjd extends zzgji {

    /* JADX INFO: renamed from: f */
    public final Context f17581f;

    /* JADX INFO: renamed from: g */
    public final Map f17582g;

    public zzgjd(zzaxt zzaxtVar, zzgie zzgieVar, Map map, Context context, zzgqo zzgqoVar) {
        super("I4xYlccqZe8KvMWrizW1s/OekBI2YfU7UNZwq9dr0dp7B5I0B1zvHWlOnn7y8ubq", "k7BIphhpl3j5W4f9W8N9gMUD+i5xBlP2tWz8eVUQlQQ=", zzaxtVar, zzgieVar, zzgqoVar.m7060a(C1137R.styleable.ConstraintSet_stateLabels));
        this.f17581f = context;
        this.f17582g = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    /* JADX INFO: renamed from: a */
    public final void mo7017a(Method method, zzaxt zzaxtVar) {
        Long lValueOf = -1L;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Long l2 = (Long) method.invoke("", this.f17581f);
                if (l2 == null) {
                    throw null;
                }
                lValueOf = l2;
            } else {
                ListenableFuture listenableFuture = (ListenableFuture) this.f17582g.get("gs");
                if (listenableFuture != null && listenableFuture.isDone()) {
                    lValueOf = Long.valueOf(((zzayt) listenableFuture.get()).m4564B0());
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        synchronized (zzaxtVar) {
            long jLongValue = lValueOf.longValue();
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4610f0(jLongValue);
        }
    }
}
