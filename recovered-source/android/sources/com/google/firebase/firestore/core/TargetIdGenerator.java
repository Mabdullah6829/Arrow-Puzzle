package com.google.firebase.firestore.core;

import com.google.firebase.firestore.util.Assert;

/* JADX INFO: loaded from: classes2.dex */
public class TargetIdGenerator {
    private static final int QUERY_CACHE_ID = 0;
    private static final int RESERVED_BITS = 1;
    private static final int SYNC_ENGINE_ID = 1;
    private int generatorId;
    private int nextId;

    public TargetIdGenerator(int i2, int i3) {
        Assert.hardAssert((i2 & 1) == i2, "Generator ID %d contains more than %d reserved bits", Integer.valueOf(i2), 1);
        this.generatorId = i2;
        seek(i3);
    }

    public static TargetIdGenerator forSyncEngine() {
        return new TargetIdGenerator(1, 1);
    }

    public static TargetIdGenerator forTargetCache(int i2) {
        TargetIdGenerator targetIdGenerator = new TargetIdGenerator(0, i2);
        targetIdGenerator.nextId();
        return targetIdGenerator;
    }

    private void seek(int i2) {
        Assert.hardAssert((i2 & 1) == this.generatorId, "Cannot supply target ID from different generator ID", new Object[0]);
        this.nextId = i2;
    }

    public int nextId() {
        int i2 = this.nextId;
        this.nextId = i2 + 2;
        return i2;
    }
}
