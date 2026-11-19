package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzekl implements zzfos {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzeko f14090a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzekq f14091b;

    public /* synthetic */ zzekl(zzeko zzekoVar, zzekq zzekqVar) {
        this.f14090a = zzekoVar;
        this.f14091b = zzekqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfos
    /* JADX INFO: renamed from: b */
    public final Object mo5874b(Object obj) {
        zzeko zzekoVar = this.f14090a;
        zzekoVar.getClass();
        ContentValues contentValues = new ContentValues();
        zzekq zzekqVar = this.f14091b;
        contentValues.put("timestamp", Long.valueOf(zzekqVar.f14098a));
        contentValues.put("gws_query_id", zzekqVar.f14099b);
        contentValues.put("url", zzekqVar.f14100c);
        contentValues.put("event_state", Integer.valueOf(zzekqVar.f14101d - 1));
        ((SQLiteDatabase) obj).insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        Context context = zzekoVar.f14095s;
        com.google.android.gms.ads.internal.util.zzbo zzboVarM3203b = com.google.android.gms.ads.internal.util.zzs.m3203b(context);
        if (zzboVarM3203b != null) {
            try {
                zzboVarM3203b.zzf(new ObjectWrapper(context));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.m3151l("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }
}
