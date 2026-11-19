package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import androidx.core.app.NotificationCompat;
import androidx.webkit.internal.AssetHelper;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzecv;
import com.google.android.gms.internal.ads.zzecz;
import com.google.android.gms.internal.ads.zzgax;
import com.google.android.gms.internal.ads.zzhcp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
public final class zzat {

    /* JADX INFO: renamed from: a */
    public final Context f3481a;

    /* JADX INFO: renamed from: b */
    public final zzecz f3482b;

    /* JADX INFO: renamed from: c */
    public String f3483c;

    /* JADX INFO: renamed from: d */
    public String f3484d;

    /* JADX INFO: renamed from: e */
    public String f3485e;

    /* JADX INFO: renamed from: f */
    public String f3486f;

    /* JADX INFO: renamed from: h */
    public final int f3488h;

    /* JADX INFO: renamed from: i */
    public PointF f3489i;

    /* JADX INFO: renamed from: j */
    public PointF f3490j;

    /* JADX INFO: renamed from: k */
    public final zzgax f3491k;

    /* JADX INFO: renamed from: g */
    public int f3487g = 0;

    /* JADX INFO: renamed from: l */
    public final Runnable f3492l = new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzas
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            zzat zzatVar = this.f3480s;
            zzatVar.f3487g = 4;
            zzatVar.m3092b();
        }
    };

    public zzat(Context context) {
        this.f3481a = context;
        this.f3488h = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        zztVar.f3720t.m3128a();
        this.f3491k = zztVar.f3720t.f3536b;
        this.f3482b = zztVar.f3715o.f3506g;
    }

    /* JADX INFO: renamed from: e */
    public static final int m3090e(ArrayList arrayList, String str, boolean z) {
        if (!z) {
            return -1;
        }
        arrayList.add(str);
        return arrayList.size() - 1;
    }

    /* JADX INFO: renamed from: a */
    public final void m3091a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f3487g = 0;
            this.f3489i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i2 = this.f3487g;
        if (i2 == -1) {
            return;
        }
        Runnable runnable = this.f3492l;
        zzgax zzgaxVar = this.f3491k;
        if (i2 == 0) {
            if (actionMasked == 5) {
                this.f3487g = 5;
                this.f3490j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                zzgaxVar.postDelayed(runnable, ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8297R5)).longValue());
                return;
            }
            return;
        }
        if (i2 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z = false;
                for (int i3 = 0; i3 < historySize; i3++) {
                    z |= !m3093c(motionEvent.getHistoricalX(0, i3), motionEvent.getHistoricalY(0, i3), motionEvent.getHistoricalX(1, i3), motionEvent.getHistoricalY(1, i3));
                }
                if (m3093c(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                    return;
                }
            }
            this.f3487g = -1;
            zzgaxVar.removeCallbacks(runnable);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3092b() {
        String str;
        try {
            Context context = this.f3481a;
            if (!(context instanceof Activity)) {
                int i2 = zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3072e("Can not create dialog without Activity Context");
                return;
            }
            com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
            zzax zzaxVar = zztVar.f3715o;
            synchronized (zzaxVar.f3500a) {
                str = zzaxVar.f3502c;
            }
            String str2 = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(str)) {
                str2 = "Creative preview";
            }
            String str3 = true != zztVar.f3715o.m3103h() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iM3090e = m3090e(arrayList, "Ad information", true);
            final int iM3090e2 = m3090e(arrayList, str2, true);
            final int iM3090e3 = m3090e(arrayList, str3, true);
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8871za)).booleanValue();
            final int iM3090e4 = m3090e(arrayList, "Open ad inspector", zBooleanValue);
            final int iM3090e5 = m3090e(arrayList, "Ad inspector settings", zBooleanValue);
            AlertDialog.Builder builderM3212k = zzs.m3212k(context);
            builderM3212k.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzad
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    final zzat zzatVar = this.f3453s;
                    zzecz zzeczVar = zzatVar.f3482b;
                    if (i3 != iM3090e) {
                        if (i3 == iM3090e2) {
                            int i4 = zze.f3574b;
                            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Debug mode [Creative Preview] selected.");
                            zzcfy.f9946a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaf
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzat zzatVar2 = zzatVar;
                                    com.google.android.gms.ads.internal.zzt zztVar2 = com.google.android.gms.ads.internal.zzt.f3698C;
                                    zzax zzaxVar2 = zztVar2.f3715o;
                                    Context context2 = zzatVar2.f3481a;
                                    String str4 = zzatVar2.f3484d;
                                    String str5 = zzatVar2.f3485e;
                                    zzaxVar2.getClass();
                                    zzbio zzbioVar = zzbix.f8330T5;
                                    com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                                    String strM3095j = zzax.m3095j(context2, zzaxVar2.m3105k(context2, (String) zzbaVar.f3098c.m5030a(zzbioVar), str4, str5).toString(), str5);
                                    if (TextUtils.isEmpty(strM3095j)) {
                                        int i5 = zze.f3574b;
                                        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Not linked for in app preview.");
                                    } else {
                                        try {
                                            JSONObject jSONObject = new JSONObject(strM3095j.trim());
                                            String strOptString = jSONObject.optString("gct");
                                            zzaxVar2.f3505f = jSONObject.optString(NotificationCompat.CATEGORY_STATUS);
                                            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8871za)).booleanValue()) {
                                                String str6 = zzaxVar2.f3505f;
                                                boolean z = "0".equals(str6) || "2".equals(str6);
                                                zzaxVar2.m3101f(z);
                                                zztVar2.f3708h.m5387g().m3178b(!z ? "" : str4);
                                            }
                                            synchronized (zzaxVar2.f3500a) {
                                                zzaxVar2.f3502c = strOptString;
                                            }
                                            String str7 = zzaxVar2.f3505f;
                                            if ("2".equals(str7)) {
                                                int i6 = zze.f3574b;
                                                com.google.android.gms.ads.internal.util.client.zzo.m3068a("Creative is not pushed for this device.");
                                                zzaxVar2.m3104i(context2, "There was no creative pushed from DFP to the device.", false, false);
                                                return;
                                            } else if ("1".equals(str7)) {
                                                int i7 = zze.f3574b;
                                                com.google.android.gms.ads.internal.util.client.zzo.m3068a("The app is not linked for creative preview.");
                                                zzaxVar2.m3098c(context2, str4, str5);
                                                return;
                                            } else {
                                                if ("0".equals(str7)) {
                                                    int i8 = zze.f3574b;
                                                    com.google.android.gms.ads.internal.util.client.zzo.m3068a("Device is linked for in app preview.");
                                                    zzaxVar2.m3104i(context2, "The device is successfully linked for creative preview.", false, true);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (JSONException e) {
                                            int i9 = zze.f3574b;
                                            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Fail to get in app preview response json.", e);
                                        }
                                    }
                                    zzaxVar2.m3104i(context2, "In-app preview failed to load because of a system error. Please try again later.", true, true);
                                }
                            });
                            return;
                        }
                        if (i3 == iM3090e3) {
                            int i5 = zze.f3574b;
                            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Debug mode [Troubleshooting] selected.");
                            zzcfy.f9946a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzag
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzat zzatVar2 = zzatVar;
                                    zzax zzaxVar2 = com.google.android.gms.ads.internal.zzt.f3698C.f3715o;
                                    String str4 = zzatVar2.f3484d;
                                    String str5 = zzatVar2.f3485e;
                                    String str6 = zzatVar2.f3486f;
                                    boolean zM3103h = zzaxVar2.m3103h();
                                    Context context2 = zzatVar2.f3481a;
                                    boolean zM3097b = zzaxVar2.m3097b(context2, str4, str5);
                                    synchronized (zzaxVar2.f3500a) {
                                        zzaxVar2.f3503d = zM3097b;
                                    }
                                    if (!zzaxVar2.m3103h()) {
                                        zzaxVar2.m3098c(context2, str4, str5);
                                        return;
                                    }
                                    if (!zM3103h && !TextUtils.isEmpty(str6)) {
                                        zzaxVar2.m3100e(context2, str5, str6, str4);
                                    }
                                    int i6 = zze.f3574b;
                                    com.google.android.gms.ads.internal.util.client.zzo.m3068a("Device is linked for debug signals.");
                                    zzaxVar2.m3104i(context2, "The device is successfully linked for troubleshooting.", false, true);
                                }
                            });
                            return;
                        }
                        if (i3 == iM3090e4) {
                            final zzhcp zzhcpVar = zzcfy.f9951f;
                            zzhcp zzhcpVar2 = zzcfy.f9946a;
                            if (zzeczVar.m6167f()) {
                                zzhcpVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaq
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzat zzatVar2 = zzatVar;
                                        zzatVar2.getClass();
                                        com.google.android.gms.ads.internal.zzt.f3698C.f3715o.m3096a(zzatVar2.f3481a);
                                    }
                                });
                                return;
                            } else {
                                zzhcpVar2.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzap
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        com.google.android.gms.ads.internal.zzt zztVar2 = com.google.android.gms.ads.internal.zzt.f3698C;
                                        zzax zzaxVar2 = zztVar2.f3715o;
                                        final zzat zzatVar2 = zzatVar;
                                        Context context2 = zzatVar2.f3481a;
                                        if (!zzaxVar2.m3097b(context2, zzatVar2.f3484d, zzatVar2.f3485e)) {
                                            zztVar2.f3715o.m3098c(context2, zzatVar2.f3484d, zzatVar2.f3485e);
                                        } else {
                                            zzhcpVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzai
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    zzat zzatVar3 = zzatVar2;
                                                    zzatVar3.getClass();
                                                    com.google.android.gms.ads.internal.zzt.f3698C.f3715o.m3096a(zzatVar3.f3481a);
                                                }
                                            });
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        if (i3 == iM3090e5) {
                            final zzhcp zzhcpVar3 = zzcfy.f9951f;
                            zzhcp zzhcpVar4 = zzcfy.f9946a;
                            if (zzeczVar.m6167f()) {
                                zzhcpVar3.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzae
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        zzat zzatVar2 = zzatVar;
                                        zzatVar2.m3094d(zzatVar2.f3481a);
                                    }
                                });
                                return;
                            } else {
                                zzhcpVar4.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzar
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        com.google.android.gms.ads.internal.zzt zztVar2 = com.google.android.gms.ads.internal.zzt.f3698C;
                                        zzax zzaxVar2 = zztVar2.f3715o;
                                        final zzat zzatVar2 = zzatVar;
                                        Context context2 = zzatVar2.f3481a;
                                        if (!zzaxVar2.m3097b(context2, zzatVar2.f3484d, zzatVar2.f3485e)) {
                                            zztVar2.f3715o.m3098c(context2, zzatVar2.f3484d, zzatVar2.f3485e);
                                        } else {
                                            zzhcpVar3.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzah
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    zzat zzatVar3 = zzatVar2;
                                                    zzatVar3.m3094d(zzatVar3.f3481a);
                                                }
                                            });
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        return;
                    }
                    Context context2 = zzatVar.f3481a;
                    if (!(context2 instanceof Activity)) {
                        int i6 = zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3072e("Can not create dialog without Activity Context");
                        return;
                    }
                    String str4 = zzatVar.f3483c;
                    final String str5 = "No debug information";
                    if (!TextUtils.isEmpty(str4)) {
                        Uri uriBuild = new Uri.Builder().encodedQuery(str4.replaceAll("\\+", "%20")).build();
                        StringBuilder sb = new StringBuilder();
                        zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                        HashMap mapM3216o = zzs.m3216o(uriBuild);
                        for (String str6 : mapM3216o.keySet()) {
                            sb.append(str6);
                            sb.append(" = ");
                            sb.append((String) mapM3216o.get(str6));
                            sb.append("\n\n");
                        }
                        String strTrim = sb.toString().trim();
                        if (!TextUtils.isEmpty(strTrim)) {
                            str5 = strTrim;
                        }
                    }
                    zzs zzsVar2 = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                    AlertDialog.Builder builderM3212k2 = zzs.m3212k(context2);
                    builderM3212k2.setMessage(str5);
                    builderM3212k2.setTitle("Ad Information");
                    builderM3212k2.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzan
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i7) {
                            zzat zzatVar2 = zzatVar;
                            zzatVar2.getClass();
                            zzs zzsVar3 = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                            zzs.m3220s(zzatVar2.f3481a, Intent.createChooser(new Intent("android.intent.action.SEND").setType(AssetHelper.DEFAULT_MIME_TYPE).putExtra("android.intent.extra.TEXT", str5), "Share via"));
                        }
                    });
                    builderM3212k2.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzao
                        @Override // android.content.DialogInterface.OnClickListener
                        public final /* synthetic */ void onClick(DialogInterface dialogInterface2, int i7) {
                        }
                    });
                    builderM3212k2.create().show();
                }
            });
            builderM3212k.create().show();
        } catch (WindowManager.BadTokenException e) {
            zze.m3151l("", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3093c(float f2, float f3, float f4, float f5) {
        float fAbs = Math.abs(this.f3489i.x - f2);
        int i2 = this.f3488h;
        return fAbs < ((float) i2) && Math.abs(this.f3489i.y - f3) < ((float) i2) && Math.abs(this.f3490j.x - f4) < ((float) i2) && Math.abs(this.f3490j.y - f5) < ((float) i2);
    }

    /* JADX INFO: renamed from: d */
    public final void m3094d(Context context) {
        final int i2;
        ArrayList arrayList = new ArrayList();
        int iM3090e = m3090e(arrayList, "None", true);
        final int iM3090e2 = m3090e(arrayList, "Shake", true);
        final int iM3090e3 = m3090e(arrayList, "Flick", true);
        int iOrdinal = this.f3482b.f13647r.ordinal();
        if (iOrdinal != 1) {
            i2 = iOrdinal != 2 ? iM3090e : iM3090e3;
        } else {
            i2 = iM3090e2;
        }
        zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        AlertDialog.Builder builderM3212k = zzs.m3212k(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i2);
        builderM3212k.setTitle("Setup gesture");
        builderM3212k.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i2, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzaj
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i3) {
                atomicInteger.set(i3);
            }
        });
        builderM3212k.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzak
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i3) {
                this.f3465s.m3092b();
            }
        });
        builderM3212k.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzal
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                zzat zzatVar = this.f3466s;
                zzecz zzeczVar = zzatVar.f3482b;
                AtomicInteger atomicInteger2 = atomicInteger;
                if (atomicInteger2.get() != i2) {
                    if (atomicInteger2.get() == iM3090e2) {
                        zzeczVar.m6169h(zzecv.f13622t, true);
                    } else if (atomicInteger2.get() == iM3090e3) {
                        zzeczVar.m6169h(zzecv.f13623u, true);
                    } else {
                        zzeczVar.m6169h(zzecv.f13621s, true);
                    }
                }
                zzatVar.m3092b();
            }
        });
        builderM3212k.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.ads.internal.util.zzam
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                this.f3471s.m3092b();
            }
        });
        builderM3212k.create().show();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f3483c);
        sb.append(",DebugSignal: ");
        sb.append(this.f3486f);
        sb.append(",AFMA Version: ");
        sb.append(this.f3485e);
        sb.append(",Ad Unit ID: ");
        return AbstractC0271e0.m403k(sb, this.f3484d, "}");
    }
}
