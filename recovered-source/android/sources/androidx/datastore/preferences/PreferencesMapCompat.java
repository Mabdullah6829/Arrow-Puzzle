package androidx.datastore.preferences;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class PreferencesMapCompat {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final PreferencesProto.PreferenceMap readFrom(InputStream input) throws CorruptionException {
            AbstractC6452k.m12181e(input, "input");
            try {
                PreferencesProto.PreferenceMap from = PreferencesProto.PreferenceMap.parseFrom(input);
                AbstractC6452k.m12180d(from, "{\n                Prefer…From(input)\n            }");
                return from;
            } catch (InvalidProtocolBufferException e) {
                throw new CorruptionException("Unable to parse preferences proto.", e);
            }
        }

        private Companion() {
        }
    }
}
