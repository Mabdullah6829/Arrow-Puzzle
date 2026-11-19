package com.instagram.common.viewpoint.core;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.widget.C1137R;
import androidx.core.view.PointerIconCompat;
import com.facebook.ads.internal.androidx.support.p052v7.widget.RecyclerView$SavedState;
import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7M */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C23377M extends ViewGroup {
    public static byte[] A18;
    public static String[] A19 = {"EVtiEz0XwzmAcv0NfW8PxL5EkbzIoYic", "JvoTrXnfxJUplw5tP56Ros2T7Gsfofpu", "CB3RTx10Tt9OnvYftpvuMygLYd0xmG3f", "iCoGDb0mnoj0sn99iJ8fx9KF0Zt33I3a", "ipdvxhFfLLm3eGkYLsOkZJNxKW1ljoxp", "EVaiAhpvjrLt8PNqQrclR8roKXj174Mb", "AK1oSCSoqExnNm9Bojb7ErrkRophOnjO", "V"};
    public static final Interpolator A1A;
    public static final boolean A1B;
    public static final boolean A1C;
    public static final boolean A1D;
    public static final boolean A1E;
    public static final boolean A1F;
    public static final boolean A1G;
    public static final int[] A1H;
    public static final int[] A1I;
    public static final Class<?>[] A1J;
    public C4566ht A00;
    public C3493QQ A01;
    public C4565hs A02;
    public RunnableC3506Qd A03;
    public AbstractC3518Qq A04;
    public AbstractC3526Qy A05;
    public AbstractC3530R2 A06;
    public InterfaceC3539RB A07;
    public RunnableC3547RJ A08;
    public C4549hb A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public float A0L;
    public float A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public int A0V;
    public int A0W;
    public int A0X;
    public VelocityTracker A0Y;
    public EdgeEffect A0Z;
    public EdgeEffect A0a;
    public EdgeEffect A0b;
    public EdgeEffect A0c;
    public C3432PP A0d;
    public InterfaceC3521Qt A0e;
    public InterfaceC3524Qw A0f;
    public AbstractC3533R5 A0g;
    public InterfaceC3534R6 A0h;
    public AbstractC3535R7 A0i;
    public RecyclerView$SavedState A0j;
    public Runnable A0k;
    public List<RecyclerView.OnChildAttachStateChangeListener> A0l;
    public List<AbstractC3535R7> A0m;
    public boolean A0n;
    public boolean A0o;
    public final Rect A0p;
    public final RectF A0q;
    public final C3538RA A0r;
    public final C3545RH A0s;
    public final C3556RS A0t;
    public final Runnable A0u;
    public final ArrayList<RecyclerView.ItemDecoration> A0v;
    public final List<AbstractC3548RK> A0w;
    public final int A0x;
    public final int A0y;
    public final Rect A0z;
    public final AccessibilityManager A10;
    public final C4553hg A11;
    public final InterfaceC3555RR A12;
    public final ArrayList<InterfaceC3534R6> A13;
    public final int[] A14;
    public final int[] A15;
    public final int[] A16;
    public final int[] A17;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C23377M A0H(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof C23377M) {
            return (C23377M) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            C23377M c23377mA0H = A0H(viewGroup.getChildAt(i2));
            if (c23377mA0H != null) {
                return c23377mA0H;
            }
        }
        return null;
    }

    public static String A0I(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A18, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A19;
            if (strArr[3].charAt(2) == strArr[2].charAt(2)) {
                throw new RuntimeException();
            }
            A19[1] = "u7dEJjISLATYPJ53p8QeJMuNBCdH6OYt";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 27);
            i5++;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0N() {
        this.A0s.A04(4);
        A1L();
        A1M();
        this.A0s.A04 = 1;
        if (this.A0s.A0C) {
            for (int iA05 = this.A01.A05() - 1; iA05 >= 0; iA05--) {
                AbstractC3548RK abstractC3548RKA0F = A0F(this.A01.A09(iA05));
                if (!abstractC3548RKA0F.A0l()) {
                    long jA0C = A0C(abstractC3548RKA0F);
                    C3525Qx c3525QxA0E = this.A05.A0E(this.A0s, abstractC3548RKA0F);
                    AbstractC3548RK abstractC3548RKA05 = this.A0t.A05(jA0C);
                    if (abstractC3548RKA05 == null || abstractC3548RKA05.A0l()) {
                        this.A0t.A0E(abstractC3548RKA0F, c3525QxA0E);
                    } else {
                        boolean zA0H = this.A0t.A0H(abstractC3548RKA05);
                        boolean zA0H2 = this.A0t.A0H(abstractC3548RKA0F);
                        if (zA0H && abstractC3548RKA05 == abstractC3548RKA0F) {
                            this.A0t.A0E(abstractC3548RKA0F, c3525QxA0E);
                        } else {
                            C3525Qx c3525QxA04 = this.A0t.A04(abstractC3548RKA05);
                            this.A0t.A0E(abstractC3548RKA0F, c3525QxA0E);
                            C3525Qx c3525QxA03 = this.A0t.A03(abstractC3548RKA0F);
                            if (c3525QxA04 == null) {
                                A0m(jA0C, abstractC3548RKA0F, abstractC3548RKA05);
                            } else {
                                A0t(abstractC3548RKA05, abstractC3548RKA0F, c3525QxA04, c3525QxA03, zA0H, zA0H2);
                            }
                        }
                    }
                }
            }
            this.A0t.A0G(this.A12);
        }
        this.A06.A1I(this.A0r);
        this.A0s.A05 = this.A0s.A03;
        this.A0C = false;
        this.A0s.A0C = false;
        this.A0s.A0B = false;
        this.A06.A09 = false;
        if (this.A0r.A02 != null) {
            this.A0r.A02.clear();
        }
        if (this.A06.A08) {
            this.A06.A00 = 0;
            this.A06.A08 = false;
            this.A0r.A0O();
        }
        this.A06.A1x(this.A0s);
        A1N();
        A1p(false);
        this.A0t.A06();
        if (A11(this.A14[0], this.A14[1])) {
            A1d(0, 0);
        }
        A0Q();
        A0S();
    }

    public static void A0W() {
        A18 = new byte[]{82, 68, 46, 68, 122, -115, -119, -101, 68, 108, -109, -112, -120, -119, -106, 68, 86, 94, -80, -13, -15, -2, -2, -1, 4, -80, -14, -11, -80, -10, -1, 5, -2, -12, -80, -14, 5, 4, -80, -7, 4, -80, -7, 3, -80, -2, -11, -13, -11, 3, 3, -15, 2, 9, -80, -10, -1, 2, -80, -73, 0, 10, -73, -8, 3, 9, -4, -8, -5, 16, -73, -8, 11, 11, -8, -6, -1, -4, -5, -73, 11, 6, -73, -8, -73, -23, -4, -6, 16, -6, 3, -4, 9, -19, 0, -4, 14, -47, 97, -86, -76, 97, -81, -80, -75, 97, -94, 97, -91, -86, -77, -90, -92, -75, 97, -92, -87, -86, -83, -91, 97, -80, -89, 97, -95, -17, -16, -11, -95, -25, -16, -10, -17, -27, -81, -95, -59, -22, -27, -95, -30, -17, -6, -95, -50, -16, -11, -22, -16, -17, -58, -9, -26, -17, -11, -12, -95, -24, -26, -11, -95, -12, -20, -22, -15, -15, -26, -27, -64, -98, -110, -45, -42, -45, -30, -26, -41, -28, -84, -66, -78, -11, 1, 0, 6, -9, 10, 6, -52, -99, -111, -35, -46, -22, -32, -26, -27, -85, -82, -109, -24, -26, -36, -31, -38, -109, -41, -40, -39, -44, -24, -33, -25, -109, -23, -44, -33, -24, -40, -78, -48, -37, -37, -44, -45, -113, -31, -44, -36, -34, -27, -44, -77, -44, -29, -48, -46, -41, -44, -45, -59, -40, -44, -26, -113, -26, -40, -29, -41, -113, -48, -113, -27, -40, -44, -26, -113, -26, -41, -40, -46, -41, -113, -40, -30, -113, -35, -34, -29, -113, -43, -37, -48, -42, -42, -44, -45, -113, -48, -30, -113, -29, -36, -33, -113, -45, -44, -29, -48, -46, -41, -44, -45, -99, -69, -39, -26, -26, -25, -20, -104, -37, -39, -28, -28, -104, -20, -32, -31, -21, -104, -27, -35, -20, -32, -25, -36, -104, -31, -26, -104, -39, -104, -21, -37, -22, -25, -28, -28, -104, -37, -39, -28, -28, -38, -39, -37, -29, -90, -104, -53, -37, -22, -25, -28, -28, -104, -37, -39, -28, -28, -38, -39, -37, -29, -21, -104, -27, -31, -33, -32, -20, -38, -35, -104, -22, -19, -26, -104, -36, -19, -22, -31, -26, -33, -104, -39, -104, -27, -35, -39, -21, -19, -22, -35, -104, -98, -104, -28, -39, -15, -25, -19, -20, -104, -24, -39, -21, -21, -104, -17, -32, -35, -22, -35, -104, -15, -25, -19, -104, -37, -39, -26, -26, -25, -20, -104, -37, -32, -39, -26, -33, -35, -104, -20, -32, -35, -54, -35, -37, -15, -37, -28, -35, -22, -50, -31, -35, -17, -104, -36, -39, -20, -39, -90, -104, -71, -26, -15, -104, -27, -35, -20, -32, -25, -36, -104, -37, -39, -28, -28, -104, -20, -32, -39, -20, -104, -27, -31, -33, -32, -20, -104, -37, -32, -39, -26, -33, -35, -104, -20, -32, -35, -104, -21, -20, -22, -19, -37, -20, -19, -22, -35, -25, -34, -104, -20, -32, -35, -104, -54, -35, -37, -15, -37, -28, -35, -22, -50, -31, -35, -17, -104, -25, -22, -104, -20, -32, -35, -104, -39, -36, -39, -24, -20, -35, -22, -104, -37, -25, -26, -20, -35, -26, -20, -21, -104, -21, -32, -25, -19, -28, -36, -104, -38, -35, -104, -24, -25, -21, -20, -24, -25, -26, -35, -36, -104, -20, -25, -20, -32, -35, -104, -26, -35, -16, -20, -104, -34, -22, -39, -27, -35, -90, -59, -29, -16, -16, -15, -10, -94, -27, -29, -18, -18, -94, -10, -22, -21, -11, -94, -17, -25, -10, -22, -15, -26, -94, -7, -22, -21, -18, -25, -94, -44, -25, -27, -5, -27, -18, -25, -12, -40, -21, -25, -7, -94, -21, -11, -94, -27, -15, -17, -14, -9, -10, -21, -16, -23, -94, -29, -94, -18, -29, -5, -15, -9, -10, -94, -15, -12, -94, -11, -27, -12, -15, -18, -18, -21, -16, -23, -52, -22, -9, -9, -8, -3, -87, -17, -11, -14, -9, -16, -87, 0, -14, -3, -15, -8, -2, -3, -87, -22, -87, -43, -22, 2, -8, -2, -3, -42, -22, -9, -22, -16, -18, -5, -87, -4, -18, -3, -73, -87, -52, -22, -11, -11, -87, -4, -18, -3, -43, -22, 2, -8, -2, -3, -42, -22, -9, -22, -16, -18, -5, -87, 0, -14, -3, -15, -87, -22, -87, -9, -8, -9, -74, -9, -2, -11, -11, -87, -22, -5, -16, -2, -10, -18, -9, -3, -73, 106, -120, -107, -107, -106, -101, 71, -102, -118, -103, -106, -109, -109, 71, -101, -106, 71, -105, -106, -102, -112, -101, -112, -106, -107, 71, -120, 71, 115, -120, -96, -106, -100, -101, 116, -120, -107, -120, -114, -116, -103, 71, -102, -116, -101, 85, 71, 106, -120, -109, -109, 71, -102, -116, -101, 115, -120, -96, -106, -100, -101, 116, -120, -107, -120, -114, -116, -103, 71, -98, -112, -101, -113, 71, -120, 71, -107, -106, -107, 84, -107, -100, -109, -109, 71, -120, -103, -114, -100, -108, -116, -107, -101, 85, -114, -84, -71, -71, -70, -65, 107, -66, -82, -67, -70, -73, -73, 107, -62, -76, -65, -77, -70, -64, -65, 107, -84, 107, -105, -84, -60, -70, -64, -65, -104, -84, -71, -84, -78, -80, -67, 107, -66, -80, -65, 121, 107, -114, -84, -73, -73, 107, -66, -80, -65, -105, -84, -60, -70, -64, -65, -104, -84, -71, -84, -78, -80, -67, 107, -62, -76, -65, -77, 107, -84, 107, -71, -70, -71, 120, -71, -64, -73, -73, 107, -84, -67, -78, -64, -72, -80, -71, -65, 121, -43, -13, 0, 0, 1, 6, -78, 5, -1, 1, 1, 6, -6, -78, 5, -11, 4, 1, -2, -2, -78, 9, -5, 6, -6, 1, 7, 6, -78, -13, -78, -34, -13, 11, 1, 7, 6, -33, -13, 0, -13, -7, -9, 4, -78, 5, -9, 6, -64, -78, -43, -13, -2, -2, -78, 5, -9, 6, -34, -13, 11, 1, 7, 6, -33, -13, 0, -13, -7, -9, 4, -78, 9, -5, 6, -6, 
        -78, -13, -78, 0, 1, 0, -65, 0, 7, -2, -2, -78, -13, 4, -7, 7, -1, -9, 0, 6, -64, 96, -117, 60, -118, -117, -112, 60, -113, -127, -112, 104, 125, -107, -117, -111, -112, 98, -114, -117, -106, -127, -118, 60, -123, -118, 60, -120, 125, -107, -117, -111, -112, 60, -117, -114, 60, -113, 127, -114, -117, -120, -120, -94, -49, -49, -52, -49, 125, -51, -49, -52, -64, -62, -48, -48, -58, -53, -60, 125, -48, -64, -49, -52, -55, -55, -104, 125, -51, -52, -58, -53, -47, -62, -49, 125, -58, -53, -63, -62, -43, 125, -61, -52, -49, 125, -58, -63, 125, -111, -90, -66, -76, -70, -71, -110, -90, -77, -90, -84, -86, -73, 101, 119, -104, 73, -118, -115, -118, -103, -99, -114, -101, 73, -118, -99, -99, -118, -116, -111, -114, -115, 100, 73, -100, -108, -110, -103, -103, -110, -105, -112, 73, -107, -118, -94, -104, -98, -99, 110, -113, 64, -116, -127, -103, -113, -107, -108, 64, -115, -127, -114, -127, -121, -123, -110, 64, -127, -108, -108, -127, -125, -120, -123, -124, 91, 64, -109, -117, -119, -112, -112, -119, -114, -121, 64, -116, -127, -103, -113, -107, -108, -98, -64, -67, -80, -70, -77, -69, 110, -59, -74, -73, -70, -77, 110, -69, -81, -62, -79, -74, -73, -68, -75, 110, -79, -74, -81, -68, -75, -77, -78, 110, -60, -73, -77, -59, 110, -74, -67, -70, -78, -77, -64, -63, 110, -59, -73, -62, -74, 110, -62, -74, -77, 110, -68, -77, -59, -67, -68, -77, -63, 124, 110, -94, -74, -77, 110, -66, -64, -77, 123, -70, -81, -57, -67, -61, -62, 110, -73, -68, -76, -67, -64, -69, -81, -62, -73, -67, -68, 110, -76, -67, -64, 110, -62, -74, -77, 110, -79, -74, -81, -68, -75, -77, 110, -74, -67, -70, -78, -77, -64, 110, -84, -80, 122, -96, -49, -58, -58, -93, -56, -48, -69, -58, -61, -66, -69, -50, -65, -113, -109, 93, -116, -85, -119, -98, -74, -84, -78, -79, -103, -99, 103, -105, -88, -71, -69, -80, -88, -77, -112, -75, -67, -88, -77, -80, -85, -88, -69, -84, -96, -92, 110, -95, -79, -64, -67, -70, -70, -108, -89, -91, -69, -91, -82, -89, -76, -104, -85, -89, -71, -90, -71, -73, -51, -73, -64, -71, -58, -86, -67, -71, -53, 116, -72, -61, -71, -57, 116, -62, -61, -56, 116, -57, -55, -60, -60, -61, -58, -56, 116, -57, -73, -58, -61, -64, -64, -67, -62, -69, 116, -56, -61, 116, -75, -62, 116, -75, -74, -57, -61, -64, -55, -56, -71, 116, -60, -61, -57, -67, -56, -67, -61, -62, -126, 116, -87, -57, -71, 116, -57, -73, -58, -61, -64, -64, -88, -61, -92, -61, -57, -67, -56, -67, -61, -62, 116, -67, -62, -57, -56, -71, -75, -72, -88, -69, -71, -49, -71, -62, -69, -56, -84, -65, -69, -51, 118, -66, -73, -55, 118, -60, -59, 118, -94, -73, -49, -59, -53, -54, -93, -73, -60, -73, -67, -69, -56, -102, -67, -75, 102, -86, -81, -84, -84, -85, -72, -85, -76, -70, 102, -100, -81, -85, -67, -114, -75, -78, -86, -85, -72, -71, 102, -82, -89, -68, -85, 102, -70, -82, -85, 102, -71, -89, -77, -85, 102, -87, -82, -89, -76, -83, -85, 102, -113, -118, 116, 102, -102, -82, -81, -71, 102, -77, -81, -83, -82, -70, 102, -82, -89, -74, -74, -85, -76, 102, -86, -69, -85, 102, -70, -75, 102, -81, -76, -87, -75, -76, -71, -81, -71, -70, -85, -76, -70, 102, -121, -86, -89, -74, -70, -85, -72, 102, -69, -74, -86, -89, -70, -85, 102, -85, -68, -85, -76, -70, -71, 102, -75, -72, 102, -81, -84, 102, -70, -82, -85, 102, -110, -89, -65, -75, -69, -70, -109, -89, -76, -89, -83, -85, -72, 102, -78, -89, -65, -71, 102, -75, -69, -70, 102, -70, -82, -85, 102, -71, -89, -77, -85, 102, -100, -81, -85, -67, 102, -77, -69, -78, -70, -81, -74, -78, -85, 102, -70, -81, -77, -85, -71, 116, 80, 102, -100, -81, -85, -67, -114, -75, -78, -86, -85, -72, 102, 119, -128, 126, -95, -103, 74, -114, -109, -112, -112, -113, -100, -113, -104, -98, 74, -128, -109, -113, -95, 114, -103, -106, -114, -113, -100, -99, 74, -110, -117, -96, -113, 74, -98, -110, -113, 74, -99, -117, -105, -113, 74, -99, -98, -117, -116, -106, -113, 74, 115, 110, 88, 74, 125, -98, -117, -116, -106, -113, 74, 115, 110, -99, 74, -109, -104, 74, -93, -103, -97, -100, 74, -117, -114, -117, -102, -98, -113, -100, 74, 119, 127, 125, 126, 74, 108, 111, 74, -97, -104, -109, -101, -97, -113, 74, -117, -104, -114, 74, 125, 114, 121, 127, 118, 110, 74, 120, 121, 126, 74, -115, -110, -117, -104, -111, -113, 88, 52, 74, -128, -109, -113, -95, 114, -103, -106, -114, -113, -100, 74, 91, 100, -102, -83, -87, -69, 100, -111, -109, -109, -107, -93, -93, -103, -110, -103, -100, -103, -92, -87, -44, -39, -30, -43, -45, -28, -39, -33, -34, -112, -35, -27, -29, -28, -112, -46, -43, -112, -47, -46, -29, -33, -36, -27, -28, -43, -98, -112, -30, -43, -45, -43, -39, -26, -43, -44, -86, -14, -16, -1, -44, -1, -16, -8, -38, -15, -15, -2, -16, -1, -2, -51, -52, -95, -58, -57, -54, -62, -76, -57, -61, -43, -97, -46, -46, -65, -63, -58, -61, -62, -78, -51, -75, -57, -52, -62, -51, -43, -78, -79, -122, -85, -84, -81, -89, -103, -84, -88, -70, -121, -88, -73, -92, -90, -85, -88, -89, -119, -75, -78, -80, -102, -84, -79, -89, -78, -70, -102, -103, 114, -112, -97, 110, -109, -108, -105, -113, 111, -99, -116, -94, -108, -103, -110, 122, -99, -113, -112, -99, -72, -73, -110, -73, -67, -82, -69, -84, -82, -71, -67, -99, -72, -66, -84, -79, -114, -65, -82, -73, -67, -16, -30, -15, -48, -32, -17, 
        -20, -23, -23, -26, -21, -28, -47, -20, -14, -32, -27, -48, -23, -20, -19, -91, -90, -73, -99, -33, -34, -31, -99, -34, -17, -28, -14, -22, -30, -21, -15, -99, -32, -20, -21, -16, -15, -34, -21, -15, -99};
    }

    static {
        A0W();
        A1I = new int[]{R.attr.nestedScrollingEnabled};
        A1H = new int[]{R.attr.clipToPadding};
        A1C = false;
        A1B = Build.VERSION.SDK_INT >= 23;
        A1D = true;
        A1E = true;
        A1F = false;
        A1G = false;
        Class<?> cls = Integer.TYPE;
        A1J = new Class[]{Context.class, AttributeSet.class, cls, cls};
        A1A = new InterpolatorC3517Qp();
    }

    public C23377M(Context context) {
        this(context, null);
    }

    public C23377M(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C23377M(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A11 = new C4553hg(this);
        this.A0r = new C3538RA(this);
        this.A0t = new C3556RS();
        this.A0u = new RunnableC3515Qn(this);
        this.A0p = new Rect();
        this.A0z = new Rect();
        this.A0q = new RectF();
        this.A0v = new ArrayList<>();
        this.A13 = new ArrayList<>();
        this.A0O = 0;
        this.A0C = false;
        this.A0U = 0;
        this.A0N = 0;
        this.A05 = new C23407P();
        this.A0W = 0;
        this.A0V = -1;
        this.A0L = Float.MIN_VALUE;
        this.A0M = Float.MIN_VALUE;
        this.A0o = true;
        this.A08 = new RunnableC3547RJ(this);
        this.A02 = A1E ? new C4565hs() : null;
        this.A0s = new C3545RH();
        this.A0G = false;
        this.A0H = false;
        this.A0f = new C4557hk(this);
        this.A0K = false;
        this.A14 = new int[2];
        this.A17 = new int[2];
        this.A16 = new int[2];
        this.A15 = new int[2];
        this.A0w = new ArrayList();
        this.A0k = new RunnableC3516Qo(this);
        this.A12 = new C4560hn(this);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A1H, i2, 0);
            this.A0B = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.A0B = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A0X = viewConfiguration.getScaledTouchSlop();
        this.A0L = AbstractC3450Pi.A00(viewConfiguration, context);
        this.A0M = AbstractC3450Pi.A01(viewConfiguration, context);
        this.A0y = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A0x = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.A05.A0J(this.A0f);
        A0e();
        A0O();
        if (AbstractC3449Ph.A00(this) == 0) {
            AbstractC3449Ph.A09(this, 1);
        }
        this.A10 = (AccessibilityManager) getContext().getSystemService(A0I(1831, 13, 21));
        setAccessibilityDelegateCompat(new C4549hb(this));
        setDescendantFocusability(262144);
        setNestedScrollingEnabled(true);
    }

    private int A0B(View view) {
        int id = view.getId();
        while (true) {
            boolean zIsFocused = view.isFocused();
            String[] strArr = A19;
            String str = strArr[0];
            String str2 = strArr[6];
            int iCharAt = str.charAt(14);
            int lastKnownId = str2.charAt(14);
            if (iCharAt == lastKnownId) {
                throw new RuntimeException();
            }
            A19[1] = "skNAKCm7G9cheB5S1YDp1BKl7DhhyUWu";
            if (!zIsFocused && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                int id2 = view.getId();
                if (id2 != -1) {
                    id = view.getId();
                }
            } else {
                return id;
            }
        }
    }

    private final long A0C(AbstractC3548RK abstractC3548RK) {
        return this.A04.A0M() ? abstractC3548RK.A0Q() : abstractC3548RK.A03;
    }

    private View A0D() {
        AbstractC3548RK abstractC3548RKA1F;
        int i2 = this.A0s.A01 != -1 ? this.A0s.A01 : 0;
        int iA03 = this.A0s.A03();
        if (A19[1].charAt(14) != '5') {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[0] = "7qfeZgEkVtoAThUnrGXSh94SPjREp60d";
        strArr[6] = "LKFRBKGk6g3UCUNb2omEsqPfgI9kqX1N";
        for (int startFocusSearchIndex = i2; startFocusSearchIndex < iA03; startFocusSearchIndex++) {
            AbstractC3548RK abstractC3548RKA1F2 = A1F(startFocusSearchIndex);
            if (abstractC3548RKA1F2 == null) {
                break;
            }
            if (abstractC3548RKA1F2.A0H.hasFocusable()) {
                return abstractC3548RKA1F2.A0H;
            }
        }
        int startFocusSearchIndex2 = Math.min(iA03, i2);
        for (int limit = startFocusSearchIndex2 - 1; limit >= 0 && (abstractC3548RKA1F = A1F(limit)) != null; limit--) {
            if (abstractC3548RKA1F.A0H.hasFocusable()) {
                return abstractC3548RKA1F.A0H;
            }
        }
        return null;
    }

    private final AbstractC3548RK A0E(long j2) {
        if (this.A04 == null || !this.A04.A0M()) {
            return null;
        }
        int iA06 = this.A01.A06();
        AbstractC3548RK abstractC3548RK = null;
        for (int i2 = 0; i2 < iA06; i2++) {
            AbstractC3548RK holder = A0F(this.A01.A0A(i2));
            if (holder != null && !holder.A0g() && holder.A0Q() == j2) {
                if (this.A01.A0K(holder.A0H)) {
                    abstractC3548RK = holder;
                } else {
                    return holder;
                }
            }
        }
        return abstractC3548RK;
    }

    public static AbstractC3548RK A0F(View view) {
        if (view == null) {
            return null;
        }
        return ((C3531R3) view.getLayoutParams()).A00;
    }

    private final AbstractC3548RK A0G(View view) {
        View itemView = A1E(view);
        if (itemView == null) {
            return null;
        }
        return A1I(itemView);
    }

    private void A0J() {
        A0T();
        setScrollState(0);
    }

    private void A0K() {
        int i2 = this.A0P;
        this.A0P = 0;
        if (i2 != 0 && A1q()) {
            AccessibilityEvent event = AccessibilityEvent.obtain();
            event.setEventType(2048);
            AbstractC3467Q0.A01(event, i2);
            sendAccessibilityEventUnchecked(event);
        }
    }

    private void A0L() {
        this.A0s.A04(1);
        A1j(this.A0s);
        this.A0s.A0A = false;
        A1L();
        this.A0t.A06();
        A1M();
        A0P();
        A0U();
        this.A0s.A0E = this.A0s.A0C && this.A0H;
        this.A0H = false;
        this.A0G = false;
        this.A0s.A09 = this.A0s.A0B;
        this.A0s.A03 = this.A04.A0B();
        A0x(this.A14);
        if (this.A0s.A0C) {
            int iA05 = this.A01.A05();
            for (int i2 = 0; i2 < iA05; i2++) {
                AbstractC3548RK holder = A0F(this.A01.A09(i2));
                if (!holder.A0l() && (!holder.A0f() || this.A04.A0M())) {
                    AbstractC3526Qy abstractC3526Qy = this.A05;
                    C3545RH c3545rh = this.A0s;
                    int i3 = AbstractC3526Qy.A06(holder);
                    this.A0t.A0F(holder, abstractC3526Qy.A0F(c3545rh, holder, i3, holder.A0R()));
                    if (this.A0s.A0E && holder.A0j() && !holder.A0g() && !holder.A0l() && !holder.A0f()) {
                        this.A0t.A08(A0C(holder), holder);
                    }
                }
            }
        }
        if (this.A0s.A0B) {
            A0i();
            boolean z = this.A0s.A0D;
            this.A0s.A0D = false;
            this.A06.A1w(this.A0r, this.A0s);
            this.A0s.A0D = z;
            for (int i4 = 0; i4 < this.A01.A05(); i4++) {
                AbstractC3548RK abstractC3548RKA0F = A0F(this.A01.A09(i4));
                boolean didStructureChange = abstractC3548RKA0F.A0l();
                if (!didStructureChange) {
                    boolean didStructureChange2 = this.A0t.A0I(abstractC3548RKA0F);
                    if (!didStructureChange2) {
                        int iA06 = AbstractC3526Qy.A06(abstractC3548RKA0F);
                        boolean zA0o = abstractC3548RKA0F.A0o(8192);
                        if (!zA0o) {
                            iA06 |= 4096;
                        }
                        C3525Qx c3525QxA0F = this.A05.A0F(this.A0s, abstractC3548RKA0F, iA06, abstractC3548RKA0F.A0R());
                        if (zA0o) {
                            A1k(abstractC3548RKA0F, c3525QxA0F);
                        } else {
                            this.A0t.A0D(abstractC3548RKA0F, c3525QxA0F);
                        }
                    }
                }
            }
            A0X();
        } else {
            A0X();
        }
        A1N();
        A1p(false);
        this.A0s.A04 = 2;
    }

    private void A0M() {
        A1L();
        A1M();
        this.A0s.A04(6);
        this.A00.A07();
        this.A0s.A03 = this.A04.A0B();
        this.A0s.A00 = 0;
        this.A0s.A09 = false;
        this.A06.A1w(this.A0r, this.A0s);
        this.A0s.A0D = false;
        this.A0j = null;
        this.A0s.A0C = this.A0s.A0C && this.A05 != null;
        this.A0s.A04 = 4;
        A1N();
        A1p(false);
    }

    private void A0O() {
        this.A01 = new C3493QQ(new C4559hm(this));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0039  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Code duplicated, block: B:38:0x0097  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    private void A0P() {
        boolean animationTypeSupported;
        boolean animationTypeSupported2;
        boolean z;
        String[] strArr;
        boolean animationTypeSupported3;
        boolean z2;
        String[] strArr2;
        boolean animationTypeSupported4;
        if (this.A0C) {
            this.A00.A09();
            this.A06.A1O(this);
        }
        if (A0z()) {
            this.A00.A08();
        } else {
            this.A00.A07();
        }
        boolean z3 = false;
        boolean z4 = this.A0G || this.A0H;
        C3545RH c3545rh = this.A0s;
        boolean animationTypeSupported5 = this.A0D;
        if (!animationTypeSupported5 || this.A05 == null) {
            animationTypeSupported = false;
            c3545rh.A0C = animationTypeSupported;
            C3545RH c3545rh2 = this.A0s;
            animationTypeSupported2 = this.A0s.A0C;
            if (animationTypeSupported2 && z4) {
                z = this.A0C;
                strArr = A19;
                if (strArr[0].charAt(14) != strArr[6].charAt(14)) {
                    A19[1] = "7Og9vWbqNs6YAv5unyKh2gLlxcE2wi8q";
                    if (!z) {
                        animationTypeSupported3 = A0z();
                        if (animationTypeSupported3) {
                            z3 = true;
                        }
                    }
                }
            }
            c3545rh2.A0B = z3;
            if (A19[1].charAt(14) != '5') {
                A19[7] = "L";
                return;
            } else {
                A19[1] = "0WSVsCNPEcRoxF5nhO8GZMq6S27V0Wk1";
                return;
            }
        }
        boolean animationTypeSupported6 = this.A0C;
        if (animationTypeSupported6 || z4) {
            z2 = this.A0C;
            strArr2 = A19;
            if (strArr2[0].charAt(14) != strArr2[6].charAt(14)) {
                String[] strArr3 = A19;
                strArr3[4] = "vM5jRQNxomoF5LpbXWYyMOkGK7YRN5II";
                strArr3[5] = "jrspPuxDXaGO5llky5gceAJYKeOu5twS";
                if (z2) {
                    animationTypeSupported4 = this.A04.A0M();
                    if (animationTypeSupported4) {
                        animationTypeSupported = false;
                    }
                    c3545rh.A0C = animationTypeSupported;
                    C3545RH c3545rh3 = this.A0s;
                    animationTypeSupported2 = this.A0s.A0C;
                    if (animationTypeSupported2) {
                        z = this.A0C;
                        strArr = A19;
                        if (strArr[0].charAt(14) != strArr[6].charAt(14)) {
                            A19[1] = "7Og9vWbqNs6YAv5unyKh2gLlxcE2wi8q";
                            if (!z) {
                                animationTypeSupported3 = A0z();
                                if (animationTypeSupported3) {
                                    z3 = true;
                                }
                            }
                        }
                    }
                    c3545rh3.A0B = z3;
                    if (A19[1].charAt(14) != '5') {
                        A19[7] = "L";
                        return;
                    } else {
                        A19[1] = "0WSVsCNPEcRoxF5nhO8GZMq6S27V0Wk1";
                        return;
                    }
                }
                animationTypeSupported = true;
                c3545rh.A0C = animationTypeSupported;
                C3545RH c3545rh4 = this.A0s;
                animationTypeSupported2 = this.A0s.A0C;
                if (animationTypeSupported2) {
                    z = this.A0C;
                    strArr = A19;
                    if (strArr[0].charAt(14) != strArr[6].charAt(14)) {
                        A19[1] = "7Og9vWbqNs6YAv5unyKh2gLlxcE2wi8q";
                        if (!z) {
                            animationTypeSupported3 = A0z();
                            if (animationTypeSupported3) {
                                z3 = true;
                            }
                        }
                    }
                }
                c3545rh4.A0B = z3;
                if (A19[1].charAt(14) != '5') {
                    A19[7] = "L";
                    return;
                } else {
                    A19[1] = "0WSVsCNPEcRoxF5nhO8GZMq6S27V0Wk1";
                    return;
                }
            }
        } else {
            boolean animationTypeSupported7 = this.A06.A09;
            if (!animationTypeSupported7) {
                animationTypeSupported = false;
                c3545rh.A0C = animationTypeSupported;
                C3545RH c3545rh5 = this.A0s;
                animationTypeSupported2 = this.A0s.A0C;
                if (animationTypeSupported2) {
                    z = this.A0C;
                    strArr = A19;
                    if (strArr[0].charAt(14) != strArr[6].charAt(14)) {
                        A19[1] = "7Og9vWbqNs6YAv5unyKh2gLlxcE2wi8q";
                        if (!z) {
                            animationTypeSupported3 = A0z();
                            if (animationTypeSupported3) {
                                z3 = true;
                            }
                        }
                    }
                }
                c3545rh5.A0B = z3;
                if (A19[1].charAt(14) != '5') {
                    A19[7] = "L";
                    return;
                } else {
                    A19[1] = "0WSVsCNPEcRoxF5nhO8GZMq6S27V0Wk1";
                    return;
                }
            }
            z2 = this.A0C;
            strArr2 = A19;
            if (strArr2[0].charAt(14) != strArr2[6].charAt(14)) {
                String[] strArr4 = A19;
                strArr4[4] = "vM5jRQNxomoF5LpbXWYyMOkGK7YRN5II";
                strArr4[5] = "jrspPuxDXaGO5llky5gceAJYKeOu5twS";
                if (z2) {
                    animationTypeSupported4 = this.A04.A0M();
                    if (animationTypeSupported4) {
                        animationTypeSupported = false;
                    }
                    c3545rh.A0C = animationTypeSupported;
                    C3545RH c3545rh6 = this.A0s;
                    animationTypeSupported2 = this.A0s.A0C;
                    if (animationTypeSupported2) {
                        z = this.A0C;
                        strArr = A19;
                        if (strArr[0].charAt(14) != strArr[6].charAt(14)) {
                            A19[1] = "7Og9vWbqNs6YAv5unyKh2gLlxcE2wi8q";
                            if (!z) {
                                animationTypeSupported3 = A0z();
                                if (animationTypeSupported3) {
                                    z3 = true;
                                }
                            }
                        }
                    }
                    c3545rh6.A0B = z3;
                    if (A19[1].charAt(14) != '5') {
                        A19[7] = "L";
                        return;
                    } else {
                        A19[1] = "0WSVsCNPEcRoxF5nhO8GZMq6S27V0Wk1";
                        return;
                    }
                }
                animationTypeSupported = true;
                c3545rh.A0C = animationTypeSupported;
                C3545RH c3545rh7 = this.A0s;
                animationTypeSupported2 = this.A0s.A0C;
                if (animationTypeSupported2) {
                    z = this.A0C;
                    strArr = A19;
                    if (strArr[0].charAt(14) != strArr[6].charAt(14)) {
                        A19[1] = "7Og9vWbqNs6YAv5unyKh2gLlxcE2wi8q";
                        if (!z) {
                            animationTypeSupported3 = A0z();
                            if (animationTypeSupported3) {
                                z3 = true;
                            }
                        }
                    }
                }
                c3545rh7.A0B = z3;
                if (A19[1].charAt(14) != '5') {
                    A19[7] = "L";
                    return;
                } else {
                    A19[1] = "0WSVsCNPEcRoxF5nhO8GZMq6S27V0Wk1";
                    return;
                }
            }
        }
        throw new RuntimeException();
    }

    private void A0Q() {
        View viewToFocus;
        if (this.A0o && this.A04 != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() == 131072 && isFocused()) {
                return;
            }
            if (!isFocused()) {
                View focusedChild = getFocusedChild();
                if (A1G && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                    if (this.A01.A05() == 0) {
                        requestFocus();
                        return;
                    }
                } else if (!this.A01.A0K(focusedChild)) {
                    return;
                }
            }
            AbstractC3548RK abstractC3548RKA0E = null;
            long j2 = this.A0s.A08;
            String[] strArr = A19;
            if (strArr[3].charAt(2) == strArr[2].charAt(2)) {
                throw new RuntimeException();
            }
            A19[1] = "kf1DBtA0T6eQEv5OJ0aXYpUf8VxTHKxU";
            if (j2 != -1 && this.A04.A0M()) {
                abstractC3548RKA0E = A0E(this.A0s.A08);
            }
            View viewA0D = null;
            if (abstractC3548RKA0E == null || this.A01.A0K(abstractC3548RKA0E.A0H) || !abstractC3548RKA0E.A0H.hasFocusable()) {
                if (this.A01.A05() > 0) {
                    viewA0D = A0D();
                }
            } else {
                viewA0D = abstractC3548RKA0E.A0H;
            }
            if (viewA0D != null) {
                if (this.A0s.A02 != -1 && (viewToFocus = viewA0D.findViewById(this.A0s.A02)) != null && viewToFocus.isFocusable()) {
                    viewA0D = viewToFocus;
                }
                viewA0D.requestFocus();
            }
        }
    }

    private void A0R() {
        boolean zIsFinished = false;
        if (this.A0a != null) {
            this.A0a.onRelease();
            zIsFinished = this.A0a.isFinished();
        }
        if (this.A0c != null) {
            this.A0c.onRelease();
            boolean needsInvalidate = this.A0c.isFinished();
            zIsFinished |= needsInvalidate;
        }
        if (this.A0b != null) {
            this.A0b.onRelease();
            boolean needsInvalidate2 = this.A0b.isFinished();
            zIsFinished |= needsInvalidate2;
        }
        EdgeEffect edgeEffect = this.A0Z;
        if (A19[1].charAt(14) != '5') {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[4] = "DUYzAwLS0Yoz3H0mkub2uXfjKU6irrBR";
        strArr[5] = "haWSXRvp1CmnNAQfK1MdvfBgKkr4J9QQ";
        if (edgeEffect != null) {
            this.A0Z.onRelease();
            boolean needsInvalidate3 = this.A0Z.isFinished();
            zIsFinished |= needsInvalidate3;
        }
        if (zIsFinished) {
            AbstractC3449Ph.A07(this);
        }
    }

    private void A0S() {
        this.A0s.A08 = -1L;
        this.A0s.A01 = -1;
        this.A0s.A02 = -1;
    }

    private void A0T() {
        if (this.A0Y != null) {
            this.A0Y.clear();
        }
        A1Z(0);
        A0R();
    }

    private void A0U() {
        int iA0M;
        View focusedChild = null;
        if (this.A0o && hasFocus()) {
            AbstractC3518Qq abstractC3518Qq = this.A04;
            String[] strArr = A19;
            if (strArr[3].charAt(2) == strArr[2].charAt(2)) {
                throw new RuntimeException();
            }
            A19[7] = "5";
            if (abstractC3518Qq != null) {
                focusedChild = getFocusedChild();
            }
        }
        AbstractC3548RK abstractC3548RKA0G = focusedChild == null ? null : A0G(focusedChild);
        if (abstractC3548RKA0G == null) {
            A0S();
            return;
        }
        this.A0s.A08 = this.A04.A0M() ? abstractC3548RKA0G.A0Q() : -1L;
        C3545RH c3545rh = this.A0s;
        if (this.A0C) {
            iA0M = -1;
        } else {
            iA0M = abstractC3548RKA0G.A0g() ? abstractC3548RKA0G.A01 : abstractC3548RKA0G.A0M();
        }
        c3545rh.A01 = iA0M;
        C3545RH c3545rh2 = this.A0s;
        View child = abstractC3548RKA0G.A0H;
        c3545rh2.A02 = A0B(child);
    }

    private void A0V() {
        this.A08.A08();
        if (this.A06 != null) {
            this.A06.A0z();
        }
    }

    private final void A0X() {
        int iA06 = this.A01.A06();
        for (int i2 = 0; i2 < iA06; i2++) {
            AbstractC3548RK abstractC3548RKA0F = A0F(this.A01.A0A(i2));
            if (!abstractC3548RKA0F.A0l()) {
                abstractC3548RKA0F.A0S();
            }
        }
        this.A0r.A0K();
    }

    private final void A0Y() {
        AbstractC3518Qq abstractC3518Qq = this.A04;
        String strA0I = A0I(1370, 12, 39);
        if (abstractC3518Qq == null) {
            Log.e(strA0I, A0I(1123, 36, 14));
            return;
        }
        if (this.A06 == null) {
            Log.e(strA0I, A0I(1159, 43, 5));
            return;
        }
        this.A0s.A0A = false;
        if (this.A0s.A04 == 1) {
            A0L();
            this.A06.A1Q(this);
            A0M();
        } else if (this.A00.A0C() || this.A06.A0j() != getWidth() || this.A06.A0Z() != getHeight()) {
            this.A06.A1Q(this);
            A0M();
        } else {
            this.A06.A1Q(this);
        }
        A0N();
    }

    private final void A0Z() {
        int state;
        for (int size = this.A0w.size() - 1; size >= 0; size--) {
            AbstractC3548RK abstractC3548RK = this.A0w.get(size);
            if (abstractC3548RK.A0H.getParent() == this && !abstractC3548RK.A0l() && (state = abstractC3548RK.A02) != -1) {
                AbstractC3449Ph.A09(abstractC3548RK.A0H, state);
                abstractC3548RK.A02 = -1;
            }
        }
        this.A0w.clear();
    }

    private final void A0a() {
        if (this.A0Z != null) {
            return;
        }
        this.A0Z = new EdgeEffect(getContext());
        if (this.A0B) {
            this.A0Z.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            this.A0Z.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    private final void A0b() {
        if (this.A0a != null) {
            return;
        }
        this.A0a = new EdgeEffect(getContext());
        if (this.A0B) {
            this.A0a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            this.A0a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    private final void A0c() {
        if (this.A0b != null) {
            return;
        }
        this.A0b = new EdgeEffect(getContext());
        if (this.A0B) {
            this.A0b.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            return;
        }
        EdgeEffect edgeEffect = this.A0b;
        int measuredHeight = getMeasuredHeight();
        if (A19[7].length() != 1) {
            throw new RuntimeException();
        }
        A19[1] = "cbkJKTW5fmkF4V5GELAthVoRFDIiLVou";
        edgeEffect.setSize(measuredHeight, getMeasuredWidth());
    }

    private final void A0d() {
        if (this.A0c != null) {
            return;
        }
        this.A0c = new EdgeEffect(getContext());
        if (this.A0B) {
            this.A0c.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            return;
        }
        EdgeEffect edgeEffect = this.A0c;
        int measuredWidth = getMeasuredWidth();
        if (A19[7].length() != 1) {
            throw new RuntimeException();
        }
        A19[7] = "g";
        edgeEffect.setSize(measuredWidth, getMeasuredHeight());
    }

    private final void A0e() {
        this.A00 = new C4566ht(new C4558hl(this));
    }

    private final void A0f() {
        this.A0Z = null;
        this.A0c = null;
        this.A0b = null;
        this.A0a = null;
    }

    private final void A0g() {
        int iA06 = this.A01.A06();
        for (int i2 = 0; i2 < iA06; i2++) {
            ((C3531R3) this.A01.A0A(i2).getLayoutParams()).A01 = true;
        }
        this.A0r.A0M();
    }

    private final void A0h() {
        int iA06 = this.A01.A06();
        for (int i2 = 0; i2 < iA06; i2++) {
            AbstractC3548RK abstractC3548RKA0F = A0F(this.A01.A0A(i2));
            if (abstractC3548RKA0F != null && !abstractC3548RKA0F.A0l()) {
                abstractC3548RKA0F.A0Z(6);
            }
        }
        A0g();
        this.A0r.A0N();
    }

    private final void A0i() {
        int iA06 = this.A01.A06();
        for (int i2 = 0; i2 < iA06; i2++) {
            AbstractC3548RK abstractC3548RKA0F = A0F(this.A01.A0A(i2));
            if (!abstractC3548RKA0F.A0l()) {
                abstractC3548RKA0F.A0X();
            }
        }
    }

    private void A0j(float f2, float f3, float f4, float f5) {
        boolean z = false;
        if (f3 < 0.0f) {
            A0b();
            AbstractC3484QH.A00(this.A0a, (-f3) / getWidth(), 1.0f - (f4 / getHeight()));
            z = true;
        } else if (f3 > 0.0f) {
            A0c();
            AbstractC3484QH.A00(this.A0b, f3 / getWidth(), f4 / getHeight());
            z = true;
        }
        if (f5 < 0.0f) {
            A0d();
            AbstractC3484QH.A00(this.A0c, (-f5) / getHeight(), f2 / getWidth());
            z = true;
        } else if (f5 > 0.0f) {
            A0a();
            AbstractC3484QH.A00(this.A0Z, f5 / getHeight(), 1.0f - (f2 / getWidth()));
            z = true;
        }
        if (!z && f3 == 0.0f) {
            if (A19[7].length() != 1) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[0] = "SiLEOgLe53s9c6khchOb02AHEH0FRuha";
            strArr[6] = "5HcivrXWoCNvsp5G28hhclxyRqnGBHgf";
            if (f5 == 0.0f) {
                return;
            }
        }
        AbstractC3449Ph.A07(this);
    }

    private final void A0k(int i2) {
        AbstractC3530R2 abstractC3530R2 = this.A06;
        if (this.A0i != null) {
            this.A0i.A0L(this, i2);
        }
        if (this.A0m != null) {
            for (int size = this.A0m.size() - 1; size >= 0; size--) {
                this.A0m.get(size).A0L(this, i2);
                String[] strArr = A19;
                String str = strArr[3];
                String str2 = strArr[2];
                int iCharAt = str.charAt(2);
                int i3 = str2.charAt(2);
                if (iCharAt == i3) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A19;
                strArr2[4] = "wNO3zluUeYau1J5tWYXYTZjLKyZssSra";
                strArr2[5] = "exw9q3ETOdRCiu35xcNaFWLlKD0n1alI";
            }
        }
    }

    private final void A0l(int i2, int i3, Interpolator interpolator) {
        if (this.A06 == null) {
            Log.e(A0I(1370, 12, 39), A0I(924, 97, C1137R.styleable.ConstraintSet_quantizeMotionSteps));
            return;
        }
        if (this.A0I) {
            return;
        }
        if (!this.A06.A22()) {
            i2 = 0;
        }
        boolean zA23 = this.A06.A23();
        String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new RuntimeException();
        }
        A19[1] = "Tqmtltgb2GXtzJ5pgFbL4REJzj4lGX6R";
        if (!zA23) {
            i3 = 0;
        }
        if (i2 != 0 || i3 != 0) {
            this.A08.A0D(i2, i3, interpolator);
        }
    }

    private void A0m(long j2, AbstractC3548RK abstractC3548RK, AbstractC3548RK abstractC3548RK2) {
        int iA05 = this.A01.A05();
        for (int i2 = 0; i2 < iA05; i2++) {
            AbstractC3548RK other = A0F(this.A01.A09(i2));
            if (other != abstractC3548RK && A0C(other) == j2) {
                AbstractC3518Qq abstractC3518Qq = this.A04;
                String[] strArr = A19;
                String str = strArr[0];
                String str2 = strArr[6];
                int i3 = str.charAt(14);
                int childCount = str2.charAt(14);
                if (i3 == childCount) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A19;
                strArr2[3] = "juwPw4JUkqCkrA4IuHnNpcgybF39inA5";
                strArr2[2] = "0NBeszRVzWCIaFL2RR4GryyHu33afAAx";
                String strA0I = A0I(1, 17, 9);
                if (abstractC3518Qq != null && this.A04.A0M()) {
                    throw new IllegalStateException(A0I(1696, 130, 15) + other + strA0I + abstractC3548RK + A1J());
                }
                throw new IllegalStateException(A0I(1508, 188, 43) + other + strA0I + abstractC3548RK + A1J());
            }
        }
        Log.e(A0I(1370, 12, 39), A0I(1202, 111, 51) + abstractC3548RK2 + A0I(18, 41, C1137R.styleable.ConstraintSet_pivotAnchor) + abstractC3548RK + A1J());
    }

    private void A0n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        int actionIndex2 = this.A0V;
        if (pointerId != actionIndex2) {
            return;
        }
        int i2 = actionIndex == 0 ? 1 : 0;
        int actionIndex3 = motionEvent.getPointerId(i2);
        this.A0V = actionIndex3;
        int actionIndex4 = (int) (motionEvent.getX(i2) + 0.5f);
        this.A0S = actionIndex4;
        this.A0Q = actionIndex4;
        int actionIndex5 = (int) (motionEvent.getY(i2) + 0.5f);
        this.A0T = actionIndex5;
        this.A0R = actionIndex5;
    }

    public static void A0o(View view, Rect rect) {
        C3531R3 c3531r3 = (C3531R3) view.getLayoutParams();
        Rect rect2 = c3531r3.A03;
        rect.set((view.getLeft() - rect2.left) - c3531r3.leftMargin, (view.getTop() - rect2.top) - c3531r3.topMargin, view.getRight() + rect2.right + c3531r3.rightMargin, view.getBottom() + rect2.bottom + c3531r3.bottomMargin);
    }

    private void A0p(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.A0p.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C3531R3) {
            if (A19[7].length() != 1) {
                throw new RuntimeException();
            }
            A19[1] = "MS6MXnJil8kPq55ThMmX90CfGz9dq6Ir";
            C3531R3 c3531r3 = (C3531R3) layoutParams;
            if (!c3531r3.A01) {
                Rect insets = c3531r3.A03;
                this.A0p.left -= insets.left;
                this.A0p.right += insets.right;
                this.A0p.top -= insets.top;
                this.A0p.bottom += insets.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.A0p);
            offsetRectIntoDescendantCoords(view, this.A0p);
        }
        this.A06.A1c(this, view, this.A0p, !this.A0D, view2 == null);
    }

    private void A0q(AbstractC3518Qq abstractC3518Qq, boolean z, boolean z2) {
        if (this.A04 != null) {
            this.A04.A0I(this.A11);
            this.A04.A0L(this);
        }
        if (!z || z2) {
            A1P();
        }
        this.A00.A09();
        AbstractC3518Qq abstractC3518Qq2 = this.A04;
        this.A04 = abstractC3518Qq;
        if (abstractC3518Qq != null) {
            abstractC3518Qq.A0H(this.A11);
        }
        AbstractC3530R2 abstractC3530R2 = this.A06;
        C3538RA c3538ra = this.A0r;
        AbstractC3518Qq oldAdapter = this.A04;
        c3538ra.A0U(abstractC3518Qq2, oldAdapter, z);
        this.A0s.A0D = true;
        A1R();
    }

    private void A0r(AbstractC3548RK abstractC3548RK) {
        View view = abstractC3548RK.A0H;
        boolean z = view.getParent() == this;
        this.A0r.A0Y(A1I(view));
        boolean zA0i = abstractC3548RK.A0i();
        String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[3] = "TiCmVlWwgQ6VOJfmkNnlNNx0y9AVJwa2";
        strArr2[2] = "F9jx2AB6s4oeG4sqKvJHQ7CgJaKOJBvs";
        if (zA0i) {
            this.A01.A0H(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.A01.A0J(view, true);
        } else {
            this.A01.A0E(view);
        }
    }

    public static void A0s(AbstractC3548RK abstractC3548RK) {
        if (abstractC3548RK.A09 != null) {
            C23377M c23377m = abstractC3548RK.A09.get();
            while (c23377m != null) {
                View item = abstractC3548RK.A0H;
                if (c23377m == item) {
                    return;
                }
                Object parent = c23377m.getParent();
                if (parent instanceof View) {
                    c23377m = (View) parent;
                } else {
                    c23377m = null;
                }
            }
            abstractC3548RK.A09 = null;
        }
    }

    private void A0t(AbstractC3548RK abstractC3548RK, AbstractC3548RK abstractC3548RK2, C3525Qx c3525Qx, C3525Qx c3525Qx2, boolean z, boolean z2) {
        abstractC3548RK.A0d(false);
        if (z) {
            A0r(abstractC3548RK);
        }
        if (abstractC3548RK != abstractC3548RK2) {
            if (z2) {
                A0r(abstractC3548RK2);
            }
            abstractC3548RK.A06 = abstractC3548RK2;
            A0r(abstractC3548RK);
            this.A0r.A0Y(abstractC3548RK);
            abstractC3548RK2.A0d(false);
            abstractC3548RK2.A07 = abstractC3548RK;
        }
        if (this.A05.A0R(abstractC3548RK, abstractC3548RK2, c3525Qx, c3525Qx2)) {
            A1O();
        }
    }

    private void A0x(int[] iArr) {
        int iA05 = this.A01.A05();
        if (iA05 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int maxPositionPreLayout = Integer.MAX_VALUE;
        int minPositionPreLayout = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < iA05; i2++) {
            AbstractC3548RK abstractC3548RKA0F = A0F(this.A01.A09(i2));
            if (!abstractC3548RKA0F.A0l()) {
                int count = abstractC3548RKA0F.A0O();
                if (count < maxPositionPreLayout) {
                    maxPositionPreLayout = count;
                }
                if (count > minPositionPreLayout) {
                    minPositionPreLayout = count;
                }
            }
        }
        iArr[0] = maxPositionPreLayout;
        iArr[1] = minPositionPreLayout;
    }

    private boolean A0y() {
        int iA05 = this.A01.A05();
        for (int i2 = 0; i2 < iA05; i2++) {
            AbstractC3548RK abstractC3548RKA0F = A0F(this.A01.A09(i2));
            if (abstractC3548RKA0F != null && !abstractC3548RKA0F.A0l()) {
                boolean zA0j = abstractC3548RKA0F.A0j();
                int i3 = A19[7].length();
                if (i3 != 1) {
                    throw new RuntimeException();
                }
                A19[1] = "5mbkKWt0hxhFdp5kkkYwhOUPEf80vh4b";
                if (zA0j) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean A0z() {
        return this.A05 != null && this.A06.A24();
    }

    private boolean A11(int i2, int i3) {
        A0x(this.A14);
        return (this.A14[0] == i2 && this.A14[1] == i3) ? false : true;
    }

    private final boolean A12(int i2, int i3) {
        if (this.A06 == null) {
            Log.e(A0I(1370, 12, 39), A0I(651, 89, 110));
            return false;
        }
        if (this.A0I) {
            return false;
        }
        boolean zA22 = this.A06.A22();
        boolean canScroll = this.A06.A23();
        if (!zA22 || Math.abs(i2) < this.A0y) {
            i2 = 0;
        }
        if (!canScroll || Math.abs(i3) < this.A0y) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        float f2 = i2;
        String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[3] = "ReiKJWWZUipUJIZKdTnth4O85KfdJzFe";
        strArr2[2] = "VE75UicjWgpvWTg6gZrF4R3BQlGAuEv7";
        boolean canScrollHorizontal = dispatchNestedPreFling(f2, i3);
        if (!canScrollHorizontal) {
            boolean canScrollVertical = zA22 || canScroll;
            dispatchNestedFling(i2, i3, canScrollVertical);
            if (this.A0g != null) {
                boolean canScrollHorizontal2 = this.A0g.A0B(i2, i3);
                if (canScrollHorizontal2) {
                    return true;
                }
            }
            if (canScrollVertical) {
                int i4 = 0;
                if (zA22) {
                    i4 = 0 | 1;
                }
                if (canScroll) {
                    i4 |= 2;
                }
                A1u(i4, 1);
                int nestedScrollAxis = -this.A0x;
                int iMax = Math.max(nestedScrollAxis, Math.min(i2, this.A0x));
                int nestedScrollAxis2 = -this.A0x;
                this.A08.A09(iMax, Math.max(nestedScrollAxis2, Math.min(i3, this.A0x)));
                return true;
            }
        }
        return false;
    }

    private final boolean A13(int consumedX, int consumedY, MotionEvent motionEvent) {
        int i2 = 0;
        int i3 = 0;
        int iA1f = 0;
        int iA1g = 0;
        A1K();
        if (this.A04 != null) {
            A1L();
            A1M();
            AbstractC3412P4.A01(A0I(1361, 9, 51));
            A1j(this.A0s);
            if (consumedX != 0) {
                iA1f = this.A06.A1f(consumedX, this.A0r, this.A0s);
                i2 = consumedX - iA1f;
            }
            if (consumedY != 0) {
                iA1g = this.A06.A1g(consumedY, this.A0r, this.A0s);
                i3 = consumedY - iA1g;
            }
            AbstractC3412P4.A00();
            A1Q();
            A1N();
            A1p(false);
        }
        if (!this.A0v.isEmpty()) {
            invalidate();
        }
        if (A1v(iA1f, iA1g, i2, i3, this.A17, 0)) {
            this.A0S -= this.A17[0];
            this.A0T -= this.A17[1];
            if (motionEvent != null) {
                motionEvent.offsetLocation(this.A17[0], this.A17[1]);
            }
            int[] iArr = this.A15;
            iArr[0] = iArr[0] + this.A17[0];
            int[] iArr2 = this.A15;
            iArr2[1] = iArr2[1] + this.A17[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && !AbstractC3430PN.A00(motionEvent, 8194)) {
                A0j(motionEvent.getX(), i2, motionEvent.getY(), i3);
            }
            A1b(consumedX, consumedY);
        }
        if (iA1f != 0 || iA1g != 0) {
            A1d(iA1f, iA1g);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (iA1f == 0 && iA1g == 0) ? false : true;
    }

    private boolean A14(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (0 != 0) {
            if (action == 0) {
                this.A0h = null;
            } else {
                if (action == 3 || action == 1) {
                    this.A0h = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int action2 = this.A13.size();
            if (0 < action2) {
                this.A13.get(0);
                throw new NullPointerException(A0I(1973, 21, 46));
            }
            return false;
        }
        return false;
    }

    private boolean A15(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.A0h = null;
        }
        int action2 = this.A13.size();
        if (0 < action2) {
            this.A13.get(0);
            throw new NullPointerException(A0I(1973, 21, 46));
        }
        return false;
    }

    private boolean A16(View view, View view2, int i2) {
        int absHorizontal;
        if (view2 == null || view2 == this) {
            return false;
        }
        if (view == null) {
            return true;
        }
        if (i2 == 2 || i2 == 1) {
            boolean z = this.A06.A0c() == 1;
            boolean rtl = i2 == 2;
            if (rtl ^ z) {
                absHorizontal = 66;
            } else {
                absHorizontal = 17;
            }
            if (A17(view, view2, absHorizontal)) {
                return true;
            }
            if (i2 == 2) {
                return A17(view, view2, 130);
            }
            String[] strArr = A19;
            String str = strArr[0];
            String str2 = strArr[6];
            int iCharAt = str.charAt(14);
            int absHorizontal2 = str2.charAt(14);
            if (iCharAt == absHorizontal2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[3] = "Ohwc1756uTT166t9FAn6vugoi7AJfc0c";
            strArr2[2] = "5J1fVRqaKzeN2XjLKxMOi2uJr88KN7aK";
            return A17(view, view2, 33);
        }
        return A17(view, view2, i2);
    }

    private boolean A17(View view, View view2, int i2) {
        this.A0p.set(0, 0, view.getWidth(), view.getHeight());
        this.A0z.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.A0p);
        offsetDescendantRectToMyCoords(view2, this.A0z);
        switch (i2) {
            case 17:
                return (this.A0p.right > this.A0z.right || this.A0p.left >= this.A0z.right) && this.A0p.left > this.A0z.left;
            case 33:
                return (this.A0p.bottom > this.A0z.bottom || this.A0p.top >= this.A0z.bottom) && this.A0p.top > this.A0z.top;
            case 66:
                return (this.A0p.left < this.A0z.left || this.A0p.right <= this.A0z.left) && this.A0p.right < this.A0z.right;
            case 130:
                if (this.A0p.top >= this.A0z.top) {
                    Rect rect = this.A0p;
                    String[] strArr = A19;
                    if (strArr[0].charAt(14) == strArr[6].charAt(14)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A19;
                    strArr2[0] = "mOrDrwN7qo6GKKMJ6G3US4mLdoh2ETut";
                    strArr2[6] = "IWP4ZqDDS1db9pl2oaFrT53kmkniKDfl";
                    if (rect.bottom > this.A0z.top) {
                        return false;
                    }
                }
                return this.A0p.bottom < this.A0z.bottom;
            default:
                throw new IllegalArgumentException(A0I(1844, 37, 85) + i2 + A1J());
        }
    }

    private final boolean A18(AccessibilityEvent accessibilityEvent) {
        if (A1s()) {
            int iA00 = 0;
            if (accessibilityEvent != null) {
                iA00 = AbstractC3467Q0.A00(accessibilityEvent);
            }
            if (iA00 == 0) {
                iA00 = 0;
            }
            int type = this.A0P;
            this.A0P = type | iA00;
            return true;
        }
        return false;
    }

    public final int A1B(View view) {
        AbstractC3548RK holder = A0F(view);
        if (holder != null) {
            return holder.A0O();
        }
        return -1;
    }

    public final int A1C(AbstractC3548RK abstractC3548RK) {
        if (abstractC3548RK.A0o(524) || !abstractC3548RK.A0e()) {
            return -1;
        }
        return this.A00.A05(abstractC3548RK.A03);
    }

    public final Rect A1D(View view) {
        C3531R3 c3531r3 = (C3531R3) view.getLayoutParams();
        if (!c3531r3.A01) {
            return c3531r3.A03;
        }
        if (this.A0s.A07()) {
            boolean zA01 = c3531r3.A01();
            if (A19[7].length() != 1) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[0] = "RfoZAoElzPqJKaUzlOfJ9JNtEQb3r4Q3";
            strArr[6] = "IQCpaJiMXE8HuUJ13qJ8cPkLmMUIWIfQ";
            if (zA01 || c3531r3.A03()) {
                return c3531r3.A03;
            }
        }
        Rect rect = c3531r3.A03;
        rect.set(0, 0, 0, 0);
        if (0 < this.A0v.size()) {
            this.A0p.set(0, 0, 0, 0);
            this.A0v.get(0);
            throw new NullPointerException(A0I(1881, 14, 112));
        }
        c3531r3.A01 = false;
        return rect;
    }

    public final View A1E(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this) {
            boolean z = parent instanceof View;
            if (A19[7].length() == 1) {
                String[] strArr = A19;
                strArr[3] = "J9ctOc3byknHaiu8XEstSyzOEyaFCb7S";
                strArr[2] = "QOdc34hkOqsfpHVshThNFi46vThKtwkT";
                if (!z) {
                    break;
                }
                view = parent;
                parent = view.getParent();
            } else {
                throw new RuntimeException();
            }
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final AbstractC3548RK A1F(int i2) {
        if (this.A0C) {
            return null;
        }
        int iA06 = this.A01.A06();
        AbstractC3548RK hidden = null;
        for (int i3 = 0; i3 < iA06; i3++) {
            AbstractC3548RK abstractC3548RKA0F = A0F(this.A01.A0A(i3));
            if (abstractC3548RKA0F != null && !abstractC3548RKA0F.A0g()) {
                int childCount = A1C(abstractC3548RKA0F);
                if (childCount != i2) {
                    continue;
                } else if (this.A01.A0K(abstractC3548RKA0F.A0H)) {
                    hidden = abstractC3548RKA0F;
                } else {
                    return abstractC3548RKA0F;
                }
            }
        }
        return hidden;
    }

    public final AbstractC3548RK A1G(int i2) {
        return A1H(i2, false);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[SYNTHETIC] */
    public final AbstractC3548RK A1H(int i2, boolean z) {
        int iA06 = this.A01.A06();
        AbstractC3548RK abstractC3548RK = null;
        for (int i3 = 0; i3 < iA06; i3++) {
            AbstractC3548RK holder = A0F(this.A01.A0A(i3));
            if (holder != null && !holder.A0g()) {
                if (z) {
                    int childCount = holder.A03;
                    if (childCount != i2) {
                        continue;
                    } else if (this.A01.A0K(holder.A0H)) {
                        abstractC3548RK = holder;
                    } else {
                        return holder;
                    }
                } else {
                    int iA0O = holder.A0O();
                    if (A19[7].length() != 1) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A19;
                    strArr[0] = "DSFgyC6FMCN69yIuBkrrEJFcLDPwcLMd";
                    strArr[6] = "g7Jt9Xl9pBIMUQLD2e0MPBENYY0SKHj8";
                    if (iA0O != i2) {
                        continue;
                    } else if (this.A01.A0K(holder.A0H)) {
                        abstractC3548RK = holder;
                    } else {
                        return holder;
                    }
                }
            }
        }
        return abstractC3548RK;
    }

    public final AbstractC3548RK A1I(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return A0F(view);
        }
        throw new IllegalArgumentException(A0I(1826, 5, 41) + view + A0I(98, 26, 38) + this);
    }

    public final String A1J() {
        return A0I(0, 1, 23) + super.toString() + A0I(169, 10, 87) + this.A04 + A0I(189, 9, 86) + this.A06 + A0I(179, 10, C1137R.styleable.ConstraintSet_quantizeMotionSteps) + getContext();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    public final void A1K() {
        boolean z = this.A0D;
        String strA0I = A0I(1313, 17, 63);
        if (!z || this.A0C) {
            AbstractC3412P4.A01(strA0I);
            A0Y();
            AbstractC3412P4.A00();
            return;
        }
        if (!this.A00.A0B()) {
            return;
        }
        C4566ht c4566ht = this.A00;
        String[] strArr = A19;
        if (strArr[0].charAt(14) != strArr[6].charAt(14)) {
            A19[1] = "cmOs2ngvAj3urs5G14jP2yS9Pox4PNUI";
            if (c4566ht.A0D(4) && !this.A00.A0D(11)) {
                AbstractC3412P4.A01(A0I(1341, 20, 44));
                A1L();
                A1M();
                this.A00.A08();
                if (!this.A0J) {
                    boolean zA0y = A0y();
                    String[] strArr2 = A19;
                    if (strArr2[3].charAt(2) != strArr2[2].charAt(2)) {
                        A19[7] = "a";
                        if (zA0y) {
                            A0Y();
                        } else {
                            this.A00.A06();
                        }
                    } else if (zA0y) {
                        A0Y();
                    } else {
                        this.A00.A06();
                    }
                }
                A1p(true);
                if (A19[7].length() == 1) {
                    String[] strArr3 = A19;
                    strArr3[3] = "rQ0jmwctWvIOIioOAlLcoJlzUDkcSysz";
                    strArr3[2] = "N5NmD2ge71vhim7LrdB83J9iYpsRCLkc";
                    A1N();
                    AbstractC3412P4.A00();
                    return;
                }
            } else {
                if (this.A00.A0B()) {
                    AbstractC3412P4.A01(strA0I);
                    A0Y();
                    AbstractC3412P4.A00();
                    return;
                }
                return;
            }
        }
        throw new RuntimeException();
    }

    public final void A1L() {
        this.A0O++;
        if (this.A0O == 1 && !this.A0I) {
            this.A0J = false;
        }
    }

    public final void A1M() {
        this.A0U++;
    }

    public final void A1N() {
        A1o(true);
    }

    public final void A1O() {
        if (!this.A0K && this.A0F) {
            AbstractC3449Ph.A0D(this, this.A0k);
            this.A0K = true;
        }
    }

    public final void A1P() {
        if (this.A05 != null) {
            this.A05.A0H();
        }
        if (this.A06 != null) {
            this.A06.A1K(this.A0r);
            this.A06.A1I(this.A0r);
        }
        this.A0r.A0P();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    public final void A1Q() {
        int iA05 = this.A01.A05();
        for (int left = 0; left < iA05; left++) {
            View view = this.A01.A09(left);
            AbstractC3548RK abstractC3548RKA1I = A1I(view);
            if (abstractC3548RKA1I != null && abstractC3548RKA1I.A07 != null) {
                View shadowingView = abstractC3548RKA1I.A07.A0H;
                int left2 = view.getLeft();
                int top = view.getTop();
                int count = shadowingView.getLeft();
                if (left2 == count) {
                    int count2 = shadowingView.getTop();
                    if (top != count2) {
                        int i2 = shadowingView.getWidth();
                        int count3 = shadowingView.getHeight();
                        shadowingView.layout(left2, top, i2 + left2, count3 + top);
                    }
                } else {
                    int i3 = shadowingView.getWidth();
                    int count4 = shadowingView.getHeight();
                    shadowingView.layout(left2, top, i3 + left2, count4 + top);
                }
            }
        }
    }

    public final void A1R() {
        this.A0C = true;
        A0h();
    }

    public final void A1S() {
        if (this.A0m != null) {
            this.A0m.clear();
        }
    }

    public final void A1T() {
        setScrollState(0);
        A0V();
    }

    public final void A1U(int i2) {
        if (this.A06 == null) {
            return;
        }
        this.A06.A1r(i2);
        awakenScrollBars();
    }

    public final void A1V(int i2) {
        int iA05 = this.A01.A05();
        for (int i3 = 0; i3 < iA05; i3++) {
            this.A01.A09(i3).offsetLeftAndRight(i2);
        }
    }

    public final void A1W(int i2) {
        int iA05 = this.A01.A05();
        for (int i3 = 0; i3 < iA05; i3++) {
            this.A01.A09(i3).offsetTopAndBottom(i2);
        }
    }

    public final void A1X(int i2) {
        if (this.A0I) {
            return;
        }
        A1T();
        if (this.A06 == null) {
            Log.e(A0I(1370, 12, 39), A0I(740, 94, 12));
        } else {
            this.A06.A1r(i2);
            awakenScrollBars();
        }
    }

    public final void A1Y(int i2) {
        if (this.A0I) {
            return;
        }
        if (this.A06 == null) {
            Log.e(A0I(1370, 12, 39), A0I(924, 97, C1137R.styleable.ConstraintSet_quantizeMotionSteps));
        } else {
            this.A06.A1z(this, this.A0s, i2);
        }
    }

    public final void A1Z(int i2) {
        getScrollingChildHelper().A03(i2);
    }

    public final void A1a(int i2, int i3) {
        if (i2 < 0) {
            A0b();
            this.A0a.onAbsorb(-i2);
        } else if (i2 > 0) {
            A0c();
            this.A0b.onAbsorb(i2);
        }
        if (i3 < 0) {
            A0d();
            this.A0c.onAbsorb(-i3);
        } else if (i3 > 0) {
            A0a();
            String[] strArr = A19;
            if (strArr[3].charAt(2) == strArr[2].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[0] = "Kq4j6FG7zvFvwW4vRC6zLjapwuK9WjkP";
            strArr2[6] = "2Xczf707pBdLKDJ5NVr429bRaPx31sq0";
            this.A0Z.onAbsorb(i3);
        }
        if (i2 != 0 || i3 != 0) {
            AbstractC3449Ph.A07(this);
        }
    }

    public final void A1b(int i2, int i3) {
        boolean zIsFinished = false;
        if (this.A0a != null) {
            boolean needsInvalidate = this.A0a.isFinished();
            if (!needsInvalidate && i2 > 0) {
                this.A0a.onRelease();
                zIsFinished = this.A0a.isFinished();
            }
        }
        if (this.A0b != null) {
            boolean needsInvalidate2 = this.A0b.isFinished();
            if (!needsInvalidate2 && i2 < 0) {
                this.A0b.onRelease();
                boolean needsInvalidate3 = this.A0b.isFinished();
                zIsFinished |= needsInvalidate3;
            }
        }
        EdgeEffect edgeEffect = this.A0c;
        String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[0] = "hv7OcE78gRUWXZIBx5R2VkE7fvviVqXd";
        strArr2[6] = "NFDR0brV2INlGIZxgJE16fqqg8Mw1YR1";
        if (edgeEffect != null) {
            boolean needsInvalidate4 = this.A0c.isFinished();
            if (!needsInvalidate4 && i3 > 0) {
                this.A0c.onRelease();
                boolean needsInvalidate5 = this.A0c.isFinished();
                zIsFinished |= needsInvalidate5;
            }
        }
        if (this.A0Z != null) {
            boolean needsInvalidate6 = this.A0Z.isFinished();
            if (!needsInvalidate6 && i3 < 0) {
                this.A0Z.onRelease();
                boolean needsInvalidate7 = this.A0Z.isFinished();
                zIsFinished |= needsInvalidate7;
            }
        }
        if (zIsFinished) {
            AbstractC3449Ph.A07(this);
        }
    }

    public final void A1c(int i2, int i3) {
        int iA02 = AbstractC3530R2.A02(i2, getPaddingLeft() + getPaddingRight(), AbstractC3449Ph.A03(this));
        int paddingTop = getPaddingTop();
        int width = getPaddingBottom();
        int i4 = paddingTop + width;
        int width2 = AbstractC3449Ph.A02(this);
        setMeasuredDimension(iA02, AbstractC3530R2.A02(i3, i4, width2));
    }

    public final void A1d(int i2, int i3) {
        this.A0N++;
        int scrollY = getScrollX();
        int scrollX = getScrollY();
        onScrollChanged(scrollY, scrollX, scrollY, scrollX);
        if (this.A0i != null) {
            this.A0i.A0M(this, i2, i3);
        }
        if (this.A0m != null) {
            for (int scrollY2 = this.A0m.size() - 1; scrollY2 >= 0; scrollY2--) {
                this.A0m.get(scrollY2).A0M(this, i2, i3);
            }
        }
        this.A0N--;
    }

    public final void A1e(int i2, int i3) {
        A0l(i2, i3, null);
    }

    public final void A1f(View view) {
        int cnt;
        A0F(view);
        AbstractC3518Qq abstractC3518Qq = this.A04;
        if (this.A0l != null && (cnt = this.A0l.size() - 1) >= 0) {
            this.A0l.get(cnt);
            throw new NullPointerException(A0I(1895, 27, 67));
        }
    }

    public final void A1g(View view) {
        A0F(view);
        AbstractC3518Qq abstractC3518Qq = this.A04;
        if (this.A0l != null) {
            List<RecyclerView.OnChildAttachStateChangeListener> list = this.A0l;
            String[] strArr = A19;
            if (strArr[0].charAt(14) == strArr[6].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[4] = "Ju6zs0r9efzkyV7LXILEyjCEKckziCxk";
            strArr2[5] = "xtNh9wS4idAx9IKZVnTROlGUKiewUtpM";
            int size = list.size() - 1;
            if (size >= 0) {
                this.A0l.get(size);
                throw new NullPointerException(A0I(1922, 29, 40));
            }
        }
    }

    public final void A1h(AbstractC3535R7 abstractC3535R7) {
        if (this.A0m == null) {
            this.A0m = new ArrayList();
        }
        this.A0m.add(abstractC3535R7);
    }

    public final void A1i(AbstractC3535R7 abstractC3535R7) {
        if (this.A0m != null) {
            List<AbstractC3535R7> list = this.A0m;
            if (A19[7].length() != 1) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[3] = "sOoQs3X4dS853ZpkNjZwaQi0LuRyF7Hc";
            strArr[2] = "YQ1nAsE5QOTVY911s6plJSU2g6bxQXkh";
            list.remove(abstractC3535R7);
        }
    }

    public final void A1j(C3545RH c3545rh) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.A08.A01;
            c3545rh.A06 = overScroller.getFinalX() - overScroller.getCurrX();
            c3545rh.A07 = overScroller.getFinalY() - overScroller.getCurrY();
        } else {
            c3545rh.A06 = 0;
            c3545rh.A07 = 0;
        }
    }

    public final void A1k(AbstractC3548RK abstractC3548RK, C3525Qx c3525Qx) {
        abstractC3548RK.A0a(0, 8192);
        if (this.A0s.A0E) {
            boolean zA0j = abstractC3548RK.A0j();
            if (A19[1].charAt(14) != '5') {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[0] = "SaiGfOi3tH24E262D5BQaQwya8XqTMou";
            strArr[6] = "ZNTGZnAbt95d53NkHsORUVfXJkKP7CFB";
            if (zA0j && !abstractC3548RK.A0g() && !abstractC3548RK.A0l()) {
                this.A0t.A08(A0C(abstractC3548RK), abstractC3548RK);
            }
        }
        this.A0t.A0F(abstractC3548RK, c3525Qx);
    }

    public final void A1l(AbstractC3548RK abstractC3548RK, C3525Qx c3525Qx, C3525Qx c3525Qx2) {
        abstractC3548RK.A0d(false);
        if (this.A05.A0O(abstractC3548RK, c3525Qx, c3525Qx2)) {
            A1O();
        }
    }

    public final void A1m(AbstractC3548RK abstractC3548RK, C3525Qx c3525Qx, C3525Qx c3525Qx2) {
        A0r(abstractC3548RK);
        abstractC3548RK.A0d(false);
        if (this.A05.A0P(abstractC3548RK, c3525Qx, c3525Qx2)) {
            A1O();
        }
    }

    public final void A1n(String str) {
        if (A1s()) {
            if (str == null) {
                throw new IllegalStateException(A0I(574, 77, 103) + A1J());
            }
            throw new IllegalStateException(str);
        }
        if (this.A0N > 0) {
            Log.w(A0I(1370, 12, 39), A0I(294, 280, 93), new IllegalStateException(A0I(0, 0, C1137R.styleable.ConstraintSet_transitionPathRotate) + A1J()));
        }
    }

    public final void A1o(boolean z) {
        this.A0U--;
        if (this.A0U < 1) {
            String[] strArr = A19;
            if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[4] = "VgsuIcXtp0FweJIL4JjeIuHXK9vcALAx";
            strArr2[5] = "AVlqmC2HCSNpSWUvoITeU6SwKS4OLgxH";
            this.A0U = 0;
            if (z) {
                A0K();
                A0Z();
            }
        }
    }

    public final void A1p(boolean z) {
        if (this.A0O < 1) {
            this.A0O = 1;
        }
        if (!z) {
            this.A0J = false;
        }
        if (this.A0O == 1) {
            if (z && this.A0J) {
                boolean z2 = this.A0I;
                if (A19[1].charAt(14) != '5') {
                    throw new RuntimeException();
                }
                A19[7] = "k";
                if (!z2 && this.A06 != null && this.A04 != null) {
                    A0Y();
                }
            }
            if (!this.A0I) {
                this.A0J = false;
            }
        }
        this.A0O--;
    }

    public final boolean A1q() {
        return this.A10 != null && this.A10.isEnabled();
    }

    public final boolean A1r() {
        if (this.A0D) {
            boolean z = this.A0C;
            String[] strArr = A19;
            if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                throw new RuntimeException();
            }
            A19[7] = "K";
            if (!z && !this.A00.A0B()) {
                return false;
            }
        }
        return true;
    }

    public final boolean A1s() {
        return this.A0U > 0;
    }

    public final boolean A1t(int i2) {
        return getScrollingChildHelper().A09(i2);
    }

    public final boolean A1u(int i2, int i3) {
        return getScrollingChildHelper().A0B(i2, i3);
    }

    public final boolean A1v(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return getScrollingChildHelper().A0D(i2, i3, i4, i5, iArr, i6);
    }

    public final boolean A1w(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().A0F(i2, i3, iArr, iArr2, i4);
    }

    public final boolean A1x(View view) {
        A1L();
        boolean zA0L = this.A01.A0L(view);
        if (zA0L) {
            AbstractC3548RK viewHolder = A0F(view);
            this.A0r.A0Y(viewHolder);
            this.A0r.A0X(viewHolder);
        }
        boolean removed = !zA0L;
        A1p(removed);
        return zA0L;
    }

    public final boolean A1y(AbstractC3548RK abstractC3548RK) {
        return this.A05 == null || this.A05.A0S(abstractC3548RK, abstractC3548RK.A0R());
    }

    public final boolean A1z(AbstractC3548RK abstractC3548RK, int i2) {
        if (A1s()) {
            abstractC3548RK.A02 = i2;
            this.A0w.add(abstractC3548RK);
            return false;
        }
        AbstractC3449Ph.A09(abstractC3548RK.A0H, i2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> views, int i2, int i3) {
        if (this.A06 == null || !this.A06.A1e(this, views, i2, i3)) {
            super.addFocusables(views, i2, i3);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C3531R3) && this.A06.A1a((C3531R3) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        if (this.A06 != null && this.A06.A22()) {
            return this.A06.A1h(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        if (this.A06 != null && this.A06.A22()) {
            return this.A06.A1i(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        if (this.A06 != null && this.A06.A22()) {
            return this.A06.A1j(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        if (this.A06 == null || !this.A06.A23()) {
            return 0;
        }
        AbstractC3530R2 abstractC3530R2 = this.A06;
        String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[3] = "OwG4fgggKq7icgaaysnCa6zBD064f6Q4";
        strArr2[2] = "UojYTgk0EBa2sJrZvEgoz68xRxvrHNBO";
        return abstractC3530R2.A1k(this.A0s);
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        if (this.A06 != null && this.A06.A23()) {
            return this.A06.A1l(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        if (this.A06 != null && this.A06.A23()) {
            return this.A06.A1m(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return getScrollingChildHelper().A08(f2, f3, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().A07(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().A0E(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().A0C(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        dispatchThawSelfOnly(container);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
        dispatchFreezeSelfOnly(container);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0199 A[DONT_INVERT, PHI: r5
  0x0199: PHI (r5v4 'padding' int) = (r5v3 'padding' int), (r5v3 'padding' int), (r5v7 'padding' int) binds: [B:49:0x00e1, B:53:0x0108, B:74:0x018f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x019b  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:86:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        ArrayList<RecyclerView.ItemDecoration> arrayList;
        int iCharAt;
        int count;
        int count2;
        super.draw(canvas);
        int size = this.A0v.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.A0v.get(i2);
            String[] strArr = A19;
            String str = strArr[4];
            String str2 = strArr[5];
            int i3 = str.charAt(24);
            int count3 = str2.charAt(24);
            if (i3 != count3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[4] = "gQsc8vIJl1UGYmi9aNFbwaJOKb8pUSAm";
            strArr2[5] = "oC19iGbHbrFzAvfkH6l2iab1KXGTXLUm";
        }
        int padding = 0;
        if (this.A0a != null && !this.A0a.isFinished()) {
            int restore = canvas.save();
            int paddingBottom = this.A0B ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            int count4 = getHeight();
            canvas.translate((-count4) + paddingBottom, 0.0f);
            padding = (this.A0a == null || !this.A0a.draw(canvas)) ? 0 : 1;
            canvas.restoreToCount(restore);
        }
        if (this.A0c != null && !this.A0c.isFinished()) {
            int restore2 = canvas.save();
            if (this.A0B) {
                int count5 = getPaddingLeft();
                float f2 = count5;
                int count6 = getPaddingTop();
                canvas.translate(f2, count6);
            }
            int count7 = (this.A0c == null || !this.A0c.draw(canvas)) ? 0 : 1;
            padding |= count7;
            canvas.restoreToCount(restore2);
        }
        if (this.A0b != null && !this.A0b.isFinished()) {
            int iSave = canvas.save();
            int restore3 = getWidth();
            int paddingTop = this.A0B ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            int count8 = -paddingTop;
            float f3 = count8;
            int count9 = -restore3;
            canvas.translate(f3, count9);
            int count10 = (this.A0b == null || !this.A0b.draw(canvas)) ? 0 : 1;
            padding |= count10;
            canvas.restoreToCount(iSave);
        }
        if (this.A0Z == null) {
            if (padding == 0) {
                arrayList = this.A0v;
                String[] strArr3 = A19;
                String str3 = strArr3[3];
                String str4 = strArr3[2];
                iCharAt = str3.charAt(2);
                count = str4.charAt(2);
                if (iCharAt != count) {
                    A19[7] = "H";
                    count2 = arrayList.size();
                    if (count2 > 0) {
                        padding = 1;
                    }
                }
            }
            if (padding != 0) {
                AbstractC3449Ph.A07(this);
                return;
            }
            return;
        }
        EdgeEffect edgeEffect = this.A0Z;
        String[] strArr4 = A19;
        String str5 = strArr4[3];
        String str6 = strArr4[2];
        int iCharAt2 = str5.charAt(2);
        int count11 = str6.charAt(2);
        if (iCharAt2 == count11) {
            throw new RuntimeException();
        }
        String[] strArr5 = A19;
        strArr5[3] = "pc4oxgQcBgvDQxlVEd8f0MQKJjQuaCtL";
        strArr5[2] = "7OrxE1K6SAZd49hN5xk5t3PbvmNxieuR";
        if (!edgeEffect.isFinished()) {
            int iSave2 = canvas.save();
            canvas.rotate(180.0f);
            if (this.A0B) {
                int count12 = getWidth();
                int i4 = -count12;
                if (A19[1].charAt(14) == '5') {
                    String[] strArr6 = A19;
                    strArr6[3] = "kFmiqaRapActNLLOarRDIccZMtzlwzdY";
                    strArr6[2] = "xQ3lH2Su3SoDIim9C11VlEm3b0Af7gFe";
                    int count13 = getPaddingRight();
                    float f4 = i4 + count13;
                    int count14 = getHeight();
                    int i5 = -count14;
                    int count15 = getPaddingBottom();
                    canvas.translate(f4, i5 + count15);
                }
            } else {
                int count16 = getWidth();
                float f5 = -count16;
                int count17 = getHeight();
                canvas.translate(f5, -count17);
            }
            padding |= (this.A0Z == null || !this.A0Z.draw(canvas)) ? 0 : 1;
            String[] strArr7 = A19;
            String str7 = strArr7[4];
            String str8 = strArr7[5];
            int iCharAt3 = str7.charAt(24);
            int count18 = str8.charAt(24);
            if (iCharAt3 == count18) {
                A19[1] = "WzyBKHPzEJ8PH456mJZxotJJ1epXOuMr";
                canvas.restoreToCount(iSave2);
                if (padding == 0 && this.A05 != null) {
                    arrayList = this.A0v;
                    String[] strArr8 = A19;
                    String str9 = strArr8[3];
                    String str10 = strArr8[2];
                    iCharAt = str9.charAt(2);
                    count = str10.charAt(2);
                    if (iCharAt != count) {
                        A19[7] = "H";
                        count2 = arrayList.size();
                        if (count2 > 0 && this.A05.A0M()) {
                            padding = 1;
                        }
                    }
                }
                if (padding != 0) {
                    AbstractC3449Ph.A07(this);
                    return;
                }
                return;
            }
        } else {
            if (padding == 0) {
                arrayList = this.A0v;
                String[] strArr9 = A19;
                String str11 = strArr9[3];
                String str12 = strArr9[2];
                iCharAt = str11.charAt(2);
                count = str12.charAt(2);
                if (iCharAt != count) {
                    A19[7] = "H";
                    count2 = arrayList.size();
                    if (count2 > 0) {
                        padding = 1;
                    }
                }
            }
            if (padding != 0) {
                AbstractC3449Ph.A07(this);
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:22:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:31:0x009b  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00db  */
    /* JADX WARN: Code duplicated, block: B:59:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00df  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:72:0x0115 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x0116  */
    /* JADX WARN: Code duplicated, block: B:75:0x0125  */
    /* JADX WARN: Code duplicated, block: B:77:0x012b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0141  */
    /* JADX WARN: Code duplicated, block: B:93:0x0179 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x017a  */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0165, code lost:
    
        if (r4 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016b, code lost:
    
        return super.focusSearch(r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x016c, code lost:
    
        if (r4 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x016f, code lost:
    
        A0p(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0172, code lost:
    
        return r11;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r11, int r12) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C23377M.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (this.A06 != null) {
            return this.A06.A1q();
        }
        throw new IllegalStateException(A0I(1475, 33, 59) + A1J());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (this.A06 != null) {
            return this.A06.A0x(getContext(), attributeSet);
        }
        throw new IllegalStateException(A0I(1475, 33, 59) + A1J());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (this.A06 != null) {
            return this.A06.A0y(layoutParams);
        }
        throw new IllegalStateException(A0I(1475, 33, 59) + A1J());
    }

    public AbstractC3518Qq getAdapter() {
        return this.A04;
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.A06 != null) {
            return this.A06.A0X();
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        if (0 == 0) {
            return super.getChildDrawingOrder(i2, i3);
        }
        throw new NullPointerException(A0I(1951, 22, 16));
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.A0B;
    }

    public C4549hb getCompatAccessibilityDelegate() {
        return this.A09;
    }

    public AbstractC3526Qy getItemAnimator() {
        return this.A05;
    }

    public AbstractC3530R2 getLayoutManager() {
        return this.A06;
    }

    public int getMaxFlingVelocity() {
        return this.A0x;
    }

    public int getMinFlingVelocity() {
        return this.A0y;
    }

    public long getNanoTime() {
        if (A1E) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC3533R5 getOnFlingListener() {
        return this.A0g;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.A0o;
    }

    public C3537R9 getRecycledViewPool() {
        return this.A0r.A0H();
    }

    public int getScrollState() {
        return this.A0W;
    }

    private C3432PP getScrollingChildHelper() {
        if (this.A0d == null) {
            this.A0d = new C3432PP(this);
        }
        return this.A0d;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().A05();
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.A0F;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().A06();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0U = 0;
        boolean z = true;
        this.A0F = true;
        if (!this.A0D || isLayoutRequested()) {
            z = false;
        }
        this.A0D = z;
        if (this.A06 != null) {
            this.A06.A1P(this);
        }
        this.A0K = false;
        if (A1E) {
            this.A03 = RunnableC3506Qd.A07.get();
            RunnableC3506Qd runnableC3506Qd = this.A03;
            String[] strArr = A19;
            if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[4] = "C0ehsoOGkHH4Yo5xO6QtGogVKP7uVX9B";
            strArr2[5] = "76wleFUxgdDs3CwSlu7sJ9vYK22l9wck";
            if (runnableC3506Qd == null) {
                this.A03 = new RunnableC3506Qd();
                Display displayA04 = AbstractC3449Ph.A04(this);
                float f2 = 60.0f;
                if (!isInEditMode() && displayA04 != null) {
                    float refreshRate = displayA04.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                this.A03.A00 = (long) (1.0E9f / f2);
                RunnableC3506Qd.A07.set(this.A03);
            }
            this.A03.A09(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.A05 != null) {
            this.A05.A0H();
        }
        A1T();
        this.A0F = false;
        if (this.A06 != null) {
            this.A06.A1S(this, this.A0r);
        }
        this.A0w.clear();
        removeCallbacks(this.A0k);
        this.A0t.A07();
        if (A1E && this.A03 != null) {
            this.A03.A0A(this);
            this.A03 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.A0v.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.A0v.get(i2);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float vScroll;
        float axisValue;
        if (this.A06 == null || this.A0I) {
            return false;
        }
        int action = motionEvent.getAction();
        String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[4] = "SqJdYhJCWRyNUdRTYMkhoX0xKlvJTIzq";
        strArr2[5] = "dLZEV46oohOd8c5dsstKZ2mmKWuZBEje";
        if (action == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.A06.A23()) {
                    vScroll = -motionEvent.getAxisValue(9);
                } else {
                    vScroll = 0.0f;
                }
                if (this.A06.A22()) {
                    axisValue = motionEvent.getAxisValue(10);
                } else {
                    axisValue = 0.0f;
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.A06.A23()) {
                    vScroll = -axisValue;
                    axisValue = 0.0f;
                } else if (this.A06.A22()) {
                    vScroll = 0.0f;
                } else {
                    vScroll = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                vScroll = 0.0f;
                axisValue = 0.0f;
            }
            if (vScroll != 0.0f || axisValue != 0.0f) {
                float hScroll = this.A0L;
                A13((int) (hScroll * axisValue), (int) (this.A0M * vScroll), motionEvent);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A0I) {
            return false;
        }
        if (A15(motionEvent)) {
            A0J();
            return true;
        }
        if (this.A06 == null) {
            return false;
        }
        boolean zA22 = this.A06.A22();
        boolean startScroll = this.A06.A23();
        if (this.A0Y == null) {
            this.A0Y = VelocityTracker.obtain();
        }
        this.A0Y.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        switch (actionMasked) {
            case 0:
                boolean canScrollHorizontally = this.A0n;
                if (canScrollHorizontally) {
                    this.A0n = false;
                }
                this.A0V = motionEvent.getPointerId(0);
                int x = (int) (motionEvent.getX() + 0.5f);
                this.A0S = x;
                this.A0Q = x;
                int y2 = (int) (motionEvent.getY() + 0.5f);
                this.A0T = y2;
                this.A0R = y2;
                if (this.A0W == 2) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    String[] strArr = A19;
                    if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                        String[] strArr2 = A19;
                        strArr2[4] = "M5UY6PcxpnTLVPVued5fx0ZBKGPv0DD6";
                        strArr2[5] = "epX9q1DqtqLsT3WNVlKQ1OkRKfkr8qoW";
                        setScrollState(1);
                    } else {
                        String[] strArr3 = A19;
                        strArr3[3] = "mz0Spg27ESm6n2CBfiNuhIq158jNl3XC";
                        strArr3[2] = "LXDJrUlN0pxLgDChp5qc6Quk8NcN491z";
                        setScrollState(1);
                    }
                }
                int[] iArr = this.A15;
                this.A15[1] = 0;
                iArr[0] = 0;
                int i2 = 0;
                if (zA22) {
                    i2 = 0 | 1;
                }
                if (startScroll) {
                    i2 |= 2;
                }
                A1u(i2, 0);
                break;
            case 1:
                this.A0Y.clear();
                A1Z(0);
                break;
            case 2:
                int iFindPointerIndex = motionEvent.findPointerIndex(this.A0V);
                if (iFindPointerIndex >= 0) {
                    int index = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.A0W != 1) {
                        int i3 = index - this.A0Q;
                        int dy = y3 - this.A0R;
                        int dx = 0;
                        if (zA22) {
                            int x2 = Math.abs(i3);
                            int actionIndex2 = this.A0X;
                            if (A19[1].charAt(14) != '5') {
                                throw new RuntimeException();
                            }
                            A19[1] = "KTspDQ6S4I31ss5nDId9o94814z1kYXz";
                            if (x2 > actionIndex2) {
                                this.A0S = index;
                                dx = 1;
                            }
                        }
                        if (startScroll && Math.abs(dy) > this.A0X) {
                            this.A0T = y3;
                            dx = 1;
                        }
                        if (dx != 0) {
                            setScrollState(1);
                        }
                    }
                } else {
                    Log.e(A0I(1370, 12, 39), A0I(1063, 46, 66) + this.A0V + A0I(124, 45, 102));
                    return false;
                }
                break;
            case 3:
                A0J();
                break;
            case 5:
                this.A0V = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.A0S = x3;
                this.A0Q = x3;
                int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.A0T = y4;
                this.A0R = y4;
                break;
            case 6:
                A0n(motionEvent);
                break;
        }
        return this.A0W == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        AbstractC3412P4.A01(A0I(1330, 11, 34));
        A0Y();
        AbstractC3412P4.A00();
        this.A0D = true;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        if (this.A06 == null) {
            A1c(i2, i3);
            return;
        }
        boolean z = this.A06.A06;
        String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[3] = "7ZSgCyrANqbSR0bOMUGXtewOYYl5EtQ7";
        strArr2[2] = "EtNqJr4QhL0ASxhb1XseUjRgOzTVtavV";
        int heightMode = 0;
        if (z) {
            int mode = View.MeasureSpec.getMode(i2);
            int widthMode = View.MeasureSpec.getMode(i3);
            if (mode == 1073741824 && widthMode == 1073741824) {
                heightMode = 1;
            }
            this.A06.A1L(this.A0r, this.A0s, i2, i3);
            if (heightMode != 0 || this.A04 == null) {
                return;
            }
            int widthMode2 = this.A0s.A04;
            if (widthMode2 == 1) {
                A0L();
            }
            this.A06.A13(i2, i3);
            this.A0s.A0A = true;
            A0M();
            this.A06.A14(i2, i3);
            if (this.A06.A21()) {
                AbstractC3530R2 abstractC3530R2 = this.A06;
                int widthMode3 = getMeasuredWidth();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(widthMode3, BasicMeasure.EXACTLY);
                int widthMode4 = getMeasuredHeight();
                abstractC3530R2.A13(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(widthMode4, BasicMeasure.EXACTLY));
                this.A0s.A0A = true;
                A0M();
                if (A19[1].charAt(14) != '5') {
                    this.A06.A14(i2, i3);
                    return;
                }
                String[] strArr3 = A19;
                strArr3[3] = "2scJF4Z4oabFWuCQusikCL010xDMrwfy";
                strArr3[2] = "adt4S0RTiAMMvoy66yYvZbK2iUPJlD04";
                this.A06.A14(i2, i3);
                return;
            }
            return;
        }
        if (this.A0E) {
            this.A06.A1L(this.A0r, this.A0s, i2, i3);
            return;
        }
        if (this.A0A) {
            A1L();
            A1M();
            A0P();
            A1N();
            if (this.A0s.A0B) {
                this.A0s.A09 = true;
            } else {
                this.A00.A07();
                this.A0s.A09 = false;
            }
            this.A0A = false;
            A1p(false);
        } else if (this.A0s.A0B) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        if (this.A04 != null) {
            this.A0s.A03 = this.A04.A0B();
        } else {
            this.A0s.A03 = 0;
        }
        A1L();
        this.A06.A1L(this.A0r, this.A0s, i2, i3);
        A1p(false);
        this.A0s.A09 = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (A1s()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof WrappedParcelable)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            classLoader = getContext().getClassLoader();
        }
        Parcelable state = ((WrappedParcelable) parcelable).unwrap(classLoader);
        if (!(state instanceof RecyclerView$SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        this.A0j = (RecyclerView$SavedState) state;
        super.onRestoreInstanceState(this.A0j.A02());
        if (this.A06 != null && this.A0j.A00 != null) {
            this.A06.A1u(this.A0j.A00);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        RecyclerView$SavedState recyclerView$SavedState = new RecyclerView$SavedState(super.onSaveInstanceState());
        RecyclerView$SavedState state = this.A0j;
        if (state != null) {
            RecyclerView$SavedState state2 = this.A0j;
            recyclerView$SavedState.A03(state2);
        } else if (this.A06 != null) {
            recyclerView$SavedState.A00 = this.A06.A1n();
        } else {
            recyclerView$SavedState.A00 = null;
        }
        return new WrappedParcelable(recyclerView$SavedState);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            A0f();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.A0I || this.A0n) {
            return false;
        }
        if (A14(motionEvent)) {
            A0J();
            return true;
        }
        if (this.A06 == null) {
            return false;
        }
        boolean zA22 = this.A06.A22();
        boolean eventAddedToVelocityTracker = this.A06.A23();
        if (this.A0Y == null) {
            this.A0Y = VelocityTracker.obtain();
        }
        boolean canScrollVertically = false;
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.A15;
            this.A15[1] = 0;
            iArr[0] = 0;
        }
        float f4 = this.A15[0];
        if (A19[1].charAt(14) == '5') {
            String[] strArr = A19;
            strArr[4] = "SmtdwAgCAQ3d1YsOl1YESVhzKEqu7eKK";
            strArr[5] = "J6uBjvS6jISF4fo0G11W738KKcsSrsAN";
            motionEventObtain.offsetLocation(f4, this.A15[1]);
            switch (actionMasked) {
                case 0:
                    this.A0V = motionEvent.getPointerId(0);
                    int dy = (int) (motionEvent.getX() + 0.5f);
                    this.A0S = dy;
                    this.A0Q = dy;
                    int dx = (int) (motionEvent.getY() + 0.5f);
                    this.A0T = dx;
                    this.A0R = dx;
                    int nestedScrollAxis = 0;
                    if (zA22) {
                        nestedScrollAxis = 0 | 1;
                    }
                    if (eventAddedToVelocityTracker) {
                        nestedScrollAxis |= 2;
                    }
                    A1u(nestedScrollAxis, 0);
                    if (!canScrollVertically) {
                        this.A0Y.addMovement(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    return true;
                case 1:
                    this.A0Y.addMovement(motionEventObtain);
                    canScrollVertically = true;
                    this.A0Y.computeCurrentVelocity(1000, this.A0x);
                    if (zA22) {
                        f2 = -this.A0Y.getXVelocity(this.A0V);
                    } else {
                        f2 = 0.0f;
                    }
                    if (eventAddedToVelocityTracker) {
                        f3 = -this.A0Y.getYVelocity(this.A0V);
                    } else {
                        f3 = 0.0f;
                    }
                    if (A19[1].charAt(14) == '5') {
                        String[] strArr2 = A19;
                        strArr2[0] = "jpSzY3cN6Yd9mC426DHJqMOwyRQLyhoD";
                        strArr2[6] = "NqO1hqm0aSOLr2VmuYam7NnyHk2GnoAg";
                        if ((f2 == 0.0f && f3 == 0.0f) || !A12((int) f2, (int) f3)) {
                            setScrollState(0);
                        }
                        A0T();
                        if (!canScrollVertically) {
                            this.A0Y.addMovement(motionEventObtain);
                        }
                        motionEventObtain.recycle();
                        return true;
                    }
                    break;
                case 2:
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.A0V);
                    if (iFindPointerIndex < 0) {
                        Log.e(A0I(1370, 12, 39), A0I(1063, 46, 66) + this.A0V + A0I(124, 45, 102));
                        return false;
                    }
                    int x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    int actionIndex2 = this.A0S - x;
                    int dy2 = this.A0T - y2;
                    if (A1w(actionIndex2, dy2, this.A16, this.A17, 0)) {
                        actionIndex2 -= this.A16[0];
                        dy2 -= this.A16[1];
                        motionEventObtain.offsetLocation(this.A17[0], this.A17[1]);
                        int[] iArr2 = this.A15;
                        iArr2[0] = iArr2[0] + this.A17[0];
                        int[] iArr3 = this.A15;
                        iArr3[1] = iArr3[1] + this.A17[1];
                    }
                    if (this.A0W != 1) {
                        boolean z = false;
                        if (zA22 && Math.abs(actionIndex2) > this.A0X) {
                            if (actionIndex2 > 0) {
                                actionIndex2 -= this.A0X;
                            } else {
                                actionIndex2 += this.A0X;
                            }
                            z = true;
                        }
                        if (eventAddedToVelocityTracker && Math.abs(dy2) > this.A0X) {
                            if (dy2 > 0) {
                                dy2 -= this.A0X;
                            } else {
                                dy2 += this.A0X;
                            }
                            z = true;
                        }
                        if (z) {
                            setScrollState(1);
                        }
                    }
                    if (this.A0W == 1) {
                        this.A0S = x - this.A17[0];
                        this.A0T = y2 - this.A17[1];
                        if (A13(zA22 ? actionIndex2 : 0, eventAddedToVelocityTracker ? dy2 : 0, motionEventObtain)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        if (this.A03 != null && (actionIndex2 != 0 || dy2 != 0)) {
                            this.A03.A0B(this, actionIndex2, dy2);
                        }
                    }
                    if (!canScrollVertically) {
                        this.A0Y.addMovement(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    return true;
                case 3:
                    A0J();
                    if (!canScrollVertically) {
                        this.A0Y.addMovement(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    return true;
                case 4:
                default:
                    if (!canScrollVertically) {
                        this.A0Y.addMovement(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    return true;
                case 5:
                    this.A0V = motionEvent.getPointerId(actionIndex);
                    int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.A0S = x2;
                    this.A0Q = x2;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.A0T = y3;
                    this.A0R = y3;
                    if (!canScrollVertically) {
                        this.A0Y.addMovement(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    return true;
                case 6:
                    A0n(motionEvent);
                    if (!canScrollVertically) {
                        this.A0Y.addMovement(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    return true;
            }
        }
        throw new RuntimeException();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        AbstractC3548RK abstractC3548RKA0F = A0F(view);
        if (abstractC3548RKA0F != null) {
            if (abstractC3548RKA0F.A0i()) {
                abstractC3548RKA0F.A0V();
            } else if (!abstractC3548RKA0F.A0l()) {
                throw new IllegalArgumentException(A0I(219, 75, 84) + abstractC3548RKA0F + A1J());
            }
        }
        view.clearAnimation();
        A1g(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.A06.A1d(this, this.A0s, view, view2) && view2 != null) {
            A0p(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.A06.A1b(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.A13.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<InterfaceC3534R6> arrayList = this.A13;
            int i3 = A19[7].length();
            if (i3 != 1) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[3] = "ALuvCB3Uxfwb6USvRsTQeejOaKQGJDVI";
            strArr[2] = "eH5kVfmfggziqkhtmDEzLdVkGL1u4682";
            arrayList.get(i2);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.A0O == 0) {
            boolean z = this.A0I;
            String[] strArr = A19;
            if (strArr[0].charAt(14) == strArr[6].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[0] = "DQNG7v2eQntUoXmxdvl3JfddX2pbwEnJ";
            strArr2[6] = "9dlsUD8r2K7vneFeWRut3F36hDYz7ROo";
            if (!z) {
                super.requestLayout();
                return;
            }
        }
        this.A0J = true;
    }

    @Override // android.view.View
    public final void scrollBy(int i2, int i3) {
        if (this.A06 == null) {
            Log.e(A0I(1370, 12, 39), A0I(834, 90, 48));
            return;
        }
        if (this.A0I) {
            return;
        }
        boolean zA22 = this.A06.A22();
        boolean zA23 = this.A06.A23();
        if (zA22 || zA23) {
            String[] strArr = A19;
            if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                throw new RuntimeException();
            }
            A19[1] = "hukuWuX8c8ikYD5Zh6axQSjgAUqwSCKd";
            if (!zA22) {
                i2 = 0;
            }
            A13(i2, zA23 ? i3 : 0, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        Log.w(A0I(1370, 12, 39), A0I(1382, 93, 57));
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (A18(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C4549hb c4549hb) {
        this.A09 = c4549hb;
        AbstractC3449Ph.A0B(this, this.A09);
    }

    public void setAdapter(AbstractC3518Qq abstractC3518Qq) {
        setLayoutFrozen(false);
        A0q(abstractC3518Qq, false, true);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC3521Qt interfaceC3521Qt) {
        if (interfaceC3521Qt == null) {
            return;
        }
        this.A0e = interfaceC3521Qt;
        setChildrenDrawingOrderEnabled(0 != 0);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.A0B) {
            A0f();
        }
        this.A0B = z;
        super.setClipToPadding(z);
        if (this.A0D) {
            requestLayout();
        }
    }

    public void setHasFixedSize(boolean z) {
        this.A0E = z;
    }

    public void setItemAnimator(AbstractC3526Qy abstractC3526Qy) {
        if (this.A05 != null) {
            this.A05.A0H();
            this.A05.A0J(null);
        }
        this.A05 = abstractC3526Qy;
        if (this.A05 != null) {
            this.A05.A0J(this.A0f);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.A0r.A0Q(i2);
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.A0I) {
            A1n(A0I(PointerIconCompat.TYPE_GRABBING, 42, 1));
            if (!z) {
                this.A0I = false;
                if (this.A0J && this.A06 != null && this.A04 != null) {
                    requestLayout();
                }
                this.A0J = false;
                return;
            }
            long now = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0));
            String[] strArr = A19;
            if (strArr[0].charAt(14) == strArr[6].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[0] = "JdEcOawzhGoMi7SJTaKu9jXFd9l8G1Qn";
            strArr2[6] = "ngxMbpV1qHapbkXJW6JrwI2187obRSoG";
            this.A0I = true;
            this.A0n = true;
            A1T();
        }
    }

    public void setLayoutManager(AbstractC3530R2 abstractC3530R2) {
        if (abstractC3530R2 == this.A06) {
            return;
        }
        A1T();
        if (this.A06 != null) {
            if (this.A05 != null) {
                this.A05.A0H();
            }
            this.A06.A1K(this.A0r);
            this.A06.A1I(this.A0r);
            this.A0r.A0P();
            if (this.A0F) {
                this.A06.A1S(this, this.A0r);
            }
            this.A06.A1R(null);
            this.A06 = null;
        } else {
            this.A0r.A0P();
        }
        this.A01.A0B();
        this.A06 = abstractC3530R2;
        if (abstractC3530R2 != null) {
            if (abstractC3530R2.A03 == null) {
                this.A06.A1R(this);
                if (this.A0F) {
                    this.A06.A1P(this);
                }
            } else {
                throw new IllegalArgumentException(A0I(1109, 14, 42) + abstractC3530R2 + A0I(59, 39, 124) + abstractC3530R2.A03.A1J());
            }
        }
        this.A0r.A0O();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().A04(z);
    }

    public void setOnFlingListener(AbstractC3533R5 abstractC3533R5) {
        this.A0g = abstractC3533R5;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC3535R7 abstractC3535R7) {
        this.A0i = abstractC3535R7;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.A0o = z;
    }

    public void setRecycledViewPool(C3537R9 c3537r9) {
        this.A0r.A0V(c3537r9);
    }

    public void setRecyclerListener(InterfaceC3539RB interfaceC3539RB) {
        this.A07 = interfaceC3539RB;
    }

    public void setScrollState(int i2) {
        if (i2 == this.A0W) {
            return;
        }
        this.A0W = i2;
        if (i2 != 2) {
            A0V();
        }
        A0k(i2);
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i2) {
            case 0:
                break;
            case 1:
                this.A0X = viewConfiguration.getScaledPagingTouchSlop();
                return;
            default:
                Log.w(A0I(1370, 12, 39), A0I(1994, 47, 98) + i2 + A0I(198, 21, 88));
                break;
        }
        this.A0X = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC3546RI abstractC3546RI) {
        this.A0r.A0W(abstractC3546RI);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().A0A(i2);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().A02();
    }
}
