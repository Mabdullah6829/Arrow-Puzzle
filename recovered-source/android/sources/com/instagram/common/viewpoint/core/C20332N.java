package com.instagram.common.viewpoint.core;

import com.google.common.collect.ParametricNullness;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2N */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C20332N extends AbstractC20312L<K, V>.WrappedList implements RandomAccess {
    public final /* synthetic */ AbstractC20312L A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2N != com.google.common.collect.AbstractMapBasedMultimap<K, V>$RandomAccessWrappedList */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lp != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    /* JADX WARN: Incorrect inner types in method signature: (TK;Ljava/util/List<TV;>;Lcom/facebook/ads/redexgen/X/2L<TK;TV;>.WrappedCollection;)V */
    public C20332N(@ParametricNullness final AbstractC20312L this$0, @CheckForNull Object key, List delegate, C4802lp ancestor) {
        super(this$0, key, delegate, ancestor);
        this.A00 = this$0;
    }
}
