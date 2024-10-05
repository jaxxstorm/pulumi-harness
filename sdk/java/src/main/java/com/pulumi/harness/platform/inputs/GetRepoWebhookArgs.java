// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRepoWebhookArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRepoWebhookArgs Empty = new GetRepoWebhookArgs();

    /**
     * Description of the webhook.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the webhook.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Webhook enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Webhook enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * Identifier of the webhook.
     * 
     */
    @Import(name="identifier", required=true)
    private Output<String> identifier;

    /**
     * @return Identifier of the webhook.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }

    /**
     * Allow insecure connections for provided webhook URL.
     * 
     */
    @Import(name="insecure", required=true)
    private Output<Boolean> insecure;

    /**
     * @return Allow insecure connections for provided webhook URL.
     * 
     */
    public Output<Boolean> insecure() {
        return this.insecure;
    }

    /**
     * Unique identifier of the organization.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Unique identifier of the project.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Unique identifier of the project.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Identifier of the repository.
     * 
     */
    @Import(name="repoIdentifier", required=true)
    private Output<String> repoIdentifier;

    /**
     * @return Identifier of the repository.
     * 
     */
    public Output<String> repoIdentifier() {
        return this.repoIdentifier;
    }

    /**
     * Webhook secret which will be used to sign the webhook payload.
     * 
     */
    @Import(name="secret")
    private @Nullable Output<String> secret;

    /**
     * @return Webhook secret which will be used to sign the webhook payload.
     * 
     */
    public Optional<Output<String>> secret() {
        return Optional.ofNullable(this.secret);
    }

    /**
     * List of triggers of the webhook (keep empty for all triggers).
     * 
     */
    @Import(name="triggers")
    private @Nullable Output<List<String>> triggers;

    /**
     * @return List of triggers of the webhook (keep empty for all triggers).
     * 
     */
    public Optional<Output<List<String>>> triggers() {
        return Optional.ofNullable(this.triggers);
    }

    /**
     * URL that&#39;s called by the webhook.
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return URL that&#39;s called by the webhook.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private GetRepoWebhookArgs() {}

    private GetRepoWebhookArgs(GetRepoWebhookArgs $) {
        this.description = $.description;
        this.enabled = $.enabled;
        this.identifier = $.identifier;
        this.insecure = $.insecure;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.repoIdentifier = $.repoIdentifier;
        this.secret = $.secret;
        this.triggers = $.triggers;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRepoWebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRepoWebhookArgs $;

        public Builder() {
            $ = new GetRepoWebhookArgs();
        }

        public Builder(GetRepoWebhookArgs defaults) {
            $ = new GetRepoWebhookArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the webhook.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the webhook.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled Webhook enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Webhook enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param identifier Identifier of the webhook.
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Identifier of the webhook.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param insecure Allow insecure connections for provided webhook URL.
         * 
         * @return builder
         * 
         */
        public Builder insecure(Output<Boolean> insecure) {
            $.insecure = insecure;
            return this;
        }

        /**
         * @param insecure Allow insecure connections for provided webhook URL.
         * 
         * @return builder
         * 
         */
        public Builder insecure(Boolean insecure) {
            return insecure(Output.of(insecure));
        }

        /**
         * @param orgId Unique identifier of the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Unique identifier of the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Unique identifier of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique identifier of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param repoIdentifier Identifier of the repository.
         * 
         * @return builder
         * 
         */
        public Builder repoIdentifier(Output<String> repoIdentifier) {
            $.repoIdentifier = repoIdentifier;
            return this;
        }

        /**
         * @param repoIdentifier Identifier of the repository.
         * 
         * @return builder
         * 
         */
        public Builder repoIdentifier(String repoIdentifier) {
            return repoIdentifier(Output.of(repoIdentifier));
        }

        /**
         * @param secret Webhook secret which will be used to sign the webhook payload.
         * 
         * @return builder
         * 
         */
        public Builder secret(@Nullable Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret Webhook secret which will be used to sign the webhook payload.
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        /**
         * @param triggers List of triggers of the webhook (keep empty for all triggers).
         * 
         * @return builder
         * 
         */
        public Builder triggers(@Nullable Output<List<String>> triggers) {
            $.triggers = triggers;
            return this;
        }

        /**
         * @param triggers List of triggers of the webhook (keep empty for all triggers).
         * 
         * @return builder
         * 
         */
        public Builder triggers(List<String> triggers) {
            return triggers(Output.of(triggers));
        }

        /**
         * @param triggers List of triggers of the webhook (keep empty for all triggers).
         * 
         * @return builder
         * 
         */
        public Builder triggers(String... triggers) {
            return triggers(List.of(triggers));
        }

        /**
         * @param url URL that&#39;s called by the webhook.
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url URL that&#39;s called by the webhook.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public GetRepoWebhookArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("GetRepoWebhookArgs", "enabled");
            }
            if ($.identifier == null) {
                throw new MissingRequiredPropertyException("GetRepoWebhookArgs", "identifier");
            }
            if ($.insecure == null) {
                throw new MissingRequiredPropertyException("GetRepoWebhookArgs", "insecure");
            }
            if ($.repoIdentifier == null) {
                throw new MissingRequiredPropertyException("GetRepoWebhookArgs", "repoIdentifier");
            }
            if ($.url == null) {
                throw new MissingRequiredPropertyException("GetRepoWebhookArgs", "url");
            }
            return $;
        }
    }

}