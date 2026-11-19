package com.instagram.common.viewpoint.core;

import com.google.common.collect.ParametricNullness;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.BL */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2566BL<K, V> extends AbstractC19871d<Map.Entry<K, V>, K> {
    public C2566BL(Iterator backingIterator) {
        super(backingIterator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC19871d
    @ParametricNullness
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final K A01(Map.Entry<K, V> entry) {
        return entry.getKey();
    }
}
