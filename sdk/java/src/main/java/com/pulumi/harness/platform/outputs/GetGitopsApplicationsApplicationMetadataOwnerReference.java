// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGitopsApplicationsApplicationMetadataOwnerReference {
    /**
     * @return API version of the referent.
     * 
     */
    private @Nullable String apiVersion;
    /**
     * @return If true, AND if the owner has the &#34;foregroundDeletion&#34; finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs &#34;delete&#34; permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
     * 
     */
    private @Nullable Boolean blockOwnerDeletion;
    /**
     * @return Indicates if the reference points to the managing controller.
     * 
     */
    private @Nullable Boolean controller;
    /**
     * @return Kind of the referent.
     * 
     */
    private @Nullable String kind;
    /**
     * @return Name of the referent.
     * 
     */
    private @Nullable String name;
    /**
     * @return UID of the referent.
     * 
     */
    private @Nullable String uid;

    private GetGitopsApplicationsApplicationMetadataOwnerReference() {}
    /**
     * @return API version of the referent.
     * 
     */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * @return If true, AND if the owner has the &#34;foregroundDeletion&#34; finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs &#34;delete&#34; permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
     * 
     */
    public Optional<Boolean> blockOwnerDeletion() {
        return Optional.ofNullable(this.blockOwnerDeletion);
    }
    /**
     * @return Indicates if the reference points to the managing controller.
     * 
     */
    public Optional<Boolean> controller() {
        return Optional.ofNullable(this.controller);
    }
    /**
     * @return Kind of the referent.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Name of the referent.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return UID of the referent.
     * 
     */
    public Optional<String> uid() {
        return Optional.ofNullable(this.uid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitopsApplicationsApplicationMetadataOwnerReference defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable Boolean blockOwnerDeletion;
        private @Nullable Boolean controller;
        private @Nullable String kind;
        private @Nullable String name;
        private @Nullable String uid;
        public Builder() {}
        public Builder(GetGitopsApplicationsApplicationMetadataOwnerReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.blockOwnerDeletion = defaults.blockOwnerDeletion;
    	      this.controller = defaults.controller;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.uid = defaults.uid;
        }

        @CustomType.Setter
        public Builder apiVersion(@Nullable String apiVersion) {

            this.apiVersion = apiVersion;
            return this;
        }
        @CustomType.Setter
        public Builder blockOwnerDeletion(@Nullable Boolean blockOwnerDeletion) {

            this.blockOwnerDeletion = blockOwnerDeletion;
            return this;
        }
        @CustomType.Setter
        public Builder controller(@Nullable Boolean controller) {

            this.controller = controller;
            return this;
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {

            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder uid(@Nullable String uid) {

            this.uid = uid;
            return this;
        }
        public GetGitopsApplicationsApplicationMetadataOwnerReference build() {
            final var _resultValue = new GetGitopsApplicationsApplicationMetadataOwnerReference();
            _resultValue.apiVersion = apiVersion;
            _resultValue.blockOwnerDeletion = blockOwnerDeletion;
            _resultValue.controller = controller;
            _resultValue.kind = kind;
            _resultValue.name = name;
            _resultValue.uid = uid;
            return _resultValue;
        }
    }
}
