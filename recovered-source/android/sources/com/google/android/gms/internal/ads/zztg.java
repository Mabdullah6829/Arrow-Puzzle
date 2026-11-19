package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.math.RoundingMode;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zztg implements zzrh {

    /* JADX INFO: renamed from: a */
    public final Context f20842a;

    /* JADX INFO: renamed from: b */
    public final zztf f20843b;

    /* JADX INFO: renamed from: c */
    public zzeg f20844c;

    /* JADX INFO: renamed from: d */
    public zzdp f20845d;

    /* JADX INFO: renamed from: e */
    public zzqj f20846e;

    /* JADX INFO: renamed from: f */
    public zzqp f20847f;

    /* JADX INFO: renamed from: g */
    public Looper f20848g;

    /* JADX INFO: renamed from: h */
    public Context f20849h;

    /* JADX INFO: renamed from: i */
    public final zztk f20850i;

    public /* synthetic */ zztg(zzte zzteVar) {
        Context context = zzteVar.f20837a;
        this.f20842a = context;
        zztk zztkVar = zzteVar.f20840d;
        zztkVar.getClass();
        this.f20850i = zztkVar;
        this.f20846e = zzteVar.f20839c;
        this.f20843b = context == null ? null : new zztf(this);
        this.f20845d = zzdp.f12520a;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x011c  */
    /* JADX INFO: renamed from: a */
    public final zzrc m8860a(zzra zzraVar) {
        zzqu zzquVarM8841a;
        int i2;
        boolean zBooleanValue;
        int i3;
        m8863d(zzraVar);
        zzv zzvVar = zzraVar.f20675a;
        zzd zzdVar = zzraVar.f20676b;
        zztk zztkVar = this.f20850i;
        zztkVar.getClass();
        zzvVar.getClass();
        String str = zzvVar.f21061o;
        zzdVar.getClass();
        int i4 = Build.VERSION.SDK_INT;
        int i5 = 2;
        if (i4 < 29 || (i2 = zzvVar.f21039I) == -1) {
            zzquVarM8841a = zzqu.f20661d;
        } else {
            Context context = zztkVar.f20879a;
            Boolean bool = zztkVar.f20880b;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                if (context != null) {
                    String parameters = zzcj.m5503a(context).getParameters("offloadVariableRateSupported");
                    zztkVar.f20880b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                } else {
                    zztkVar.f20880b = Boolean.FALSE;
                }
                zBooleanValue = zztkVar.f20880b.booleanValue();
            }
            str.getClass();
            int iM4355g = zzas.m4355g(str, zzvVar.f21057k);
            if (iM4355g != 0) {
                switch (iM4355g) {
                    case 2:
                    case 3:
                        i3 = 3;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        i3 = 21;
                        break;
                    case 7:
                    case 8:
                        i3 = 23;
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        i3 = 28;
                        break;
                    case 13:
                    case 19:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    default:
                        i3 = Integer.MAX_VALUE;
                        break;
                    case 14:
                        i3 = 25;
                        break;
                    case 20:
                        i3 = 30;
                        break;
                    case 21:
                    case 22:
                        i3 = 31;
                        break;
                    case 30:
                    case 31:
                        i3 = 34;
                        break;
                }
                if (i4 < i3) {
                    zzquVarM8841a = zzqu.f20661d;
                } else {
                    int iM6503e = zzvVar.f21038H;
                    if (iM6503e == -1) {
                        iM6503e = zzfm.m6503e(zzvVar.f21037G);
                    }
                    if (iM6503e != 0) {
                        try {
                            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i2).setChannelMask(iM6503e).setEncoding(iM4355g).build();
                            if (i4 >= 33) {
                                int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(audioFormatBuild, zzdVar.m5884a());
                                if ((directPlaybackSupport & 1) == 0) {
                                    zzquVarM8841a = zzqu.f20661d;
                                } else {
                                    boolean z = (directPlaybackSupport & 3) == 3;
                                    zzqt zzqtVar = new zzqt();
                                    zzqtVar.f20658a = true;
                                    zzqtVar.f20659b = z;
                                    zzqtVar.f20660c = zBooleanValue;
                                    zzquVarM8841a = zzqtVar.m8841a();
                                }
                            } else if (i4 >= 31) {
                                int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, zzdVar.m5884a());
                                if (playbackOffloadSupport == 0) {
                                    zzquVarM8841a = zzqu.f20661d;
                                } else {
                                    zzqt zzqtVar2 = new zzqt();
                                    boolean z2 = i4 > 32 && playbackOffloadSupport == 2;
                                    zzqtVar2.f20658a = true;
                                    zzqtVar2.f20659b = z2;
                                    zzqtVar2.f20660c = zBooleanValue;
                                    zzquVarM8841a = zzqtVar2.m8841a();
                                }
                            } else if (AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, zzdVar.m5884a())) {
                                zzqt zzqtVar3 = new zzqt();
                                zzqtVar3.f20658a = true;
                                zzqtVar3.f20660c = zBooleanValue;
                                zzquVarM8841a = zzqtVar3.m8841a();
                            } else {
                                zzquVarM8841a = zzqu.f20661d;
                            }
                        } catch (IllegalArgumentException unused) {
                            zzquVarM8841a = zzqu.f20661d;
                        }
                    } else {
                        zzquVarM8841a = zzqu.f20661d;
                    }
                }
            } else {
                zzquVarM8841a = zzqu.f20661d;
            }
        }
        zzrb zzrbVar = new zzrb();
        if (!Objects.equals(str, "audio/raw") ? this.f20846e.m8836b(zzvVar, zzdVar) == null : zzvVar.f21040J != 2) {
            i5 = 0;
        }
        zzrbVar.f20684d = i5;
        zzrbVar.f20681a = zzquVarM8841a.f20662a;
        zzrbVar.f20682b = zzquVarM8841a.f20663b;
        zzrbVar.f20683c = zzquVarM8841a.f20664c;
        return zzrbVar.m8847a();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    /* JADX WARN: Code duplicated, block: B:38:0x009f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX INFO: renamed from: b */
    public final zzrg m8861b(zzra zzraVar) throws zzqy {
        int iIntValue;
        int i2;
        char c;
        int iM6504f;
        int iMax;
        int i3;
        int iM4112b;
        boolean z;
        m8863d(zzraVar);
        zzv zzvVar = zzraVar.f20675a;
        zzd zzdVar = zzraVar.f20676b;
        String str = zzvVar.f21061o;
        int i4 = zzvVar.f21037G;
        int i5 = zzvVar.f21039I;
        if (Objects.equals(str, "audio/raw")) {
            i2 = zzvVar.f21040J;
            zzgtr.m7128a(zzfm.m6502d(i2));
            iIntValue = zzvVar.f21038H;
            if (iIntValue == -1) {
                iIntValue = zzfm.m6503e(i4);
            }
            iM6504f = zzfm.m6504f(i2) * i4;
            c = 0;
        } else {
            zzqu zzquVar = zzqu.f20661d;
            Pair pairM8836b = this.f20846e.m8836b(zzvVar, zzdVar);
            if (pairM8836b == null) {
                throw new zzqy("Unable to configure passthrough for: ".concat(String.valueOf(zzvVar)));
            }
            int iIntValue2 = ((Integer) pairM8836b.first).intValue();
            iIntValue = ((Integer) pairM8836b.second).intValue();
            i2 = iIntValue2;
            c = 2;
            iM6504f = -1;
        }
        int i6 = zzvVar.f21056j;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i6 == -1) {
            i6 = 768000;
        }
        int iMax2 = zzraVar.f20680f;
        if (iMax2 != -1) {
            iIntValue = iIntValue;
        } else {
            int minBufferSize = AudioTrack.getMinBufferSize(i5, iIntValue, i2);
            zzgtr.m7133f(minBufferSize != -2);
            if (iM6504f == -1) {
                iM6504f = 1;
            }
            int i7 = 250000;
            if (c == 0) {
                long j2 = i5;
                long j3 = iM6504f;
                int iM7304a = zzhaq.m7304a(((((long) 250000) * j2) * j3) / 1000000);
                int iM7304a2 = zzhaq.m7304a(((((long) 750000) * j2) * j3) / 1000000);
                String str2 = zzfm.f16091a;
                iMax = Math.max(iM7304a, Math.min(minBufferSize * 4, iM7304a2));
            } else if (c != 1) {
                if (i2 == 5) {
                    i7 = 500000;
                } else {
                    if (i2 == 8) {
                        i7 = 1000000;
                        i3 = 8;
                    }
                    if (i6 != -1) {
                        RoundingMode roundingMode = RoundingMode.CEILING;
                        iM4112b = zzhag.m7295a(i6, 8);
                    } else {
                        iM4112b = zzage.m4112b(i3);
                        if (iM4112b != -2147483647) {
                            z = true;
                        } else {
                            z = false;
                        }
                        zzgtr.m7133f(z);
                    }
                    iMax = zzhaq.m7304a((((long) i7) * ((long) iM4112b)) / 1000000);
                }
                i3 = i2;
                if (i6 != -1) {
                    RoundingMode roundingMode2 = RoundingMode.CEILING;
                    iM4112b = zzhag.m7295a(i6, 8);
                } else {
                    iM4112b = zzage.m4112b(i3);
                    if (iM4112b != -2147483647) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zzgtr.m7133f(z);
                }
                iMax = zzhaq.m7304a((((long) i7) * ((long) iM4112b)) / 1000000);
            } else {
                int iM4112b2 = zzage.m4112b(i2);
                zzgtr.m7133f(iM4112b2 != -2147483647);
                iMax = zzhaq.m7304a((((long) iM4112b2) * 50000000) / 1000000);
            }
            iMax2 = (((Math.max(minBufferSize, iMax) + iM6504f) - 1) / iM6504f) * iM6504f;
        }
        zzrf zzrfVar = new zzrf();
        zzrfVar.f20690b = i5;
        zzrfVar.f20691c = iIntValue;
        zzrfVar.f20689a = i2;
        zzrfVar.f20692d = iMax2;
        zzrfVar.f20694f = zzraVar.f20678d;
        zzrfVar.f20693e = zzdVar;
        zzrfVar.f20695g = zzraVar.f20679e;
        return new zzrg(zzrfVar);
    }

    /* JADX INFO: renamed from: c */
    public final zztb m8862c(zzrg zzrgVar) throws zzrd {
        Context context;
        try {
            int i2 = zzrgVar.f20701f;
            int i3 = zzrgVar.f20702g;
            Context context2 = null;
            if (i3 != -1 && (context = this.f20842a) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.f20849h;
                if (context3 == null || context3.getDeviceId() != i3) {
                    this.f20849h = context.createDeviceContext(i3);
                }
                context2 = this.f20849h;
                i2 = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(zzrgVar.f20700e.m5884a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(zzrgVar.f20697b).setChannelMask(zzrgVar.f20698c).setEncoding(zzrgVar.f20696a).build()).setTransferMode(1).setBufferSizeInBytes(zzrgVar.f20699d).setSessionId(i2);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 29) {
                sessionId.setOffloadedPlayback(false);
            }
            if (i4 >= 34 && context2 != null) {
                sessionId.setContext(context2);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            if (audioTrackBuild.getState() == 1) {
                return new zztb(audioTrackBuild, zzrgVar, this.f20843b, this.f20845d);
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new zzrd();
        } catch (IllegalArgumentException e) {
            e = e;
            throw new zzrd(e);
        } catch (UnsupportedOperationException e2) {
            e = e2;
            throw new zzrd(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m8863d(zzra zzraVar) {
        Context context;
        zzqj zzqjVarM8834a;
        AudioDeviceInfo audioDeviceInfo = zzraVar.f20677c;
        zzd zzdVar = zzraVar.f20676b;
        m8864e();
        zzqp zzqpVar = this.f20847f;
        if (zzqpVar == null && (context = this.f20842a) != null) {
            final zzqp zzqpVar2 = new zzqp(context, new zztd(this), zzdVar, audioDeviceInfo);
            this.f20847f = zzqpVar2;
            if (zzqpVar2.f20655k) {
                zzqjVarM8834a = zzqpVar2.f20652h;
                zzqjVarM8834a.getClass();
            } else {
                zzqpVar2.f20655k = true;
                zzqm zzqmVar = zzqpVar2.f20650f;
                if (zzqmVar != null) {
                    zzqmVar.f20641a.registerContentObserver(zzqmVar.f20642b, false, zzqmVar);
                }
                Context context2 = zzqpVar2.f20645a;
                AudioManager audioManagerM5503a = zzcj.m5503a(context2);
                zzql zzqlVar = zzqpVar2.f20648d;
                Handler handler = zzqpVar2.f20647c;
                audioManagerM5503a.registerAudioDeviceCallback(zzqlVar, handler);
                if (Build.VERSION.SDK_INT >= 32 && zzqpVar2.f20651g == null) {
                    zzqpVar2.f20651g = new zzaco(context2, new Runnable() { // from class: com.google.android.gms.internal.ads.zzqk
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzqpVar2.m8839c();
                        }
                    }, Boolean.valueOf(zzfm.m6508j(context2)));
                }
                zzqjVarM8834a = zzqj.m8834a(context2, context2.registerReceiver(zzqpVar2.f20649e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), zzqpVar2.f20654j, zzqpVar2.f20653i, zzqpVar2.m8837a());
                zzqpVar2.f20652h = zzqjVarM8834a;
            }
            this.f20846e = zzqjVarM8834a;
        } else if (zzqpVar != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(zzqpVar.f20653i)) {
                zzqpVar.f20653i = audioDeviceInfo;
                Context context3 = zzqpVar.f20645a;
                zzd zzdVar2 = zzqpVar.f20654j;
                List listM8837a = zzqpVar.m8837a();
                zzgwt zzgwtVar = zzqj.f20631e;
                zzqpVar.m8838b(zzqj.m8834a(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzdVar2, audioDeviceInfo, listM8837a));
            }
            zzqp zzqpVar3 = this.f20847f;
            if (!Objects.equals(zzdVar, zzqpVar3.f20654j)) {
                zzqpVar3.f20654j = zzdVar;
                Context context4 = zzqpVar3.f20645a;
                AudioDeviceInfo audioDeviceInfo2 = zzqpVar3.f20653i;
                List listM8837a2 = zzqpVar3.m8837a();
                zzgwt zzgwtVar2 = zzqj.f20631e;
                zzqpVar3.m8838b(zzqj.m8834a(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzdVar, audioDeviceInfo2, listM8837a2));
            }
        }
        this.f20846e.getClass();
    }

    /* JADX INFO: renamed from: e */
    public final void m8864e() {
        if (this.f20842a == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f20848g;
        boolean z = true;
        if (looper != null && looper != looperMyLooper) {
            z = false;
        }
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null";
        if (!z) {
            throw new IllegalStateException(zzgui.m7149b("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
        this.f20848g = looperMyLooper;
    }
}
