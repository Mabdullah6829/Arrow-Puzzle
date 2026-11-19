package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdr {

    /* JADX INFO: renamed from: a */
    public static final byte[] f12695a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final String[] f12696b = {"", "A", "B", "C"};

    /* JADX INFO: renamed from: c */
    public static final Pattern f12697c = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: a */
    public static String m6032a(int i2, boolean z, int i3, int i4, int[] iArr, int i5) {
        int i6;
        Object[] objArr = {f12696b[i2], Integer.valueOf(i3), Integer.valueOf(i4), Character.valueOf(true != z ? 'L' : 'H'), Integer.valueOf(i5)};
        String str = zzfm.f16091a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i7 = 6;
        while (true) {
            if (i7 <= 0) {
                break;
            }
            int i8 = i7 - 1;
            if (iArr[i8] != 0) {
                break;
            }
            i7 = i8;
        }
        for (i6 = 0; i6 < i7; i6++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i6])));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static Pair m6033b(zzv zzvVar) {
        boolean z;
        zzdq zzdqVarM6034c = m6034c(zzvVar);
        if (zzdqVarM6034c == null || !(z = zzdqVarM6034c.f12606c)) {
            return null;
        }
        zzgtr.m7133f(z);
        Integer numValueOf = Integer.valueOf(zzdqVarM6034c.f12604a);
        zzgtr.m7133f(z);
        return new Pair(numValueOf, Integer.valueOf(zzdqVarM6034c.f12605b));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:232:0x03b4  */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016f, code lost:
    
        if (r0.equals("09") != true) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0177, code lost:
    
        if (r0.equals("08") != true) goto L840;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017f, code lost:
    
        if (r0.equals("07") != true) goto L841;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0187, code lost:
    
        if (r0.equals("06") != true) goto L842;
     */
    /* JADX WARN: Code restructure failed: missing block: B:839:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:841:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:842:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:843:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:844:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:845:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:846:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:847:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0190, code lost:
    
        if (r0.equals("05") != true) goto L843;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0199, code lost:
    
        if (r0.equals("04") != true) goto L844;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a4, code lost:
    
        if (r0.equals("03") != true) goto L845;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01af, code lost:
    
        if (r0.equals("02") != true) goto L846;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ba, code lost:
    
        if (r0.equals("01") != true) goto L847;
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v44 int, still in use, count: 1, list:
  (r3v44 int) from 0x00b0: IF  (r3v44 int) != (1567 int)  -> B:17:0x00b2 A[HIDDEN] (LINE:177)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v44 int, still in use, count: 1, list:
  (r3v44 int) from 0x00b0: IF  (r3v44 int) != (1567 int)  -> B:17:0x00b2 A[HIDDEN] (LINE:177)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzdq m6034c(com.google.android.gms.internal.ads.zzv r37) {
        /*
            Method dump skipped, instruction units count: 3600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdr.m6034c(com.google.android.gms.internal.ads.zzv):com.google.android.gms.internal.ads.zzdq");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0179  */
    /* JADX INFO: renamed from: d */
    public static zzdq m6035d(String str, String[] strArr, zzi zziVar) {
        int i2;
        Integer num = null;
        if (strArr.length < 4) {
            AbstractC5152f.m3775g(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = f12697c.matcher(strArr[1]);
        if (!matcher.matches()) {
            AbstractC5152f.m3775g(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        String strGroup = matcher.group(1);
        boolean zEquals = "1".equals(strGroup);
        zzdq zzdqVar = zzdq.f12603d;
        if (zEquals) {
            i2 = 1;
        } else {
            if (!"2".equals(strGroup)) {
                AbstractC5152f.m3775g(strGroup, "Unknown HEVC profile string: ", "CodecSpecificDataUtil");
                return zzdqVar;
            }
            i2 = (zziVar == null || zziVar.f19549c != 6) ? 2 : 4096;
        }
        String str2 = strArr[3];
        switch (str2) {
            case "L30":
                num = 1;
                break;
            case "L60":
                num = 4;
                break;
            case "L63":
                num = 16;
                break;
            case "L90":
                num = 64;
                break;
            case "L93":
                num = 256;
                break;
            case "L120":
                num = 1024;
                break;
            case "L123":
                num = 4096;
                break;
            case "L150":
                num = 16384;
                break;
            case "L153":
                num = 65536;
                break;
            case "L156":
                num = 262144;
                break;
            case "L180":
                num = 1048576;
                break;
            case "L183":
                num = 4194304;
                break;
            case "L186":
                num = 16777216;
                break;
            case "H30":
                num = 2;
                break;
            case "H60":
                num = 8;
                break;
            case "H63":
                num = 32;
                break;
            case "H90":
                num = 128;
                break;
            case "H93":
                num = 512;
                break;
            case "H120":
                num = 2048;
                break;
            case "H123":
                num = 8192;
                break;
            case "H150":
                num = 32768;
                break;
            case "H153":
                num = 131072;
                break;
            case "H156":
                num = 524288;
                break;
            case "H180":
                num = 2097152;
                break;
            case "H183":
                num = 8388608;
                break;
            case "H186":
                num = 33554432;
                break;
        }
        if (num != null) {
            return new zzdq(i2, num.intValue(), true);
        }
        zzeh.m6211c("CodecSpecificDataUtil", "Unknown HEVC level string: ".concat(str2));
        return zzdqVar;
    }
}
