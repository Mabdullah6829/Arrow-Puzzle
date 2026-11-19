package com.instagram.common.viewpoint.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import androidx.constraintlayout.widget.C1137R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.P2 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3410P2 {
    public static C3410P2 A05;
    public static byte[] A06;
    public static final Object A07;
    public final Context A00;
    public final Handler A01;
    public final HashMap<BroadcastReceiver, ArrayList<C3409P1>> A04 = new HashMap<>();
    public final HashMap<String, ArrayList<C3409P1>> A03 = new HashMap<>();
    public final ArrayList<C3408P0> A02 = new ArrayList<>();

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 63);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{11, 11, 109, 66, 71, 95, 78, 89, 11, 79, 66, 79, 11, 69, 68, 95, 11, 70, 74, 95, 72, 67, 17, 11, 95, 95, 57, 22, 19, 11, 26, 13, 95, 18, 30, 11, 28, 23, 26, 27, 94, 95, 95, 18, 30, 11, 28, 23, 66, 79, 7, 42, 101, 108, 42, 99, 100, 126, 111, 100, 126, 42, 37, 118, 102, 109, 96, 104, 96, 37, 86, 116, 99, 126, 120, 121, 55, 123, 126, 100, 99, 45, 55, 84, 119, 123, 121, 116, 90, 106, 119, 121, 124, 123, 121, 107, 108, 85, 121, 118, 121, 127, 125, 106, 24, 52, 33, 54, 61, 60, 59, 50, 117, 52, 50, 52, 60, 59, 38, 33, 117, 51, 60, 57, 33, 48, 39, 117, 24, 47, 57, 37, 38, 60, 35, 36, 45, 106, 62, 51, 58, 47, 106, 56, 58, 45, 48, 54, 55, 78, 76, 89, 72, 74, 66, 95, 84, 12, 9, 28, 9, 72, 69, 76, 89, 91, 64, 69, 64, 65, 89, 64, 14, 92, 75, 79, 93, 65, 64};
    }

    static {
        A03();
        A07 = new Object();
    }

    public C3410P2(Context context) {
        this.A00 = context;
        this.A01 = new HandlerC3407Oz(this, context.getMainLooper());
    }

    public static C3410P2 A00(Context context) {
        C3410P2 c3410p2;
        synchronized (A07) {
            if (A05 == null) {
                A05 = new C3410P2(context.getApplicationContext());
            }
            c3410p2 = A05;
        }
        return c3410p2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C3408P0[] c3408p0Arr;
        while (true) {
            synchronized (this.A04) {
                int size = this.A02.size();
                if (size > 0) {
                    c3408p0Arr = new C3408P0[size];
                    this.A02.toArray(c3408p0Arr);
                    this.A02.clear();
                } else {
                    return;
                }
            }
            for (C3408P0 c3408p0 : c3408p0Arr) {
                int j2 = c3408p0.A01.size();
                for (int nbr = 0; nbr < j2; nbr++) {
                    C3409P1 c3409p1 = c3408p0.A01.get(nbr);
                    if (!c3409p1.A01) {
                        c3409p1.A02.onReceive(this.A00, c3408p0.A00);
                    }
                }
            }
        }
    }

    public final void A05(BroadcastReceiver broadcastReceiver) {
        synchronized (this.A04) {
            ArrayList<C3409P1> arrayListRemove = this.A04.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                C3409P1 c3409p1 = arrayListRemove.get(size);
                c3409p1.A01 = true;
                for (int j2 = 0; j2 < c3409p1.A03.countActions(); j2++) {
                    String action = c3409p1.A03.getAction(j2);
                    ArrayList<C3409P1> arrayList = this.A03.get(action);
                    if (arrayList != null) {
                        int i2 = arrayList.size();
                        for (int i3 = i2 - 1; i3 >= 0; i3--) {
                            C3409P1 c3409p2 = arrayList.get(i3);
                            if (c3409p2.A02 == broadcastReceiver) {
                                c3409p2.A01 = true;
                                arrayList.remove(i3);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.A03.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final void A06(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.A04) {
            C3409P1 c3409p1 = new C3409P1(intentFilter, broadcastReceiver);
            ArrayList<C3409P1> arrayList = this.A04.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.A04.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c3409p1);
            for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                String action = intentFilter.getAction(i2);
                ArrayList<C3409P1> arrayList2 = this.A03.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.A03.put(action, arrayList2);
                }
                arrayList2.add(c3409p1);
            }
        }
    }

    public final boolean A07(Intent intent) {
        String strA01;
        synchronized (this.A04) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.A00.getContentResolver());
            Uri data = intent.getData();
            String action2 = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean debug = (intent.getFlags() & 8) != 0;
            if (debug) {
                StringBuilder sb = new StringBuilder();
                String type = A01(128, 15, C1137R.styleable.ConstraintSet_pivotAnchor);
                StringBuilder sbAppend = sb.append(type).append(strResolveTypeIfNeeded);
                String type2 = A01(62, 8, 58);
                StringBuilder sbAppend2 = sbAppend.append(type2).append(action2);
                String type3 = A01(51, 11, 53);
                sbAppend2.append(type3).append(intent).toString();
            }
            HashMap<String, ArrayList<C3409P1>> map = this.A03;
            String type4 = intent.getAction();
            ArrayList<C3409P1> arrayList = map.get(type4);
            if (arrayList != null) {
                if (debug) {
                    StringBuilder sb2 = new StringBuilder();
                    String type5 = A01(70, 13, 40);
                    sb2.append(type5).append(arrayList).toString();
                }
                ArrayList arrayList2 = null;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    C3409P1 c3409p1 = arrayList.get(i2);
                    if (debug) {
                        StringBuilder sb3 = new StringBuilder();
                        String type6 = A01(104, 24, 106);
                        sb3.append(type6).append(c3409p1.A03).toString();
                    }
                    if (!c3409p1.A00) {
                        int iMatch = c3409p1.A03.match(action, strResolveTypeIfNeeded, action2, data, categories, A01(83, 21, 39));
                        if (iMatch >= 0) {
                            if (debug) {
                                String str = A01(24, 27, 64) + Integer.toHexString(iMatch);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(c3409p1);
                            c3409p1.A00 = true;
                        } else if (debug) {
                            switch (iMatch) {
                                case -4:
                                    strA01 = A01(149, 8, 18);
                                    break;
                                case -3:
                                    strA01 = A01(143, 6, 102);
                                    break;
                                case -2:
                                    strA01 = A01(157, 4, 87);
                                    break;
                                case -1:
                                    strA01 = A01(161, 4, 3);
                                    break;
                                default:
                                    strA01 = A01(165, 14, 17);
                                    break;
                            }
                            String str2 = A01(0, 24, 20) + strA01;
                        }
                    }
                }
                if (arrayList2 != null) {
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        ((C3409P1) arrayList2.get(i3)).A00 = false;
                    }
                    this.A02.add(new C3408P0(intent, arrayList2));
                    if (!this.A01.hasMessages(1)) {
                        this.A01.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
