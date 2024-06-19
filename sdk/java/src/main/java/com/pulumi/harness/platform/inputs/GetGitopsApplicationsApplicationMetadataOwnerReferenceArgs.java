// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsApplicationsApplicationMetadataOwnerReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetGitopsApplicationsApplicationMetadataOwnerReferenceArgs Empty = new GetGitopsApplicationsApplicationMetadataOwnerReferenceArgs();

    /**
     * API version of the referent.
     * 
     */
    @Import(name="apiVersion")
    private @Nullable Output<String> apiVersion;

    /**
     * @return API version of the referent.
     * 
     */
    public Optional<Output<String>> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }

    /**
     * If true, AND if the owner has the &#34;foregroundDeletion&#34; finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs &#34;delete&#34; permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
     * 
     */
    @Import(name="blockOwnerDeletion")
    private @Nullable Output<Boolean> blockOwnerDeletion;

    /**
     * @return If true, AND if the owner has the &#34;foregroundDeletion&#34; finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs &#34;delete&#34; permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
     * 
     */
    public Optional<Output<Boolean>> blockOwnerDeletion() {
        return Optional.ofNullable(this.blockOwnerDeletion);
    }

    /**
     * Indicates if the reference points to the managing controller.
     * 
     */
    @Import(name="controller")
    private @Nullable Output<Boolean> controller;

    /**
     * @return Indicates if the reference points to the managing controller.
     * 
     */
    public Optional<Output<Boolean>> controller() {
        return Optional.ofNullable(this.controller);
    }

    /**
     * Kind of the referent.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Kind of the referent.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Name of the referent.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the referent.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * UID of the referent.
     * 
     */
    @Import(name="uid")
    private @Nullable Output<String> uid;

    /**
     * @return UID of the referent.
     * 
     */
    public Optional<Output<String>> uid() {
        return Optional.ofNullable(this.uid);
    }

    private GetGitopsApplicationsApplicationMetadataOwnerReferenceArgs() {}

    private GetGitopsApplicationsApplicationMetadataOwnerReferenceArgs(GetGitopsApplicationsApplicationMetadataOwnerReferenceArgs $) {
        this.apiVersion = $.apiVersion;
        this.blockOwnerDeletion = $.blockOwnerDeletion;
        this.controller = $.controller;
        this.kind = $.kind;
        this.name = $.name;
        this.uid = $.uid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsApplicationsApplicationMetadataOwnerReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsApplicationsApplicationMetadataOwnerReferenceArgs $;

        public Builder() {
            $ = new GetGitopsApplicationsApplicationMetadataOwnerReferenceArgs();
        }

        public Builder(GetGitopsApplicationsApplicationMetadataOwnerReferenceArgs defaults) {
            $ = new GetGitopsApplicationsApplicationMetadataOwnerReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiVersion API version of the referent.
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        /**
         * @param apiVersion API version of the referent.
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(String apiVersion) {
            return apiVersion(Output.of(apiVersion));
        }

        /**
         * @param blockOwnerDeletion If true, AND if the owner has the &#34;foregroundDeletion&#34; finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs &#34;delete&#34; permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
         * 
         * @return builder
         * 
         */
        public Builder blockOwnerDeletion(@Nullable Output<Boolean> blockOwnerDeletion) {
            $.blockOwnerDeletion = blockOwnerDeletion;
            return this;
        }

        /**
         * @param blockOwnerDeletion If true, AND if the owner has the &#34;foregroundDeletion&#34; finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs &#34;delete&#34; permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
         * 
         * @return builder
         * 
         */
        public Builder blockOwnerDeletion(Boolean blockOwnerDeletion) {
            return blockOwnerDeletion(Output.of(blockOwnerDeletion));
        }

        /**
         * @param controller Indicates if the reference points to the managing controller.
         * 
         * @return builder
         * 
         */
        public Builder controller(@Nullable Output<Boolean> controller) {
            $.controller = controller;
            return this;
        }

        /**
         * @param controller Indicates if the reference points to the managing controller.
         * 
         * @return builder
         * 
         */
        public Builder controller(Boolean controller) {
            return controller(Output.of(controller));
        }

        /**
         * @param kind Kind of the referent.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind of the referent.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name Name of the referent.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the referent.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param uid UID of the referent.
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<String> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid UID of the referent.
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        public GetGitopsApplicationsApplicationMetadataOwnerReferenceArgs build() {
            return $;
        }
    }

}
