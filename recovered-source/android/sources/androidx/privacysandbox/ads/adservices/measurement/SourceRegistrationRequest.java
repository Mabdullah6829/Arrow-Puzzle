package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.util.List;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFeatures.RegisterSourceOptIn
public final class SourceRegistrationRequest {
    private final InputEvent inputEvent;
    private final List<Uri> registrationUris;

    public static final class Builder {
        private InputEvent inputEvent;
        private final List<Uri> registrationUris;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder(List<? extends Uri> registrationUris) {
            AbstractC6452k.m12181e(registrationUris, "registrationUris");
            this.registrationUris = registrationUris;
        }

        public final SourceRegistrationRequest build() {
            return new SourceRegistrationRequest(this.registrationUris, this.inputEvent);
        }

        public final Builder setInputEvent(InputEvent inputEvent) {
            AbstractC6452k.m12181e(inputEvent, "inputEvent");
            this.inputEvent = inputEvent;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SourceRegistrationRequest(List<? extends Uri> registrationUris, InputEvent inputEvent) {
        AbstractC6452k.m12181e(registrationUris, "registrationUris");
        this.registrationUris = registrationUris;
        this.inputEvent = inputEvent;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceRegistrationRequest)) {
            return false;
        }
        SourceRegistrationRequest sourceRegistrationRequest = (SourceRegistrationRequest) obj;
        return AbstractC6452k.m12177a(this.registrationUris, sourceRegistrationRequest.registrationUris) && AbstractC6452k.m12177a(this.inputEvent, sourceRegistrationRequest.inputEvent);
    }

    public final InputEvent getInputEvent() {
        return this.inputEvent;
    }

    public final List<Uri> getRegistrationUris() {
        return this.registrationUris;
    }

    public int hashCode() {
        int iHashCode = this.registrationUris.hashCode();
        InputEvent inputEvent = this.inputEvent;
        if (inputEvent == null) {
            return iHashCode;
        }
        return inputEvent.hashCode() + (iHashCode * 31);
    }

    public String toString() {
        return AbstractC0271e0.m399g("AppSourcesRegistrationRequest { ", "RegistrationUris=[" + this.registrationUris + "], InputEvent=" + this.inputEvent, " }");
    }

    public /* synthetic */ SourceRegistrationRequest(List list, InputEvent inputEvent, int i2, AbstractC6447f abstractC6447f) {
        this(list, (i2 & 2) != 0 ? null : inputEvent);
    }
}
