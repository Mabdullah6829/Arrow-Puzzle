package com.google.android.gms.common;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.core.app.PendingIntentCompat;
import com.google.android.gms.internal.base.zao;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class zad extends zao {

    /* JADX INFO: renamed from: a */
    public final Context f4665a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ GoogleApiAvailability f4666b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zad(GoogleApiAvailability googleApiAvailability, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f4666b = googleApiAvailability;
        this.f4665a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 39);
            sb.append("Don't know how to handle this message: ");
            sb.append(i2);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i3 = GoogleApiAvailabilityLight.f4156a;
        GoogleApiAvailability googleApiAvailability = this.f4666b;
        Context context = this.f4665a;
        int iM3403c = googleApiAvailability.m3403c(context, i3);
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f4161a;
        if (iM3403c == 1 || iM3403c == 2 || iM3403c == 3 || iM3403c == 9) {
            Intent intentM3402b = googleApiAvailability.m3402b(context, iM3403c, "n");
            googleApiAvailability.m3400g(context, iM3403c, intentM3402b == null ? null : PendingIntentCompat.getActivity(context, 0, intentM3402b, 134217728, false));
        }
    }
}
