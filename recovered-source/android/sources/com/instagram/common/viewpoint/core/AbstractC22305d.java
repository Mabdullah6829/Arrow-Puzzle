package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5d */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC22305d {
    public static void A00(InterfaceC5000pF interfaceC5000pF) {
        if (interfaceC5000pF != null) {
            try {
                interfaceC5000pF.close();
            } catch (IOException unused) {
            }
        }
    }
}
