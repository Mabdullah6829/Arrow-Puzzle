package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.arrow.puzzle.escape.maze.free.game.R;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.messaging.Constants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzchi extends FrameLayout implements zzcgz {

    /* JADX INFO: renamed from: A */
    public boolean f10015A;

    /* JADX INFO: renamed from: B */
    public boolean f10016B;

    /* JADX INFO: renamed from: C */
    public boolean f10017C;

    /* JADX INFO: renamed from: D */
    public long f10018D;

    /* JADX INFO: renamed from: E */
    public long f10019E;

    /* JADX INFO: renamed from: F */
    public String f10020F;

    /* JADX INFO: renamed from: G */
    public String[] f10021G;

    /* JADX INFO: renamed from: H */
    public Bitmap f10022H;

    /* JADX INFO: renamed from: I */
    public final ImageView f10023I;

    /* JADX INFO: renamed from: J */
    public boolean f10024J;

    /* JADX INFO: renamed from: s */
    public final zzchu f10025s;

    /* JADX INFO: renamed from: t */
    public final FrameLayout f10026t;

    /* JADX INFO: renamed from: u */
    public final View f10027u;

    /* JADX INFO: renamed from: v */
    public final zzbjm f10028v;

    /* JADX INFO: renamed from: w */
    public final zzchw f10029w;

    /* JADX INFO: renamed from: x */
    public final long f10030x;

    /* JADX INFO: renamed from: y */
    public final zzcha f10031y;

    /* JADX INFO: renamed from: z */
    public boolean f10032z;

    public zzchi(Context context, zzchu zzchuVar, int i2, boolean z, zzbjm zzbjmVar, zzcht zzchtVar, zzdzt zzdztVar) {
        zzbjm zzbjmVar2;
        zzcha zzcgyVar;
        zzcha zzckqVar;
        super(context);
        this.f10025s = zzchuVar;
        this.f10028v = zzbjmVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10026t = frameLayout;
        zzbio zzbioVar = zzbix.f8758t;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
            frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.m3544h(zzchuVar.zzk());
        zzchm zzchmVar = zzchuVar.zzk().f3639a;
        zzchv zzchvVar = new zzchv(context, zzchuVar.mo5472h(), zzchuVar.mo5470e(), zzbjmVar, zzchuVar.zzi());
        if (i2 == 3) {
            zzckqVar = new zzckq(context, zzchvVar);
            zzbjmVar2 = zzbjmVar;
        } else {
            if (i2 == 2) {
                zzchuVar.mo5609p().getClass();
                zzcgyVar = new zzcim(context, zzchvVar, zzchuVar, z, zzchtVar, zzdztVar);
                zzbjmVar2 = zzbjmVar;
            } else {
                zzbjmVar2 = zzbjmVar;
                zzcgyVar = new zzcgy(context, zzchuVar, z, zzchuVar.mo5609p().m5677b(), new zzchv(context, zzchuVar.mo5472h(), zzchuVar.mo5470e(), zzbjmVar, zzchuVar.zzi()), zzdztVar);
            }
            zzckqVar = zzcgyVar;
        }
        this.f10031y = zzckqVar;
        View view = new View(context);
        this.f10027u = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzckqVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8691p0)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8640m0)).booleanValue()) {
            m5432a();
        }
        this.f10023I = new ImageView(context);
        this.f10030x = ((Long) zzbivVar2.m5030a(zzbix.f8725r0)).longValue();
        boolean zBooleanValue = ((Boolean) zzbivVar2.m5030a(zzbix.f8674o0)).booleanValue();
        this.f10017C = zBooleanValue;
        zzbjmVar2.m5044c("spinner_used", true != zBooleanValue ? "0" : "1");
        this.f10029w = new zzchw(this);
        zzckqVar.mo5410j(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m5432a() {
        zzcha zzchaVar = this.f10031y;
        if (zzchaVar == null) {
            return;
        }
        TextView textView = new TextView(zzchaVar.getContext());
        Resources resourcesM5383c = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5383c();
        textView.setText(String.valueOf(resourcesM5383c == null ? "AdMob - " : resourcesM5383c.getString(R.string.watermark_label_prefix)).concat(zzchaVar.mo5409i()));
        textView.setTextColor(SupportMenu.CATEGORY_MASK);
        textView.setBackgroundColor(InputDeviceCompat.SOURCE_ANY);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        FrameLayout frameLayout = this.f10026t;
        frameLayout.addView(textView, layoutParams);
        frameLayout.bringChildToFront(textView);
    }

    /* JADX INFO: renamed from: b */
    public final void m5433b() {
        zzcha zzchaVar = this.f10031y;
        if (zzchaVar == null) {
            return;
        }
        long jMo5416p = zzchaVar.mo5416p();
        if (this.f10018D == jMo5416p || jMo5416p <= 0) {
            return;
        }
        float f2 = jMo5416p / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8829x2)).booleanValue()) {
            String strValueOf = String.valueOf(f2);
            String strValueOf2 = String.valueOf(zzchaVar.mo5423w());
            String strValueOf3 = String.valueOf(zzchaVar.mo5422v());
            String strValueOf4 = String.valueOf(zzchaVar.mo5421u());
            String strValueOf5 = String.valueOf(zzchaVar.mo5424x());
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            m5434c("timeupdate", "time", strValueOf, "totalBytes", strValueOf2, "qoeCachedBytes", strValueOf3, "qoeLoadedBytes", strValueOf4, "droppedFrames", strValueOf5, "reportTime", String.valueOf(System.currentTimeMillis()));
        } else {
            m5434c("timeupdate", "time", String.valueOf(f2));
        }
        this.f10018D = jMo5416p;
    }

    /* JADX INFO: renamed from: c */
    public final void m5434c(String str, String... strArr) {
        HashMap map = new HashMap();
        zzcha zzchaVar = this.f10031y;
        Integer numMo5431z = zzchaVar != null ? zzchaVar.mo5431z() : null;
        if (numMo5431z != null) {
            map.put("playerId", numMo5431z.toString());
        }
        map.put(NotificationCompat.CATEGORY_EVENT, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.f10025s.mo5129b("onVideoEvent", map);
    }

    /* JADX INFO: renamed from: d */
    public final void m5435d() {
        zzchu zzchuVar = this.f10025s;
        if (zzchuVar.zzj() == null || !this.f10015A || this.f10016B) {
            return;
        }
        zzchuVar.zzj().getWindow().clearFlags(128);
        this.f10015A = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m5436e() {
        zzchw zzchwVar = this.f10029w;
        zzchwVar.f10113t = false;
        com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzs.f3626l;
        zzfVar.removeCallbacks(zzchwVar);
        zzfVar.postDelayed(zzchwVar, 250L);
        zzfVar.post(new zzchc(this));
    }

    /* JADX INFO: renamed from: f */
    public final void m5437f() {
        zzcha zzchaVar = this.f10031y;
        if (zzchaVar != null && this.f10019E == 0) {
            m5434c("canplaythrough", TypedValues.TransitionType.S_DURATION, String.valueOf(zzchaVar.mo5415o() / 1000.0f), "videoWidth", String.valueOf(zzchaVar.mo5419s()), "videoHeight", String.valueOf(zzchaVar.mo5420t()));
        }
    }

    public final void finalize() throws Throwable {
        try {
            this.f10029w.m5484a();
            final zzcha zzchaVar = this.f10031y;
            if (zzchaVar != null) {
                ((zzcfx) zzcfy.f9951f).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzchaVar.mo5412l();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m5438g() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8863z2)).booleanValue()) {
            zzchw zzchwVar = this.f10029w;
            zzchwVar.f10113t = false;
            com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzs.f3626l;
            zzfVar.removeCallbacks(zzchwVar);
            zzfVar.postDelayed(zzchwVar, 250L);
        }
        zzchu zzchuVar = this.f10025s;
        if (zzchuVar.zzj() != null && !this.f10015A) {
            boolean z = (zzchuVar.zzj().getWindow().getAttributes().flags & 128) != 0;
            this.f10016B = z;
            if (!z) {
                zzchuVar.zzj().getWindow().addFlags(128);
                this.f10015A = true;
            }
        }
        this.f10032z = true;
    }

    /* JADX INFO: renamed from: h */
    public final void m5439h() {
        m5434c("pause", new String[0]);
        m5435d();
        this.f10032z = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m5440i() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8863z2)).booleanValue()) {
            this.f10029w.m5484a();
        }
        m5434c("ended", new String[0]);
        m5435d();
    }

    /* JADX INFO: renamed from: j */
    public final void m5441j(String str, String str2) {
        m5434c(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "what", str, "extra", str2);
    }

    /* JADX INFO: renamed from: k */
    public final void m5442k() {
        if (this.f10024J && this.f10022H != null) {
            ImageView imageView = this.f10023I;
            if (imageView.getParent() == null) {
                imageView.setImageBitmap(this.f10022H);
                imageView.invalidate();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                FrameLayout frameLayout = this.f10026t;
                frameLayout.addView(imageView, layoutParams);
                frameLayout.bringChildToFront(imageView);
            }
        }
        this.f10029w.m5484a();
        this.f10019E = this.f10018D;
        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new zzchd(this));
    }

    /* JADX INFO: renamed from: l */
    public final void m5443l(int i2, int i3) {
        if (this.f10017C) {
            zzbio zzbioVar = zzbix.f8708q0;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            int iMax = Math.max(i2 / ((Integer) zzbaVar.f3098c.m5030a(zzbioVar)).intValue(), 1);
            int iMax2 = Math.max(i3 / ((Integer) zzbaVar.f3098c.m5030a(zzbioVar)).intValue(), 1);
            Bitmap bitmap = this.f10022H;
            if (bitmap != null && bitmap.getWidth() == iMax && this.f10022H.getHeight() == iMax2) {
                return;
            }
            this.f10022H = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.f10024J = false;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m5444m() {
        this.f10027u.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f10012s.m5434c("firstFrameRendered", new String[0]);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m5445n(int i2, int i3, int i4, int i5) {
        if (com.google.android.gms.ads.internal.util.zze.m3152m()) {
            int length = String.valueOf(i2).length();
            StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(i3).length() + 3 + String.valueOf(i4).length() + 3 + String.valueOf(i5).length());
            AbstractC1456a.m2455v(sb, "Set video bounds to x:", i2, ";y:", i3);
            sb.append(";w:");
            sb.append(i4);
            sb.append(";h:");
            sb.append(i5);
            com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
        }
        if (i4 == 0 || i5 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
        layoutParams.setMargins(i2, i3, 0, 0);
        this.f10026t.setLayoutParams(layoutParams);
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        zzchw zzchwVar = this.f10029w;
        if (z) {
            zzchwVar.f10113t = false;
            com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzs.f3626l;
            zzfVar.removeCallbacks(zzchwVar);
            zzfVar.postDelayed(zzchwVar, 250L);
        } else {
            zzchwVar.m5484a();
            this.f10019E = this.f10018D;
        }
        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzchi zzchiVar = this.f10013s;
                zzchiVar.getClass();
                zzchiVar.m5434c("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
            }
        });
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        boolean z = false;
        zzchw zzchwVar = this.f10029w;
        if (i2 == 0) {
            zzchwVar.f10113t = false;
            com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzs.f3626l;
            zzfVar.removeCallbacks(zzchwVar);
            zzfVar.postDelayed(zzchwVar, 250L);
            z = true;
        } else {
            zzchwVar.m5484a();
            this.f10019E = this.f10018D;
        }
        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new zzche(this, z));
    }

    @Override // com.google.android.gms.internal.ads.zzcgz
    public final void zzi() {
        if (this.f10032z) {
            ImageView imageView = this.f10023I;
            if (imageView.getParent() != null) {
                this.f10026t.removeView(imageView);
            }
        }
        zzcha zzchaVar = this.f10031y;
        if (zzchaVar == null || this.f10022H == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        zztVar.f3711k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzchaVar.getBitmap(this.f10022H) != null) {
            this.f10024J = true;
        }
        zztVar.f3711k.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.m3152m()) {
            StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 26);
            sb.append("Spinner frame grab took ");
            sb.append(jElapsedRealtime2);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
        }
        if (jElapsedRealtime2 > this.f10030x) {
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.f10017C = false;
            this.f10022H = null;
            zzbjm zzbjmVar = this.f10028v;
            if (zzbjmVar != null) {
                zzbjmVar.m5044c("spinner_jank", Long.toString(jElapsedRealtime2));
            }
        }
    }
}
