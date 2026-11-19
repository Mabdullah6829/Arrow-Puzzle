package com.google.android.gms.ads.internal.util.client;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzeg;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzblg;
import com.google.android.gms.internal.ads.zzgax;
import com.google.firebase.firestore.BuildConfig;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
public final class zzf {

    /* JADX INFO: renamed from: b */
    public static final zzgax f3409b = new zzgax(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    public static final String f3410c = AdView.class.getName();

    /* JADX INFO: renamed from: d */
    public static final String f3411d = InterstitialAd.class.getName();

    /* JADX INFO: renamed from: e */
    public static final String f3412e = AdManagerAdView.class.getName();

    /* JADX INFO: renamed from: f */
    public static final String f3413f = AdManagerInterstitialAd.class.getName();

    /* JADX INFO: renamed from: g */
    public static final String f3414g = AdLoader.class.getName();

    /* JADX INFO: renamed from: a */
    public float f3415a = -1.0f;

    /* JADX INFO: renamed from: a */
    public static final void m3032a(Context context, String str, Bundle bundle, zze zzeVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            GoogleApiAvailabilityLight.f4157b.getClass();
            int iM3401a = GoogleApiAvailabilityLight.m3401a(context);
            str = AbstractC0271e0.m402j(new StringBuilder(String.valueOf(iM3401a).length() + 10), ".261710000", iM3401a);
        }
        bundle.putString("js", str);
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(ProxyConfig.MATCH_HTTPS).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str2 : bundle.keySet()) {
            builderAppendQueryParameter.appendQueryParameter(str2, bundle.getString(str2));
        }
        zzeVar.zza(builderAppendQueryParameter.toString());
    }

    /* JADX INFO: renamed from: b */
    public static final int m3033b(Context context, int i2) {
        return m3041r(context.getResources().getDisplayMetrics(), i2);
    }

    /* JADX INFO: renamed from: c */
    public static final String m3034c(Context context) {
        zzbix.m5032a(context);
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || m3042s()) {
            string = BuildConfig.TARGET_BACKEND;
        }
        return m3035d(string, "MD5");
    }

    /* JADX INFO: renamed from: d */
    public static String m3035d(String str, String str2) {
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final void m3036h(BaseAdView baseAdView, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, int i2, int i3) {
        if (baseAdView.getChildCount() != 0) {
            return;
        }
        Context context = baseAdView.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i2);
        textView.setBackgroundColor(i3);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i2);
        int iM3033b = m3033b(context, 3);
        int i4 = zzrVar.f3262x;
        int i5 = zzrVar.f3259u;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(i4 - iM3033b, i5 - iM3033b, 17));
        baseAdView.addView(frameLayout, i4, i5);
    }

    /* JADX INFO: renamed from: j */
    public static ActivityManager.MemoryInfo m3037j(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (NullPointerException unused) {
            zzo.m3073f("Error retrieving the memory information.");
            return memoryInfo;
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m3038k(Context context) {
        if (context == null) {
            return null;
        }
        try {
            Bundle bundle = Wrappers.m3665a(context).m3662a(128, context.getPackageName()).metaData;
            if (bundle != null && bundle.containsKey("com.google.unity.ads.UNITY_VERSION")) {
                return bundle.getString("com.google.unity.ads.UNITY_VERSION");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m3039p(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) zzblg.f9126d.m5057c());
    }

    /* JADX INFO: renamed from: q */
    public static PreloadConfiguration m3040q(zzfp zzfpVar) {
        String str = zzfpVar.f3189s;
        if (AdFormat.m2747b(zzfpVar.f3190t) == null) {
            return null;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfpVar.f3191u;
        AdRequest.Builder builder = new AdRequest.Builder();
        List list = zzmVar.f3231w;
        zzeg zzegVar = builder.f2926a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzegVar.f3112a.add((String) it.next());
            }
        }
        zzegVar.f3113b.putAll(zzmVar.f3210E);
        Bundle bundle = zzmVar.f3211F;
        for (String str2 : bundle.keySet()) {
            builder.m2740a(str2, bundle.getString(str2));
        }
        zzegVar.f3124m = zzmVar.f3221P;
        String str3 = zzmVar.f3209D;
        if (str3 != null) {
            builder.m2743d(str3);
        }
        builder.m2744e(zzmVar.f3219N);
        zzegVar.f3121j = zzmVar.f3213H;
        new AdRequest(builder);
        new AdRequest(new AdRequest.Builder());
        return new PreloadConfiguration();
    }

    /* JADX INFO: renamed from: r */
    public static final int m3041r(DisplayMetrics displayMetrics, int i2) {
        return (int) TypedValue.applyDimension(1, i2, displayMetrics);
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m3042s() {
        boolean zBooleanValue = ((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8253Oc)).booleanValue();
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        if (str.contains("generic") || str.contains(BuildConfig.TARGET_BACKEND)) {
            return true;
        }
        return zBooleanValue && Build.HARDWARE.contains("ranchu");
    }

    /* JADX INFO: renamed from: e */
    public final JSONArray m3043e(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m3044f(jSONArray, it.next());
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: f */
    public final void m3044f(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(m3049n((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(m3048m((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(m3043e((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(m3050o((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m3045g(JSONObject jSONObject, String str, Object obj) throws JSONException {
        Boolean[] boolArr;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8775u)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, m3049n((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, m3048m((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), m3043e((Collection) obj));
            return;
        }
        if (obj instanceof Object[]) {
            jSONObject.put(str, m3043e(Arrays.asList((Object[]) obj)));
            return;
        }
        int i2 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            if (iArr == null) {
                numArr = new Integer[0];
            } else {
                int length = iArr.length;
                Integer[] numArr2 = new Integer[length];
                while (i2 < length) {
                    numArr2[i2] = Integer.valueOf(iArr[i2]);
                    i2++;
                }
                numArr = numArr2;
            }
            jSONObject.put(str, m3050o(numArr));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr2 = (double[]) obj;
            if (dArr2 == null) {
                dArr = new Double[0];
            } else {
                int length2 = dArr2.length;
                Double[] dArr3 = new Double[length2];
                while (i2 < length2) {
                    dArr3[i2] = Double.valueOf(dArr2[i2]);
                    i2++;
                }
                dArr = dArr3;
            }
            jSONObject.put(str, m3050o(dArr));
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            if (jArr == null) {
                lArr = new Long[0];
            } else {
                int length3 = jArr.length;
                Long[] lArr2 = new Long[length3];
                while (i2 < length3) {
                    lArr2[i2] = Long.valueOf(jArr[i2]);
                    i2++;
                }
                lArr = lArr2;
            }
            jSONObject.put(str, m3050o(lArr));
            return;
        }
        if (!(obj instanceof boolean[])) {
            jSONObject.put(str, obj);
            return;
        }
        boolean[] zArr = (boolean[]) obj;
        if (zArr == null) {
            boolArr = new Boolean[0];
        } else {
            int length4 = zArr.length;
            Boolean[] boolArr2 = new Boolean[length4];
            while (i2 < length4) {
                boolArr2[i2] = Boolean.valueOf(zArr[i2]);
                i2++;
            }
            boolArr = boolArr2;
        }
        jSONObject.put(str, m3050o(boolArr));
    }

    /* JADX INFO: renamed from: i */
    public final int m3046i(Context context, int i2) {
        if (this.f3415a < 0.0f) {
            synchronized (this) {
                try {
                    if (this.f3415a < 0.0f) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        if (windowManager == null) {
                            return 0;
                        }
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        this.f3415a = displayMetrics.density;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Math.round(i2 / this.f3415a);
    }

    /* JADX INFO: renamed from: l */
    public final void m3047l(final Context context, String str, Bundle bundle) {
        m3032a(context, str, bundle, new zze() { // from class: com.google.android.gms.ads.internal.util.client.zzd
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final /* synthetic */ zzt zza(String str2) {
                new zzc(this.f3407a, context, str2).start();
                return zzt.f3438s;
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final JSONObject m3048m(Map map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                m3045g(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e.getMessage())));
        }
    }

    /* JADX INFO: renamed from: n */
    public final JSONObject m3049n(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m3045g(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: o */
    public final JSONArray m3050o(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            m3044f(jSONArray, obj);
        }
        return jSONArray;
    }
}
