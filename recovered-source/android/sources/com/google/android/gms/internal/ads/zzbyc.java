package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;

/* JADX INFO: loaded from: classes2.dex */
final class zzbyc implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzbye f9501s;

    public zzbyc(zzbye zzbyeVar) {
        this.f9501s = zzbyeVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        zzbye zzbyeVar = this.f9501s;
        zzbyeVar.getClass();
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", zzbyeVar.f9505e);
        data.putExtra("eventLocation", zzbyeVar.f9509i);
        data.putExtra("description", zzbyeVar.f9508h);
        long j2 = zzbyeVar.f9506f;
        if (j2 > -1) {
            data.putExtra("beginTime", j2);
        }
        long j3 = zzbyeVar.f9507g;
        if (j3 > -1) {
            data.putExtra("endTime", j3);
        }
        data.setFlags(268435456);
        com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        com.google.android.gms.ads.internal.util.zzs.m3220s(zzbyeVar.f9504d, data);
    }
}
