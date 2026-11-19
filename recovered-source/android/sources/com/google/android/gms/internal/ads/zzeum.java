package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeum implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzhcp f14911a;

    /* JADX INFO: renamed from: b */
    public final Context f14912b;

    /* JADX INFO: renamed from: c */
    public final zzflg f14913c;

    /* JADX INFO: renamed from: d */
    public final ViewGroup f14914d;

    public zzeum(zzhcp zzhcpVar, Context context, zzflg zzflgVar, ViewGroup viewGroup) {
        this.f14911a = zzhcpVar;
        this.f14912b = context;
        this.f14913c = zzflgVar;
        this.f14914d = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        zzbix.m5032a(this.f14912b);
        return this.f14911a.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeul
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                ArrayList arrayList = new ArrayList();
                zzeum zzeumVar = this.f14910a;
                View view = zzeumVar.f14914d;
                while (view != null) {
                    Object parent = view.getParent();
                    if (parent == null) {
                        break;
                    }
                    int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
                    Bundle bundle = new Bundle();
                    bundle.putString("type", parent.getClass().getName());
                    bundle.putInt("index_of_child", iIndexOfChild);
                    arrayList.add(bundle);
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                }
                return new zzeun(zzeumVar.f14912b, zzeumVar.f14913c.f16042f, arrayList);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 3;
    }
}
