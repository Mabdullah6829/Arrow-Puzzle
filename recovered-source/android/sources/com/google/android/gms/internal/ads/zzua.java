package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.LoudnessCodecController;
import android.media.MediaFormat;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.view.PointerIconCompat;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzua extends zzvw implements zzmd {

    /* JADX INFO: renamed from: X0 */
    public final Context f20965X0;

    /* JADX INFO: renamed from: Y0 */
    public final zzrw f20966Y0;

    /* JADX INFO: renamed from: Z0 */
    public final zztu f20967Z0;

    /* JADX INFO: renamed from: a1 */
    public final zzvi f20968a1;

    /* JADX INFO: renamed from: b1 */
    public int f20969b1;

    /* JADX INFO: renamed from: c1 */
    public boolean f20970c1;

    /* JADX INFO: renamed from: d1 */
    public zzv f20971d1;

    /* JADX INFO: renamed from: e1 */
    public zzv f20972e1;

    /* JADX INFO: renamed from: f1 */
    public long f20973f1;

    /* JADX INFO: renamed from: g1 */
    public boolean f20974g1;

    /* JADX INFO: renamed from: h1 */
    public boolean f20975h1;

    /* JADX INFO: renamed from: i1 */
    public boolean f20976i1;

    /* JADX INFO: renamed from: j1 */
    public boolean f20977j1;

    /* JADX INFO: renamed from: k1 */
    public int f20978k1;

    /* JADX INFO: renamed from: l1 */
    public boolean f20979l1;

    /* JADX INFO: renamed from: m1 */
    public long f20980m1;

    public zzua(Context context, zzve zzveVar, zzvy zzvyVar, Handler handler, zzrx zzrxVar, zztu zztuVar) {
        zzvi zzviVar;
        if (Build.VERSION.SDK_INT >= 35) {
            zzvh zzvhVar = zzvh.f21102a;
            zzviVar = new zzvi(0);
        } else {
            zzviVar = null;
        }
        super(context.getApplicationContext(), 1, zzveVar, zzvyVar, 44100.0f);
        this.f20965X0 = context.getApplicationContext();
        this.f20967Z0 = zztuVar;
        this.f20968a1 = zzviVar;
        this.f20978k1 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        this.f20966Y0 = new zzrw(handler, zzrxVar);
        this.f20980m1 = -9223372036854775807L;
        zztuVar.f20947l = new zztz(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    /* JADX INFO: renamed from: D */
    public final void mo3980D(boolean z, boolean z2) {
        super.mo3980D(z, z2);
        final zzjd zzjdVar = this.f21152M0;
        final zzrw zzrwVar = this.f20966Y0;
        Handler handler = zzrwVar.f20723a;
        if (handler != null) {
            handler.post(new Runnable(zzjdVar) { // from class: com.google.android.gms.internal.ads.zzrv
                @Override // java.lang.Runnable
                public final void run() {
                    zzrw zzrwVar2 = this.f20722s;
                    zzrwVar2.getClass();
                    String str = zzfm.f16091a;
                    zzpt zzptVar = ((zzkf) zzrwVar2.f20724b).f20189s.f20264r;
                    zzptVar.m8814r(zzptVar.m8818w(), PointerIconCompat.TYPE_CROSSHAIR, new zzoz());
                }
            });
        }
        m8601x();
        zzqh zzqhVar = this.f20070x;
        zzqhVar.getClass();
        zztu zztuVar = this.f20967Z0;
        zztuVar.f20946k = zzqhVar;
        zzdp zzdpVar = this.f20071y;
        zzdpVar.getClass();
        zztuVar.f20951p.f20845d = zzdpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: G */
    public final boolean mo3982G() {
        if (!this.f21148K0) {
            return false;
        }
        zztu zztuVar = this.f20967Z0;
        if (zztuVar.m8883l()) {
            return zztuVar.f20922K && !zztuVar.m8891t();
        }
        return true;
    }

    /* JADX INFO: renamed from: J0 */
    public final void m8894J0() {
        long j2;
        long jMax;
        ArrayDeque arrayDeque;
        long j3;
        mo3982G();
        final zztu zztuVar = this.f20967Z0;
        zztp zztpVar = zztuVar.f20935X;
        if (!zztuVar.m8883l() || zztuVar.f20915D) {
            j2 = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(zztuVar.f20953r.m8857d(), zzfm.m6520v(zztuVar.f20949n.f20895e.f20697b, zztuVar.m8884m()));
            while (true) {
                arrayDeque = zztuVar.f20942g;
                if (arrayDeque.isEmpty() || jMin < ((zzts) arrayDeque.getFirst()).f20906c) {
                    break;
                } else {
                    zztuVar.f20956u = (zzts) arrayDeque.remove();
                }
            }
            zzts zztsVar = zztuVar.f20956u;
            long jM6521w = jMin - zztsVar.f20906c;
            long jM6523y = zzfm.m6523y(jM6521w, zztsVar.f20904a.f6970a);
            if (arrayDeque.isEmpty()) {
                zzcv zzcvVar = zztpVar.f20901c;
                if (!zzcvVar.zzc()) {
                    j2 = Long.MIN_VALUE;
                } else if (zzcvVar.f11552n >= 1024) {
                    long j4 = zzcvVar.f11551m;
                    zzcu zzcuVar = zzcvVar.f11548j;
                    zzcuVar.getClass();
                    long jZza = j4 - ((long) ((zzcuVar.f11427j * zzcuVar.f11419b) * zzcuVar.f11426i.zza()));
                    int i2 = zzcvVar.f11546h.f10387a;
                    int i3 = zzcvVar.f11545g.f10387a;
                    if (i2 == i3) {
                        jM6521w = zzfm.m6521w(jM6521w, jZza, zzcvVar.f11552n, RoundingMode.DOWN);
                        j2 = Long.MIN_VALUE;
                    } else {
                        j2 = Long.MIN_VALUE;
                        jM6521w = zzfm.m6521w(jM6521w, jZza * ((long) i2), zzcvVar.f11552n * ((long) i3), RoundingMode.DOWN);
                    }
                } else {
                    j2 = Long.MIN_VALUE;
                    jM6521w = (long) (((double) zzcvVar.f11541c) * jM6521w);
                }
                zzts zztsVar2 = zztuVar.f20956u;
                j3 = zztsVar2.f20905b + jM6521w;
                zztsVar2.f20907d = jM6521w - jM6523y;
            } else {
                j2 = Long.MIN_VALUE;
                zzts zztsVar3 = zztuVar.f20956u;
                j3 = zztsVar3.f20905b + jM6523y + zztsVar3.f20907d;
            }
            long j5 = zztpVar.f20900b.f20989l;
            jMax = zzfm.m6520v(zztuVar.f20949n.f20895e.f20697b, j5) + j3;
            long j6 = zztuVar.f20932U;
            if (j5 > j6) {
                long jM6520v = zzfm.m6520v(zztuVar.f20949n.f20895e.f20697b, j5 - j6);
                zztuVar.f20932U = j5;
                zztuVar.f20933V += jM6520v;
                if (zztuVar.f20934W == null) {
                    zztuVar.f20934W = new Handler(Looper.myLooper());
                }
                zztuVar.f20934W.removeCallbacksAndMessages(null);
                zztuVar.f20934W.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zztr
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zztu zztuVar2 = zztuVar;
                        if (zztuVar2.f20933V >= PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
                            ((zztz) zztuVar2.f20947l).f20963a.f20976i1 = true;
                            zztuVar2.f20933V = 0L;
                        }
                    }
                }, 100L);
            }
        }
        if (jMax != j2) {
            if (!this.f20974g1) {
                jMax = Math.max(this.f20973f1, jMax);
            }
            this.f20973f1 = jMax;
            this.f20974g1 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: Q */
    public final boolean mo3994Q() {
        return this.f20967Z0.m8891t();
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    /* JADX INFO: renamed from: c */
    public final long mo8618c() {
        if (this.f20072z == 2) {
            m8894J0();
        }
        return this.f20973f1;
    }

    @Override // com.google.android.gms.internal.ads.zziz, com.google.android.gms.internal.ads.zznc
    /* JADX INFO: renamed from: d */
    public final zzmd mo8591d() {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0032  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c3  */
    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: h0 */
    public final int mo4005h0(zzvy zzvyVar, zzv zzvVar) {
        int i2;
        Collection collectionM8974b;
        boolean z;
        String str = zzvVar.f21061o;
        if (!zzas.m4349a(str)) {
            return 128;
        }
        int i3 = zzvVar.f21045O;
        int i4 = 1;
        boolean z2 = i3 == 0;
        zztu zztuVar = this.f20967Z0;
        if (z2) {
            if (i3 != 0) {
                List listM8973a = zzwi.m8973a("audio/raw", false, false);
                if ((listM8973a.isEmpty() ? null : (zzvp) listM8973a.get(0)) == null) {
                    i2 = 0;
                }
            }
            zzrc zzrcVarM8860a = zztuVar.f20951p.m8860a(zztuVar.m8885n(zzvVar));
            zzqt zzqtVar = new zzqt();
            zzqtVar.f20658a = zzrcVarM8860a.f20685a;
            zzqtVar.f20659b = zzrcVarM8860a.f20686b;
            zzqtVar.f20660c = zzrcVarM8860a.f20687c;
            zzqu zzquVarM8841a = zzqtVar.m8841a();
            if (zzquVarM8841a.f20662a) {
                i2 = true != zzquVarM8841a.f20663b ? 512 : 1536;
                if (zzquVarM8841a.f20664c) {
                    i2 |= 2048;
                }
            } else {
                i2 = 0;
            }
            if (zztuVar.m8886o(zzvVar) != 0) {
                return i2 | 172;
            }
        } else {
            i2 = 0;
        }
        if (!"audio/raw".equals(str) || zztuVar.m8886o(zzvVar) != 0) {
            int i5 = zzvVar.f21037G;
            int i6 = zzvVar.f21039I;
            zzt zztVar = new zzt();
            zztVar.m8853e("audio/raw");
            zztVar.f20780F = i5;
            zztVar.f20782H = i6;
            zztVar.f20783I = 2;
            if (zztuVar.m8886o(new zzv(zztVar)) != 0) {
                if (zzvVar.f21061o == null) {
                    zzgzi zzgziVar = zzgwt.f18303t;
                    collectionM8974b = zzgyo.f18355w;
                } else if (zztuVar.m8886o(zzvVar) != 0) {
                    List listM8973a2 = zzwi.m8973a("audio/raw", false, false);
                    zzvp zzvpVar = listM8973a2.isEmpty() ? null : (zzvp) listM8973a2.get(0);
                    if (zzvpVar != null) {
                        collectionM8974b = zzgwt.m7216n(zzvpVar);
                    } else {
                        collectionM8974b = zzwi.m8974b(zzvyVar, zzvVar, false, false);
                    }
                } else {
                    collectionM8974b = zzwi.m8974b(zzvyVar, zzvVar, false, false);
                }
                if (!((AbstractCollection) collectionM8974b).isEmpty()) {
                    if (z2) {
                        zzgyo zzgyoVar = (zzgyo) collectionM8974b;
                        zzvp zzvpVar2 = (zzvp) zzgyoVar.get(0);
                        Context context = this.f20965X0;
                        boolean zM8946b = zzvpVar2.m8946b(context, zzvVar);
                        if (!zM8946b) {
                            int i7 = 1;
                            while (true) {
                                if (i7 >= zzgyoVar.f18357v) {
                                    z = true;
                                    break;
                                }
                                zzvp zzvpVar3 = (zzvp) zzgyoVar.get(i7);
                                if (zzvpVar3.m8946b(context, zzvVar)) {
                                    z = false;
                                    zM8946b = true;
                                    zzvpVar2 = zzvpVar3;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            z = true;
                            break;
                        }
                        int i8 = true != zM8946b ? 3 : 4;
                        int i9 = 8;
                        if (zM8946b && zzvpVar2.m8947c(zzvVar)) {
                            i9 = 16;
                        }
                        return i8 | i9 | 32 | (true != zzvpVar2.f21117g ? 0 : 64) | (true != z ? 0 : 128) | i2;
                    }
                    i4 = 2;
                }
            }
        }
        return i4 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    /* JADX INFO: renamed from: i */
    public final void mo8619i(zzav zzavVar) {
        zztu zztuVar = this.f20967Z0;
        zztuVar.getClass();
        float f2 = zzavVar.f6970a;
        String str = zzfm.f16091a;
        zzav zzavVar2 = new zzav(Math.max(0.1f, Math.min(f2, 8.0f)), Math.max(0.1f, Math.min(zzavVar.f6971b, 8.0f)));
        zztuVar.f20957v = zzavVar2;
        zzts zztsVar = new zzts(zzavVar2, -9223372036854775807L, -9223372036854775807L);
        if (zztuVar.m8883l()) {
            zztuVar.f20955t = zztsVar;
        } else {
            zztuVar.f20956u = zztsVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: i0 */
    public final ArrayList mo4006i0(zzvy zzvyVar, zzv zzvVar) {
        Collection collectionM8974b;
        if (zzvVar.f21061o == null) {
            zzgzi zzgziVar = zzgwt.f18303t;
            collectionM8974b = zzgyo.f18355w;
        } else if (this.f20967Z0.m8886o(zzvVar) != 0) {
            List listM8973a = zzwi.m8973a("audio/raw", false, false);
            zzvp zzvpVar = listM8973a.isEmpty() ? null : (zzvp) listM8973a.get(0);
            if (zzvpVar != null) {
                collectionM8974b = zzgwt.m7216n(zzvpVar);
            } else {
                collectionM8974b = zzwi.m8974b(zzvyVar, zzvVar, false, false);
            }
        } else {
            collectionM8974b = zzwi.m8974b(zzvyVar, zzvVar, false, false);
        }
        HashMap map = zzwi.f21212a;
        ArrayList arrayList = new ArrayList(collectionM8974b);
        Collections.sort(arrayList, new zzwf(new zzwg(this.f20965X0, zzvVar)));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x003d  */
    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz, com.google.android.gms.internal.ads.zzmx
    /* JADX INFO: renamed from: j */
    public final void mo4007j(int i2, Object obj) {
        zzvi zzviVar;
        zztu zztuVar = this.f20967Z0;
        if (i2 == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (zztuVar.f20918G != fFloatValue) {
                zztuVar.f20918G = fFloatValue;
                if (zztuVar.m8883l()) {
                    zztuVar.f20953r.f20821a.setVolume(zztuVar.f20918G);
                    return;
                }
                return;
            }
            return;
        }
        if (i2 == 3) {
            zzd zzdVar = (zzd) obj;
            zzdVar.getClass();
            if (zztuVar.f20954s.equals(zzdVar)) {
                return;
            }
            zztuVar.f20954s = zzdVar;
            zztuVar.m8881j();
            return;
        }
        if (i2 == 6) {
            zze zzeVar = (zze) obj;
            zzeVar.getClass();
            if (zztuVar.f20928Q.equals(zzeVar)) {
                return;
            }
            if (zztuVar.f20953r != null) {
                zztuVar.f20928Q.getClass();
            }
            zztuVar.f20928Q = zzeVar;
            return;
        }
        if (i2 == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            zztuVar.f20929R = audioDeviceInfo;
            zztb zztbVar = zztuVar.f20953r;
            if (zztbVar != null) {
                zztbVar.m8858e(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i2 == 16) {
            obj.getClass();
            this.f20978k1 = ((Integer) obj).intValue();
            zzvm zzvmVar = this.f21180f0;
            if (zzvmVar == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f20978k1));
            zzvmVar.mo8914d(bundle);
            return;
        }
        if (i2 == 19) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            int i3 = zztuVar.f20930S;
            if (iIntValue == 0 || iIntValue == -1) {
                iIntValue = -1;
            }
            if (i3 == iIntValue) {
                return;
            }
            zztuVar.f20930S = iIntValue;
            zztuVar.m8881j();
            return;
        }
        if (i2 == 9) {
            obj.getClass();
            zztuVar.f20958w = ((Boolean) obj).booleanValue();
            zzts zztsVar = new zzts(zztuVar.f20957v, -9223372036854775807L, -9223372036854775807L);
            if (zztuVar.m8883l()) {
                zztuVar.f20955t = zztsVar;
                return;
            } else {
                zztuVar.f20956u = zztsVar;
                return;
            }
        }
        if (i2 != 10) {
            super.mo4007j(i2, obj);
            return;
        }
        obj.getClass();
        int iIntValue2 = ((Integer) obj).intValue();
        if (zztuVar.f20927P) {
            if (zztuVar.f20926O == iIntValue2) {
                zztuVar.f20927P = false;
                if (zztuVar.f20926O != iIntValue2) {
                    zztuVar.f20926O = iIntValue2;
                    zztuVar.m8881j();
                }
            }
        } else if (zztuVar.f20926O != iIntValue2) {
            zztuVar.f20926O = iIntValue2;
            zztuVar.m8881j();
        }
        if (Build.VERSION.SDK_INT < 35 || (zzviVar = this.f20968a1) == null) {
            return;
        }
        zzviVar.m8941a(iIntValue2);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: j0 */
    public final boolean mo8895j0(zzv zzvVar) {
        m8601x();
        return this.f20967Z0.m8886o(zzvVar) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: k0 */
    public final zzvj mo4008k0(zzvp zzvpVar, zzv zzvVar, float f2) {
        int iIntValue;
        Integer num;
        zzv[] zzvVarArr = this.f20055B;
        zzvVarArr.getClass();
        int length = zzvVarArr.length;
        String str = zzvpVar.f21111a;
        "OMX.google.raw.decoder".equals(str);
        int iMax = zzvVar.f21062p;
        int i2 = 0;
        if (length != 1) {
            for (zzv zzvVar2 : zzvVarArr) {
                if (zzvpVar.m8948d(zzvVar, zzvVar2).f20091d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    iMax = Math.max(iMax, zzvVar2.f21062p);
                }
            }
        }
        this.f20969b1 = iMax;
        int i3 = Build.VERSION.SDK_INT;
        this.f20970c1 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str2 = zzvpVar.f21113c;
        int i4 = this.f20969b1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        int i5 = zzvVar.f21037G;
        mediaFormat.setInteger("channel-count", i5);
        int i6 = zzvVar.f21039I;
        mediaFormat.setInteger("sample-rate", i6);
        zzek.m6243a(mediaFormat, zzvVar.f21064r);
        zzek.m6244b(mediaFormat, "max-input-size", i4);
        mediaFormat.setInteger("priority", 0);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f2);
        }
        String str3 = zzvVar.f21061o;
        if ("audio/ac4".equals(str3)) {
            Pair pairM6033b = zzdr.m6033b(zzvVar);
            if (pairM6033b != null) {
                zzek.m6244b(mediaFormat, "profile", ((Integer) pairM6033b.first).intValue());
                zzek.m6244b(mediaFormat, FirebaseAnalytics.Param.LEVEL, ((Integer) pairM6033b.second).intValue());
            }
            if (i3 <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        zzt zztVar = new zzt();
        zztVar.m8853e("audio/raw");
        zztVar.f20780F = i5;
        zztVar.f20782H = i6;
        zztVar.f20783I = 4;
        zzv zzvVar3 = new zzv(zztVar);
        zztu zztuVar = this.f20967Z0;
        if (zztuVar.m8886o(zzvVar3) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i3 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i3 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f20978k1));
        }
        zzv zzvVar4 = null;
        if (Objects.equals(str3, "audio/iamf")) {
            zztg zztgVar = zztuVar.f20951p;
            zzqj zzqjVar = zztgVar != null ? zztgVar.f20846e : null;
            int i7 = 12;
            if (zzqjVar == null) {
                zzeh.m6211c("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                zzgxd zzgxdVar = zzty.f20962a;
                Iterator it = zzqjVar.f20638d.iterator();
                do {
                    if (!it.hasNext()) {
                        iIntValue = 0;
                        break;
                    }
                    num = (Integer) it.next();
                    iIntValue = num.intValue();
                } while (!zzty.f20962a.contains(num));
                if (iIntValue != 0) {
                    i7 = iIntValue;
                } else {
                    for (Integer num2 : zzqjVar.f20637c) {
                        int iIntValue2 = num2.intValue();
                        if (zzty.f20962a.contains(num2)) {
                            i2 = iIntValue2;
                            break;
                        }
                    }
                    if (i2 != 0) {
                        i7 = i2;
                    }
                }
                int iBitCount = Integer.bitCount(i7);
                mediaFormat.setInteger("channel-mask", i7);
                mediaFormat.setInteger("max-output-channel-count", iBitCount);
            }
        }
        m8957B0(mediaFormat);
        if ("audio/raw".equals(zzvpVar.f21112b) && !"audio/raw".equals(str3)) {
            zzvVar4 = zzvVar;
        }
        this.f20972e1 = zzvVar4;
        return new zzvj(zzvpVar, mediaFormat, zzvVar, null, this.f20968a1);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: l0 */
    public final zzje mo4009l0(zzvp zzvpVar, zzv zzvVar, zzv zzvVar2, boolean z) {
        int i2;
        int i3;
        zzje zzjeVarM8948d = zzvpVar.m8948d(zzvVar, zzvVar2);
        int i4 = zzjeVarM8948d.f20092e;
        if (this.f21175a0 == null && mo8895j0(zzvVar2)) {
            i4 |= 32768;
        }
        "OMX.google.raw.decoder".equals(zzvpVar.f21111a);
        if (zzvVar2.f21062p > this.f20969b1) {
            i4 |= 64;
        }
        String str = zzvpVar.f21111a;
        if (i4 != 0) {
            i3 = 0;
            i2 = i4;
        } else {
            i2 = 0;
            i3 = zzjeVarM8948d.f20091d;
        }
        return new zzje(str, zzvVar, zzvVar2, i3, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: m0 */
    public final long mo8896m0(long j2, long j3) {
        long jM6521w;
        zztu zztuVar = this.f20967Z0;
        boolean z = zztuVar.m8891t() && this.f20980m1 != -9223372036854775807L;
        if (this.f20979l1) {
            if (!zztuVar.m8883l()) {
                jM6521w = -9223372036854775807L;
            } else if (zztuVar.f20949n.m8870b()) {
                jM6521w = zzfm.m6520v(zztuVar.f20949n.f20895e.f20697b, zztuVar.f20953r.m8856c());
            } else {
                long jM8856c = zztuVar.f20953r.m8856c();
                int iM4112b = zzage.m4112b(zztuVar.f20949n.f20895e.f20696a);
                zzgtr.m7133f(iM4112b != -2147483647);
                jM6521w = zzfm.m6521w(jM8856c, 1000000L, iM4112b, RoundingMode.DOWN);
            }
            if (this.f20977j1 && z && jM6521w != -9223372036854775807L) {
                float fMin = Math.min(jM6521w, this.f20980m1 - j2);
                zzav zzavVar = zztuVar.f20957v;
                return Math.max(WorkRequest.MIN_BACKOFF_MILLIS, (long) ((fMin / (zzavVar != null ? zzavVar.f6970a : 1.0f)) / 2.0f));
            }
        } else if (z || this.f21148K0) {
            return 1000000L;
        }
        return WorkRequest.MIN_BACKOFF_MILLIS;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: n0 */
    public final float mo4010n0(float f2, zzv zzvVar, zzv[] zzvVarArr) {
        int iMax = -1;
        for (zzv zzvVar2 : zzvVarArr) {
            int i2 = zzvVar2.f21039I;
            if (i2 != -1) {
                iMax = Math.max(iMax, i2);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f2;
    }

    @Override // com.google.android.gms.internal.ads.zznc, com.google.android.gms.internal.ads.zzne
    /* JADX INFO: renamed from: o */
    public final String mo4011o() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: o0 */
    public final void mo4012o0(final String str, final long j2, final long j3) {
        final zzrw zzrwVar = this.f20966Y0;
        Handler handler = zzrwVar.f20723a;
        if (handler != null) {
            handler.post(new Runnable(str, j2, j3) { // from class: com.google.android.gms.internal.ads.zzri
                @Override // java.lang.Runnable
                public final void run() {
                    zzrw zzrwVar2 = this.f20703s;
                    zzrwVar2.getClass();
                    String str2 = zzfm.f16091a;
                    zzpt zzptVar = ((zzkf) zzrwVar2.f20724b).f20189s.f20264r;
                    zzptVar.m8814r(zzptVar.m8818w(), PointerIconCompat.TYPE_TEXT, new zzpj());
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    /* JADX INFO: renamed from: p */
    public final void mo4013p(boolean z, boolean z2, long j2) {
        super.mo4013p(z, z2, j2);
        this.f20967Z0.m8873a();
        this.f20973f1 = j2;
        this.f20980m1 = -9223372036854775807L;
        this.f20976i1 = false;
        this.f20977j1 = false;
        this.f20974g1 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: p0 */
    public final void mo4014p0(final String str) {
        final zzrw zzrwVar = this.f20966Y0;
        Handler handler = zzrwVar.f20723a;
        if (handler != null) {
            handler.post(new Runnable(str) { // from class: com.google.android.gms.internal.ads.zzrp
                @Override // java.lang.Runnable
                public final void run() {
                    zzrw zzrwVar2 = this.f20714s;
                    zzrwVar2.getClass();
                    String str2 = zzfm.f16091a;
                    zzpt zzptVar = ((zzkf) zzrwVar2.f20724b).f20189s.f20264r;
                    zzptVar.m8814r(zzptVar.m8818w(), PointerIconCompat.TYPE_NO_DROP, new zzpp());
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zziz
    /* JADX INFO: renamed from: q */
    public final void mo4015q() {
        this.f20967Z0.m8888q();
        this.f20979l1 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: q0 */
    public final void mo4016q0(final Exception exc) {
        zzeh.m6214f("MediaCodecAudioRenderer", "Audio codec error", exc);
        final zzrw zzrwVar = this.f20966Y0;
        Handler handler = zzrwVar.f20723a;
        if (handler != null) {
            handler.post(new Runnable(exc) { // from class: com.google.android.gms.internal.ads.zzrt
                @Override // java.lang.Runnable
                public final void run() {
                    zzrw zzrwVar2 = this.f20720s;
                    zzrwVar2.getClass();
                    String str = zzfm.f16091a;
                    zzpt zzptVar = ((zzkf) zzrwVar2.f20724b).f20189s.f20264r;
                    zzptVar.m8814r(zzptVar.m8818w(), 1029, new zznu());
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: r0 */
    public final zzje mo4017r0(zzly zzlyVar) {
        final zzv zzvVar = zzlyVar.f20351b;
        zzvVar.getClass();
        this.f20971d1 = zzvVar;
        final zzje zzjeVarMo4017r0 = super.mo4017r0(zzlyVar);
        final zzrw zzrwVar = this.f20966Y0;
        Handler handler = zzrwVar.f20723a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrm
                @Override // java.lang.Runnable
                public final void run() {
                    zzrw zzrwVar2 = zzrwVar;
                    zzrwVar2.getClass();
                    String str = zzfm.f16091a;
                    zzpt zzptVar = ((zzkf) zzrwVar2.f20724b).f20189s.f20264r;
                    zznp zznpVarM8818w = zzptVar.m8818w();
                    zzptVar.m8814r(zznpVarM8818w, PointerIconCompat.TYPE_VERTICAL_TEXT, new zzeb(zznpVarM8818w, zzvVar, zzjeVarMo4017r0) { // from class: com.google.android.gms.internal.ads.zzpm

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ zzv f20546a;

                        {
                            this.f20546a = zzvVar;
                        }

                        @Override // com.google.android.gms.internal.ads.zzeb
                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ void mo6141b(Object obj) {
                            ((zznr) obj).mo5546i(this.f20546a);
                        }
                    });
                }
            });
        }
        return zzjeVarMo4017r0;
    }

    @Override // com.google.android.gms.internal.ads.zziz
    /* JADX INFO: renamed from: s */
    public final void mo4018s() {
        m8894J0();
        this.f20979l1 = false;
        zztu zztuVar = this.f20967Z0;
        zztuVar.f20925N = false;
        if (zztuVar.m8883l()) {
            zztb zztbVar = zztuVar.f20953r;
            zzti zztiVar = zztbVar.f20825e;
            zztiVar.f20861k = 0L;
            zztiVar.f20870t = 0;
            zztiVar.f20869s = 0;
            zztiVar.f20862l = 0L;
            zztiVar.f20875y = -9223372036854775807L;
            zztiVar.f20876z = -9223372036854775807L;
            if (zztiVar.f20871u == -9223372036854775807L) {
                zztiVar.f20858h.m8848a(0);
            }
            zztiVar.f20873w = zztiVar.m8867c();
            if (!zztbVar.f20830j || zztbVar.m8855b()) {
                zztbVar.f20821a.pause();
            }
        }
        this.f20977j1 = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: s0 */
    public final void mo4019s0(zzv zzvVar, MediaFormat mediaFormat) throws zzjm {
        int iM6500b;
        int integer;
        zzxl zzxlVar;
        zzv zzvVar2 = this.f20972e1;
        zzham zzhamVar = null;
        if (zzvVar2 != null) {
            zzvVar = zzvVar2;
        } else if (this.f21180f0 != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(zzvVar.f21061o)) {
                iM6500b = zzvVar.f21040J;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                iM6500b = mediaFormat.getInteger("pcm-encoding");
            } else {
                iM6500b = mediaFormat.containsKey("v-bits-per-sample") ? zzfm.m6500b(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            }
            int integer2 = mediaFormat.getInteger("channel-count");
            int i2 = zzvVar.f21038H;
            if (i2 == -1 || zzvVar.f21037G != integer2) {
                i2 = -1;
            }
            if (mediaFormat.containsKey("channel-mask") && (integer = mediaFormat.getInteger("channel-mask")) != 0 && Integer.bitCount(integer) == integer2) {
                i2 = integer;
            }
            zzt zztVar = new zzt();
            zztVar.m8853e("audio/raw");
            zztVar.f20783I = iM6500b;
            zztVar.f20784J = zzvVar.f21041K;
            zztVar.f20785K = zzvVar.f21042L;
            zztVar.f20799k = zzvVar.f21058l;
            zztVar.f20789a = zzvVar.f21047a;
            zztVar.f20790b = zzvVar.f21048b;
            zztVar.f20791c = zzgwt.m7220t(zzvVar.f21049c);
            zztVar.f20792d = zzvVar.f21050d;
            zztVar.f20793e = zzvVar.f21051e;
            zztVar.f20794f = zzvVar.f21052f;
            zztVar.f20780F = integer2;
            zztVar.f20781G = i2;
            zztVar.f20782H = mediaFormat.getInteger("sample-rate");
            zzvVar = new zzv(zztVar);
            if (this.f20970c1) {
                int i3 = zzvVar.f21037G;
                if (i3 == 3) {
                    zzhamVar = zzaho.f5334a;
                } else if (i3 == 5) {
                    zzhamVar = zzaho.f5335b;
                } else if (i3 == 6) {
                    zzhamVar = zzaho.f5336c;
                } else if (i3 == 7) {
                    zzhamVar = zzaho.f5337d;
                } else if (i3 != 8) {
                    zzham zzhamVar2 = zzaho.f5334a;
                } else {
                    zzhamVar = zzaho.f5338e;
                }
            }
        }
        try {
            int i4 = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i4 >= 29) {
                if (this.f21198x0) {
                    m8601x();
                }
                zzgtr.m7133f(i4 >= 29);
            }
            zztu zztuVar = this.f20967Z0;
            zzry zzryVar = new zzry(zzvVar);
            zzryVar.f20726b = zzhamVar;
            zzbf zzbfVar = this.f20061H;
            zzryVar.f20727c = zzbfVar;
            zzryVar.f20728d = this.f20062I;
            if (!zzbfVar.m4833g() && (zzxlVar = zzryVar.f20728d) != null) {
                if (zzryVar.f20727c.mo4739e(zzxlVar.f21278a) == -1) {
                    z = false;
                }
                zzgtr.m7128a(z);
            }
            zztuVar.m8887p(new zzrz(zzryVar));
        } catch (zzsb e) {
            throw m8602y(e, e.f20734s, false, 5001);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    /* JADX INFO: renamed from: t */
    public final void mo4020t() {
        final zzjd zzjdVar;
        final zzrw zzrwVar = this.f20966Y0;
        this.f20975h1 = true;
        this.f20971d1 = null;
        this.f20980m1 = -9223372036854775807L;
        this.f20977j1 = false;
        try {
            try {
                this.f20967Z0.m8873a();
                super.mo4020t();
                zzjdVar = this.f21152M0;
                zzrwVar.getClass();
                synchronized (zzjdVar) {
                }
            } finally {
                super.mo4020t();
                zzjdVar = this.f21152M0;
                zzrwVar.getClass();
                synchronized (zzjdVar) {
                    Handler handler = zzrwVar.f20723a;
                    if (handler != null) {
                        handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrq
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzrw zzrwVar2 = zzrwVar;
                                synchronized (zzjdVar) {
                                }
                                String str = zzfm.f16091a;
                                zzpt zzptVar = ((zzkf) zzrwVar2.f20724b).f20189s.f20264r;
                                zzptVar.m8814r(zzptVar.m8817v(zzptVar.f20558d.f20553e), PointerIconCompat.TYPE_ALL_SCROLL, new zzpq());
                            }
                        });
                    }
                }
            }
        } catch (Throwable th) {
            final zzjd zzjdVar2 = this.f21152M0;
            zzrwVar.getClass();
            synchronized (zzjdVar2) {
                Handler handler2 = zzrwVar.f20723a;
                if (handler2 != null) {
                    handler2.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrq
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzrw zzrwVar2 = zzrwVar;
                            synchronized (zzjdVar2) {
                            }
                            String str = zzfm.f16091a;
                            zzpt zzptVar = ((zzkf) zzrwVar2.f20724b).f20189s.f20264r;
                            zzptVar.m8814r(zzptVar.m8817v(zzptVar.f20558d.f20553e), PointerIconCompat.TYPE_ALL_SCROLL, new zzpq());
                        }
                    });
                }
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: t0 */
    public final void mo4021t0() {
        this.f20967Z0.f20914C = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvw, com.google.android.gms.internal.ads.zziz
    /* JADX INFO: renamed from: u */
    public final void mo4022u() {
        zztu zztuVar = this.f20967Z0;
        this.f20976i1 = false;
        this.f20977j1 = false;
        this.f20980m1 = -9223372036854775807L;
        try {
            super.mo4022u();
            if (this.f20975h1) {
            }
        } finally {
            if (this.f20975h1) {
                this.f20975h1 = false;
                zztuVar.m8874b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: u0 */
    public final boolean mo4023u0(long j2, long j3, zzvm zzvmVar, ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z, boolean z2, zzv zzvVar) throws zzjm {
        byteBuffer.getClass();
        this.f20980m1 = -9223372036854775807L;
        if (this.f20972e1 != null && (i3 & 2) != 0) {
            zzvmVar.getClass();
            zzvmVar.mo8909A(i2);
            return true;
        }
        zztu zztuVar = this.f20967Z0;
        if (z) {
            if (zzvmVar != null) {
                zzvmVar.mo8909A(i2);
            }
            this.f21152M0.f20081f += i4;
            zztuVar.f20914C = true;
            return true;
        }
        try {
            if (!zztuVar.m8889r(byteBuffer, j4, i4)) {
                this.f20980m1 = j4;
                return false;
            }
            if (zzvmVar != null) {
                zzvmVar.mo8909A(i2);
            }
            this.f21152M0.f20080e += i4;
            return true;
        } catch (zzsc e) {
            zzv zzvVar2 = this.f20971d1;
            if (this.f21198x0) {
                m8601x();
            }
            throw m8602y(e, zzvVar2, false, 5001);
        } catch (zzsf e2) {
            if (this.f21198x0) {
                m8601x();
            }
            throw m8602y(e2, zzvVar, e2.f20736t, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziz
    /* JADX INFO: renamed from: v */
    public final void mo4024v() {
        zzvi zzviVar;
        zzaco zzacoVar;
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        Handler handler;
        zztg zztgVar = this.f20967Z0.f20951p;
        zzeg zzegVar = zztgVar.f20844c;
        if (zzegVar != null) {
            zzegVar.m6199e();
        }
        zzqp zzqpVar = zztgVar.f20847f;
        if (zzqpVar != null && zzqpVar.f20655k) {
            zzqpVar.f20652h = null;
            Context context = zzqpVar.f20645a;
            zzcj.m5503a(context).unregisterAudioDeviceCallback(zzqpVar.f20648d);
            if (Build.VERSION.SDK_INT >= 32 && (zzacoVar = zzqpVar.f20651g) != null) {
                Spatializer spatializer = zzacoVar.f4917a;
                if (spatializer != null && (spatializer$OnSpatializerStateChangedListener = zzacoVar.f4920d) != null && (handler = zzacoVar.f4919c) != null) {
                    spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
                    handler.removeCallbacksAndMessages(null);
                }
                zzqpVar.f20651g = null;
            }
            context.unregisterReceiver(zzqpVar.f20649e);
            zzqm zzqmVar = zzqpVar.f20650f;
            if (zzqmVar != null) {
                zzqmVar.f20641a.unregisterContentObserver(zzqmVar);
            }
            zzqpVar.f20655k = false;
        }
        if (Build.VERSION.SDK_INT < 35 || (zzviVar = this.f20968a1) == null) {
            return;
        }
        zzviVar.f21103a.clear();
        LoudnessCodecController loudnessCodecController = zzviVar.f21104b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: v0 */
    public final void mo4025v0(final zzjb zzjbVar) {
        final zzrw zzrwVar = this.f20966Y0;
        Handler handler = zzrwVar.f20723a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrl
                @Override // java.lang.Runnable
                public final void run() {
                    zzrw zzrwVar2 = zzrwVar;
                    zzrwVar2.getClass();
                    String str = zzfm.f16091a;
                    ((zzkf) zzrwVar2.f20724b).f20189s.f20222D.m8622a(zzjbVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: w0 */
    public final void mo4026w0() throws zzjm {
        try {
            this.f20967Z0.m8890s();
            long j2 = this.f21154N0.f21136f;
            if (j2 != -9223372036854775807L) {
                this.f20980m1 = j2;
            }
        } catch (zzsf e) {
            throw m8602y(e, e.f20737u, e.f20736t, true != this.f21198x0 ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: x0 */
    public final void mo8897x0(long j2) {
        this.f20967Z0.f20917F = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    /* JADX INFO: renamed from: y0 */
    public final void mo4027y0(zzix zzixVar) {
        zzv zzvVar;
        if (Build.VERSION.SDK_INT < 29 || (zzvVar = zzixVar.f20046b) == null || !Objects.equals(zzvVar.f21061o, "audio/opus") || !this.f21198x0) {
            return;
        }
        ByteBuffer byteBuffer = zzixVar.f20050f;
        byteBuffer.getClass();
        zzixVar.f20046b.getClass();
        if (byteBuffer.remaining() == 8) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong();
            zztb zztbVar = this.f20967Z0.f20953r;
            if (zztbVar != null) {
                zztbVar.m8855b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final boolean zzh() {
        boolean z = this.f20976i1;
        this.f20976i1 = false;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final zzav zzj() {
        return this.f20967Z0.f20957v;
    }
}
