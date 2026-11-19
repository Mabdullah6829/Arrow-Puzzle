package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfuy extends zzfuu {

    /* JADX INFO: renamed from: a */
    public final zzfuw f16613a;

    /* JADX INFO: renamed from: d */
    public zzfwi f16616d;

    /* JADX INFO: renamed from: g */
    public final String f16619g;

    /* JADX INFO: renamed from: b */
    public final zzfvw f16614b = new zzfvw();

    /* JADX INFO: renamed from: e */
    public boolean f16617e = false;

    /* JADX INFO: renamed from: f */
    public boolean f16618f = false;

    /* JADX INFO: renamed from: c */
    public zzfxj f16615c = new zzfxj(null);

    public zzfuy(zzfuv zzfuvVar, zzfuw zzfuwVar, String str) {
        this.f16613a = zzfuwVar;
        this.f16619g = str;
        zzfux zzfuxVar = zzfuwVar.f16608g;
        if (zzfuxVar == zzfux.HTML || zzfuxVar == zzfux.JAVASCRIPT) {
            WebView webView = zzfuwVar.f16603b;
            zzfwj zzfwjVar = new zzfwj(str);
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            zzfwjVar.f16703b = new zzfxk(webView);
            this.f16616d = zzfwjVar;
        } else {
            this.f16616d = new zzfwm(str, Collections.unmodifiableMap(zzfuwVar.f16605d));
        }
        this.f16616d.mo6741a();
        zzfvs.f16671c.f16672a.add(this);
        zzfwi zzfwiVar = this.f16616d;
        zzfwiVar.getClass();
        zzfvz zzfvzVar = zzfvz.f16687a;
        WebView webViewM6743c = zzfwiVar.m6743c();
        String str2 = zzfwiVar.f16702a;
        JSONObject jSONObject = new JSONObject();
        zzfwo.m6748b(jSONObject, "impressionOwner", zzfuvVar.f16597a);
        zzfwo.m6748b(jSONObject, "mediaEventsOwner", zzfuvVar.f16598b);
        zzfwo.m6748b(jSONObject, "creativeType", zzfuvVar.f16600d);
        zzfwo.m6748b(jSONObject, "impressionType", zzfuvVar.f16601e);
        zzfwo.m6748b(jSONObject, "isolateVerificationScripts", Boolean.valueOf(zzfuvVar.f16599c));
        zzfvzVar.m6735a(webViewM6743c, "init", jSONObject, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfuu
    /* JADX INFO: renamed from: a */
    public final void mo6721a(View view) {
        if (this.f16618f || ((View) this.f16615c.get()) == view) {
            return;
        }
        this.f16615c = new zzfxj(view);
        zzfwi zzfwiVar = this.f16616d;
        zzfwiVar.getClass();
        zzfwiVar.f16704c = System.nanoTime();
        zzfwiVar.f16705d = 1;
        Collection<zzfuy> collectionUnmodifiableCollection = Collections.unmodifiableCollection(zzfvs.f16671c.f16672a);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (zzfuy zzfuyVar : collectionUnmodifiableCollection) {
            if (zzfuyVar != this && ((View) zzfuyVar.f16615c.get()) == view) {
                zzfuyVar.f16615c.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuu
    /* JADX INFO: renamed from: b */
    public final void mo6722b() {
        if (this.f16618f) {
            return;
        }
        this.f16615c.clear();
        if (!this.f16618f) {
            this.f16614b.f16682a.clear();
        }
        this.f16618f = true;
        zzfwi zzfwiVar = this.f16616d;
        zzfwiVar.getClass();
        zzfvz.f16687a.m6735a(zzfwiVar.m6743c(), "finishSession", zzfwiVar.f16702a);
        zzfvs zzfvsVar = zzfvs.f16671c;
        ArrayList arrayList = zzfvsVar.f16672a;
        ArrayList arrayList2 = zzfvsVar.f16673b;
        boolean z = arrayList2.size() > 0;
        arrayList.remove(this);
        arrayList2.remove(this);
        if (z && arrayList2.size() <= 0) {
            zzfwa zzfwaVarM6737a = zzfwa.m6737a();
            zzfwaVarM6737a.getClass();
            zzfxc zzfxcVar = zzfxc.f16735g;
            zzfxcVar.getClass();
            Handler handler = zzfxc.f16737i;
            if (handler != null) {
                handler.removeCallbacks(zzfxc.f16739k);
                zzfxc.f16737i = null;
            }
            zzfxcVar.f16740a.clear();
            zzfxc.f16736h.post(new zzfwx(zzfxcVar));
            zzfvr zzfvrVar = zzfvr.f16670v;
            zzfvrVar.f16674s = false;
            zzfvrVar.f16676u = null;
            zzfvo zzfvoVar = zzfwaVarM6737a.f16691b;
            zzfvoVar.f16659b.getContentResolver().unregisterContentObserver(zzfvoVar);
        }
        this.f16616d.mo6742b();
        this.f16616d = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfuu
    /* JADX INFO: renamed from: c */
    public final void mo6723c(View view, zzfvb zzfvbVar) {
        if (this.f16618f) {
            return;
        }
        this.f16614b.m6733a(view, zzfvbVar);
    }

    /* JADX INFO: renamed from: d */
    public final void m6725d() {
        if (this.f16617e || this.f16616d == null) {
            return;
        }
        this.f16617e = true;
        ArrayList arrayList = zzfvs.f16671c.f16673b;
        boolean z = arrayList.size() > 0;
        arrayList.add(this);
        if (!z) {
            zzfwa zzfwaVarM6737a = zzfwa.m6737a();
            zzfwaVarM6737a.getClass();
            zzfvr zzfvrVar = zzfvr.f16670v;
            zzfvrVar.f16676u = zzfwaVarM6737a;
            zzfvrVar.f16674s = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z2 = runningAppProcessInfo.importance == 100 || zzfvrVar.mo6731a();
            zzfvrVar.f16675t = z2;
            zzfvrVar.mo6732b(z2);
            zzfxc.f16735g.getClass();
            zzfxc.m6755b();
            zzfvo zzfvoVar = zzfwaVarM6737a.f16691b;
            zzfvoVar.getClass();
            zzfvoVar.f16663f.submit(new zzfvn(zzfvoVar));
            zzfvoVar.f16659b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, zzfvoVar);
        }
        float f2 = zzfwa.m6737a().f16690a;
        zzfwi zzfwiVar = this.f16616d;
        zzfwiVar.getClass();
        zzfvz.f16687a.m6735a(zzfwiVar.m6743c(), "setDeviceVolume", Float.valueOf(f2), zzfwiVar.f16702a);
        zzfwi zzfwiVar2 = this.f16616d;
        Date date = zzfvq.f16665e.f16666a;
        zzfwiVar2.m6746f(date != null ? (Date) date.clone() : null);
        this.f16616d.mo6744d(this, this.f16613a);
    }
}
