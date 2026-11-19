package com.instagram.common.viewpoint.core;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bl */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2592Bl<K, V> extends C4905nh<K, V>.Itr<Map.Entry<K, V>> {
    public final /* synthetic */ C4905nh A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2592Bl(final C4905nh this$0) {
        super(this$0, null);
        this.A00 = this$0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Map.Entry<K, V> A03(int entry) {
        return new C2589Bi(this.A00, entry);
    }
}
