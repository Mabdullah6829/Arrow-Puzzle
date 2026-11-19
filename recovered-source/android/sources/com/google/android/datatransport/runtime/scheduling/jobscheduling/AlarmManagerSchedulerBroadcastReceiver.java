package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.firebase.crashlytics.internal.concurrency.RunnableC5655b;
import com.google.firebase.firestore.local.RunnableC5811t;
import p063h.EnumC6358d;
import p069k.C6430k;
import p069k.C6440u;
import p079q.C6517h;
import p085u.AbstractC6540a;

/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f2924a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i2 = intent.getExtras().getInt("attemptNumber");
        C6440u.m12173b(context);
        if (queryParameter == null) {
            throw new NullPointerException("Null backendName");
        }
        EnumC6358d enumC6358dM12212b = AbstractC6540a.m12212b(iIntValue);
        byte[] bArrDecode = queryParameter2 != null ? Base64.decode(queryParameter2, 0) : null;
        C6517h c6517h = C6440u.m12172a().f24625d;
        c6517h.f24720e.execute(new RunnableC5811t(c6517h, new C6430k(queryParameter, bArrDecode, enumC6358dM12212b), i2, new RunnableC5655b(1), 1));
    }
}
