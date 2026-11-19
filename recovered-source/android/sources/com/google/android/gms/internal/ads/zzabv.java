package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabv implements zzabr, zzip {

    /* JADX INFO: renamed from: F */
    public static final zzgwt f4863F = zzgwt.m7218r(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* JADX INFO: renamed from: G */
    public static final zzgwt f4864G = zzgwt.m7218r(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* JADX INFO: renamed from: H */
    public static final zzgwt f4865H = zzgwt.m7218r(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* JADX INFO: renamed from: I */
    public static final zzgwt f4866I = zzgwt.m7218r(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* JADX INFO: renamed from: J */
    public static final zzgwt f4867J = zzgwt.m7218r(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* JADX INFO: renamed from: K */
    public static final zzgwt f4868K = zzgwt.m7218r(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* JADX INFO: renamed from: L */
    public static zzabv f4869L;

    /* JADX INFO: renamed from: A */
    public long f4870A;

    /* JADX INFO: renamed from: B */
    public long f4871B;

    /* JADX INFO: renamed from: C */
    public long f4872C;

    /* JADX INFO: renamed from: D */
    public int f4873D;

    /* JADX INFO: renamed from: E */
    public String f4874E;

    /* JADX INFO: renamed from: s */
    public final Context f4875s;

    /* JADX INFO: renamed from: t */
    public final zzgww f4876t;

    /* JADX INFO: renamed from: u */
    public final zzabp f4877u;

    /* JADX INFO: renamed from: v */
    public final zzacj f4878v;

    /* JADX INFO: renamed from: w */
    public int f4879w;

    /* JADX INFO: renamed from: x */
    public long f4880x;

    /* JADX INFO: renamed from: y */
    public long f4881y;

    /* JADX INFO: renamed from: z */
    public long f4882z;

    public zzabv(Context context, HashMap map) {
        boolean z;
        this.f4875s = context == null ? null : context.getApplicationContext();
        this.f4876t = zzgww.m7229a(map);
        this.f4877u = new zzabp();
        this.f4878v = new zzacj();
        if (context == null) {
            this.f4873D = 0;
            this.f4871B = 1000000L;
            return;
        }
        zzes zzesVarM6320a = zzes.m6320a(context);
        int iM6321b = zzesVarM6320a.m6321b();
        this.f4873D = iM6321b;
        this.f4871B = m3939f(iM6321b);
        zzem zzemVar = new zzem() { // from class: com.google.android.gms.internal.ads.zzabt
            /* JADX WARN: Code duplicated, block: B:25:0x003f A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:4:0x0003, B:6:0x0007, B:11:0x0011, B:16:0x001c, B:18:0x0020, B:20:0x0026, B:22:0x0030, B:24:0x003a, B:26:0x004b, B:25:0x003f, B:27:0x004d, B:29:0x005c, B:31:0x0064), top: B:38:0x0003 }] */
            @Override // com.google.android.gms.internal.ads.zzem
            public final void zza(int i2) {
                String strM7120b;
                TelephonyManager telephonyManager;
                zzabv zzabvVar = this.f4862a;
                synchronized (zzabvVar) {
                    try {
                        if (zzabvVar.f4873D != i2 || zzabvVar.f4874E == null) {
                            zzabvVar.f4873D = i2;
                            if (i2 != 1 && i2 != 0 && i2 != 8) {
                                if (zzabvVar.f4874E == null) {
                                    Context context2 = zzabvVar.f4875s;
                                    String str = zzfm.f16091a;
                                    if (context2 == null || (telephonyManager = (TelephonyManager) context2.getSystemService("phone")) == null) {
                                        strM7120b = zzgsz.m7120b(Locale.getDefault().getCountry());
                                    } else {
                                        String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                        if (TextUtils.isEmpty(networkCountryIso)) {
                                            strM7120b = zzgsz.m7120b(Locale.getDefault().getCountry());
                                        } else {
                                            strM7120b = zzgsz.m7120b(networkCountryIso);
                                        }
                                    }
                                    zzabvVar.f4874E = strM7120b;
                                }
                                zzabvVar.f4871B = zzabvVar.m3939f(i2);
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                zzabvVar.m3937d(zzabvVar.f4879w > 0 ? (int) (jElapsedRealtime - zzabvVar.f4880x) : 0, zzabvVar.f4881y, zzabvVar.f4871B);
                                zzabvVar.f4880x = jElapsedRealtime;
                                zzabvVar.f4881y = 0L;
                                zzabvVar.f4870A = 0L;
                                zzabvVar.f4882z = 0L;
                                zzacj zzacjVar = zzabvVar.f4878v;
                                zzacjVar.f4907a.clear();
                                zzacjVar.f4909c = -1;
                                zzacjVar.f4910d = 0;
                                zzacjVar.f4911e = 0;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        Executor executorM5922a = zzdi.m5922a();
        CopyOnWriteArrayList<zzeo> copyOnWriteArrayList = zzesVarM6320a.f14756b;
        for (zzeo zzeoVar : copyOnWriteArrayList) {
            if (zzeoVar.f14361a.get() == null) {
                copyOnWriteArrayList.remove(zzeoVar);
            }
        }
        zzeo zzeoVar2 = new zzeo(zzesVarM6320a, zzemVar, executorM5922a);
        synchronized (zzesVarM6320a.f14757c) {
            zzesVarM6320a.f14756b.add(zzeoVar2);
            z = zzesVarM6320a.f14759e;
        }
        if (z) {
            zzeoVar2.f14362b.execute(new zzen(zzeoVar2));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0130, code lost:
    
        if (r3.equals("AQ") != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0148, code lost:
    
        if (r3.equals("GQ") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x016e, code lost:
    
        if (r3.equals("GM") != false) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0178, code lost:
    
        if (r3.equals("GL") != false) goto L600;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0182, code lost:
    
        if (r3.equals("GI") != false) goto L722;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01d2, code lost:
    
        if (r3.equals("FK") != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0214, code lost:
    
        if (r3.equals("ER") != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x023a, code lost:
    
        if (r3.equals("CX") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0244, code lost:
    
        if (r3.equals("CW") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x025c, code lost:
    
        if (r3.equals("CU") != false) goto L669;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0282, code lost:
    
        if (r3.equals("CM") != false) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x028c, code lost:
    
        if (r3.equals("CL") != false) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0296, code lost:
    
        if (r3.equals("CK") != false) goto L892;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x02a0, code lost:
    
        if (r3.equals("ZW") != false) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x02c6, code lost:
    
        if (r3.equals("YT") != false) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x02d0, code lost:
    
        if (r3.equals("YE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x02e8, code lost:
    
        if (r3.equals("WS") != false) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x02f2, code lost:
    
        if (r3.equals("WF") != false) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x02fc, code lost:
    
        if (r3.equals("VU") != false) goto L665;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0330, code lost:
    
        if (r3.equals("VE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x033a, code lost:
    
        if (r3.equals("VC") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0344, code lost:
    
        if (r3.equals("VA") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0386, code lost:
    
        if (r3.equals("UA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x03ac, code lost:
    
        if (r3.equals("TV") != false) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x03c4, code lost:
    
        if (r3.equals("TR") != false) goto L904;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x03ea, code lost:
    
        if (r3.equals("TM") != false) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x03f4, code lost:
    
        if (r3.equals("TL") != false) goto L669;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x03fe, code lost:
    
        if (r3.equals("TJ") != false) goto L792;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0408, code lost:
    
        if (r3.equals("TH") != false) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x040f, code lost:
    
        return new int[]{0, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0424, code lost:
    
        if (r3.equals("TD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x043c, code lost:
    
        if (r3.equals("SZ") != false) goto L881;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0446, code lost:
    
        if (r3.equals("SY") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0450, code lost:
    
        if (r3.equals("SX") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0476, code lost:
    
        if (r3.equals("SS") != false) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x047d, code lost:
    
        return new int[]{4, 3, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x04ae, code lost:
    
        if (r3.equals("SM") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x04b8, code lost:
    
        if (r3.equals("SL") != false) goto L873;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x04d0, code lost:
    
        if (r3.equals("SJ") != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x04da, code lost:
    
        if (r3.equals("SI") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x04e4, code lost:
    
        if (r3.equals("SH") != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x04fc, code lost:
    
        if (r3.equals("SE") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0506, code lost:
    
        if (r3.equals("SD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0510, code lost:
    
        if (r3.equals("SC") != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x051a, code lost:
    
        if (r3.equals("SB") != false) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0521, code lost:
    
        return new int[]{4, 2, 4, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0064, code lost:
    
        if (r3.equals("CI") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x058a, code lost:
    
        if (r3.equals("PY") != false) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x05a2, code lost:
    
        if (r3.equals("PT") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x05c8, code lost:
    
        if (r3.equals("PM") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x05fc, code lost:
    
        if (r3.equals("PG") != false) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0622, code lost:
    
        if (r3.equals("PA") != false) goto L916;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0648, code lost:
    
        if (r3.equals("NU") != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x064f, code lost:
    
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0656, code lost:
    
        if (r3.equals("NR") != false) goto L669;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007c, code lost:
    
        if (r3.equals("CG") != false) goto L780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x068a, code lost:
    
        if (r3.equals("NI") != false) goto L807;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x06a2, code lost:
    
        if (r3.equals("NF") != false) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x06a9, code lost:
    
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x06b0, code lost:
    
        if (r3.equals("NE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x06ba, code lost:
    
        if (r3.equals("NC") != false) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x06c1, code lost:
    
        return new int[]{2, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x06d6, code lost:
    
        if (r3.equals("MZ") != false) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x06dd, code lost:
    
        return new int[]{3, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x072a, code lost:
    
        if (r3.equals("MT") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0734, code lost:
    
        if (r3.equals("MS") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x073e, code lost:
    
        if (r3.equals("MR") != false) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0745, code lost:
    
        return new int[]{4, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x075a, code lost:
    
        if (r3.equals("MP") != false) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0761, code lost:
    
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0784, code lost:
    
        if (r3.equals("MM") != false) goto L629;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x078e, code lost:
    
        if (r3.equals("ML") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x07a6, code lost:
    
        if (r3.equals("MH") != false) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x07ad, code lost:
    
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x07b4, code lost:
    
        if (r3.equals("MG") != false) goto L780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x07e8, code lost:
    
        if (r3.equals("MC") != false) goto L600;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x07ef, code lost:
    
        return new int[]{1, 2, 2, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x0804, code lost:
    
        if (r3.equals("LY") != false) goto L873;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x080e, code lost:
    
        if (r3.equals("LV") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x0834, code lost:
    
        if (r3.equals("LS") != false) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x083b, code lost:
    
        return new int[]{4, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x0842, code lost:
    
        if (r3.equals("LR") != false) goto L796;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x084c, code lost:
    
        if (r3.equals("LK") != false) goto L629;
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x0853, code lost:
    
        return new int[]{3, 2, 3, 3, 4, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x085a, code lost:
    
        if (r3.equals("LI") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x089c, code lost:
    
        if (r3.equals("KY") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x08a6, code lost:
    
        if (r3.equals("KW") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x08be, code lost:
    
        if (r3.equals("KN") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x08c8, code lost:
    
        if (r3.equals("KM") != false) goto L665;
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x08cf, code lost:
    
        return new int[]{4, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:668:0x08d6, code lost:
    
        if (r3.equals("KI") != false) goto L669;
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x08dd, code lost:
    
        return new int[]{4, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00be, code lost:
    
        if (r3.equals("BQ") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:0x091c, code lost:
    
        if (r3.equals("JO") != false) goto L904;
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x0934, code lost:
    
        if (r3.equals("JE") != false) goto L722;
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x094b, code lost:
    
        if (r3.equals("IS") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x098d, code lost:
    
        if (r3.equals("IM") != false) goto L722;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x0994, code lost:
    
        return new int[]{0, 2, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x09c5, code lost:
    
        if (r3.equals("HU") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x09cf, code lost:
    
        if (r3.equals("HT") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x09d9, code lost:
    
        if (r3.equals("HR") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x09e0, code lost:
    
        return new int[]{1, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:779:0x0a57, code lost:
    
        if (r3.equals("EG") != false) goto L780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x0a5e, code lost:
    
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x0a65, code lost:
    
        if (r3.equals("EE") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x0a6c, code lost:
    
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:791:0x0a81, code lost:
    
        if (r3.equals("DZ") != false) goto L792;
     */
    /* JADX WARN: Code restructure failed: missing block: B:793:0x0a88, code lost:
    
        return new int[]{3, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:795:0x0a8f, code lost:
    
        if (r3.equals("DO") != false) goto L796;
     */
    /* JADX WARN: Code restructure failed: missing block: B:797:0x0a96, code lost:
    
        return new int[]{3, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x0a9d, code lost:
    
        if (r3.equals("DM") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:806:0x0ab5, code lost:
    
        if (r3.equals("CR") != false) goto L807;
     */
    /* JADX WARN: Code restructure failed: missing block: B:808:0x0abc, code lost:
    
        return new int[]{2, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x0ac3, code lost:
    
        if (r3.equals("CD") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x0aca, code lost:
    
        return new int[]{3, 3, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:814:0x0ad1, code lost:
    
        if (r3.equals("CA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x0ad8, code lost:
    
        return new int[]{0, 2, 1, 2, 3, 3};
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x0afb, code lost:
    
        if (r3.equals("BI") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:0x0b02, code lost:
    
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f2, code lost:
    
        if (r3.equals("BL") != false) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:0x0b17, code lost:
    
        if (r3.equals("BG") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x0b1e, code lost:
    
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x0b25, code lost:
    
        if (r3.equals("BF") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x0b2c, code lost:
    
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x0b4f, code lost:
    
        if (r3.equals("AZ") != false) goto L873;
     */
    /* JADX WARN: Code restructure failed: missing block: B:857:0x0b66, code lost:
    
        if (r3.equals("AI") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:872:0x0b9a, code lost:
    
        if (r3.equals("DJ") != false) goto L873;
     */
    /* JADX WARN: Code restructure failed: missing block: B:874:0x0ba1, code lost:
    
        return new int[]{4, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:876:0x0ba8, code lost:
    
        if (r3.equals("AG") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:878:0x0baf, code lost:
    
        return new int[]{2, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:880:0x0bb6, code lost:
    
        if (r3.equals("AF") != false) goto L881;
     */
    /* JADX WARN: Code restructure failed: missing block: B:882:0x0bbd, code lost:
    
        return new int[]{4, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:888:0x0bd2, code lost:
    
        if (r3.equals("AD") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:891:0x0bdb, code lost:
    
        if (r3.equals("BZ") != false) goto L892;
     */
    /* JADX WARN: Code restructure failed: missing block: B:893:0x0be2, code lost:
    
        return new int[]{2, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:899:0x0bf7, code lost:
    
        if (r3.equals("BB") != false) goto L900;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x010a, code lost:
    
        if (r3.equals("AT") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:901:0x0bfe, code lost:
    
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:903:0x0c05, code lost:
    
        if (r3.equals("BA") != false) goto L904;
     */
    /* JADX WARN: Code restructure failed: missing block: B:905:0x0c0c, code lost:
    
        return new int[]{1, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:907:0x0c13, code lost:
    
        if (r3.equals("AX") != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:909:0x0c1a, code lost:
    
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:915:0x0c2f, code lost:
    
        if (r3.equals("AM") != false) goto L916;
     */
    /* JADX WARN: Code restructure failed: missing block: B:917:0x0c36, code lost:
    
        return new int[]{2, 3, 2, 3, 2, 2};
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] m3936h(java.lang.String r3) {
        /*
            Method dump skipped, instruction units count: 6662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabv.m3936h(java.lang.String):int[]");
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    /* JADX INFO: renamed from: b */
    public final void mo3933b(Handler handler, zzpt zzptVar) {
        zzptVar.getClass();
        zzabp zzabpVar = this.f4877u;
        CopyOnWriteArrayList<zzabo> copyOnWriteArrayList = zzabpVar.f4857a;
        for (zzabo zzaboVar : copyOnWriteArrayList) {
            if (zzaboVar.f4855b == zzptVar) {
                zzaboVar.f4856c = true;
                copyOnWriteArrayList.remove(zzaboVar);
            }
        }
        zzabpVar.f4857a.add(new zzabo(handler, zzptVar));
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    /* JADX INFO: renamed from: c */
    public final void mo3934c(zzpt zzptVar) {
        CopyOnWriteArrayList<zzabo> copyOnWriteArrayList = this.f4877u.f4857a;
        for (zzabo zzaboVar : copyOnWriteArrayList) {
            if (zzaboVar.f4855b == zzptVar) {
                zzaboVar.f4856c = true;
                copyOnWriteArrayList.remove(zzaboVar);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3937d(int i2, long j2, final long j3) {
        final int i3;
        final long j4;
        if (i2 == 0) {
            if (j2 != 0) {
                j4 = j2;
            } else if (j3 == this.f4872C) {
                return;
            } else {
                j4 = 0;
            }
            i3 = 0;
        } else {
            i3 = i2;
            j4 = j2;
        }
        this.f4872C = j3;
        for (final zzabo zzaboVar : this.f4877u.f4857a) {
            if (!zzaboVar.f4856c) {
                zzaboVar.f4854a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabn
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzaboVar.f4855b.mo3931q(i3, j4, j3);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzip
    /* JADX INFO: renamed from: e */
    public final synchronized void mo3938e(zzhj zzhjVar, zzhv zzhvVar, boolean z) {
        boolean z2;
        if (z) {
            zzhvVar.getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (this.f4879w == 0) {
                this.f4880x = SystemClock.elapsedRealtime();
            }
            this.f4879w++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a5  */
    /* JADX INFO: renamed from: f */
    public final long m3939f(int i2) {
        long jLongValue;
        Integer numValueOf = Integer.valueOf(i2);
        zzgww zzgwwVar = this.f4876t;
        Long lValueOf = (Long) zzgwwVar.get(numValueOf);
        if (lValueOf == null) {
            lValueOf = (Long) zzgwwVar.get(0);
        } else if (lValueOf.longValue() == -9223372036854775807L) {
            String str = this.f4874E;
            if (str == null) {
                str = "";
            }
            int[] iArrM3936h = m3936h(str);
            if (i2 == 2) {
                jLongValue = ((Long) ((zzgyo) f4863F).get(iArrM3936h[0])).longValue();
            } else if (i2 == 3) {
                jLongValue = ((Long) ((zzgyo) f4864G).get(iArrM3936h[1])).longValue();
            } else if (i2 == 4) {
                jLongValue = ((Long) ((zzgyo) f4865H).get(iArrM3936h[2])).longValue();
            } else if (i2 == 5) {
                jLongValue = ((Long) ((zzgyo) f4866I).get(iArrM3936h[3])).longValue();
            } else if (i2 == 7) {
                jLongValue = ((Long) ((zzgyo) f4863F).get(iArrM3936h[0])).longValue();
            } else if (i2 == 9) {
                jLongValue = ((Long) ((zzgyo) f4868K).get(iArrM3936h[5])).longValue();
            } else if (i2 != 10) {
                jLongValue = 1000000;
            } else {
                jLongValue = ((Long) ((zzgyo) f4867J).get(iArrM3936h[4])).longValue();
            }
            lValueOf = Long.valueOf(jLongValue);
        }
        if (lValueOf == null) {
            lValueOf = 1000000L;
        }
        return lValueOf.longValue();
    }

    @Override // com.google.android.gms.internal.ads.zzip
    /* JADX INFO: renamed from: g */
    public final synchronized void mo3940g(zzhv zzhvVar, boolean z, int i2) {
        boolean z2;
        if (z) {
            zzhvVar.getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f4881y += (long) i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzip
    /* JADX INFO: renamed from: k */
    public final synchronized void mo3941k(zzhv zzhvVar, boolean z) throws Throwable {
        Throwable th;
        boolean z2;
        zzabv zzabvVar;
        try {
            if (z) {
                try {
                    zzhvVar.getClass();
                    z2 = true;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } else {
                z2 = false;
            }
            if (z2) {
                try {
                    zzgtr.m7133f(this.f4879w > 0);
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    int i2 = (int) (jElapsedRealtime - this.f4880x);
                    this.f4882z += (long) i2;
                    long j2 = this.f4870A;
                    long j3 = this.f4881y;
                    this.f4870A = j2 + j3;
                    if (i2 > 0) {
                        zzacj zzacjVar = this.f4878v;
                        zzacjVar.m3946a((j3 * 8000.0f) / i2, (int) Math.sqrt(j3));
                        if (this.f4882z >= 2000 || this.f4870A >= 524288) {
                            this.f4871B = (long) zzacjVar.m3947b();
                        }
                        zzabvVar = this;
                        zzabvVar.m3937d(i2, this.f4881y, this.f4871B);
                        zzabvVar.f4880x = jElapsedRealtime;
                        zzabvVar.f4881y = 0L;
                    } else {
                        zzabvVar = this;
                    }
                    zzabvVar.f4879w--;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    /* JADX INFO: renamed from: a */
    public final zzabv mo3932a() {
        return this;
    }
}
