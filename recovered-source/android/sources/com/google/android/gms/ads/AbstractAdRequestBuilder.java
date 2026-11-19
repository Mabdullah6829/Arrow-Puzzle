package com.google.android.gms.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.internal.client.zzeg;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractAdRequestBuilder<T extends AbstractAdRequestBuilder<T>> {

    /* JADX INFO: renamed from: a */
    public final zzeg f2926a;

    public AbstractAdRequestBuilder() {
        zzeg zzegVar = new zzeg();
        this.f2926a = zzegVar;
        zzegVar.f3115d.add("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    /* JADX INFO: renamed from: a */
    public final void m2740a(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
            StringBuilder sb = new StringBuilder(str2.length() + 108);
            sb.append("Value ");
            sb.append(str2);
            sb.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
            zzo.m3073f(sb.toString());
        }
        this.f2926a.f3116e.putString(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractAdRequestBuilder m2741b(Bundle bundle) {
        zzeg zzegVar = this.f2926a;
        zzegVar.f3113b.putBundle(AdMobAdapter.class.getName(), bundle);
        if (AdMobAdapter.class.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            zzegVar.f3115d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return mo2742c();
    }

    /* JADX INFO: renamed from: c */
    public abstract AbstractAdRequestBuilder mo2742c();

    /* JADX INFO: renamed from: d */
    public final void m2743d(String str) {
        Preconditions.m3545i(str, "Content URL must be non-null.");
        Preconditions.m3542f(str, "Content URL must be non-empty.");
        int length = str.length();
        Object[] objArr = {512, Integer.valueOf(str.length())};
        if (!(length <= 512)) {
            throw new IllegalArgumentException(String.format("Content URL must not exceed %d in length.  Provided length was %d.", objArr));
        }
        this.f2926a.f3118g = str;
    }

    /* JADX INFO: renamed from: e */
    public final void m2744e(List list) {
        if (list == null) {
            zzo.m3073f("neighboring content URLs list should not be null");
            return;
        }
        ArrayList arrayList = this.f2926a.f3119h;
        arrayList.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                zzo.m3073f("neighboring content URL should not be null or empty");
            } else {
                arrayList.add(str);
            }
        }
    }
}
