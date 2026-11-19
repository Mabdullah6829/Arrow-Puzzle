package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcim extends zzcha implements TextureView.SurfaceTextureListener, zzchk {

    /* JADX INFO: renamed from: A */
    public zzckj f10142A;

    /* JADX INFO: renamed from: B */
    public String f10143B;

    /* JADX INFO: renamed from: C */
    public String[] f10144C;

    /* JADX INFO: renamed from: D */
    public boolean f10145D;

    /* JADX INFO: renamed from: E */
    public int f10146E;

    /* JADX INFO: renamed from: F */
    public zzchs f10147F;

    /* JADX INFO: renamed from: G */
    public final boolean f10148G;

    /* JADX INFO: renamed from: H */
    public boolean f10149H;

    /* JADX INFO: renamed from: I */
    public boolean f10150I;

    /* JADX INFO: renamed from: J */
    public int f10151J;

    /* JADX INFO: renamed from: K */
    public int f10152K;

    /* JADX INFO: renamed from: L */
    public float f10153L;

    /* JADX INFO: renamed from: u */
    public final zzchu f10154u;

    /* JADX INFO: renamed from: v */
    public final zzchv f10155v;

    /* JADX INFO: renamed from: w */
    public final zzcht f10156w;

    /* JADX INFO: renamed from: x */
    public final zzdzt f10157x;

    /* JADX INFO: renamed from: y */
    public zzchi f10158y;

    /* JADX INFO: renamed from: z */
    public Surface f10159z;

    public zzcim(Context context, zzchv zzchvVar, zzchu zzchuVar, boolean z, zzcht zzchtVar, zzdzt zzdztVar) {
        super(context);
        this.f10146E = 1;
        this.f10154u = zzchuVar;
        this.f10155v = zzchvVar;
        this.f10148G = z;
        this.f10156w = zzchtVar;
        zzchvVar.m5480a(this);
        this.f10157x = zzdztVar;
    }

    /* JADX INFO: renamed from: J */
    public static String m5486J(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(AbstractC1456a.m2437d(str.length(), 1, String.valueOf(canonicalName).length(), 1, String.valueOf(message).length()));
        AbstractC0271e0.m413u(sb, str, "/", canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: A */
    public final void mo5425A(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.f10144C = new String[]{str};
        } else {
            this.f10144C = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.f10143B;
        boolean z = false;
        if (this.f10156w.f10090k && str2 != null && !str.equals(str2) && this.f10146E == 4) {
            z = true;
        }
        this.f10143B = str;
        m5489F(z, num);
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: B */
    public final void mo5426B(int i2) {
        zzckj zzckjVar = this.f10142A;
        if (zzckjVar != null) {
            zzckjVar.m5553s(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: C */
    public final void mo5427C(int i2) {
        zzckj zzckjVar = this.f10142A;
        if (zzckjVar != null) {
            zzckjVar.m5554t(i2);
        }
    }

    /* JADX INFO: renamed from: D */
    public final boolean m5487D() {
        zzckj zzckjVar = this.f10142A;
        return (zzckjVar == null || !zzckjVar.m5551q() || this.f10145D) ? false : true;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m5488E() {
        return m5487D() && this.f10146E != 1;
    }

    /* JADX INFO: renamed from: F */
    public final void m5489F(boolean z, Integer num) {
        zzckj zzckjVar = this.f10142A;
        if (zzckjVar != null && !z) {
            zzckjVar.f10341K = num;
            return;
        }
        if (this.f10143B == null || this.f10159z == null) {
            return;
        }
        if (z) {
            if (!m5487D()) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                zzckjVar.m5540C();
                m5490G();
            }
        }
        if (this.f10143B.startsWith("cache:")) {
            zzcjh zzcjhVarZzr = this.f10154u.zzr(this.f10143B);
            if (zzcjhVarZzr instanceof zzcjq) {
                zzcjq zzcjqVar = (zzcjq) zzcjhVarZzr;
                synchronized (zzcjqVar) {
                    zzcjqVar.f10255y = true;
                    zzcjqVar.notify();
                }
                zzckj zzckjVar2 = zzcjqVar.f10252v;
                zzckjVar2.f10334D = null;
                zzcjqVar.f10252v = null;
                this.f10142A = zzckjVar2;
                zzckjVar2.f10341K = num;
                if (!zzckjVar2.m5551q()) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(zzcjhVarZzr instanceof zzcjn)) {
                    String strValueOf = String.valueOf(this.f10143B);
                    int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("Stream cache miss: ".concat(strValueOf));
                    return;
                }
                zzcjn zzcjnVar = (zzcjn) zzcjhVarZzr;
                zzchu zzchuVar = this.f10154u;
                com.google.android.gms.ads.internal.zzt.f3698C.f3703c.m3231E(zzchuVar.getContext(), zzchuVar.mo5472h().f3396s);
                synchronized (zzcjnVar.f10237C) {
                    try {
                        ByteBuffer byteBuffer = zzcjnVar.f10235A;
                        if (byteBuffer != null && !zzcjnVar.f10236B) {
                            byteBuffer.flip();
                            zzcjnVar.f10236B = true;
                        }
                        zzcjnVar.f10243x = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ByteBuffer byteBuffer2 = zzcjnVar.f10235A;
                boolean z2 = zzcjnVar.f10240F;
                String str = zzcjnVar.f10241v;
                if (str == null) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("Stream cache URL is null.");
                    return;
                }
                zzcht zzchtVar = this.f10156w;
                zzchu zzchuVar2 = this.f10154u;
                zzckj zzckjVar3 = new zzckj(zzchuVar2.getContext(), zzchtVar, zzchuVar2, num);
                int i6 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3072e("ExoPlayerAdapter initialized.");
                this.f10142A = zzckjVar3;
                zzckjVar3.m5538A(new Uri[]{Uri.parse(str)}, byteBuffer2, z2);
            }
        } else {
            zzcht zzchtVar2 = this.f10156w;
            zzchu zzchuVar3 = this.f10154u;
            zzckj zzckjVar4 = new zzckj(zzchuVar3.getContext(), zzchtVar2, zzchuVar3, num);
            int i7 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3072e("ExoPlayerAdapter initialized.");
            this.f10142A = zzckjVar4;
            zzchu zzchuVar4 = this.f10154u;
            String strM3231E = com.google.android.gms.ads.internal.zzt.f3698C.f3703c.m3231E(zzchuVar4.getContext(), zzchuVar4.mo5472h().f3396s);
            Uri[] uriArr = new Uri[this.f10144C.length];
            int i8 = 0;
            while (true) {
                String[] strArr = this.f10144C;
                if (i8 >= strArr.length) {
                    break;
                }
                uriArr[i8] = Uri.parse(strArr[i8]);
                i8++;
            }
            this.f10142A.m5560z(uriArr, strM3231E);
        }
        this.f10142A.f10334D = this;
        m5491H(this.f10159z, false);
        if (this.f10142A.m5551q()) {
            int iZzh = this.f10142A.f10331A.zzh();
            this.f10146E = iZzh;
            if (iZzh == 3) {
                m5492I();
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m5490G() {
        if (this.f10142A != null) {
            m5491H(null, true);
            zzckj zzckjVar = this.f10142A;
            if (zzckjVar != null) {
                zzckjVar.f10334D = null;
                zzckjVar.m5539B();
                this.f10142A = null;
            }
            this.f10146E = 1;
            this.f10145D = false;
            this.f10149H = false;
            this.f10150I = false;
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m5491H(Surface surface, boolean z) {
        zzckj zzckjVar = this.f10142A;
        if (zzckjVar == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zznm zznmVar = zzckjVar.f10331A;
            if (zznmVar != null) {
                zznmVar.f20509c.m6051b();
                zzlj zzljVar = zznmVar.f20508b;
                zzljVar.m8639w();
                zzljVar.m8637u(surface);
                int i3 = surface == null ? 0 : -1;
                zzljVar.m8638v(i3, i3);
            }
        } catch (IOException e) {
            int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("", e);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m5492I() {
        if (this.f10149H) {
            return;
        }
        this.f10149H = true;
        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzchi zzchiVar = this.f10120s.f10158y;
                if (zzchiVar != null) {
                    zzchiVar.m5437f();
                }
            }
        });
        mo5408f();
        zzchv zzchvVar = this.f10155v;
        if (zzchvVar.f10103i && !zzchvVar.f10104j) {
            zzbje.m5038a(zzchvVar.f10099e, zzchvVar.f10098d, "vfr2");
            zzchvVar.f10104j = true;
        }
        if (this.f10150I) {
            mo5413m();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    /* JADX INFO: renamed from: a */
    public final void mo5446a(int i2, int i3) {
        this.f10151J = i2;
        this.f10152K = i3;
        float f2 = i3 > 0 ? i2 / i3 : 1.0f;
        if (this.f10153L != f2) {
            this.f10153L = f2;
            requestLayout();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    /* JADX INFO: renamed from: a0 */
    public final void mo5447a0(int i2) {
        zzckj zzckjVar;
        if (this.f10146E != i2) {
            this.f10146E = i2;
            if (i2 == 3) {
                m5492I();
                return;
            }
            if (i2 != 4) {
                return;
            }
            if (this.f10156w.f10080a && (zzckjVar = this.f10142A) != null) {
                zzckjVar.m5558x(false);
            }
            this.f10155v.f10107m = false;
            zzchy zzchyVar = this.f10006t;
            zzchyVar.f10117d = false;
            zzchyVar.m5485a();
            com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcic
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzchi zzchiVar = this.f10126s.f10158y;
                    if (zzchiVar != null) {
                        zzchiVar.m5440i();
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    /* JADX INFO: renamed from: b */
    public final void mo5448b(String str, Exception exc) {
        zzckj zzckjVar;
        final String strM5486J = m5486J(str, exc);
        String strConcat = "ExoPlayerAdapter error: ".concat(strM5486J);
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3073f(strConcat);
        this.f10145D = true;
        if (this.f10156w.f10080a && (zzckjVar = this.f10142A) != null) {
            zzckjVar.m5558x(false);
        }
        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcid
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzchi zzchiVar = this.f10127s.f10158y;
                if (zzchiVar != null) {
                    zzchiVar.m5441j("ExoPlayerAdapter error", strM5486J);
                }
            }
        });
        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("AdExoPlayerView.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    /* JADX INFO: renamed from: c */
    public final void mo5449c(final boolean z, final long j2) {
        if (this.f10154u != null) {
            ((zzcfx) zzcfy.f9951f).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcik
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f10138s.f10154u.mo5475l0(z, j2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    /* JADX INFO: renamed from: d */
    public final void mo5450d(IOException iOException) {
        final String strM5486J = m5486J("onLoadException", iOException);
        String strConcat = "ExoPlayerAdapter exception: ".concat(strM5486J);
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3073f(strConcat);
        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("AdExoPlayerView.onException", iOException);
        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcia
            @Override // java.lang.Runnable
            public final void run() {
                zzchi zzchiVar = this.f10123s.f10158y;
                if (zzchiVar != null) {
                    zzchiVar.m5434c("exception", "what", "ExoPlayerAdapter exception", "extra", strM5486J);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: e */
    public final void mo5428e(int i2) {
        zzckj zzckjVar = this.f10142A;
        if (zzckjVar != null) {
            zzckjVar.m5541D(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchx
    /* JADX INFO: renamed from: f */
    public final void mo5408f() {
        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcil
            @Override // java.lang.Runnable
            public final void run() {
                zzcim zzcimVar = this.f10141s;
                zzchy zzchyVar = zzcimVar.f10006t;
                float f2 = zzchyVar.f10116c ? zzchyVar.f10118e ? 0.0f : zzchyVar.f10119f : 0.0f;
                zzckj zzckjVar = zzcimVar.f10142A;
                if (zzckjVar == null) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("Trying to set volume before player is initialized.");
                    return;
                }
                try {
                    zznm zznmVar = zzckjVar.f10331A;
                    if (zznmVar != null) {
                        zznmVar.f20509c.m6051b();
                        zznmVar.f20508b.m8628b(f2);
                    }
                } catch (IOException e) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3074g("", e);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: g */
    public final void mo5429g(int i2) {
        zzckj zzckjVar = this.f10142A;
        if (zzckjVar != null) {
            zzckjVar.m5542E(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: h */
    public final void mo5430h(int i2) {
        zzckj zzckjVar = this.f10142A;
        if (zzckjVar != null) {
            Iterator it = zzckjVar.f10344N.iterator();
            while (it.hasNext()) {
                zzcjs zzcjsVar = (zzcjs) ((WeakReference) it.next()).get();
                if (zzcjsVar != null) {
                    zzcjsVar.f10274r = i2;
                    for (Socket socket : zzcjsVar.f10275s) {
                        if (!socket.isClosed()) {
                            try {
                                socket.setReceiveBufferSize(zzcjsVar.f10274r);
                            } catch (SocketException e) {
                                int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                com.google.android.gms.ads.internal.util.client.zzo.m3074g("Failed to update receive buffer size.", e);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: i */
    public final String mo5409i() {
        return "ExoPlayer/2".concat(true != this.f10148G ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: j */
    public final void mo5410j(zzchi zzchiVar) {
        this.f10158y = zzchiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: k */
    public final void mo5411k(String str) {
        if (str != null) {
            mo5425A(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: l */
    public final void mo5412l() {
        if (m5487D()) {
            this.f10142A.m5540C();
            m5490G();
        }
        zzchv zzchvVar = this.f10155v;
        zzchvVar.f10107m = false;
        zzchy zzchyVar = this.f10006t;
        zzchyVar.f10117d = false;
        zzchyVar.m5485a();
        zzchvVar.m5481b();
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: m */
    public final void mo5413m() {
        zzckj zzckjVar;
        if (!m5488E()) {
            this.f10150I = true;
            return;
        }
        if (this.f10156w.f10080a && (zzckjVar = this.f10142A) != null) {
            zzckjVar.m5558x(true);
        }
        this.f10142A.m5552r(true);
        this.f10155v.m5483d();
        zzchy zzchyVar = this.f10006t;
        zzchyVar.f10117d = true;
        zzchyVar.m5485a();
        this.f10005s.f10043c = true;
        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcie
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzchi zzchiVar = this.f10129s.f10158y;
                if (zzchiVar != null) {
                    zzchiVar.m5438g();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: n */
    public final void mo5414n() {
        zzckj zzckjVar;
        if (m5488E()) {
            if (this.f10156w.f10080a && (zzckjVar = this.f10142A) != null) {
                zzckjVar.m5558x(false);
            }
            this.f10142A.m5552r(false);
            this.f10155v.f10107m = false;
            zzchy zzchyVar = this.f10006t;
            zzchyVar.f10117d = false;
            zzchyVar.m5485a();
            com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcif
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzchi zzchiVar = this.f10130s.f10158y;
                    if (zzchiVar != null) {
                        zzchiVar.m5439h();
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: o */
    public final int mo5415o() {
        if (m5488E()) {
            return (int) this.f10142A.f10331A.m8798b();
        }
        return 0;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f2 = this.f10153L;
        if (f2 != 0.0f && this.f10147F == null) {
            float f3 = measuredWidth;
            float f4 = f3 / measuredHeight;
            if (f2 > f4) {
                measuredHeight = (int) (f3 / f2);
            }
            if (f2 < f4) {
                measuredWidth = (int) (measuredHeight * f2);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzchs zzchsVar = this.f10147F;
        if (zzchsVar != null) {
            zzchsVar.m5461a(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        zzckj zzckjVar;
        float f2;
        int i4;
        SurfaceTexture surfaceTexture2;
        zzdzt zzdztVar;
        if (this.f10148G) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8187Ke)).booleanValue() && (zzdztVar = this.f10157x) != null) {
                zzdzs zzdzsVarM6111a = zzdztVar.m6111a();
                zzdzsVarM6111a.m6107b("action", "svp_aepv");
                zzdzsVarM6111a.m6108c();
            }
            zzchs zzchsVar = new zzchs(getContext());
            this.f10147F = zzchsVar;
            zzchsVar.f10057E = i2;
            zzchsVar.f10056D = i3;
            zzchsVar.f10059G = surfaceTexture;
            zzchsVar.start();
            if (zzchsVar.f10059G == null) {
                surfaceTexture2 = null;
            } else {
                try {
                    zzchsVar.f10064L.await();
                } catch (InterruptedException unused) {
                }
                surfaceTexture2 = zzchsVar.f10058F;
            }
            if (surfaceTexture2 != null) {
                surfaceTexture = surfaceTexture2;
            } else {
                this.f10147F.m5462b();
                this.f10147F = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f10159z = surface;
        if (this.f10142A == null) {
            m5489F(false, null);
        } else {
            m5491H(surface, true);
            if (!this.f10156w.f10080a && (zzckjVar = this.f10142A) != null) {
                zzckjVar.m5558x(true);
            }
        }
        int i5 = this.f10151J;
        if (i5 == 0 || (i4 = this.f10152K) == 0) {
            f2 = i3 > 0 ? i2 / i3 : 1.0f;
            if (this.f10153L != f2) {
                this.f10153L = f2;
                requestLayout();
            }
        } else {
            f2 = i4 > 0 ? i5 / i4 : 1.0f;
            if (this.f10153L != f2) {
                this.f10153L = f2;
                requestLayout();
            }
        }
        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcig
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzchi zzchiVar = this.f10131s.f10158y;
                if (zzchiVar != null) {
                    zzchiVar.m5436e();
                }
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        mo5414n();
        zzchs zzchsVar = this.f10147F;
        if (zzchsVar != null) {
            zzchsVar.m5462b();
            this.f10147F = null;
        }
        zzckj zzckjVar = this.f10142A;
        if (zzckjVar != null) {
            if (zzckjVar != null) {
                zzckjVar.m5558x(false);
            }
            Surface surface = this.f10159z;
            if (surface != null) {
                surface.release();
            }
            this.f10159z = null;
            m5491H(null, true);
        }
        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcii
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzchi zzchiVar = this.f10135s.f10158y;
                if (zzchiVar != null) {
                    zzchiVar.m5442k();
                }
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i2, final int i3) {
        zzchs zzchsVar = this.f10147F;
        if (zzchsVar != null) {
            zzchsVar.m5461a(i2, i3);
        }
        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcih
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzchi zzchiVar = this.f10132s.f10158y;
                if (zzchiVar != null) {
                    zzchiVar.m5443l(i2, i3);
                }
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f10155v.m5482c(this);
        this.f10005s.m5452a(surfaceTexture, this.f10158y);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 46);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i2);
        com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcij
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzchi zzchiVar = this.f10136s.f10158y;
                if (zzchiVar != null) {
                    zzchiVar.onWindowVisibilityChanged(i2);
                }
            }
        });
        super.onWindowVisibilityChanged(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: p */
    public final int mo5416p() {
        if (m5488E()) {
            return (int) this.f10142A.f10331A.mo4712k();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: q */
    public final void mo5417q(int i2) {
        if (m5488E()) {
            long j2 = i2;
            zznm zznmVar = this.f10142A.f10331A;
            int iMo4710h = zznmVar.mo4710h();
            zznmVar.f20509c.m6051b();
            zzlj zzljVar = zznmVar.f20508b;
            zzljVar.m8639w();
            if (iMo4710h == -1) {
                return;
            }
            zzgtr.m7128a(iMo4710h >= 0);
            zzbf zzbfVar = zzljVar.f20244Z.f20456a;
            if (zzbfVar.m4833g() || iMo4710h < zzbfVar.mo4735a()) {
                zzpt zzptVar = zzljVar.f20264r;
                if (!zzptVar.f20563i) {
                    zznp zznpVarM8815s = zzptVar.m8815s();
                    zzptVar.f20563i = true;
                    zzptVar.m8814r(zznpVarM8815s, -1, new zzod());
                }
                zzljVar.f20224F++;
                if (zzljVar.mo4715s()) {
                    zzeh.m6211c("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                    zzlt zzltVar = new zzlt(zzljVar.f20244Z);
                    zzltVar.m8642a(1);
                    ((zzkg) zzljVar.f20257k).m8623a(zzltVar);
                    return;
                }
                zzmu zzmuVarM8759d = zzljVar.f20244Z;
                int i3 = zzmuVarM8759d.f20460e;
                if (i3 == 3 || (i3 == 4 && !zzbfVar.m4833g())) {
                    zzmuVarM8759d = zzljVar.f20244Z.m8759d(2);
                }
                int iMo4710h2 = zzljVar.mo4710h();
                zzmu zzmuVarM8635q = zzljVar.m8635q(zzmuVarM8759d, zzbfVar, zzljVar.m8636t(zzbfVar, iMo4710h, j2));
                zzlw zzlwVar = zzljVar.f20258l;
                long jM6519u = zzfm.m6519u(j2);
                zzlwVar.getClass();
                ((zzfg) zzlwVar.f20348y.mo6124i(3, new zzlv(zzbfVar, iMo4710h, jM6519u))).m6435a();
                zzljVar.m8634o(zzmuVarM8635q, 0, true, 1, zzljVar.m8633m(zzmuVarM8635q), iMo4710h2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: r */
    public final void mo5418r(float f2, float f3) {
        zzchs zzchsVar = this.f10147F;
        if (zzchsVar != null) {
            zzchsVar.m5463c(f2, f3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: s */
    public final int mo5419s() {
        return this.f10151J;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: t */
    public final int mo5420t() {
        return this.f10152K;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: u */
    public final long mo5421u() {
        zzckj zzckjVar = this.f10142A;
        if (zzckjVar != null) {
            return zzckjVar.m5555u();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: v */
    public final long mo5422v() {
        zzckj zzckjVar = this.f10142A;
        if (zzckjVar != null) {
            return zzckjVar.m5556v();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: w */
    public final long mo5423w() {
        zzckj zzckjVar = this.f10142A;
        if (zzckjVar != null) {
            return zzckjVar.m5557w();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: x */
    public final int mo5424x() {
        zzckj zzckjVar = this.f10142A;
        if (zzckjVar != null) {
            return zzckjVar.f10336F;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    /* JADX INFO: renamed from: y */
    public final void mo5451y() {
        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcib
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzchi zzchiVar = this.f10125s.f10158y;
                if (zzchiVar != null) {
                    zzchiVar.m5444m();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    /* JADX INFO: renamed from: z */
    public final Integer mo5431z() {
        zzckj zzckjVar = this.f10142A;
        if (zzckjVar != null) {
            return zzckjVar.f10341K;
        }
        return null;
    }
}
