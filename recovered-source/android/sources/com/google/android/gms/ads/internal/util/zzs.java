package com.google.android.gms.ads.internal.util;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.app.LocaleManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.widget.AbsListView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import androidx.activity.AbstractC0948e;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.view.ScrollingView;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbiv;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcbu;
import com.google.android.gms.internal.ads.zzcks;
import com.google.android.gms.internal.ads.zzcmi;
import com.google.android.gms.internal.ads.zzcnd;
import com.google.android.gms.internal.ads.zzdwt;
import com.google.android.gms.internal.ads.zzdzs;
import com.google.android.gms.internal.ads.zzdzt;
import com.google.android.gms.internal.ads.zzfkn;
import com.google.android.gms.internal.ads.zzfkq;
import com.google.android.gms.internal.ads.zzgtf;
import com.google.android.gms.internal.ads.zzgug;
import com.google.android.gms.internal.ads.zzhcf;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzs {

    /* JADX INFO: renamed from: l */
    public static final zzf f3626l = new zzf(Looper.getMainLooper());

    /* JADX INFO: renamed from: g */
    public String f3633g;

    /* JADX INFO: renamed from: h */
    public volatile String f3634h;

    /* JADX INFO: renamed from: a */
    public final AtomicReference f3627a = new AtomicReference(null);

    /* JADX INFO: renamed from: b */
    public final AtomicReference f3628b = new AtomicReference(null);

    /* JADX INFO: renamed from: c */
    public final AtomicReference f3629c = new AtomicReference(new Bundle());

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f3630d = new AtomicBoolean();

    /* JADX INFO: renamed from: e */
    public boolean f3631e = true;

    /* JADX INFO: renamed from: f */
    public final Object f3632f = new Object();

    /* JADX INFO: renamed from: i */
    public boolean f3635i = false;

    /* JADX INFO: renamed from: j */
    public boolean f3636j = false;

    /* JADX INFO: renamed from: k */
    public final ExecutorService f3637k = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: A */
    public static final String m3191A(final Context context, String str) {
        final Context contextCreatePackageContext;
        if (str == null) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdUtil.getUserAgent", new Exception("null afmaVersion"));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8555h)).booleanValue()) {
                return m3198Q();
            }
            str = VersionInfoParcel.m3031w().f3396s;
        }
        String strM3198Q = null;
        try {
            zzce zzceVarM3143a = zzce.m3143a();
            if (TextUtils.isEmpty(zzceVarM3143a.f3558a)) {
                AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f4161a;
                try {
                    contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    contextCreatePackageContext = null;
                }
                zzceVarM3143a.f3558a = (String) zzcb.m3142a(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcd
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        SharedPreferences sharedPreferences;
                        boolean z = false;
                        Context context2 = contextCreatePackageContext;
                        Context context3 = context;
                        if (context2 != null) {
                            zze.m3150k("Attempting to read user agent from Google Play Services.");
                            sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                        } else {
                            zze.m3150k("Attempting to read user agent from local cache.");
                            sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                            z = true;
                        }
                        String string = sharedPreferences.getString("user_agent", "");
                        if (TextUtils.isEmpty(string)) {
                            zze.m3150k("Reading user agent from WebSettings");
                            string = WebSettings.getDefaultUserAgent(context3);
                            if (z) {
                                sharedPreferences.edit().putString("user_agent", string).apply();
                                zze.m3150k("Persisting user agent.");
                            }
                        }
                        return string;
                    }
                });
            }
            strM3198Q = zzceVarM3143a.f3558a;
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(strM3198Q)) {
            strM3198Q = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(strM3198Q)) {
            strM3198Q = m3198Q();
        }
        String strM2450q = AbstractC1456a.m2450q(new StringBuilder(String.valueOf(strM3198Q).length() + 10 + String.valueOf(str).length()), strM3198Q, " (Mobile; ", str);
        try {
            if (Wrappers.m3665a(context).m3664c()) {
                StringBuilder sb = new StringBuilder(strM2450q.length() + 4);
                sb.append(strM2450q);
                sb.append(";aia");
                strM2450q = sb.toString();
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdUtil.getUserAgent", e);
        }
        return strM2450q.concat(")");
    }

    /* JADX INFO: renamed from: J */
    public static ArrayList m3192J() {
        zzbio zzbioVar = zzbix.f8436a;
        ArrayList arrayListM5024b = com.google.android.gms.ads.internal.client.zzba.f3095e.f3096a.m5024b();
        ArrayList arrayList = new ArrayList();
        int size = arrayListM5024b.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListM5024b.get(i2);
            i2++;
            Iterator it = zzgug.m7143a(zzgtf.m7124c(',')).m7146d((String) obj).iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it.next()));
                } catch (NumberFormatException unused) {
                    zze.m3150k("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: K */
    public static zzq m3193K(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            return new zzq(locale.getLanguage(), locale.getCountry());
        }
        zzq zzqVar = new zzq(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        try {
            LocaleManager localeManagerM1838c = AbstractC0948e.m1838c(context.getSystemService(AbstractC0948e.m1850o()));
            if (localeManagerM1838c == null || localeManagerM1838c.getSystemLocales().isEmpty()) {
                return zzqVar;
            }
            Locale locale2 = localeManagerM1838c.getSystemLocales().get(0);
            return new zzq(locale2.getLanguage(), locale2.getCountry());
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdUtil.getSystemDefaultLocale", th);
            return zzqVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    /* JADX INFO: renamed from: M */
    public static final boolean m3194M(View view) {
        Activity activity;
        View rootView = view.getRootView();
        if (rootView == null) {
            activity = null;
        } else {
            Context context = rootView.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                activity = null;
            }
        }
        if (activity == null) {
            return false;
        }
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        return (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: N */
    public static final void m3195N(final Context context, final WebSettings webSettings) {
        zzcb.m3142a(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzf zzfVar = zzs.f3626l;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings2 = webSettings;
                webSettings2.setDatabasePath(absolutePath);
                webSettings2.setDatabaseEnabled(true);
                webSettings2.setDomStorageEnabled(true);
                webSettings2.setDisplayZoomControls(false);
                webSettings2.setBuiltInZoomControls(true);
                webSettings2.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8743s1)).booleanValue()) {
                    webSettings2.setTextZoom(100);
                }
                webSettings2.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }

    /* JADX INFO: renamed from: O */
    public static final void m3196O(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder(CustomTabsIntent.EXTRA_SESSION, null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    /* JADX INFO: renamed from: P */
    public static final String m3197P(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return m3225x(m3226y(context));
    }

    /* JADX INFO: renamed from: Q */
    public static final String m3198Q() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    /* JADX INFO: renamed from: R */
    public static final String m3199R() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : AbstractC1456a.m2450q(new StringBuilder(String.valueOf(str).length() + 1 + str2.length()), str, " ", str2);
    }

    /* JADX INFO: renamed from: S */
    public static final HashMap m3200S(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                HashSet hashSet = new HashSet();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray != null) {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i2);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdUtil.getMapOfFileNamesToKeysFromJsonString", e);
            return map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    /* JADX INFO: renamed from: T */
    public static final long m3201T(View view) {
        float fMin = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > 0.0f);
        return Math.round((fMin >= 0.0f ? fMin : 0.0f) * 100.0f);
    }

    /* JADX INFO: renamed from: a */
    public static final int m3202a(View view) {
        ViewParent parent = view.getParent();
        while (true) {
            if (parent == null) {
                return 0;
            }
            if (parent instanceof ScrollView) {
                return 1;
            }
            if (parent instanceof AbsListView) {
                return 2;
            }
            if (parent instanceof HorizontalScrollView) {
                return 3;
            }
            if (parent instanceof ScrollingView) {
                return 4;
            }
            zzbio zzbioVar = zzbix.f8497d9;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                String str = (String) zzbaVar.f3098c.m5030a(zzbix.f8514e9);
                if (TextUtils.isEmpty(str)) {
                    continue;
                } else {
                    for (String str2 : str.split(",")) {
                        if (parent.getClass().getName().toLowerCase(Locale.ROOT).contains(str2)) {
                            return 5;
                        }
                    }
                }
            }
            parent = parent.getParent();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final zzbo m3203b(Context context) {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (!(objNewInstance instanceof IBinder)) {
                int i2 = zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3070c("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof zzbo ? (zzbo) iInterfaceQueryLocalInterface : new zzbm(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("Failed to instantiate WorkManagerUtil", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m3204c(Context context, String str) {
        Context contextM5311a = zzcbu.m5311a(context);
        return Wrappers.m3665a(contextM5311a).f4662a.getPackageManager().checkPermission(str, contextM5311a.getPackageName()) == 0;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m3205d(Context context) {
        try {
            if (DeviceProperties.f4642f == null) {
                DeviceProperties.f4642f = Boolean.valueOf(PlatformVersion.m3654b() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"));
            }
            return DeviceProperties.f4642f.booleanValue();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m3206e(String str) {
        if (!com.google.android.gms.ads.internal.util.client.zzl.m3052e()) {
            return false;
        }
        zzbio zzbioVar = zzbix.f8494d6;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (!((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            return false;
        }
        String str2 = (String) zzbaVar.f3098c.m5030a(zzbix.f8528f6);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8511e6);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m3207f(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            int i2 = zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error loading class.", th);
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdUtil.isLiteSdk", th);
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m3208g(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    return runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode() || (powerManager = (PowerManager) context.getSystemService("power")) == null || !powerManager.isScreenOn();
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m3209h(Context context) {
        try {
            Bundle bundleM3226y = m3226y(context);
            return TextUtils.isEmpty(m3225x(bundleM3226y)) && !TextUtils.isEmpty(bundleM3226y.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
        } catch (RemoteException unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m3210i(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static final void m3211j(View view, int i2) {
        String str;
        int i3;
        int iHeight;
        int iWidth;
        String str2;
        String strM6481a;
        zzfkn zzfknVarMo5565B;
        zzfkq zzfkqVarMo5587Q;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = childAt.getContext().getPackageName();
            if (childAt instanceof zzdwt) {
                childAt = ((zzdwt) childAt).getChildAt(0);
            }
            if ((childAt instanceof com.google.android.gms.ads.formats.zzh) || (childAt instanceof NativeAdView)) {
                str = "NATIVE";
                i3 = 1;
            } else {
                str = "UNKNOWN";
                i3 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
            long jM3201T = m3201T(childAt);
            childAt.getLocationOnScreen(iArr);
            int i4 = iArr[0];
            int i5 = iArr[1];
            String str3 = "none";
            if (!(childAt instanceof zzcmi) || (zzfkqVarMo5587Q = ((zzcmi) childAt).mo5587Q()) == null) {
                str2 = "none";
            } else {
                str2 = zzfkqVarMo5587Q.f15973b;
                int iHashCode = childAt.hashCode();
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(iHashCode).length());
                sb.append(str2);
                sb.append(":");
                sb.append(iHashCode);
                childAt.setContentDescription(sb.toString());
            }
            if (!(childAt instanceof zzcks) || (zzfknVarMo5565B = ((zzcks) childAt).mo5565B()) == null) {
                strM6481a = str;
            } else {
                strM6481a = zzfkn.m6481a(zzfknVarMo5565B.f15918b);
                i3 = zzfknVarMo5565B.f15924e;
                str3 = zzfknVarMo5565B.f15889E;
            }
            Locale locale = Locale.US;
            String str4 = "<Ad hashCode=" + childAt.hashCode() + ", package=" + packageName + ", adNetCls=" + str3 + ", gwsQueryId=" + str2 + ", format=" + strM6481a + ", impType=" + i3 + ", class=" + childAt.getClass().getName() + ", x=" + i4 + ", y=" + i5 + ", width=" + childAt.getWidth() + ", height=" + childAt.getHeight() + ", vWidth=" + iWidth + ", vHeight=" + iHeight + ", alpha=" + jM3201T + ", state=" + Integer.toString(i2, 2) + ">";
            int i6 = zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3072e(str4);
        } catch (Exception e) {
            int i7 = zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Failure getting view location.", e);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final AlertDialog.Builder m3212k(Context context) {
        zzu zzuVar = com.google.android.gms.ads.internal.zzt.f3698C.f3706f;
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    /* JADX INFO: renamed from: l */
    public static final void m3213l(Context context, zzfkn zzfknVar, zzdzt zzdztVar) {
        zzdzs zzdzsVarM6111a = zzdztVar.m6111a();
        zzdzsVarM6111a.m6107b("action", "can_show");
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        zzs zzsVar = zztVar.f3703c;
        zzdzsVarM6111a.m6107b("foreground", true != m3208g(context) ? "1" : "0");
        zzdzsVarM6111a.m6107b("fg_al", true == zztVar.f3707g.m4855e() ? "1" : "0");
        if (zzfknVar != null) {
            List list = zzfknVar.f15954t;
            if (!list.isEmpty()) {
                zzdzsVarM6111a.m6107b("ancn", (String) list.get(0));
            }
            zzdzsVarM6111a.m6107b(FirebaseAnalytics.Param.AD_FORMAT, zzfkn.m6481a(zzfknVar.f15918b));
        }
        zzdzsVarM6111a.m6108c();
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m3214m(zzfkn zzfknVar) {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8403Xe)).booleanValue() && zzfknVar != null && zzfknVar.f15924e == 4;
    }

    /* JADX INFO: renamed from: n */
    public static final int m3215n(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String strConcat = "Could not parse value:".concat(e.toString());
            int i2 = zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f(strConcat);
            return 0;
        }
    }

    /* JADX INFO: renamed from: o */
    public static final HashMap m3216o(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8826x)).booleanValue()) {
            HashMap map = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    map.put(str, uri.getQueryParameter(str));
                }
            }
            return map;
        }
        HashMap map2 = new HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i2 = 0;
            while (true) {
                int iIndexOf = encodedQuery.indexOf(38, i2);
                int length = encodedQuery.length();
                if (iIndexOf != -1) {
                    length = iIndexOf;
                }
                int iIndexOf2 = encodedQuery.indexOf(61, i2);
                if (iIndexOf2 > length || iIndexOf2 == -1) {
                    iIndexOf2 = length;
                }
                map2.put(Uri.decode(encodedQuery.substring(i2, iIndexOf2)), iIndexOf2 == length ? "" : Uri.decode(encodedQuery.substring(iIndexOf2 + 1, length)));
                if (iIndexOf == -1) {
                    break;
                }
                i2 = iIndexOf + 1;
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: p */
    public static final int[] m3217p(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    /* JADX INFO: renamed from: q */
    public static final int[] m3218q(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArr = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        com.google.android.gms.ads.internal.client.zzay zzayVar = com.google.android.gms.ads.internal.client.zzay.f3085g;
        return new int[]{zzayVar.f3086a.m3046i(activity, iArr[0]), zzayVar.f3086a.m3046i(activity, iArr[1])};
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m3219r(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = com.google.android.gms.ads.internal.zzt.f3698C.f3703c.f3631e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || m3194M(view);
        long jM3201T = m3201T(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z)) {
            zzbio zzbioVar = zzbix.f8326T1;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            zzbiv zzbivVar = zzbaVar.f3098c;
            zzbiv zzbivVar2 = zzbaVar.f3098c;
            if ((!((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) && (!((Boolean) zzbivVar2.m5030a(zzbix.f8400Xb)).booleanValue() || jM3201T >= ((Integer) zzbivVar2.m5030a(zzbix.f8432Zb)).intValue())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public static final void m3220s(Context context, Intent intent) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8788uc)).booleanValue()) {
            try {
                context.startActivity(intent);
                return;
            } catch (Throwable unused) {
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
        }
        try {
            try {
                context.startActivity(intent);
            } catch (Throwable unused2) {
                intent.addFlags(268435456);
                context.startActivity(intent);
            }
        } catch (SecurityException e) {
            int i2 = zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("", e);
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdUtil.startActivityWithUnknownContext", e);
        }
    }

    /* JADX INFO: renamed from: t */
    public static final void m3221t(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            m3196O(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String string = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 26);
            sb.append("Opening ");
            sb.append(string);
            sb.append(" in a new browser.");
            String string2 = sb.toString();
            int i2 = zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3068a(string2);
        } catch (ActivityNotFoundException e) {
            int i3 = zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("No browser is found.", e);
        }
    }

    /* JADX INFO: renamed from: u */
    public static int m3222u(int i2) {
        if (i2 >= 5000) {
            return i2;
        }
        if (i2 <= 0) {
            return 60000;
        }
        String strM2448o = AbstractC1456a.m2448o(new StringBuilder(String.valueOf(i2).length() + 86), "HTTP timeout too low: ", i2, " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        int i3 = zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3073f(strM2448o);
        return 60000;
    }

    /* JADX INFO: renamed from: v */
    public static final void m3223v(Context context, Intent intent, zzdzt zzdztVar, String str) {
        zzbio zzbioVar = zzbix.f8051Ce;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        if (!((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue() || !(context instanceof zzcnd)) {
            m3220s(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data == null || data.toString() == null || !data.toString().matches((String) zzbivVar2.m5030a(zzbix.f8085Ee))) {
                m3220s(context, intent);
                return;
            }
            ((zzcnd) context).m5674a(intent);
            if (!((Boolean) zzbivVar2.m5030a(zzbix.f8068De)).booleanValue() || zzdztVar == null) {
                return;
            }
            zzdzs zzdzsVarM6111a = zzdztVar.m6111a();
            zzdzsVarM6111a.m6107b("action", "hila");
            if (str == null) {
                str = "";
            }
            zzdzsVarM6111a.m6107b("gqi", str);
            zzdzsVarM6111a.m6110e();
        } catch (ActivityNotFoundException e) {
            e = e;
            int i2 = zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error occurred while starting activity for result", e);
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdUtil.startActivityForResult", e);
            m3220s(context, intent);
        } catch (SecurityException e2) {
            e = e2;
            int i3 = zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error occurred while starting activity for result", e);
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdUtil.startActivityForResult", e);
            m3220s(context, intent);
        } catch (Exception e3) {
            int i4 = zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error occurred while starting activity for result", e3);
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdUtil.startActivityForResult", e3);
            m3220s(context, intent);
        }
    }

    /* JADX INFO: renamed from: w */
    public static boolean m3224w(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: x */
    public static String m3225x(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        return (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    /* JADX INFO: renamed from: y */
    public static Bundle m3226y(Context context) {
        try {
            return Wrappers.m3665a(context).m3662a(128, context.getPackageName()).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            zze.m3151l("Error getting metadata", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: z */
    public static final void m3227z(CustomTabsIntent.Builder builder, Bundle bundle) {
        if (bundle.isEmpty()) {
            return;
        }
        int i2 = bundle.getInt("h", -1);
        if (i2 >= 0) {
            builder.setInitialActivityHeightPx(i2);
        }
        int i3 = bundle.getInt("cbp", -1);
        if (i3 < 0 || i3 > 2) {
            return;
        }
        builder.setCloseButtonPosition(i3);
    }

    /* JADX INFO: renamed from: B */
    public final void m3228B(Context context, String str, HttpURLConnection httpURLConnection, int i2) {
        int iM3222u = m3222u(i2);
        String strM2448o = AbstractC1456a.m2448o(new StringBuilder(String.valueOf(iM3222u).length() + 28), "HTTP timeout: ", iM3222u, " milliseconds.");
        int i3 = zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3072e(strM2448o);
        httpURLConnection.setConnectTimeout(iM3222u);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iM3222u);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", m3231E(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    /* JADX INFO: renamed from: C */
    public final void m3229C(Context context) {
        if (this.f3635i) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbix.m5032a(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8771tc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzr(this), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzr(this), intentFilter, 4);
        }
        this.f3635i = true;
    }

    /* JADX INFO: renamed from: D */
    public final void m3230D(Context context) {
        if (this.f3636j) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbix.m5032a(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8771tc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzp(), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzp(), intentFilter, 4);
        }
        this.f3636j = true;
    }

    /* JADX INFO: renamed from: E */
    public final String m3231E(Context context, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8117Gc)).booleanValue()) {
            if (this.f3634h != null) {
                return this.f3634h;
            }
            String strM3191A = m3191A(context, str);
            if (str != null) {
                this.f3634h = strM3191A;
            }
            return strM3191A;
        }
        synchronized (this.f3632f) {
            try {
                String str2 = this.f3633g;
                if (str2 != null) {
                    return str2;
                }
                String strM3191A2 = m3191A(context, str);
                if (str != null) {
                    this.f3633g = strM3191A2;
                }
                return strM3191A2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final ListenableFuture m3232F(final Uri uri) {
        return zzhcf.m7369c(this.f3637k, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzf zzfVar = zzs.f3626l;
                zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                return zzs.m3216o(uri);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public final void m3233G(final Context context, final String str, Bundle bundle) {
        Bundle bundleM3089b;
        zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        bundle.putString("device", m3199R());
        zzbio zzbioVar = zzbix.f8436a;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        bundle.putString("eids", TextUtils.join(",", zzbaVar.f3096a.m5023a()));
        if (bundle.isEmpty()) {
            int i2 = zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Empty or null bundle.");
        } else {
            final String str2 = (String) zzbaVar.f3098c.m5030a(zzbix.f8368Vb);
            boolean andSet = this.f3630d.getAndSet(true);
            AtomicReference atomicReference = this.f3629c;
            if (!andSet) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.ads.internal.util.zzm
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str3) {
                        this.f3617a.f3629c.set(zzac.m3089b(context, str2));
                    }
                };
                if (TextUtils.isEmpty(str2)) {
                    bundleM3089b = Bundle.EMPTY;
                } else {
                    PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    bundleM3089b = zzac.m3089b(context, str2);
                }
                atomicReference.set(bundleM3089b);
            }
            bundle.putAll((Bundle) atomicReference.get());
        }
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a;
        com.google.android.gms.ads.internal.util.client.zzf.m3032a(context, str, bundle, new com.google.android.gms.ads.internal.util.client.zze() { // from class: com.google.android.gms.ads.internal.util.zzl
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final com.google.android.gms.ads.internal.util.client.zzt zza(String str3) {
                zzf zzfVar2 = zzs.f3626l;
                zzs zzsVar2 = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                new zzbt(context, str, str3, null).mo3108b();
                return com.google.android.gms.ads.internal.util.client.zzt.f3438s;
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public final boolean m3234H(String str) {
        return m3224w(str, this.f3627a, (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8207M0));
    }

    /* JADX INFO: renamed from: I */
    public final boolean m3235I(String str) {
        return m3224w(str, this.f3628b, (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8224N0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (com.google.android.gms.ads.internal.util.client.zzf.m3042s() != false) goto L26;
     */
    /* JADX INFO: renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m3236L(android.content.Context r12, android.net.Uri r13, android.os.Bundle r14) {
        /*
            r11 = this;
            if (r12 != 0) goto L9
            java.lang.String r12 = "Trying to open chrome custom tab on a null context"
            com.google.android.gms.ads.internal.util.zze.m3150k(r12)
            r12 = 3
            return r12
        L9:
            boolean r0 = r12 instanceof android.app.Activity
            r1 = 268435456(0x10000000, float:2.524355E-29)
            java.lang.String r2 = "android.intent.action.VIEW"
            if (r0 != 0) goto L21
            android.content.Intent r14 = new android.content.Intent
            r14.<init>(r2)
            r14.setData(r13)
            r14.addFlags(r1)
            r12.startActivity(r14)
            r12 = 2
            return r12
        L21:
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbix.f8866z5
            com.google.android.gms.ads.internal.client.zzba r3 = com.google.android.gms.ads.internal.client.zzba.f3095e
            com.google.android.gms.internal.ads.zzbiv r4 = r3.f3098c
            com.google.android.gms.internal.ads.zzbiv r3 = r3.f3098c
            java.lang.Object r0 = r4.m5030a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r4 = 5
            if (r0 == 0) goto L70
            androidx.browser.customtabs.CustomTabsIntent$Builder r0 = new androidx.browser.customtabs.CustomTabsIntent$Builder
            com.google.android.gms.ads.internal.zzt r1 = com.google.android.gms.ads.internal.zzt.f3698C
            com.google.android.gms.internal.ads.zzbjw r1 = r1.f3714n
            androidx.browser.customtabs.CustomTabsSession r1 = r1.m5046a()
            r0.<init>(r1)
            m3227z(r0, r14)
            androidx.browser.customtabs.CustomTabsIntent r14 = r0.build()
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbix.f8229N5
            java.lang.Object r0 = r3.m5030a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L63
            com.google.android.gms.ads.internal.client.zzay r0 = com.google.android.gms.ads.internal.client.zzay.f3085g
            com.google.android.gms.ads.internal.util.client.zzf r0 = r0.f3086a
            boolean r0 = com.google.android.gms.ads.internal.util.client.zzf.m3042s()
            if (r0 == 0) goto L63
            goto La6
        L63:
            android.content.Intent r0 = r14.intent
            java.lang.String r1 = com.google.android.gms.internal.ads.zzinp.m8562a(r12)
            r0.setPackage(r1)
            r14.launchUrl(r12, r13)
            return r4
        L70:
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbix.f8832x5
            java.lang.Object r0 = r3.m5030a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La7
            com.google.android.gms.internal.ads.zzbjy r7 = new com.google.android.gms.internal.ads.zzbjy
            r7.<init>()
            com.google.android.gms.ads.internal.util.zzk r5 = new com.google.android.gms.ads.internal.util.zzk
            r6 = r11
            r9 = r12
            r10 = r13
            r8 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r7.f8920d = r5
            r12 = r9
            android.app.Activity r12 = (android.app.Activity) r12
            androidx.browser.customtabs.CustomTabsClient r13 = r7.f8918b
            if (r13 == 0) goto L96
            goto La6
        L96:
            java.lang.String r13 = com.google.android.gms.internal.ads.zzinp.m8562a(r12)
            if (r13 == 0) goto La6
            com.google.android.gms.internal.ads.zzinq r14 = new com.google.android.gms.internal.ads.zzinq
            r14.<init>(r7)
            r7.f8919c = r14
            androidx.browser.customtabs.CustomTabsClient.bindCustomTabsService(r12, r13, r14)
        La6:
            return r4
        La7:
            r9 = r12
            r10 = r13
            android.content.Intent r12 = new android.content.Intent
            r12.<init>(r2)
            r12.setData(r10)
            r12.addFlags(r1)
            r9.startActivity(r12)
            r12 = 9
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzs.m3236L(android.content.Context, android.net.Uri, android.os.Bundle):int");
    }
}
