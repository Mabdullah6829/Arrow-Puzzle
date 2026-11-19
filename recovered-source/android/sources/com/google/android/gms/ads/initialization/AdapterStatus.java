package com.google.android.gms.ads.initialization;

/* JADX INFO: loaded from: classes.dex */
public interface AdapterStatus {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {

        /* JADX INFO: renamed from: s */
        public static final /* synthetic */ State[] f3028s = {new State("NOT_READY", 0), new State("READY", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        State EF5;

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f3028s.clone();
        }
    }
}
