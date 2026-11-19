package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafw implements zzagg {

    /* JADX INFO: renamed from: c */
    public static final int[] f5222c = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: d */
    public static final zzafv f5223d = new zzafv(new zzafu() { // from class: com.google.android.gms.internal.ads.zzaft
        @Override // com.google.android.gms.internal.ads.zzafu
        public final /* synthetic */ Constructor zza() throws IllegalAccessException, InvocationTargetException {
            int[] iArr = zzafw.f5222c;
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzaga.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });

    /* JADX INFO: renamed from: e */
    public static final zzafv f5224e = new zzafv(new zzafu() { // from class: com.google.android.gms.internal.ads.zzafs
        @Override // com.google.android.gms.internal.ads.zzafu
        public final /* synthetic */ Constructor zza() {
            int[] iArr = zzafw.f5222c;
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzaga.class).getConstructor(null);
        }
    });

    /* JADX INFO: renamed from: a */
    public zzgwt f5225a;

    /* JADX INFO: renamed from: b */
    public final zzanl f5226b = new zzanl();

    /* JADX WARN: Code duplicated, block: B:114:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:142:0x020a  */
    @Override // com.google.android.gms.internal.ads.zzagg
    /* JADX INFO: renamed from: a */
    public final synchronized zzaga[] mo4093a(Uri uri, Map map) {
        ArrayList arrayList;
        int i2;
        try {
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            String str = null;
            if (list != null && !list.isEmpty()) {
                str = (String) list.get(0);
            }
            int i3 = 20;
            if (str != null) {
                switch (zzas.m4356h(str)) {
                    case "audio/ac3":
                    case "audio/eac3":
                    case "audio/eac3-joc":
                        i2 = 0;
                        break;
                    case "audio/ac4":
                        i2 = 1;
                        break;
                    case "audio/amr":
                    case "audio/3gpp":
                    case "audio/amr-wb":
                        i2 = 3;
                        break;
                    case "audio/flac":
                        i2 = 4;
                        break;
                    case "video/x-flv":
                        i2 = 5;
                        break;
                    case "audio/midi":
                        i2 = 15;
                        break;
                    case "video/x-matroska":
                    case "audio/x-matroska":
                    case "video/webm":
                    case "audio/webm":
                    case "application/webm":
                        i2 = 6;
                        break;
                    case "audio/mpeg":
                        i2 = 7;
                        break;
                    case "video/mp4":
                    case "audio/mp4":
                    case "application/mp4":
                        i2 = 8;
                        break;
                    case "audio/ogg":
                        i2 = 9;
                        break;
                    case "video/mp2p":
                        i2 = 10;
                        break;
                    case "video/mp2t":
                        i2 = 11;
                        break;
                    case "audio/wav":
                        i2 = 12;
                        break;
                    case "text/vtt":
                        i2 = 13;
                        break;
                    case "image/jpeg":
                        i2 = 14;
                        break;
                    case "video/x-msvideo":
                        i2 = 16;
                        break;
                    case "image/png":
                        i2 = 17;
                        break;
                    case "image/webp":
                        i2 = 18;
                        break;
                    case "image/bmp":
                        i2 = 19;
                        break;
                    case "image/heif":
                    case "image/heic":
                        i2 = 20;
                        break;
                    case "image/avif":
                        i2 = 21;
                        break;
                    default:
                        i2 = -1;
                        break;
                }
            } else {
                i2 = -1;
            }
            if (i2 != -1) {
                m4094b(arrayList, i2);
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                i3 = -1;
            } else if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
                i3 = 0;
            } else if (lastPathSegment.endsWith(".ac4")) {
                i3 = 1;
            } else if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
                i3 = 2;
            } else if (lastPathSegment.endsWith(".amr")) {
                i3 = 3;
            } else if (lastPathSegment.endsWith(".flac")) {
                i3 = 4;
            } else if (lastPathSegment.endsWith(".flv")) {
                i3 = 5;
            } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
                i3 = 15;
            } else if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
                i3 = 6;
            } else if (lastPathSegment.endsWith(".mp3")) {
                i3 = 7;
            } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                i3 = 8;
            } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
                i3 = 9;
            } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
                i3 = 10;
            } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                i3 = 11;
            } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
                i3 = 12;
            } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
                i3 = 13;
            } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
                i3 = 14;
            } else if (lastPathSegment.endsWith(".avi")) {
                i3 = 16;
            } else if (lastPathSegment.endsWith(".png")) {
                i3 = 17;
            } else if (lastPathSegment.endsWith(".webp")) {
                i3 = 18;
            } else if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
                i3 = 19;
            } else if (!lastPathSegment.endsWith(".heic") && !lastPathSegment.endsWith(".heif")) {
                if (lastPathSegment.endsWith(".avif")) {
                    i3 = 21;
                } else {
                    i3 = -1;
                }
            }
            if (i3 != -1 && i3 != i2) {
                m4094b(arrayList, i3);
            }
            int[] iArr = f5222c;
            for (int i4 = 0; i4 < 21; i4++) {
                int i5 = iArr[i4];
                if (i5 != i2 && i5 != i3) {
                    m4094b(arrayList, i5);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (zzaga[]) arrayList.toArray(new zzaga[0]);
    }

    /* JADX INFO: renamed from: b */
    public final void m4094b(ArrayList arrayList, int i2) {
        zzanl zzanlVar = this.f5226b;
        switch (i2) {
            case 0:
                arrayList.add(new zzapp());
                break;
            case 1:
                arrayList.add(new zzaps());
                break;
            case 2:
                arrayList.add(new zzapv(0));
                break;
            case 3:
                arrayList.add(new zzahr(0));
                break;
            case 4:
                zzaga zzagaVarM4092a = f5223d.m4092a(0);
                if (zzagaVarM4092a == null) {
                    arrayList.add(new zzaii(0));
                } else {
                    arrayList.add(zzagaVarM4092a);
                }
                break;
            case 5:
                arrayList.add(new zzail());
                break;
            case 6:
                arrayList.add(new zzakm(new zzake(), 0, zzanlVar));
                break;
            case 7:
                arrayList.add(new zzaku(0));
                break;
            case 8:
                zzgzi zzgziVar = zzgwt.f18303t;
                arrayList.add(new zzalw(zzanlVar, TypedValues.TransitionType.TYPE_AUTO_TRANSITION, zzgyo.f18355w));
                arrayList.add(new zzami(160, zzanlVar));
                break;
            case 9:
                arrayList.add(new zzamz());
                break;
            case 10:
                arrayList.add(new zzaqz());
                break;
            case 11:
                if (this.f5225a == null) {
                    zzgzi zzgziVar2 = zzgwt.f18303t;
                    this.f5225a = zzgyo.f18355w;
                }
                arrayList.add(new zzark(0, zzanlVar, new zzfj(), new zzapx(this.f5225a)));
                break;
            case 12:
                arrayList.add(new zzarx());
                break;
            case 14:
                arrayList.add(new zzait(0));
                break;
            case 15:
                zzaga zzagaVarM4092a2 = f5224e.m4092a(new Object[0]);
                if (zzagaVarM4092a2 != null) {
                    arrayList.add(zzagaVarM4092a2);
                }
                break;
            case 16:
                arrayList.add(new zzahv(0, zzanlVar));
                break;
            case 17:
                arrayList.add(new zzanj());
                break;
            case 18:
                arrayList.add(new zzasc());
                break;
            case 19:
                arrayList.add(new zzaid());
                break;
            case 20:
                arrayList.add(new zzair(0));
                break;
            case 21:
                arrayList.add(new zzaic());
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final synchronized zzaga[] zza() {
        return mo4093a(Uri.EMPTY, new HashMap());
    }
}
