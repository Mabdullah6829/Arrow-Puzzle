package com.google.firebase.sessions;

import java.util.UUID;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes2.dex */
public final class UuidGeneratorImpl implements UuidGenerator {
    public static final UuidGeneratorImpl INSTANCE = new UuidGeneratorImpl();

    private UuidGeneratorImpl() {
    }

    @Override // com.google.firebase.sessions.UuidGenerator
    public UUID next() {
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC6452k.m12180d(uuidRandomUUID, "randomUUID(...)");
        return uuidRandomUUID;
    }
}
