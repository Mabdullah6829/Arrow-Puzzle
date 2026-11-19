package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcd {

    /* JADX INFO: renamed from: a */
    public final zzguj f9747a;

    /* JADX INFO: renamed from: b */
    public final Handler f9748b;

    /* JADX INFO: renamed from: c */
    public zzcc f9749c;

    /* JADX INFO: renamed from: d */
    public zzd f9750d;

    /* JADX INFO: renamed from: f */
    public int f9752f;

    /* JADX INFO: renamed from: h */
    public zzch f9754h;

    /* JADX INFO: renamed from: g */
    public float f9753g = 1.0f;

    /* JADX INFO: renamed from: e */
    public int f9751e = 0;

    public zzcd(final Context context, Looper looper, zzcc zzccVar) {
        this.f9747a = zzgum.m7151a(new zzguj() { // from class: com.google.android.gms.internal.ads.zzcb
            @Override // com.google.android.gms.internal.ads.zzguj
            public final /* synthetic */ Object zza() {
                return zzcj.m5503a(context);
            }
        });
        this.f9749c = zzccVar;
        this.f9748b = new Handler(looper);
    }

    /* JADX INFO: renamed from: a */
    public final void m5342a(zzd zzdVar) {
        if (Objects.equals(this.f9750d, zzdVar)) {
            return;
        }
        this.f9750d = zzdVar;
        this.f9752f = zzdVar == null ? 0 : 1;
    }

    /* JADX INFO: renamed from: b */
    public final int m5343b(int i2, boolean z) {
        int iRequestAudioFocus;
        if (i2 == 1 || this.f9752f != 1) {
            m5345d();
            m5346e(0);
            return 1;
        }
        int i3 = 3;
        if (!z) {
            int i4 = this.f9751e;
            if (i4 == 1) {
                return -1;
            }
            if (i4 == 3) {
                return 0;
            }
        } else if (this.f9751e != 2) {
            if (this.f9754h == null) {
                zzce zzceVar = new zzce();
                zzceVar.f9809a = zzd.f11854b;
                zzd zzdVar = this.f9750d;
                zzdVar.getClass();
                zzceVar.f9809a = zzdVar;
                zzceVar.f9810b = true;
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: com.google.android.gms.internal.ads.zzca
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i5) {
                        zzcd zzcdVar = this.f9576a;
                        zzcdVar.getClass();
                        if (i5 == -3 || i5 == -2) {
                            if (i5 != -2) {
                                zzcdVar.m5346e(4);
                                return;
                            }
                            zzcc zzccVar = zzcdVar.f9749c;
                            if (zzccVar != null) {
                                ((zzfg) ((zzlw) zzccVar).f20348y.mo6116a(33, 0, 0)).m6435a();
                            }
                            zzcdVar.m5346e(3);
                            return;
                        }
                        if (i5 == -1) {
                            zzcc zzccVar2 = zzcdVar.f9749c;
                            if (zzccVar2 != null) {
                                ((zzfg) ((zzlw) zzccVar2).f20348y.mo6116a(33, -1, 0)).m6435a();
                            }
                            zzcdVar.m5345d();
                            zzcdVar.m5346e(1);
                            return;
                        }
                        if (i5 != 1) {
                            AbstractC5152f.m3776h(new StringBuilder(String.valueOf(i5).length() + 27), "Unknown focus change type: ", i5, "AudioFocusManager");
                            return;
                        }
                        zzcdVar.m5346e(2);
                        zzcc zzccVar3 = zzcdVar.f9749c;
                        if (zzccVar3 != null) {
                            ((zzfg) ((zzlw) zzccVar3).f20348y.mo6116a(33, 1, 0)).m6435a();
                        }
                    }
                };
                Handler handler = this.f9748b;
                handler.getClass();
                this.f9754h = new zzch(onAudioFocusChangeListener, handler, zzceVar.f9809a, zzceVar.f9810b);
            }
            AudioManager audioManager = (AudioManager) this.f9747a.zza();
            zzch zzchVar = this.f9754h;
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 26) {
                Object obj = zzchVar.f10004d;
                obj.getClass();
                iRequestAudioFocus = audioManager.requestAudioFocus(AbstractC5149c.m3739k(obj));
            } else {
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener2 = zzchVar.f10001a;
                zzd zzdVar2 = zzchVar.f10003c;
                if (i5 >= 26) {
                    try {
                        int volumeControlStream = zzdVar2.m5884a().getVolumeControlStream();
                        if (volumeControlStream != Integer.MIN_VALUE) {
                            i3 = volumeControlStream;
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                iRequestAudioFocus = audioManager.requestAudioFocus(onAudioFocusChangeListener2, i3, 1);
            }
            if (iRequestAudioFocus == 1 || iRequestAudioFocus == 2) {
                m5346e(2);
                return 1;
            }
            m5346e(1);
            return -1;
        }
        return 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m5344c() {
        this.f9749c = null;
        m5345d();
        m5346e(0);
    }

    /* JADX INFO: renamed from: d */
    public final void m5345d() {
        int i2 = this.f9751e;
        if (i2 == 1 || i2 == 0 || this.f9754h == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.f9747a.zza();
        zzch zzchVar = this.f9754h;
        if (Build.VERSION.SDK_INT < 26) {
            audioManager.abandonAudioFocus(zzchVar.f10001a);
            return;
        }
        Object obj = zzchVar.f10004d;
        obj.getClass();
        audioManager.abandonAudioFocusRequest(AbstractC5149c.m3739k(obj));
    }

    /* JADX INFO: renamed from: e */
    public final void m5346e(int i2) {
        if (this.f9751e == i2) {
            return;
        }
        this.f9751e = i2;
        float f2 = i2 == 4 ? 0.2f : 1.0f;
        if (this.f9753g != f2) {
            this.f9753g = f2;
            zzcc zzccVar = this.f9749c;
            if (zzccVar != null) {
                ((zzlw) zzccVar).f20348y.mo6125l(34);
            }
        }
    }
}
