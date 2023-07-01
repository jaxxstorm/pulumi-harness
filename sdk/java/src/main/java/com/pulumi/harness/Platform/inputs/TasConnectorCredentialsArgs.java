// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.TasConnectorCredentialsTasManualDetailsArgs;
import java.lang.String;
import java.util.Objects;


public final class TasConnectorCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final TasConnectorCredentialsArgs Empty = new TasConnectorCredentialsArgs();

    /**
     * Authenticate to Tas using manual details.
     * 
     */
    @Import(name="tasManualDetails", required=true)
    private Output<TasConnectorCredentialsTasManualDetailsArgs> tasManualDetails;

    /**
     * @return Authenticate to Tas using manual details.
     * 
     */
    public Output<TasConnectorCredentialsTasManualDetailsArgs> tasManualDetails() {
        return this.tasManualDetails;
    }

    /**
     * Type can be ManualConfig.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type can be ManualConfig.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private TasConnectorCredentialsArgs() {}

    private TasConnectorCredentialsArgs(TasConnectorCredentialsArgs $) {
        this.tasManualDetails = $.tasManualDetails;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TasConnectorCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TasConnectorCredentialsArgs $;

        public Builder() {
            $ = new TasConnectorCredentialsArgs();
        }

        public Builder(TasConnectorCredentialsArgs defaults) {
            $ = new TasConnectorCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param tasManualDetails Authenticate to Tas using manual details.
         * 
         * @return builder
         * 
         */
        public Builder tasManualDetails(Output<TasConnectorCredentialsTasManualDetailsArgs> tasManualDetails) {
            $.tasManualDetails = tasManualDetails;
            return this;
        }

        /**
         * @param tasManualDetails Authenticate to Tas using manual details.
         * 
         * @return builder
         * 
         */
        public Builder tasManualDetails(TasConnectorCredentialsTasManualDetailsArgs tasManualDetails) {
            return tasManualDetails(Output.of(tasManualDetails));
        }

        /**
         * @param type Type can be ManualConfig.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type can be ManualConfig.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public TasConnectorCredentialsArgs build() {
            $.tasManualDetails = Objects.requireNonNull($.tasManualDetails, "expected parameter 'tasManualDetails' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
