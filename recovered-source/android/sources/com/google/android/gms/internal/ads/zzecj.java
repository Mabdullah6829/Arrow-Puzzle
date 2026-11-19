package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import androidx.core.util.Pair;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzecj {

    /* JADX INFO: renamed from: a */
    public final Context f13568a;

    /* JADX INFO: renamed from: b */
    public final ApplicationInfo f13569b;

    /* JADX INFO: renamed from: c */
    public final int f13570c;

    /* JADX INFO: renamed from: d */
    public final int f13571d;

    /* JADX INFO: renamed from: e */
    public String f13572e = "";

    public zzecj(Context context) {
        this.f13568a = context;
        this.f13569b = context.getApplicationInfo();
        zzbio zzbioVar = zzbix.f8837xa;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        this.f13570c = ((Integer) zzbaVar.f3098c.m5030a(zzbioVar)).intValue();
        this.f13571d = ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8854ya)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final JSONObject m6154a() throws JSONException {
        String strM3197P;
        String strEncodeToString;
        ApplicationInfo applicationInfo = this.f13569b;
        Context context = this.f13568a;
        JSONObject jSONObject = new JSONObject();
        try {
            String str = applicationInfo.packageName;
            com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzs.f3626l;
            Context context2 = Wrappers.m3665a(context).f4662a;
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str, 0)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", applicationInfo.packageName);
        com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        Drawable drawable = null;
        try {
            strM3197P = com.google.android.gms.ads.internal.util.zzs.m3197P(context);
        } catch (RemoteException unused2) {
            strM3197P = null;
        }
        jSONObject.put("adMobAppId", strM3197P);
        boolean zIsEmpty = this.f13572e.isEmpty();
        int i2 = this.f13571d;
        int i3 = this.f13570c;
        if (zIsEmpty) {
            try {
                PackageManagerWrapper packageManagerWrapperM3665a = Wrappers.m3665a(context);
                String str2 = applicationInfo.packageName;
                Context context3 = packageManagerWrapperM3665a.f4662a;
                ApplicationInfo applicationInfo2 = context3.getPackageManager().getApplicationInfo(str2, 0);
                drawable = (Drawable) Pair.create(context3.getPackageManager().getApplicationLabel(applicationInfo2), context3.getPackageManager().getApplicationIcon(applicationInfo2)).second;
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                strEncodeToString = "";
            } else {
                drawable.setBounds(0, 0, i3, i2);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f13572e = strEncodeToString;
        }
        if (!this.f13572e.isEmpty()) {
            jSONObject.put("icon", this.f13572e);
            jSONObject.put("iconWidthPx", i3);
            jSONObject.put("iconHeightPx", i2);
        }
        return jSONObject;
    }
}
