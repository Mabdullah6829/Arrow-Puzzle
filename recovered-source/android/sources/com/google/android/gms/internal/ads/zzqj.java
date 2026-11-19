package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.material.internal.ViewUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqj {

    /* JADX INFO: renamed from: e */
    public static final zzgwt f20631e;

    /* JADX INFO: renamed from: f */
    public static final zzqj f20632f;

    /* JADX INFO: renamed from: g */
    public static final zzgwt f20633g;

    /* JADX INFO: renamed from: h */
    public static final zzgww f20634h;

    /* JADX INFO: renamed from: a */
    public final SparseArray f20635a = new SparseArray();

    /* JADX INFO: renamed from: b */
    public final int f20636b;

    /* JADX INFO: renamed from: c */
    public final zzgwt f20637c;

    /* JADX INFO: renamed from: d */
    public final zzgwt f20638d;

    static {
        zzgwt zzgwtVarM7216n = zzgwt.m7216n(12);
        f20631e = zzgwtVarM7216n;
        f20632f = new zzqj(zzgwt.m7216n(zzqi.f20627d), zzgwtVarM7216n, zzgyo.f18355w);
        Object[] objArr = {2, 5, 6};
        zzgym.m7263a(3, objArr);
        f20633g = zzgwt.m7222v(3, objArr);
        zzgwv zzgwvVar = new zzgwv();
        zzgwvVar.m7225a(5, 6);
        zzgwvVar.m7225a(17, 6);
        zzgwvVar.m7225a(7, 6);
        zzgwvVar.m7225a(30, 10);
        zzgwvVar.m7225a(18, 6);
        zzgwvVar.m7225a(6, 8);
        zzgwvVar.m7225a(8, 8);
        zzgwvVar.m7225a(14, 8);
        f20634h = zzgwvVar.m7228d(true);
    }

    public zzqj(List list, zzgwt zzgwtVar, List list2) {
        for (int i2 = 0; i2 < ((zzgyo) list).f18357v; i2++) {
            zzqi zzqiVar = (zzqi) ((zzgyo) list).get(i2);
            this.f20635a.put(zzqiVar.f20628a, zzqiVar);
        }
        int iMax = 0;
        for (int i3 = 0; i3 < this.f20635a.size(); i3++) {
            iMax = Math.max(iMax, ((zzqi) this.f20635a.valueAt(i3)).f20629b);
        }
        this.f20636b = iMax;
        this.f20637c = zzgwt.m7220t(zzgwtVar);
        this.f20638d = zzgwt.m7220t(list2);
    }

    /* JADX WARN: Code duplicated, block: B:125:0x01c3 A[PHI: r2 r20
  0x01c3: PHI (r2v6 com.google.android.gms.internal.ads.zzgwt) = 
  (r2v5 com.google.android.gms.internal.ads.zzgwt)
  (r2v7 com.google.android.gms.internal.ads.zzgwt)
  (r2v9 com.google.android.gms.internal.ads.zzgwt)
 binds: [B:140:0x01f0, B:128:0x01d0, B:123:0x01c0] A[DONT_GENERATE, DONT_INLINE]
  0x01c3: PHI (r20v4 int) = (r20v3 int), (r20v6 int), (r20v8 int) binds: [B:140:0x01f0, B:128:0x01d0, B:123:0x01c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:130:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:223:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:225:0x03e0  */
    /* JADX INFO: renamed from: a */
    public static zzqj m8834a(Context context, Intent intent, zzd zzdVar, AudioDeviceInfo audioDeviceInfo, List list) {
        AudioDeviceInfo audioDeviceInfo2;
        int i2;
        int i3;
        int i4;
        zzgwt zzgwtVarM7216n;
        AudioDeviceInfo[] devices;
        int i5;
        int i6;
        int type;
        zzgwt zzgwtVarM8903a;
        int i7;
        int i8;
        int speakerLayoutChannelMask;
        int i9 = 2;
        AudioManager audioManagerM5503a = zzcj.m5503a(context);
        if (audioDeviceInfo == null) {
            audioDeviceInfo2 = null;
            if (Build.VERSION.SDK_INT >= 33) {
                List audioDevicesForAttributes = audioManagerM5503a.getAudioDevicesForAttributes(zzdVar.m5884a());
                if (!audioDevicesForAttributes.isEmpty()) {
                    audioDeviceInfo2 = (AudioDeviceInfo) audioDevicesForAttributes.get(0);
                }
            }
        } else {
            audioDeviceInfo2 = audioDeviceInfo;
        }
        int i10 = 3;
        if (audioDeviceInfo2 != null) {
            zzgwtVarM7216n = zzue.f20996a;
            if (zztx.m8892a(audioDeviceInfo2.getType())) {
                i2 = 2;
                i3 = 0;
                i4 = 21;
            } else {
                i4 = 21;
                if (audioDeviceInfo2.getType() != 1) {
                    if (audioDeviceInfo2.getType() == 2) {
                        i3 = 0;
                        if (Build.VERSION.SDK_INT < 36 || (speakerLayoutChannelMask = audioDeviceInfo2.getSpeakerLayoutChannelMask()) == 0 || speakerLayoutChannelMask == 1) {
                            zzeh.m6211c("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                        } else {
                            zzgwtVarM7216n = zzgwt.m7216n(Integer.valueOf(speakerLayoutChannelMask));
                        }
                    } else {
                        i3 = 0;
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 31 && audioDeviceInfo2.getType() == 10) {
                            zzgwt zzgwtVarM8903a2 = zzue.m8903a(audioDeviceInfo2);
                            if (zzgwtVarM8903a2.isEmpty()) {
                                zzgwtVarM8903a2 = zzqs.m8840a(audioDeviceInfo2.getAudioDescriptors());
                                if (!zzgwtVarM8903a2.isEmpty()) {
                                }
                            }
                            i2 = 2;
                            zzgwtVarM7216n = zzgwtVarM8903a2;
                        } else if (i11 >= 31) {
                            int type2 = audioDeviceInfo2.getType();
                            if (i11 < 31 || type2 != 29) {
                                i2 = 2;
                                if (i11 >= 31 && ((type = audioDeviceInfo2.getType()) == 11 || type == 12 || (i11 >= 31 && type == 22))) {
                                    zzgwtVarM8903a = zzue.m8903a(audioDeviceInfo2);
                                    if (!zzgwtVarM8903a.isEmpty()) {
                                        zzgwtVarM7216n = zzgwtVarM8903a;
                                    }
                                }
                            } else {
                                zzgwt zzgwtVarM8903a3 = zzue.m8903a(audioDeviceInfo2);
                                if (zzgwtVarM8903a3.isEmpty()) {
                                    List audioDescriptors = audioDeviceInfo2.getAudioDescriptors();
                                    if (i11 >= 34) {
                                        if (i11 < 34 || audioDescriptors == null) {
                                            i2 = 2;
                                            zzgwtVarM8903a = zzgyo.f18355w;
                                        } else {
                                            ArrayList arrayList = new ArrayList();
                                            Iterator it = audioDescriptors.iterator();
                                            while (it.hasNext()) {
                                                AudioDescriptor audioDescriptorM3873e = AbstractC5160n.m3873e(it.next());
                                                if (audioDescriptorM3873e.getStandard() == i9) {
                                                    byte[] descriptor = audioDescriptorM3873e.getDescriptor();
                                                    int length = descriptor.length;
                                                    if (length != i10) {
                                                        i7 = i9;
                                                        AbstractC5152f.m3776h(new StringBuilder(String.valueOf(length).length() + 21), "Invalid SADB length: ", length, "AudioDescriptorUtil");
                                                    } else {
                                                        i7 = i9;
                                                        if (Build.VERSION.SDK_INT >= 34) {
                                                            byte b = descriptor[0];
                                                            int i12 = 1 != (b & 1) ? 0 : 12;
                                                            if ((b & 2) != 0) {
                                                                i12 |= 32;
                                                            }
                                                            if ((b & 4) != 0) {
                                                                i12 |= 16;
                                                            }
                                                            if ((b & 8) != 0) {
                                                                i12 |= 192;
                                                            }
                                                            if ((b & 16) != 0) {
                                                                i12 |= 1024;
                                                            }
                                                            if ((b & 32) != 0) {
                                                                i12 |= ViewUtils.EDGE_TO_EDGE_FLAGS;
                                                            }
                                                            if ((b & 128) != 0) {
                                                                i12 |= 201326592;
                                                            }
                                                            byte b2 = descriptor[1];
                                                            if ((b2 & 1) != 0) {
                                                                i12 |= 81920;
                                                            }
                                                            if ((b2 & 2) != 0) {
                                                                i12 |= 8192;
                                                            }
                                                            if ((b2 & 4) != 0) {
                                                                i12 |= 32768;
                                                            }
                                                            if ((b2 & 8) != 0) {
                                                                i12 |= 6144;
                                                            }
                                                            if ((b2 & 16) != 0) {
                                                                i12 |= 33554432;
                                                            }
                                                            if ((b2 & 32) != 0) {
                                                                i12 |= 262144;
                                                            }
                                                            if ((b2 & 64) != 0) {
                                                                i12 |= 6144;
                                                            }
                                                            if ((b2 & 128) != 0) {
                                                                i12 |= 3145728;
                                                            }
                                                            byte b3 = descriptor[i7];
                                                            if ((b3 & 1) != 0) {
                                                                i12 |= 655360;
                                                            }
                                                            if ((b3 & 2) != 0) {
                                                                i12 |= 8388608;
                                                            }
                                                            i8 = (b3 & 4) != 0 ? 20971520 | i12 : i12;
                                                        } else {
                                                            i8 = 0;
                                                        }
                                                        arrayList.add(Integer.valueOf(i8));
                                                    }
                                                    i9 = i7;
                                                    i10 = 3;
                                                }
                                            }
                                            i2 = i9;
                                            arrayList.sort(new Comparator() { // from class: com.google.android.gms.internal.ads.zzqq
                                                @Override // java.util.Comparator
                                                public final /* synthetic */ int compare(Object obj, Object obj2) {
                                                    return Integer.bitCount(((Integer) obj2).intValue()) - Integer.bitCount(((Integer) obj).intValue());
                                                }
                                            });
                                            zzgwtVarM8903a = zzgwt.m7220t(arrayList);
                                        }
                                        if (!zzgwtVarM8903a.isEmpty()) {
                                            zzgwtVarM7216n = zzgwtVarM8903a;
                                        }
                                    } else {
                                        i2 = 2;
                                    }
                                    zzgwtVarM8903a = zzqs.m8840a(audioDescriptors);
                                    if (!zzgwtVarM8903a.isEmpty()) {
                                        zzgwtVarM7216n = zzgwtVarM8903a;
                                    }
                                } else {
                                    i2 = 2;
                                    zzgwtVarM7216n = zzgwtVarM8903a3;
                                }
                            }
                        } else {
                            i2 = 2;
                            if (i11 >= 31) {
                                zzgwtVarM8903a = zzue.m8903a(audioDeviceInfo2);
                                if (!zzgwtVarM8903a.isEmpty()) {
                                    zzgwtVarM7216n = zzgwtVarM8903a;
                                }
                            }
                        }
                    }
                    i2 = 2;
                } else {
                    i2 = 2;
                    i3 = 0;
                    zzgwtVarM7216n = zzgwt.m7216n(4);
                }
            }
        } else {
            i2 = 2;
            i3 = 0;
            i4 = 21;
            zzgwtVarM7216n = f20631e;
        }
        zzgwt zzgwtVar = zzgwtVarM7216n;
        int i13 = Build.VERSION.SDK_INT;
        zzgww zzgwwVar = f20634h;
        if (i13 >= 33 && (zzfm.m6508j(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            List directProfilesForAttributes = audioManagerM5503a.getDirectProfilesForAttributes(zzdVar.m5884a());
            HashMap map = new HashMap();
            map.put(2, new HashSet(zzhaq.m7308e(12)));
            for (int i14 = i3; i14 < directProfilesForAttributes.size(); i14++) {
                AudioProfile audioProfileM3874f = AbstractC5160n.m3874f(directProfilesForAttributes.get(i14));
                if (audioProfileM3874f.getEncapsulationType() != 1) {
                    int format = audioProfileM3874f.getFormat();
                    if (zzfm.m6502d(format) || zzgwwVar.containsKey(Integer.valueOf(format))) {
                        Integer numValueOf = Integer.valueOf(format);
                        if (map.containsKey(numValueOf)) {
                            Set set = (Set) map.get(numValueOf);
                            set.getClass();
                            set.addAll(zzhaq.m7308e(audioProfileM3874f.getChannelMasks()));
                        } else {
                            map.put(numValueOf, new HashSet(zzhaq.m7308e(audioProfileM3874f.getChannelMasks())));
                        }
                    }
                }
            }
            zzgzi zzgziVar = zzgwt.f18303t;
            zzgwq zzgwqVar = new zzgwq();
            for (Map.Entry entry : map.entrySet()) {
                zzgwqVar.m7203c(new zzqi((Set) entry.getValue(), ((Integer) entry.getKey()).intValue()));
            }
            return new zzqj(zzgwqVar.m7214f(), zzgwtVar, list);
        }
        if (audioDeviceInfo2 == null) {
            devices = audioManagerM5503a.getDevices(i2);
        } else {
            devices = new AudioDeviceInfo[1];
            devices[i3] = audioDeviceInfo2;
        }
        int length2 = devices.length;
        for (int i15 = i3; i15 < length2; i15++) {
            if (zztx.m8892a(devices[i15].getType())) {
                return new zzqj(zzgwt.m7216n(zzqi.f20627d), zzgwtVar, list);
            }
        }
        zzgxc zzgxcVar = new zzgxc();
        zzgxcVar.m7235f(2);
        if (Build.VERSION.SDK_INT < 29 || !(zzfm.m6508j(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            ContentResolver contentResolver = context.getContentResolver();
            boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", i3) == 1;
            if (z) {
                i5 = 0;
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    zzgxcVar.m7236g(f20633g);
                }
            } else {
                String str = Build.MANUFACTURER;
                if (str.equals("Amazon") || str.equals("Xiaomi")) {
                    i5 = 0;
                    if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                        zzgxcVar.m7236g(f20633g);
                    }
                } else {
                    i5 = 0;
                }
            }
            if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", i5) != 1) {
                return new zzqj(m8835c(10, zzhaq.m7307d(zzgxcVar.m7237h())), zzgwtVar, list);
            }
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                zzgxcVar.m7236g(zzhaq.m7308e(intArrayExtra));
            }
            return new zzqj(m8835c(intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10), zzhaq.m7307d(zzgxcVar.m7237h())), zzgwtVar, list);
        }
        zzgzi zzgziVar2 = zzgwt.f18303t;
        zzgwq zzgwqVar2 = new zzgwq();
        zzgxd zzgxdVarMo7231c = zzgwwVar.f18311t;
        if (zzgxdVarMo7231c == null) {
            zzgxdVarMo7231c = zzgwwVar.mo7231c();
            zzgwwVar.f18311t = zzgxdVarMo7231c;
        }
        zzgzh it2 = zzgxdVarMo7231c.iterator();
        while (it2.hasNext()) {
            Integer num = (Integer) it2.next();
            int iIntValue = num.intValue();
            switch (iIntValue) {
                case 2:
                case 3:
                    i6 = 3;
                    break;
                case 4:
                case 5:
                case 6:
                    i6 = i4;
                    break;
                case 7:
                case 8:
                    i6 = 23;
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                    i6 = 28;
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
                    i6 = Integer.MAX_VALUE;
                    break;
                case 14:
                    i6 = 25;
                    break;
                case 20:
                    i6 = 30;
                    break;
                case 21:
                case 22:
                    i6 = 31;
                    break;
                case 30:
                case 31:
                    i6 = 34;
                    break;
            }
            if (Build.VERSION.SDK_INT >= i6 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), zzdVar.m5884a())) {
                zzgwqVar2.m7203c(num);
            }
        }
        zzgwqVar2.m7203c(2);
        zzgxcVar.m7236g(zzgwqVar2.m7214f());
        return new zzqj(m8835c(10, zzhaq.m7307d(zzgxcVar.m7237h())), zzgwtVar, list);
    }

    /* JADX INFO: renamed from: c */
    public static zzgwt m8835c(int i2, int[] iArr) {
        zzgzi zzgziVar = zzgwt.f18303t;
        zzgwq zzgwqVar = new zzgwq();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i3 : iArr) {
            zzgwqVar.m7203c(new zzqi(i3, i2));
        }
        return zzgwqVar.m7214f();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:16:0x0042 A[PHI: r4
  0x0042: PHI (r4v3 int) = (r4v2 int), (r4v6 int) binds: [B:11:0x0036, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    /* JADX WARN: Code duplicated, block: B:75:0x0102  */
    /* JADX INFO: renamed from: b */
    public final Pair m8836b(zzv zzvVar, zzd zzdVar) {
        int i2;
        String str = zzvVar.f21061o;
        int iM6503e = zzvVar.f21038H;
        int i3 = zzvVar.f21037G;
        str.getClass();
        int iM4355g = zzas.m4355g(str, zzvVar.f21057k);
        Integer numValueOf = Integer.valueOf(iM4355g);
        zzgww zzgwwVar = f20634h;
        if (!zzgwwVar.containsKey(numValueOf)) {
            return null;
        }
        SparseArray sparseArray = this.f20635a;
        if (iM4355g != 18) {
            if (iM4355g != 8) {
                if (iM4355g == 30 && sparseArray.indexOfKey(30) < 0) {
                    iM4355g = 7;
                }
            } else if (sparseArray.indexOfKey(8) >= 0) {
                iM4355g = 8;
                if (iM4355g == 30) {
                    iM4355g = 7;
                }
            } else {
                iM4355g = 7;
            }
        } else if (sparseArray.indexOfKey(18) >= 0) {
            iM4355g = 18;
            if (iM4355g != 8) {
                if (iM4355g == 30) {
                    iM4355g = 7;
                }
            } else if (sparseArray.indexOfKey(8) >= 0) {
                iM4355g = 8;
                if (iM4355g == 30) {
                    iM4355g = 7;
                }
            } else {
                iM4355g = 7;
            }
        } else {
            iM4355g = 6;
        }
        if (sparseArray.indexOfKey(iM4355g) < 0) {
            return null;
        }
        zzqi zzqiVar = (zzqi) sparseArray.get(iM4355g);
        zzqiVar.getClass();
        int iIntValue = zzqiVar.f20629b;
        zzgxd zzgxdVar = zzqiVar.f20630c;
        boolean zContains = false;
        if (i3 == -1 || iM4355g == 18) {
            int i4 = zzvVar.f21039I;
            if (i4 == -1) {
                i4 = 48000;
            }
            int i5 = zzqiVar.f20628a;
            if (zzgxdVar == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    iIntValue = 10;
                    while (true) {
                        if (iIntValue <= 0) {
                            iIntValue = 0;
                            break;
                        }
                        int iM6503e2 = zzfm.m6503e(iIntValue);
                        if (iM6503e2 != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i5).setSampleRate(i4).setChannelMask(iM6503e2).build(), zzdVar.m5884a())) {
                            break;
                        }
                        iIntValue--;
                    }
                } else {
                    Object obj = zzgwwVar.get(Integer.valueOf(i5));
                    iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
        } else {
            if (!str.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
                if (zzgxdVar != null) {
                    int iM6503e3 = iM6503e != -1 ? iM6503e : zzfm.m6503e(i3);
                    if (iM6503e3 != 0) {
                        zContains = zzgxdVar.contains(Integer.valueOf(iM6503e3));
                    }
                } else if (i3 <= iIntValue) {
                    zContains = true;
                }
                if (!zContains) {
                    return null;
                }
            } else if (i3 > 10) {
                return null;
            }
            iIntValue = i3;
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 > 28) {
            i2 = iIntValue;
        } else if (iIntValue == 7) {
            i2 = 8;
        } else if (iIntValue == 3 || iIntValue == 4 || iIntValue == 5) {
            i2 = 6;
        } else {
            i2 = iIntValue;
        }
        if (i6 <= 26 && "fugu".equals(Build.DEVICE) && i2 == 1) {
            i2 = 2;
        }
        if (iM6503e == -1 || i3 != i2) {
            iM6503e = zzfm.m6503e(i2);
        }
        if (iM6503e != 0) {
            return Pair.create(Integer.valueOf(iM4355g), Integer.valueOf(iM6503e));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzqj) {
            zzqj zzqjVar = (zzqj) obj;
            SparseArray sparseArray = zzqjVar.f20635a;
            String str = zzfm.f16091a;
            int i2 = Build.VERSION.SDK_INT;
            SparseArray sparseArray2 = this.f20635a;
            if (i2 < 31) {
                int size = sparseArray2.size();
                if (size == sparseArray.size()) {
                    for (int i3 = 0; i3 < size; i3++) {
                        if (Objects.equals(sparseArray2.valueAt(i3), sparseArray.get(sparseArray2.keyAt(i3)))) {
                        }
                    }
                    if (this.f20636b != zzqjVar.f20636b) {
                    }
                }
            } else if (sparseArray2.contentEquals(sparseArray)) {
                if (this.f20636b != zzqjVar.f20636b && Objects.equals(this.f20637c, zzqjVar.f20637c) && Objects.equals(this.f20638d, zzqjVar.f20638d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iContentHashCode;
        String str = zzfm.f16091a;
        int i2 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.f20635a;
        if (i2 >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i3)) + ((sparseArray.keyAt(i3) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return Objects.hashCode(this.f20638d) + ((Objects.hashCode(this.f20637c) + (((this.f20636b * 31) + iContentHashCode) * 31)) * 31);
    }

    public final String toString() {
        String string = this.f20635a.toString();
        String strValueOf = String.valueOf(this.f20637c);
        String strValueOf2 = String.valueOf(this.f20638d);
        int i2 = this.f20636b;
        int length = String.valueOf(i2).length();
        int length2 = string.length();
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 28 + strValueOf.length() + 26 + strValueOf2.length() + 1);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i2);
        sb.append(", audioProfiles=");
        sb.append(string);
        AbstractC0271e0.m413u(sb, ", speakerLayoutChannelMasks=", strValueOf, ", spatializerChannelMasks=", strValueOf2);
        sb.append("]");
        return sb.toString();
    }
}
