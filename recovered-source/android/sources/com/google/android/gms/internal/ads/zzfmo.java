package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfmo implements zzddc {

    /* JADX INFO: renamed from: s */
    public final HashSet f16115s = new HashSet();

    /* JADX INFO: renamed from: t */
    public final Context f16116t;

    /* JADX INFO: renamed from: u */
    public final zzcfp f16117u;

    public zzfmo(Context context, zzcfp zzcfpVar) {
        this.f16116t = context;
        this.f16117u = zzcfpVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6537a(HashSet hashSet) {
        HashSet hashSet2 = this.f16115s;
        hashSet2.clear();
        hashSet2.addAll(hashSet);
    }

    /* JADX WARN: Code duplicated, block: B:73:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final Bundle m6538b() {
        String str;
        Bundle bundle;
        boolean z;
        Bundle bundle2;
        zzcfp zzcfpVar = this.f16117u;
        Context context = this.f16116t;
        zzcfpVar.getClass();
        HashSet<zzcfe> hashSet = new HashSet();
        synchronized (zzcfpVar.f9926s) {
            HashSet hashSet2 = zzcfpVar.f9930w;
            hashSet.addAll(hashSet2);
            hashSet2.clear();
        }
        Bundle bundle3 = new Bundle();
        zzcfm zzcfmVar = zzcfpVar.f9929v;
        zzcfn zzcfnVar = zzcfpVar.f9928u;
        synchronized (zzcfnVar) {
            str = zzcfnVar.f9925b;
        }
        synchronized (zzcfmVar.f9914f) {
            try {
                bundle = new Bundle();
                if (!zzcfmVar.f9917i.mo3172s()) {
                    bundle.putString("session_id", zzcfmVar.f9916h);
                }
                bundle.putLong("basets", zzcfmVar.f9910b);
                bundle.putLong("currts", zzcfmVar.f9909a);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", zzcfmVar.f9911c);
                bundle.putInt("preqs_in_session", zzcfmVar.f9912d);
                bundle.putLong("time_in_session", zzcfmVar.f9913e);
                bundle.putInt("pclick", zzcfmVar.f9918j);
                bundle.putInt("pimp", zzcfmVar.f9919k);
                Context contextM5311a = zzcbu.m5311a(context);
                int identifier = contextM5311a.getResources().getIdentifier("Theme.Translucent", "style", "android");
                if (identifier == 0) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3072e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == contextM5311a.getPackageManager().getActivityInfo(new ComponentName(contextM5311a.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                            z = true;
                            bundle.putBoolean("support_transparent_background", z);
                            synchronized (zzcfmVar.f9914f) {
                                int i3 = zzcfmVar.f9920l;
                            }
                            bundle.putInt("consent_form_action_identifier", i3);
                        } else {
                            int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                            com.google.android.gms.ads.internal.util.client.zzo.m3072e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Fail to fetch AdActivity theme");
                        com.google.android.gms.ads.internal.util.client.zzo.m3072e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                z = false;
                bundle.putBoolean("support_transparent_background", z);
                synchronized (zzcfmVar.f9914f) {
                    int i6 = zzcfmVar.f9920l;
                    bundle.putInt("consent_form_action_identifier", i6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle3.putBundle("app", bundle);
        Bundle bundle4 = new Bundle();
        Iterator it = zzcfpVar.f9931x.iterator();
        if (it.hasNext()) {
            throw null;
        }
        bundle3.putBundle("slots", bundle4);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (zzcfe zzcfeVar : hashSet) {
            synchronized (zzcfeVar.f9865d) {
                try {
                    bundle2 = new Bundle();
                    bundle2.putString("seq_num", zzcfeVar.f9866e);
                    bundle2.putString("slotid", zzcfeVar.f9867f);
                    bundle2.putBoolean("ismediation", false);
                    bundle2.putLong("treq", zzcfeVar.f9871j);
                    bundle2.putLong("tresponse", zzcfeVar.f9872k);
                    bundle2.putLong("timp", zzcfeVar.f9868g);
                    bundle2.putLong("tload", zzcfeVar.f9869h);
                    bundle2.putLong("pcc", zzcfeVar.f9870i);
                    bundle2.putLong("tfetch", -1L);
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    for (zzcfd zzcfdVar : zzcfeVar.f9864c) {
                        zzcfdVar.getClass();
                        Bundle bundle5 = new Bundle();
                        bundle5.putLong("topen", zzcfdVar.f9859a);
                        bundle5.putLong("tclose", zzcfdVar.f9860b);
                        arrayList2.add(bundle5);
                    }
                    bundle2.putParcelableArrayList("tclick", arrayList2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            arrayList.add(bundle2);
        }
        bundle3.putParcelableArrayList("ads", arrayList);
        m6537a(hashSet);
        return bundle3;
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    /* JADX INFO: renamed from: v */
    public final synchronized void mo5830v(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar.f3106s != 3) {
            zzcfp zzcfpVar = this.f16117u;
            HashSet hashSet = this.f16115s;
            synchronized (zzcfpVar.f9926s) {
                zzcfpVar.f9930w.addAll(hashSet);
            }
        }
    }
}
