package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7Z */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C23507Z {
    public static final C4912no A0E = new C4912no(new Object());
    public final int A00;
    public final long A01;
    public final long A02;
    public final Timeline A03;
    public final C4912no A04;
    public final C4912no A05;
    public final C4894nW A06;
    public final C2788Ex A07;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Start Stall Logging")
    public final EnumC4623ir A08;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Determine if stall is from Audio for logging")
    public final boolean A09;
    public final boolean A0A;
    public volatile long A0B;
    public volatile long A0C;
    public volatile long A0D;

    public C23507Z(Timeline timeline, long j2, C4894nW c4894nW, C2788Ex c2788Ex) {
        this(timeline, A0E, j2, -9223372036854775807L, 1, false, c4894nW, c2788Ex, A0E, j2, j2, j2, EnumC4623ir.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to call base constructor")
    public C23507Z(Timeline timeline, C4912no c4912no, long j2, long j3, int i2, boolean z, C4894nW c4894nW, C2788Ex c2788Ex, C4912no c4912no2, long j4, long j5, long j6) {
        this(timeline, c4912no, j2, j3, i2, z, c4894nW, c2788Ex, c4912no2, j4, j5, j6, EnumC4623ir.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to add new parameters")
    public C23507Z(@MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) Timeline timeline, @MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) C4912no c4912no, long j2, long j3, int i2, boolean z, C4894nW c4894nW, C2788Ex c2788Ex, C4912no c4912no2, long j4, long j5, long j6, EnumC4623ir enumC4623ir, boolean z2) {
        this.A03 = timeline;
        this.A05 = c4912no;
        this.A02 = j2;
        this.A01 = j3;
        this.A0C = j2;
        this.A00 = i2;
        this.A0A = z;
        this.A06 = c4894nW;
        this.A07 = c2788Ex;
        this.A04 = c4912no2;
        this.A0B = j4;
        this.A0D = j5;
        this.A0C = j6;
        this.A08 = enumC4623ir;
        this.A09 = z2;
    }

    public static void A00(C23507Z c23507z, C23507Z c23507z2) {
        c23507z2.A0C = c23507z.A0C;
        c23507z2.A0B = c23507z.A0B;
        c23507z2.A0D = c23507z.A0D;
    }

    public final C23507Z A01(int i2) {
        C23507Z c23507z = new C23507Z(this.A03, this.A05, this.A02, this.A01, i2, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c23507z);
        return c23507z;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Stall Reason Logging in Hero")
    public final C23507Z A02(int i2, EnumC4623ir enumC4623ir, boolean z) {
        C23507Z c23507z = new C23507Z(this.A03, this.A05, this.A02, this.A01, i2, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, enumC4623ir, z);
        A00(this, c23507z);
        return c23507z;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "To track Audio Stalls for Logging")
    public final C23507Z A03(int i2, boolean z) {
        C23507Z c23507z = new C23507Z(this.A03, this.A05, this.A02, this.A01, i2, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, z);
        A00(this, c23507z);
        return c23507z;
    }

    public final C23507Z A04(Timeline timeline) {
        C23507Z c23507z = new C23507Z(timeline, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c23507z);
        return c23507z;
    }

    public final C23507Z A05(C4912no c4912no) {
        return new C23507Z(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, c4912no, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
    }

    public final C23507Z A06(C4912no c4912no, long j2, long j3, long j4) {
        long j5 = j3;
        Timeline timeline = this.A03;
        if (!c4912no.A00()) {
            j5 = -9223372036854775807L;
        }
        return new C23507Z(timeline, c4912no, j2, j5, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, j4, j2);
    }

    public final C23507Z A07(C4894nW c4894nW, C2788Ex c2788Ex) {
        C23507Z c23507z = new C23507Z(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, c4894nW, c2788Ex, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c23507z);
        return c23507z;
    }

    public final C23507Z A08(boolean z) {
        C23507Z c23507z = new C23507Z(this.A03, this.A05, this.A02, this.A01, this.A00, z, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c23507z);
        return c23507z;
    }
}
