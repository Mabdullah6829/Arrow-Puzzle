package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import androidx.core.os.EnvironmentCompat;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzve implements zzvk {

    /* JADX INFO: renamed from: a */
    public final Context f21100a;

    @Deprecated
    public zzve() {
        this.f21100a = null;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x011a  */
    @Override // com.google.android.gms.internal.ads.zzvk
    /* JADX INFO: renamed from: a */
    public final zzvm mo8907a(zzvj zzvjVar) throws Exception {
        String str;
        MediaCodec mediaCodecCreateByCodecName;
        int i2;
        zzvn zzvaVar;
        Context context;
        int i3 = Build.VERSION.SDK_INT;
        int i4 = 0;
        zzux zzuxVar = null;
        mediaCodec = null;
        MediaCodec mediaCodec = null;
        zzuxVar = null;
        if (i3 < 31 && ((context = this.f21100a) == null || i3 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            try {
                zzvp zzvpVar = zzvjVar.f21105a;
                String str2 = zzvpVar.f21111a;
                Trace.beginSection("createCodec:".concat(str2));
                MediaCodec mediaCodecCreateByCodecName2 = MediaCodec.createByCodecName(str2);
                Trace.endSection();
                try {
                    Trace.beginSection("configureCodec");
                    Surface surface = zzvjVar.f21108d;
                    if (surface == null && zzvpVar.f21118h && i3 >= 35) {
                        i4 = 8;
                    }
                    mediaCodecCreateByCodecName2.configure(zzvjVar.f21106b, surface, (MediaCrypto) null, i4);
                    Trace.endSection();
                    Trace.beginSection("startCodec");
                    mediaCodecCreateByCodecName2.start();
                    Trace.endSection();
                    return new zzwj(mediaCodecCreateByCodecName2, zzvjVar.f21109e);
                } catch (IOException e) {
                    e = e;
                    mediaCodec = mediaCodecCreateByCodecName2;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                } catch (RuntimeException e2) {
                    e = e2;
                    mediaCodec = mediaCodecCreateByCodecName2;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (RuntimeException e4) {
                e = e4;
            }
        } else {
            int iM4354f = zzas.m4354f(zzvjVar.f21107c.f21061o);
            switch (iM4354f) {
                case -2:
                    str = "none";
                    break;
                case -1:
                    str = EnvironmentCompat.MEDIA_UNKNOWN;
                    break;
                case 0:
                    str = "default";
                    break;
                case 1:
                    str = "audio";
                    break;
                case 2:
                    str = "video";
                    break;
                case 3:
                    str = "text";
                    break;
                case 4:
                    str = "image";
                    break;
                case 5:
                    str = "metadata";
                    break;
                default:
                    str = "camera motion";
                    break;
            }
            zzeh.m6210b("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(str));
            zzuw zzuwVar = new zzuw(iM4354f);
            zzvp zzvpVar2 = zzvjVar.f21105a;
            String str3 = zzvpVar2.f21111a;
            try {
                StringBuilder sb = new StringBuilder(str3.length() + 12);
                sb.append("createCodec:");
                sb.append(str3);
                Trace.beginSection(sb.toString());
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str3);
                try {
                    if (i3 >= 36) {
                        zzvaVar = new zzwk(mediaCodecCreateByCodecName);
                        i2 = 4;
                    } else {
                        i2 = 0;
                        zzvaVar = new zzva(mediaCodecCreateByCodecName, (HandlerThread) ((zzuu) zzuwVar.f21017b).zza());
                    }
                    zzux zzuxVar2 = new zzux(mediaCodecCreateByCodecName, (HandlerThread) ((zzuv) zzuwVar.f21016a).zza(), zzvaVar, zzvjVar.f21109e);
                    try {
                        Trace.endSection();
                        Surface surface2 = zzvjVar.f21108d;
                        if (surface2 == null && zzvpVar2.f21118h && i3 >= 35) {
                            i2 |= 8;
                        }
                        zzuxVar2.m8925o(zzvjVar.f21106b, surface2, i2);
                        return zzuxVar2;
                    } catch (Exception e5) {
                        e = e5;
                        zzuxVar = zzuxVar2;
                        if (zzuxVar != null) {
                            zzuxVar.zzl();
                        } else if (mediaCodecCreateByCodecName != null) {
                            mediaCodecCreateByCodecName.release();
                        }
                        throw e;
                    }
                } catch (Exception e6) {
                    e = e6;
                }
            } catch (Exception e7) {
                e = e7;
                mediaCodecCreateByCodecName = null;
            }
        }
    }

    public zzve(Context context) {
        this.f21100a = context;
    }
}
