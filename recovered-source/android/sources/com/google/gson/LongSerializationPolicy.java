package com.google.gson;

import com.google.gson.internal.bind.TypeAdapters;

/* JADX INFO: loaded from: classes2.dex */
public enum LongSerializationPolicy {
    DEFAULT { // from class: com.google.gson.LongSerializationPolicy.1
        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l2) {
            return l2 == null ? JsonNull.INSTANCE : new JsonPrimitive(l2);
        }

        @Override // com.google.gson.LongSerializationPolicy
        public TypeAdapter<Number> typeAdapter() {
            return TypeAdapters.LONG;
        }
    },
    STRING { // from class: com.google.gson.LongSerializationPolicy.2
        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l2) {
            return l2 == null ? JsonNull.INSTANCE : new JsonPrimitive(l2.toString());
        }

        @Override // com.google.gson.LongSerializationPolicy
        public TypeAdapter<Number> typeAdapter() {
            return TypeAdapters.LONG_AS_STRING;
        }
    };

    public abstract JsonElement serialize(Long l2);

    public abstract TypeAdapter<Number> typeAdapter();
}
