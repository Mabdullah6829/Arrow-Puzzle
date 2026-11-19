package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcnd extends MutableContextWrapper {

    /* JADX INFO: renamed from: a */
    public Activity f10585a;

    /* JADX INFO: renamed from: b */
    public Context f10586b;

    /* JADX INFO: renamed from: c */
    public Context f10587c;

    /* JADX INFO: renamed from: a */
    public final void m5674a(Intent intent) {
        if (this.f10585a == null) {
            intent.setFlags(268435456);
            this.f10586b.startActivity(intent);
            return;
        }
        String strValueOf = String.valueOf(intent.getData());
        StringBuilder sb = new StringBuilder(strValueOf.length() + 63);
        sb.append("Starting activity for result with intent: ");
        sb.append(strValueOf);
        sb.append(" and requestCode: 236");
        com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
        this.f10585a.startActivityForResult(intent, 236);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f10587c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f10586b = applicationContext;
        this.f10585a = context instanceof Activity ? (Activity) context : null;
        this.f10587c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f10585a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f10586b.startActivity(intent);
        }
    }
}
