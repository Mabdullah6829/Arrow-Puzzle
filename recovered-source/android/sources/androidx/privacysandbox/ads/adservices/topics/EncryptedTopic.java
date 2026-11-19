package androidx.privacysandbox.ads.adservices.topics;

import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0271e0;
import p091y0.AbstractC6582l;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFeatures.Ext11OptIn
public final class EncryptedTopic {
    private final byte[] encapsulatedKey;
    private final byte[] encryptedTopic;
    private final String keyIdentifier;

    public EncryptedTopic(byte[] encryptedTopic, String keyIdentifier, byte[] encapsulatedKey) {
        AbstractC6452k.m12181e(encryptedTopic, "encryptedTopic");
        AbstractC6452k.m12181e(keyIdentifier, "keyIdentifier");
        AbstractC6452k.m12181e(encapsulatedKey, "encapsulatedKey");
        this.encryptedTopic = encryptedTopic;
        this.keyIdentifier = keyIdentifier;
        this.encapsulatedKey = encapsulatedKey;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncryptedTopic)) {
            return false;
        }
        EncryptedTopic encryptedTopic = (EncryptedTopic) obj;
        return Arrays.equals(this.encryptedTopic, encryptedTopic.encryptedTopic) && this.keyIdentifier.contentEquals(encryptedTopic.keyIdentifier) && Arrays.equals(this.encapsulatedKey, encryptedTopic.encapsulatedKey);
    }

    public final byte[] getEncapsulatedKey() {
        return this.encapsulatedKey;
    }

    public final byte[] getEncryptedTopic() {
        return this.encryptedTopic;
    }

    public final String getKeyIdentifier() {
        return this.keyIdentifier;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.encryptedTopic)), this.keyIdentifier, Integer.valueOf(Arrays.hashCode(this.encapsulatedKey)));
    }

    public String toString() {
        return AbstractC0271e0.m398f("EncryptedTopic { ", "EncryptedTopic=" + AbstractC6582l.m12232q(this.encryptedTopic) + ", KeyIdentifier=" + this.keyIdentifier + ", EncapsulatedKey=" + AbstractC6582l.m12232q(this.encapsulatedKey) + " }");
    }
}
